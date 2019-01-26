grammar Lulu2;
@header
{
    import LULU.Type;
}
@parser :: members
{
    enum TypeEnum
    {
        Int, Bool, Float, string, nullable
    }
}
//----------------------------------------Lexer----------------------------------------\\
//--------------------Comment--------------------\\
SingleLineComment : '%%' ~'\n'* ('\n'| EOF) -> channel(HIDDEN);
MultiLineComment : '%~'.*? '~%' -> channel(HIDDEN);
//--------------------KeyWords--------------------\\
ALLOCATE : 'allocate';
BOOL : 'bool';
BREAK : 'break';
CASE: 'case';
CONST : 'const';
CONTINUE : 'continue';
DECLARE : 'declare';
DEFAULT : 'default';
DESTRUCT : 'destruct';
ELSE : 'else';
fragment FALSE : 'false';
FUNCTION : 'function';
FLOAT : 'float';
FOR : 'for';
IF : 'if';
INT : 'int';
NIL : 'nil';
OF : 'of'; //Only reserved. Like goto in Java. :)
PRIVATE : 'private';
PROTECTED : 'protected';
PUBLIC : 'public';
READ : 'read';
RETURN : 'return';
STRING : 'string';
SUPER : 'super';
SWITCH : 'switch';
THIS : 'this';
fragment TRUE : 'true';
TYPE : 'type';
WHILE : 'while';
WRITE : 'write';
//--------------------Operators--------------------\\
EQUAL : '==';
NotEqual : '!=';
LessThanOrEqual : '<=';
LessThan : '<';
BiggerThan : '>';
BiggerThanOrEqual : '>=';
//--------------------Logical And Bitwise Operaters--------------------\\
BitwiseNegation : '~';
BitwiseOr : '|';
BitwiseAnd : '&';
BitwiseLogicalXor : '^';
LogicalOr : '||';
LogicalAnd : '&&';
LogicalNot : '!';
//--------------------Aritmathic Operaters--------------------\\
SUBTRACTION : '-';
ADDITION : '+';
MULTIPLICATION :'*';
DIVISION : '/';
MODULUS : '%';
ASSIGN : '=';
//--------------------Structural Operaters--------------------\\
OpenCurlyBrace : '{';
CloseCurlyBrace : '}';
OpenPar : '(';
ClosePar : ')';
OpenBrace : '[';
CloseBrace : ']';
DOT : '.';
COMMA : ',';
COLON : ':';
SEMICOLON : ';';
//--------------------Others--------------------\\
fragment DIGIT : [0-9];
fragment DECIMAL : DIGIT+;
fragment HEX : DIGIT | [a-fA-F];
fragment HEXADECIMAL : '0' [Xx] HEX+;
IntLiteral : DECIMAL | HEXADECIMAL;
fragment EXPONENT : [Ee] [+-]? DECIMAL;
//FloatLiteral : IntLiteral+ '.' DECIMAL EXPONENT?;
FloatLiteral : (IntLiteral* DOT DECIMAL | IntLiteral DOT DECIMAL*) EXPONENT?;
fragment StringSample : (~'\\');
fragment UNICODE : [xX] HEX HEX;
fragment ESCAPE : '\\' (['bnrt0] | UNICODE | '\\');
StringLiteral : '\'' (StringSample | ESCAPE)*? '\'';
BoolLiteral : FALSE | TRUE;
ID : [A-Za-z#_] [A-Za-z0-9#_]*;
WhiteSpace : [ \t\r\n]+ -> skip;
//----------------------------------------End Lexer----------------------------------------\\


//----------------------------------------Parser----------------------------------------\\
main : ftDcl? ftDef+ EOF;
ftDcl : DECLARE OpenCurlyBrace (funcDcl | typeDcl | varDef)+ CloseCurlyBrace;
funcDcl : (OpenPar args ClosePar ASSIGN)? ID OpenPar (args | argsVar)? ClosePar SEMICOLON;
typeBrace : type (OpenBrace CloseBrace)*;
args : typeBrace (COMMA typeBrace)*; //Why Not?
//    : type(OpenBrace CloseBrace)*
//    | args COMMA type (OpenBrace CloseBrace)*;
argsVar : typeBrace ID (COMMA typeBrace ID)*;
//    : type (OpenBrace CloseBrace)* ID | argsVar COMMA type (OpenBrace CloseBrace)* ID;
typeDcl : ID SEMICOLON;
varDef : CONST? type varVal (COMMA varVal)* SEMICOLON;
varVal : ref (ASSIGN expr)?;
ftDef : (typeDef | funcDef);
typeDef : TYPE ID (COLON ID)? OpenCurlyBrace component+ CloseCurlyBrace;
component : accessModifier? (varDef | funcDef);
accessModifier : PRIVATE | PUBLIC | PROTECTED;
funcDef : (OpenPar argsVar ClosePar ASSIGN)? FUNCTION ID OpenPar argsVar? ClosePar block;
block : OpenCurlyBrace (varDef | stmt)* CloseCurlyBrace;
stmt
    : assign SEMICOLON                                 #ASSIGNAlt
    | funcCall SEMICOLON                               #FUNCCALLSTMTAlt
    | condStmt                                         #CONDSTMTAlt
    | loopStmt                                         #LOOPSTMTAlt
    | RETURN SEMICOLON                                 #RETURNAlt
    | BREAK SEMICOLON                                  #BREAKAlt
    | CONTINUE SEMICOLON                               #CONTINUEAlt
    | DESTRUCT (OpenBrace CloseBrace)* ID SEMICOLON    #DESTRUCTAlt
    ;
assign : (var | OpenPar var (COMMA var)* ClosePar) ASSIGN expr;
var : ((THIS | SUPER) DOT)? ref (DOT ref)*;
ref : ID (OpenBrace expr CloseBrace)*;
expr  returns [TypeEnum t]
    : OpenPar expr ClosePar
    {
        $t = $expr.t;
    }
                                                       #PAREXPRAlt
    | unaryOp expr
    //TODO("This is not complete.")
    {
        if($expr.t != TypeEnum.Int || $expr.t != TypeEnum.Bool) throw new CompileError("bad operand types for unary operator " + $unaryOp.text + " ");
        else $t = TypeEnum.Int;
    }
                                                       #UNARYOPAlt
    | a=expr firstLevelBinaryArithmeticOp b=expr
    {
        if($a.t == $b.t) $t = $a.t;
        else
            switch($a.t)
            {
                case Int:
                    switch($b.t)
                    {
                        case Float: $t = TypeEnum.Float;
                            break;
                        case Bool: $t = TypeEnum.Int;
                            break;
                        case string: $t = TypeEnum.string;
                            break;
                        default: throw new CompileError("bad operand types for binary operator " + $firstLevelBinaryArithmeticOp.text + " ");
                    }
                    break;
                case Float:
                    switch($b.t)
                    {
                        case Bool: $t = TypeEnum.Float;
                            break;
                        case Int: $t = TypeEnum.Float;
                            break;
                        default: throw new CompileError("bad operand types for binary operator " + $firstLevelBinaryArithmeticOp.text + " ");
                    }
                    break;
                case Bool:
                    switch($b.t)
                    {
                        case Float: $t = TypeEnum.Float;
                            break;
                        case Int: $t = TypeEnum.Int;
                            break;
                        case string: $t = TypeEnum.string;
                            break;
                        default: throw new CompileError("bad operand types for binary operator " + $firstLevelBinaryArithmeticOp.text + " ");
                    }
                    break;
                case string:
                    switch($b.t)
                    {
                        case Bool: $t = TypeEnum.string;
                            break;
                        case Int :$t = TypeEnum.string;
                            break;
                        default: throw new CompileError("bad operand types for binary operator " + $firstLevelBinaryArithmeticOp.text + " ");
                    }
                    break;
            }
    }
                                                       #MULDIVAlt
    | a=expr secondLevelBinaryArithmeticOp b=expr
    {
        if($a.t == $b.t) $t = $a.t;
        else
            switch($a.t)
            {
                case Int:
                    switch($b.t)
                    {
                        case Float: $t = TypeEnum.Float;
                            break;
                        case Bool: $t = TypeEnum.Int;
                            break;
                        case string: $t = TypeEnum.string;
                            break;
                        default: throw new CompileError("bad operand types for binary operator " + $secondLevelBinaryArithmeticOp.text + " ");
                    }
                    break;
                case Float:
                    switch($b.t)
                    {
                        case Bool: $t = TypeEnum.Float;
                            break;
                        case Int: $t = TypeEnum.Float;
                            break;
                        default: throw new CompileError("bad operand types for binary operator " + $secondLevelBinaryArithmeticOp.text + " ");
                    }
                    break;
                case Bool:
                    switch($b.t)
                    {
                       case Float: $t = TypeEnum.Float;
                           break;
                       case Int: $t = TypeEnum.Int;
                           break;
                       case string: $t = TypeEnum.string;
                           break;
                       default: throw new CompileError("bad operand types for binary operator " + $secondLevelBinaryArithmeticOp.text + " ");
                    }
                    break;
                case string:
                    switch($b.t)
                    {
                        case Bool: $t = TypeEnum.string;
                            break;
                        case Int :$t = TypeEnum.string;
                            break;
                       default: throw new CompileError("bad operand types for binary operator " + $secondLevelBinaryArithmeticOp.text + " ");
                    }
            }
    }
                                                       #ADDSUBAlt
    | a=expr firstLevelBinaryRelationalOp b=expr
    {
        if($a.t == $b.t) $t = TypeEnum.Bool;
        else
            switch($a.t)
            {
                case Int:
                    switch($b.t)
                    {
                        case Float: $t = TypeEnum.Bool;
                            break;
                        case Bool: $t = TypeEnum.Bool;
                            break;
                        case string: $t = TypeEnum.Bool;
                            break;
                        default: throw new CompileError("bad operand types for binary operator " + $firstLevelBinaryRelationalOp.text + " ");
                    }
                    break;
                case Float:
                    switch($b.t)
                    {
                        case Bool: $t = TypeEnum.Bool;
                            break;
                        case Int: $t = TypeEnum.Bool;
                            break;
                        default: throw new CompileError("bad operand types for binary operator " + $firstLevelBinaryRelationalOp.text + " ");
                    }
                    break;
                case Bool:
                    switch($b.t)
                    {
                        case Float: $t = TypeEnum.Bool;
                            break;
                        case Int: $t = TypeEnum.Bool;
                            break;
                        case string: $t = TypeEnum.Bool;
                            break;
                        default: throw new CompileError("bad operand types for binary operator " + $firstLevelBinaryRelationalOp.text + " ");
                    }
                    break;
                case string:
                    switch($b.t)
                    {
                        case Bool: $t = TypeEnum.Bool;
                            break;
                        case Int :$t = TypeEnum.Bool;
                            break;
                        default: throw new CompileError("bad operand types for binary operator " + $firstLevelBinaryRelationalOp.text + " ");
                    }
                    break;
            }
    }
                                                       #COMPAREAlt
    | a=expr secondLevelBinaryRelationalOp b=expr
    {
        if($a.t == $b.t) $t = TypeEnum.Bool;
        else
            switch($a.t)
            {
                case Int:
                    switch($b.t)
                    {
                        case Float: $t = TypeEnum.Bool;
                            break;
                        case Bool: $t = TypeEnum.Bool;
                            break;
                        case string: $t = TypeEnum.Bool;
                            break;
                        default: throw new CompileError("bad operand types for binary operator " + $secondLevelBinaryRelationalOp.text + " ");
                      }
                    break;
                case Float:
                    switch($b.t)
                    {
                        case Bool: $t = TypeEnum.Bool;
                            break;
                        case Int: $t = TypeEnum.Bool;
                            break;
                        default: throw new CompileError("bad operand types for binary operator " + $secondLevelBinaryRelationalOp.text + " ");
                    }
                    break;
                case Bool:
                    switch($b.t)
                    {
                        case Float: $t = TypeEnum.Bool;
                            break;
                        case Int: $t = TypeEnum.Bool;
                            break;
                        case string: $t = TypeEnum.Bool;
                            break;
                        default: throw new CompileError("bad operand types for binary operator " + $secondLevelBinaryRelationalOp.text + " ");
                    }
                    break;
                case string:
                    switch($b.t)
                    {
                        case Bool: $t = TypeEnum.Bool;
                            break;
                        case Int :$t = TypeEnum.Bool;
                            break;
                        default: throw new CompileError("bad operand types for binary operator " + $secondLevelBinaryRelationalOp.text + " ");
                    }
                    break;
            }
    }
                                                       #EQUALITYAlt
    | a=expr BitwiseAnd b=expr
    {
        if(($a.t==TypeEnum.Int || $a.t==TypeEnum.Bool) && ($b.t==TypeEnum.Int || $b.t==TypeEnum.Bool)) $t = TypeEnum.Int;
        else throw new CompileError("bad operand types for binary operator " + $BitwiseAnd.text + " ");
    }
                                                       #BITWISEANDAlt
    | a=expr BitwiseLogicalXor b=expr
    //TODO("Ask professor")
    {
        if(($a.t==TypeEnum.Int || $a.t==TypeEnum.Bool) && ($b.t==TypeEnum.Int || $b.t==TypeEnum.Bool)) $t = TypeEnum.Int;
        else throw new CompileError("bad operand types for binary operator " + $BitwiseLogicalXor.text + " ");
    }
                                                       #BITWISELOGICALXORAlt
    | a=expr BitwiseOr b=expr
    {
        if(($a.t==TypeEnum.Int || $a.t==TypeEnum.Bool) && ($b.t==TypeEnum.Int || $b.t==TypeEnum.Bool)) $t = TypeEnum.Int;
        else throw new CompileError("bad operand types for binary operator " + $BitwiseOr.text + " ");
    }
                                                       #BITWISEORAlt
    | a=expr LogicalAnd b=expr
    {
        if(($a.t==TypeEnum.Int || $a.t==TypeEnum.Bool) && ($b.t==TypeEnum.Int || $b.t==TypeEnum.Bool)) $t = TypeEnum.Bool;
        else throw new CompileError("bad operand types for binary operator " + $LogicalAnd.text + " ");
    }
                                                       #LOGICALANDAlt
    | a=expr LogicalOr b=expr
    {
        if(($a.t==TypeEnum.Int || $a.t==TypeEnum.Bool) && ($b.t==TypeEnum.Int || $b.t==TypeEnum.Bool)) $t = TypeEnum.Bool;
        else throw new CompileError("bad operand types for binary operator " + $LogicalOr.text + " ");
    }
                                                       #LOGICALORAlt
    | constVal
    {
        $t = $constVal.t;
    }
                                                       #CONSTVALAlt
    | ALLOCATE handleCall
    {
        $t = TypeEnum.nullable;
    }
                                                       #ALLOCATIONAlt
    | funcCall
    {
        $t = TypeEnum.nullable;
    }
                                                       #FUNCCALLAlt
    | var                                              #VARAlt
    | list                                             #LISTAlt
    | NIL                                              #NILAlt
    ;
funcCall
    : (var DOT)? handleCall                            #METHODCALLAlt
    | READ OpenPar var ClosePar                        #READAlt
    | WRITE OpenPar var ClosePar                       #WRITEAlt
    ;
list : OpenBrace (expr | list) (COMMA (expr | list))* CloseBrace;
handleCall : ID OpenPar params? ClosePar;
params : expr | expr COMMA params;
condStmt
    : IF expr block (ELSE block)?                      #IFAlt
    | SWITCH var OpenCurlyBrace
        (CASE IntLiteral COLON block)* DEFAULT COLON
        block CloseCurlyBrace                          #SWITCHAlt
    ;
loopStmt
    : FOR (type? assign)? SEMICOLON expr SEMICOLON
        assign? block                                  #FORAlt
    | WHILE expr block                                 #WHILEAlt
    ;
type : INT | BOOL | FLOAT | STRING | ID;
constVal returns [TypeEnum t]
    : IntLiteral {$t = TypeEnum.Int;}
    | FloatLiteral {$t = TypeEnum.Float;}
    | BoolLiteral {$t = TypeEnum.Bool;}
    | StringLiteral {$t = TypeEnum.string;}
    ;
unaryOp : SUBTRACTION | LogicalNot | BitwiseNegation; //TODO("if two rules have equal precedence, then prefering one two others is wrong or not?")
firstLevelBinaryArithmeticOp : MULTIPLICATION | DIVISION | MODULUS;
secondLevelBinaryArithmeticOp : ADDITION | SUBTRACTION;
firstLevelBinaryRelationalOp : LessThanOrEqual | LessThan | BiggerThanOrEqual | BiggerThan;
secondLevelBinaryRelationalOp : EQUAL | NotEqual;
//----------------------------------------End Parser----------------------------------------\\