grammar Lulu2;
//----------------------------------------Lexer----------------------------------------\\
//--------------------Comment--------------------\\
SingleLineComment : '%%' ~'\n'*('\n'|EOF) -> channel(HIDDEN);
MultiLineComment : '%~'.*?'~%' -> channel(HIDDEN);
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
fragment HEX : DIGIT|[a-fA-F] ;
fragment HEXADECIMAL : '0'[Xx]HEX+;
IntLiteral : DECIMAL | HEXADECIMAL;
fragment EXPONENT : [Ee][+-]?DECIMAL;
FloatLiteral : IntLiteral+ '.' DECIMAL EXPONENT?;
fragment StringSample : (~'\\');
fragment UNICODE : [xX] HEX HEX ;
fragment ESCAPE : '\\'(['bnrt0] | UNICODE | '\\');
StringLiteral : '\'' (StringSample | ESCAPE)*? '\'';
BoolLiteral : FALSE | TRUE;
ID : [A-Za-z#_][A-Za-z0-9#_]*;
WhiteSpace : [ \t\r\n]+ -> skip;
//----------------------------------------End Lexer----------------------------------------\\


//----------------------------------------Parser----------------------------------------\\
main : ftDcl? ftDef+ EOF;
ftDcl : DECLARE OpenCurlyBrace ( funcDcl | typeDcl | varDef)+ CloseCurlyBrace;
funcDcl : (OpenPar args ClosePar ASSIGN)? ID OpenPar (args | argsVar)? ClosePar SEMICOLON;
args : type(OpenBrace CloseBrace)* | args COMMA type (OpenBrace CloseBrace)*;
argsVar : type (OpenBrace CloseBrace)* ID | argsVar COMMA type (OpenBrace CloseBrace)* ID;
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
        : assign SEMICOLON                                                          #ASSIGNAlt
       | funcCall SEMICOLON                                                       #FUNCCALLSTMTAlt
       | condStmt                                                                         #CONDSTMTAlt
       | loopStmt                                                                          #LOOPSTMTAlt
       | RETURN SEMICOLON                                                       #RETURNAlt
       | BREAK SEMICOLON                                                          #BREAKAlt
       | CONTINUE SEMICOLON                                                   #CONTINUEAlt
       | DESTRUCT (OpenBrace CloseBrace)* ID SEMICOLON    #DESTRUCTAlt
       ;
assign : (var | OpenPar var (COMMA var)* ClosePar) ASSIGN expr;
var : ((THIS | SUPER)DOT)?ref (DOT ref)*;
ref : ID (OpenBrace expr CloseBrace)*;
expr
       : OpenPar expr ClosePar                                      #PAREXPRAlt
       | unaryOp expr                                                     #UNARYOPAlt
       | expr firstLevelBinaryArithmeticOp expr           #MULDIVAlt
       | expr secondLevelBinaryArithmeticOp expr      #ADDSUBAlt
       | expr firstLevelBinaryRelationalOp expr            #COMPAREAlt
       | expr secondLevelBinaryRelationalOp expr       #EQUALITYAlt
       | expr BitwiseAnd expr                                         #BITWISEANDAlt
       | expr BitwiseLogicalXor expr                               #BITWISELOGICALXORAlt
       | expr BitwiseOr expr                                            #BITWISEORAlt
       | expr LogicalAnd expr                                          #LOGICALANDAlt
       | expr LogicalOr expr                                             #LOGICALORAlt
       | constVal                                                               #CONSTVALAlt
       | ALLOCATE handleCall                                          #ALLOCATIONAlt
       | funcCall                                                                #FUNCCALLAlt
       | var                                                                        #VARAlt
       | list                                                                        #LISTAlt
       | NIL                                                                        #NILAlt
       ;
funcCall
       : (var DOT)? handleCall                  #METHODCALLAlt
       | READ OpenPar var ClosePar        #READAlt
       | WRITE OpenPar var ClosePar      #WRITEAlt
       ;
list : OpenBrace (expr | list) (COMMA ( expr | list))* CloseBrace;
handleCall : ID OpenPar params? ClosePar;
params : expr | expr COMMA params;
condStmt
       : IF expr block (ELSE block)?                                                                                                                                #IFAlt
       | SWITCH var OpenCurlyBrace (CASE IntLiteral COLON block)* DEFAULT COLON block CloseCurlyBrace     #SWITCHAlt
       ;
loopStmt
       : FOR (type? assign)? SEMICOLON expr SEMICOLON assign? block     #FORAlt
       | WHILE expr block                                                                                #WHILEAlt
       ;
type : INT | BOOL | FLOAT | STRING | ID;
constVal : IntLiteral | FloatLiteral | BoolLiteral | StringLiteral;
unaryOp : SUBTRACTION | LogicalNot | BitwiseNegation;
firstLevelBinaryArithmeticOp : MULTIPLICATION | DIVISION | MODULUS;
secondLevelBinaryArithmeticOp : ADDITION | SUBTRACTION;
firstLevelBinaryRelationalOp :  LessThanOrEqual | LessThan | BiggerThanOrEqual | BiggerThan;
secondLevelBinaryRelationalOp : EQUAL | NotEqual;
//----------------------------------------End Parser----------------------------------------\\