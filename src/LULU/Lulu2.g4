grammar Lulu2;
@header
{
    import LULU.Type;
}
@parser :: members
{
    enum TypeEnum
    {
        Int, Bool, Float, string, nullable, Array, ArraySignature, function
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
argsVar : typeBrace ID (COMMA typeBrace ID)*;
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
var returns [Type varType] : ((THIS | SUPER) DOT)? ref (DOT ref)*;
ref : ID (OpenBrace expr CloseBrace)*;
expr  returns [Type t]
    : OpenPar expr ClosePar
    {
        $t = $expr.t;
    }
                                                       //#PAREXPRAlt
    | unaryOp expr
    //TODO("This is not complete.")
    {
        if($expr.t != Type.Int() || $expr.t != Type.Bool())
        {
            LuluListener.currentNode.throwError(new CompileError("bad operand types for unary operator " + $unaryOp.text + " "));
            $t = null;
        }
        else $t = Type.Int();
    }
                                                       //#UNARYOPAlt
    | a=expr firstLevelBinaryArithmeticOp b=expr
    {
        if(!($a.t instanceof Type.PrimitiveType) || !($b.t instanceof Type.PrimitiveType))
        {
            LuluListener.currentNode.throwError(new CompileError("bad operand types for binary operator " + $firstLevelBinaryArithmeticOp.text + " "));
            $t = null;
        }
        else
        {
            if($a.t == $b.t) $t = $a.t;
            else
                switch($a.t.getTypeEnum())
                {
                    case Int:
                        switch($b.t.getTypeEnum())
                        {
                            case Float: $t = Type.Float();
                                break;
                            case Bool: $t = Type.Int();
                                break;
                            case string: $t = Type.String();
                                break;
                            default: throw new CompileError("bad operand types for binary operator " + $firstLevelBinaryArithmeticOp.text + " ");
                        }
                        break;
                    case Float:
                        switch($b.t.getTypeEnum())
                        {
                            case Bool: $t = Type.Float();
                                break;
                            case Int: $t = Type.Float();
                                break;
                            default: throw new CompileError("bad operand types for binary operator " + $firstLevelBinaryArithmeticOp.text + " ");
                        }
                        break;
                    case Bool:
                        switch($b.t.getTypeEnum())
                        {
                            case Float: $t = Type.Float();
                                break;
                            case Int: $t = Type.Int();
                                break;
                            case string: $t = Type.String();
                                break;
                            default: throw new CompileError("bad operand types for binary operator " + $firstLevelBinaryArithmeticOp.text + " ");
                        }
                        break;
                    case string:
                        switch($b.t.getTypeEnum())
                        {
                            case Bool: $t = Type.String();
                                break;
                            case Int :$t = Type.String();
                                break;
                            default: throw new CompileError("bad operand types for binary operator " + $firstLevelBinaryArithmeticOp.text + " ");
                        }
                        break;
                }
        }
    }
                                                       //#MULDIVAlt
    | a=expr secondLevelBinaryArithmeticOp b=expr
    {
        if(!($a.t instanceof Type.PrimitiveType) || !($b.t instanceof Type.PrimitiveType))
        {
            LuluListener.currentNode.throwError(new CompileError("bad operand types for binary operator " + $secondLevelBinaryArithmeticOp.text + " "));
            $t = null;
        }
        else
        {
            if($a.t == $b.t) $t = $a.t;
            else
                switch($a.t.getTypeEnum())
                {
                    case Int:
                        switch($b.t.getTypeEnum())
                        {
                            case Float: $t = Type.Float();
                                break;
                            case Bool: $t = Type.Int();
                                break;
                            case string: $t = Type.String();
                                break;
                            default: throw new CompileError("bad operand types for binary operator " + $secondLevelBinaryArithmeticOp.text + " ");
                        }
                        break;
                    case Float:
                        switch($b.t.getTypeEnum())
                        {
                            case Bool: $t = Type.Float();
                                break;
                            case Int: $t = Type.Float();
                                break;
                            default: throw new CompileError("bad operand types for binary operator " + $secondLevelBinaryArithmeticOp.text + " ");
                        }
                        break;
                    case Bool:
                        switch($b.t.getTypeEnum())
                        {
                           case Float: $t = Type.Float();
                               break;
                           case Int: $t = Type.Int();
                               break;
                           case string: $t = Type.String();
                               break;
                           default: throw new CompileError("bad operand types for binary operator " + $secondLevelBinaryArithmeticOp.text + " ");
                        }
                        break;
                    case string:
                        switch($b.t.getTypeEnum())
                        {
                            case Bool: $t = Type.String();
                                break;
                            case Int :$t = Type.String();
                                break;
                           default: throw new CompileError("bad operand types for binary operator " + $secondLevelBinaryArithmeticOp.text + " ");
                        }
                }
        }
    }
                                                       //#ADDSUBAlt
    | a=expr firstLevelBinaryRelationalOp b=expr
    {
        if(!($a.t instanceof Type.PrimitiveType) || !($b.t instanceof Type.PrimitiveType))
        {
            LuluListener.currentNode.throwError(new CompileError("bad operand types for binary operator " + $firstLevelBinaryRelationalOp.text + " "));
            $t = null;
        }
        else
        {
            if($a.t == $b.t) $t = Type.Bool();
            else
                switch($a.t.getTypeEnum())
                {
                    case Int:
                        switch($b.t.getTypeEnum())
                        {
                            case Float: $t = Type.Bool();
                                break;
                            case Bool: $t = Type.Bool();
                                break;
                            case string: $t = Type.Bool();
                                break;
                            default: throw new CompileError("bad operand types for binary operator " + $firstLevelBinaryRelationalOp.text + " ");
                        }
                        break;
                    case Float:
                        switch($b.t.getTypeEnum())
                        {
                            case Bool: $t = Type.Bool();
                                break;
                            case Int: $t = Type.Bool();
                                break;
                            default: throw new CompileError("bad operand types for binary operator " + $firstLevelBinaryRelationalOp.text + " ");
                        }
                        break;
                    case Bool:
                        switch($b.t.getTypeEnum())
                        {
                            case Float: $t = Type.Bool();
                                break;
                            case Int: $t = Type.Bool();
                                break;
                            case string: $t = Type.Bool();
                                break;
                            default: throw new CompileError("bad operand types for binary operator " + $firstLevelBinaryRelationalOp.text + " ");
                        }
                        break;
                    case string:
                        switch($b.t.getTypeEnum())
                        {
                            case Bool: $t = Type.Bool();
                                break;
                            case Int :$t = Type.Bool();
                                break;
                            default: throw new CompileError("bad operand types for binary operator " + $firstLevelBinaryRelationalOp.text + " ");
                        }
                        break;
                }
        }
    }
                                                       //#COMPAREAlt
    | a=expr secondLevelBinaryRelationalOp b=expr
    {
        if(!($a.t instanceof Type.PrimitiveType) || !($b.t instanceof Type.PrimitiveType))
        {
            LuluListener.currentNode.throwError(new CompileError("bad operand types for binary operator " + $secondLevelBinaryRelationalOp.text + " "));
            $t = null;
        }
        else
        {
            if($a.t == $b.t) $t = Type.Bool();
            else
                switch($a.t.getTypeEnum())
                {
                    case Int:
                        switch($b.t.getTypeEnum())
                        {
                            case Float: $t = Type.Bool();
                                break;
                            case Bool: $t = Type.Bool();
                                break;
                            case string: $t = Type.Bool();
                                break;
                            default: throw new CompileError("bad operand types for binary operator " + $secondLevelBinaryRelationalOp.text + " ");
                          }
                        break;
                    case Float:
                        switch($b.t.getTypeEnum())
                        {
                            case Bool: $t = Type.Bool();
                                break;
                            case Int: $t = Type.Bool();
                                break;
                            default: throw new CompileError("bad operand types for binary operator " + $secondLevelBinaryRelationalOp.text + " ");
                        }
                        break;
                    case Bool:
                        switch($b.t.getTypeEnum())
                        {
                            case Float: $t = Type.Bool();
                                break;
                            case Int: $t = Type.Bool();
                                break;
                            case string: $t = Type.Bool();
                                break;
                            default: throw new CompileError("bad operand types for binary operator " + $secondLevelBinaryRelationalOp.text + " ");
                        }
                        break;
                    case string:
                        switch($b.t.getTypeEnum())
                        {
                            case Bool: $t = Type.Bool();
                                break;
                            case Int :$t = Type.Bool();
                                break;
                            default: throw new CompileError("bad operand types for binary operator " + $secondLevelBinaryRelationalOp.text + " ");
                        }
                        break;
                }
        }
    }
                                                       //#EQUALITYAlt
    | a=expr BitwiseAnd b=expr
    {
        if(($a.t==Type.Int() || $a.t==Type.Bool()) && ($b.t==Type.Int() || $b.t==Type.Bool())) $t = Type.Int();
        else
        {
            LuluListener.currentNode.throwError(new CompileError("bad operand types for binary operator " + $BitwiseAnd.text + " "));
            $t = null;
        }
    }
                                                       //#BITWISEANDAlt
    | a=expr BitwiseLogicalXor b=expr
    {
        if(($a.t==Type.Int() || $a.t==Type.Bool()) && ($b.t==Type.Int() || $b.t==Type.Bool())) $t = Type.Int();
        else
        {
            LuluListener.currentNode.throwError(new CompileError("bad operand types for binary operator " + $BitwiseLogicalXor.text + " "));
            $t = null;
        }
    }
                                                       //#BITWISELOGICALXORAlt
    | a=expr BitwiseOr b=expr
    {
        if(($a.t==Type.Int() || $a.t==Type.Bool()) && ($b.t==Type.Int() || $b.t==Type.Bool())) $t = Type.Int();
        else
        {
            LuluListener.currentNode.throwError(new CompileError("bad operand types for binary operator " + $BitwiseOr.text + " "));
            $t = null;
        }
    }
                                                       //#BITWISEORAlt
    | a=expr LogicalAnd b=expr
    {
        if(($a.t==Type.Int() || $a.t==Type.Bool()) && ($b.t==Type.Int() || $b.t==Type.Bool())) $t = Type.Bool();
        else
        {
            LuluListener.currentNode.throwError(new CompileError("bad operand types for binary operator " + $LogicalAnd.text + " "));
            $t = null;
        }
    }
                                                       //#LOGICALANDAlt
    | a=expr LogicalOr b=expr
    {
        if(($a.t==Type.Int() || $a.t==Type.Bool()) && ($b.t==Type.Int() || $b.t==Type.Bool())) $t = Type.Bool();
        else
        {
            LuluListener.currentNode.throwError(new CompileError("bad operand types for binary operator " + $LogicalOr.text + " "));
            $t = null;
        }
    }
                                                       //#LOGICALORAlt
    | constVal
    {
        $t = $constVal.t;
    }
                                                       //#CONSTVALAlt
    | ALLOCATE handleCall
    {
        var text = $handleCall.text;
        var id = text.split("[(]")[0];
        var type = LuluListener.getType(id);
        if(type == null)
        {
            LuluListener.currentNode.throwError(new CompileError("type not defined"));
            $t = null;
        }
        else $t = type;
    }
                                                       //#ALLOCATIONAlt
    | funcCall
    {
        $t = null;
    }
                                                       //#FUNCCALLAlt
    | var
    {
        $t = $var.varType;
    }
                                                       //#VARAlt
    | list
    {
        $t = $list.listType;
    }
                                                       //#LISTAlt
    | NIL
    {
        $t = null;
    }
                                                       //#NILAlt
    ;
funcCall
    : (var DOT)? handleCall                            #METHODCALLAlt
    | READ OpenPar var ClosePar                        #READAlt
    | WRITE OpenPar var ClosePar                       #WRITEAlt
    ;
list returns [Type listType]
    : OpenBrace a=expr (COMMA b+=expr)* CloseBrace
    {
        var type = $a.t;
        if(!$b.stream().map(t -> t.t).allMatch(t -> type == t))
        {
            LuluListener.currentNode.throwError(new CompileError("incompatible types"));
        }
        else
            $listType = new Array($a.t, $b.size() + 1);
    }
    ;
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
constVal returns [Type t]
    : IntLiteral {$t = Type.Int();}
    | FloatLiteral {$t = Type.Float();}
    | BoolLiteral {$t = Type.Bool();}
    | StringLiteral {$t = Type.String();}
    ;
unaryOp : SUBTRACTION | LogicalNot | BitwiseNegation; //TODO("if two rules have equal precedence, then prefering one two others is wrong or not?")
firstLevelBinaryArithmeticOp : MULTIPLICATION | DIVISION | MODULUS;
secondLevelBinaryArithmeticOp : ADDITION | SUBTRACTION;
firstLevelBinaryRelationalOp : LessThanOrEqual | LessThan | BiggerThanOrEqual | BiggerThan;
secondLevelBinaryRelationalOp : EQUAL | NotEqual;
//----------------------------------------End Parser----------------------------------------\\