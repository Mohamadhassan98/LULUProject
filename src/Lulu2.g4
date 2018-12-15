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
STRING : 'StringType';
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
        : assign SEMICOLON
       | funcCall SEMICOLON
       | condStmt
       | loopStmt
       | RETURN SEMICOLON
       | BREAK SEMICOLON
       | CONTINUE SEMICOLON
       | DESTRUCT (OpenBrace CloseBrace)* ID SEMICOLON
       ;
assign : (var | OpenPar var (COMMA var)* ClosePar) ASSIGN expr;
var : ((THIS | SUPER)DOT)?ref (DOT ref)*;
ref : ID (OpenBrace expr CloseBrace)*;
expr
       : OpenPar expr ClosePar
       | unaryOp expr
       | expr firstLevelBinaryArithmeticOp expr
       | expr secondLevelBinaryArithmeticOp expr
       | expr firstLevelBinaryRelationalOp expr
       | expr secondLevelBinaryRelationalOp expr
       | expr BitwiseAnd expr
       | expr BitwiseLogicalXor expr
       | expr BitwiseOr expr
       | expr LogicalAnd expr
       | expr LogicalOr expr
       | constVal
       | ALLOCATE handleCall
       | funcCall
       | var
       | list
       | NIL
       ;
funcCall : (var DOT)? handleCall | READ OpenPar var ClosePar | WRITE OpenPar var ClosePar;
list : OpenBrace (expr | list) (COMMA ( expr | list))* CloseBrace;
handleCall : ID OpenPar params? ClosePar;
params : expr | expr COMMA params;
condStmt
       : IF expr block (ELSE block)?
       | SWITCH var OpenCurlyBrace (CASE IntLiteral COLON block)* DEFAULT COLON block CloseCurlyBrace;
loopStmt
       : FOR (type? assign)? SEMICOLON expr SEMICOLON assign? block
       | WHILE expr block
       ;
type : INT | BOOL | FLOAT | STRING | ID;
constVal : IntLiteral | FloatLiteral | BoolLiteral | StringLiteral;
unaryOp : SUBTRACTION | LogicalNot | BitwiseNegation;
firstLevelBinaryArithmeticOp : MULTIPLICATION | DIVISION | MODULUS;
secondLevelBinaryArithmeticOp : ADDITION | SUBTRACTION;
firstLevelBinaryRelationalOp :  LessThanOrEqual | LessThan | BiggerThanOrEqual | BiggerThan;
secondLevelBinaryRelationalOp : EQUAL | NotEqual;
//----------------------------------------End Parser----------------------------------------\\