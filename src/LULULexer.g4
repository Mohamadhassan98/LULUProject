lexer grammar LULULexer;
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
OF : 'of'; //may be fragment based on use
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
