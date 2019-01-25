// Generated from C:/Users/Mohamadhassan/IdeaProjects/LULUProject/src/LULU\Lulu2.g4 by ANTLR 4.7
package LULU;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Lulu2Parser extends Parser
{
    public static final int SingleLineComment = 1, MultiLineComment = 2, ALLOCATE = 3, BOOL = 4, BREAK = 5, CASE = 6, CONST = 7, CONTINUE = 8, DECLARE = 9, DEFAULT = 10, DESTRUCT = 11, ELSE = 12, FUNCTION = 13, FLOAT = 14, FOR = 15, IF = 16, INT = 17, NIL = 18, OF = 19, PRIVATE = 20, PROTECTED = 21, PUBLIC = 22, READ = 23, RETURN = 24, STRING = 25, SUPER = 26, SWITCH = 27, THIS = 28, TYPE = 29, WHILE = 30, WRITE = 31, EQUAL = 32, NotEqual = 33, LessThanOrEqual = 34, LessThan = 35, BiggerThan = 36, BiggerThanOrEqual = 37, BitwiseNegation = 38, BitwiseOr = 39, BitwiseAnd = 40, BitwiseLogicalXor = 41, LogicalOr = 42, LogicalAnd = 43, LogicalNot = 44, SUBTRACTION = 45, ADDITION = 46, MULTIPLICATION = 47, DIVISION = 48, MODULUS = 49, ASSIGN = 50, OpenCurlyBrace = 51, CloseCurlyBrace = 52, OpenPar = 53, ClosePar = 54, OpenBrace = 55, CloseBrace = 56, DOT = 57, COMMA = 58, COLON = 59, SEMICOLON = 60, IntLiteral = 61, FloatLiteral = 62, StringLiteral = 63, BoolLiteral = 64, ID = 65, WhiteSpace = 66;
    public static final int RULE_main = 0, RULE_ftDcl = 1, RULE_funcDcl = 2, RULE_typeBrace = 3, RULE_args = 4, RULE_argsVar = 5, RULE_typeDcl = 6, RULE_varDef = 7, RULE_varVal = 8, RULE_ftDef = 9, RULE_typeDef = 10, RULE_component = 11, RULE_accessModifier = 12, RULE_funcDef = 13, RULE_block = 14, RULE_stmt = 15, RULE_assign = 16, RULE_var = 17, RULE_ref = 18, RULE_expr = 19, RULE_funcCall = 20, RULE_list = 21, RULE_handleCall = 22, RULE_params = 23, RULE_condStmt = 24, RULE_loopStmt = 25, RULE_type = 26, RULE_constVal = 27, RULE_unaryOp = 28, RULE_firstLevelBinaryArithmeticOp = 29, RULE_secondLevelBinaryArithmeticOp = 30, RULE_firstLevelBinaryRelationalOp = 31, RULE_secondLevelBinaryRelationalOp = 32;
    public static final String[] ruleNames = {
            "main",
            "ftDcl",
            "funcDcl", "typeBrace",
            "args",
            "argsVar",
            "typeDcl",
            "varDef",
            "varVal",
            "ftDef",
            "typeDef",
            "component",
            "accessModifier",
            "funcDef",
            "block",
            "stmt",
            "assign",
            "var",
            "ref",
            "expr",
            "funcCall",
            "list",
            "handleCall",
            "params",
            "condStmt",
            "loopStmt",
            "type",
            "constVal",
            "unaryOp",
            "firstLevelBinaryArithmeticOp",
            "secondLevelBinaryArithmeticOp",
            "firstLevelBinaryRelationalOp",
            "secondLevelBinaryRelationalOp"
    };
    public static final String _serializedATN = "\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3D\u01ec\4\2\t\2\4" + "\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t" + "\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22" + "\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31" + "\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!" + "\t!\4\"\t\"\3\2\5\2F\n\2\3\2\6\2I\n\2\r\2\16\2J\3\2\3\2\3\3\3\3\3\3\3" + "\3\3\3\6\3T\n\3\r\3\16\3U\3\3\3\3\3\4\3\4\3\4\3\4\3\4\5\4_\n\4\3\4\3\4" + "\3\4\3\4\5\4e\n\4\3\4\3\4\3\4\3\5\3\5\3\5\7\5m\n\5\f\5\16\5p\13\5\3\5" + "\3\5\3\6\3\6\3\6\7\6w\n\6\f\6\16\6z\13\6\3\7\3\7\3\7\7\7\177\n\7\f\7\16" + "\7\u0082\13\7\3\7\3\7\3\7\3\7\3\7\7\7\u0089\n\7\f\7\16\7\u008c\13\7\3" + "\7\3\7\7\7\u0090\n\7\f\7\16\7\u0093\13\7\3\b\3\b\3\b\3\t\5\t\u0099\n\t" + "\3\t\3\t\3\t\3\t\7\t\u009f\n\t\f\t\16\t\u00a2\13\t\3\t\3\t\3\n\3\n\3\n" + "\5\n\u00a9\n\n\3\13\3\13\5\13\u00ad\n\13\3\f\3\f\3\f\3\f\5\f\u00b3\n\f" + "\3\f\3\f\6\f\u00b7\n\f\r\f\16\f\u00b8\3\f\3\f\3\r\5\r\u00be\n\r\3\r\3" + "\r\5\r\u00c2\n\r\3\16\3\16\3\17\3\17\3\17\3\17\3\17\5\17\u00cb\n\17\3" + "\17\3\17\3\17\3\17\5\17\u00d1\n\17\3\17\3\17\3\17\3\20\3\20\3\20\7\20" + "\u00d9\n\20\f\20\16\20\u00dc\13\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21" + "\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u00f1" + "\n\21\f\21\16\21\u00f4\13\21\3\21\3\21\5\21\u00f8\n\21\3\22\3\22\3\22" + "\3\22\3\22\7\22\u00ff\n\22\f\22\16\22\u0102\13\22\3\22\3\22\5\22\u0106" + "\n\22\3\22\3\22\3\22\3\23\3\23\5\23\u010d\n\23\3\23\3\23\3\23\7\23\u0112" + "\n\23\f\23\16\23\u0115\13\23\3\24\3\24\3\24\3\24\3\24\7\24\u011c\n\24" + "\f\24\16\24\u011f\13\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3" + "\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5" + "\25\u0138\n\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25" + "\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25" + "\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25" + "\3\25\3\25\3\25\3\25\3\25\3\25\7\25\u0167\n\25\f\25\16\25\u016a\13\25" + "\3\26\3\26\3\26\5\26\u016f\n\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26" + "\3\26\3\26\3\26\5\26\u017c\n\26\3\27\3\27\3\27\5\27\u0181\n\27\3\27\3" + "\27\3\27\5\27\u0186\n\27\7\27\u0188\n\27\f\27\16\27\u018b\13\27\3\27\3" + "\27\3\30\3\30\3\30\5\30\u0192\n\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31" + "\5\31\u019b\n\31\3\32\3\32\3\32\3\32\3\32\5\32\u01a2\n\32\3\32\3\32\3" + "\32\3\32\3\32\3\32\3\32\7\32\u01ab\n\32\f\32\16\32\u01ae\13\32\3\32\3" + "\32\3\32\3\32\3\32\5\32\u01b5\n\32\3\33\3\33\5\33\u01b9\n\33\3\33\5\33" + "\u01bc\n\33\3\33\3\33\3\33\3\33\5\33\u01c2\n\33\3\33\3\33\3\33\3\33\3" + "\33\3\33\5\33\u01ca\n\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34" + "\3\34\5\34\u01d6\n\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u01e0" + "\n\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3\"\2\3(#\2\4\6\b\n\f\16" + "\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@B\2\t\3\2\26\30\4\2" + "\34\34\36\36\4\2((./\3\2\61\63\3\2/\60\3\2$\'\3\2\"#\2\u0216\2E\3\2\2" + "\2\4N\3\2\2\2\6^\3\2\2\2\bi\3\2\2\2\ns\3\2\2\2\f{\3\2\2\2\16\u0094\3\2" + "\2\2\20\u0098\3\2\2\2\22\u00a5\3\2\2\2\24\u00ac\3\2\2\2\26\u00ae\3\2\2" + "\2\30\u00bd\3\2\2\2\32\u00c3\3\2\2\2\34\u00ca\3\2\2\2\36\u00d5\3\2\2\2" + " \u00f7\3\2\2\2\"\u0105\3\2\2\2$\u010c\3\2\2\2&\u0116\3\2\2\2(\u0137\3" + "\2\2\2*\u017b\3\2\2\2,\u017d\3\2\2\2.\u018e\3\2\2\2\60\u019a\3\2\2\2\62" + "\u01b4\3\2\2\2\64\u01c9\3\2\2\2\66\u01d5\3\2\2\28\u01df\3\2\2\2:\u01e1" + "\3\2\2\2<\u01e3\3\2\2\2>\u01e5\3\2\2\2@\u01e7\3\2\2\2B\u01e9\3\2\2\2D" + "F\5\4\3\2ED\3\2\2\2EF\3\2\2\2FH\3\2\2\2GI\5\24\13\2HG\3\2\2\2IJ\3\2\2" + "\2JH\3\2\2\2JK\3\2\2\2KL\3\2\2\2LM\7\2\2\3M\3\3\2\2\2NO\7\13\2\2OS\7\65" + "\2\2PT\5\6\4\2QT\5\16\b\2RT\5\20\t\2SP\3\2\2\2SQ\3\2\2\2SR\3\2\2\2TU\3" + "\2\2\2US\3\2\2\2UV\3\2\2\2VW\3\2\2\2WX\7\66\2\2X\5\3\2\2\2YZ\7\67\2\2" + "Z[\5\n\6\2[\\\78\2\2\\]\7\64\2\2]_\3\2\2\2^Y\3\2\2\2^_\3\2\2\2_`\3\2\2" + "\2`a\7C\2\2ad\7\67\2\2be\5\n\6\2ce\5\f\7\2db\3\2\2\2dc\3\2\2\2de\3\2\2" + "\2ef\3\2\2\2fg\78\2\2gh\7>\2\2h\7\3\2\2\2in\5\66\34\2jk\79\2\2km\7:\2" + "\2lj\3\2\2\2mp\3\2\2\2nl\3\2\2\2no\3\2\2\2oq\3\2\2\2pn\3\2\2\2qr\b\5\1" + "\2r\t\3\2\2\2sx\5\b\5\2tu\7<\2\2uw\5\b\5\2vt\3\2\2\2wz\3\2\2\2xv\3\2\2" + "\2xy\3\2\2\2y\13\3\2\2\2zx\3\2\2\2{\u0080\5\66\34\2|}\79\2\2}\177\7:\2" + "\2~|\3\2\2\2\177\u0082\3\2\2\2\u0080~\3\2\2\2\u0080\u0081\3\2\2\2\u0081" + "\u0083\3\2\2\2\u0082\u0080\3\2\2\2\u0083\u0091\7C\2\2\u0084\u0085\7<\2" + "\2\u0085\u008a\5\66\34\2\u0086\u0087\79\2\2\u0087\u0089\7:\2\2\u0088\u0086" + "\3\2\2\2\u0089\u008c\3\2\2\2\u008a\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b" + "\u008d\3\2\2\2\u008c\u008a\3\2\2\2\u008d\u008e\7C\2\2\u008e\u0090\3\2" + "\2\2\u008f\u0084\3\2\2\2\u0090\u0093\3\2\2\2\u0091\u008f\3\2\2\2\u0091" + "\u0092\3\2\2\2\u0092\r\3\2\2\2\u0093\u0091\3\2\2\2\u0094\u0095\7C\2\2" + "\u0095\u0096\7>\2\2\u0096\17\3\2\2\2\u0097\u0099\7\t\2\2\u0098\u0097\3" + "\2\2\2\u0098\u0099\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u009b\5\66\34\2\u009b" + "\u00a0\5\22\n\2\u009c\u009d\7<\2\2\u009d\u009f\5\22\n\2\u009e\u009c\3" + "\2\2\2\u009f\u00a2\3\2\2\2\u00a0\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1" + "\u00a3\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a3\u00a4\7>\2\2\u00a4\21\3\2\2\2" + "\u00a5\u00a8\5&\24\2\u00a6\u00a7\7\64\2\2\u00a7\u00a9\5(\25\2\u00a8\u00a6" + "\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\23\3\2\2\2\u00aa\u00ad\5\26\f\2\u00ab" + "\u00ad\5\34\17\2\u00ac\u00aa\3\2\2\2\u00ac\u00ab\3\2\2\2\u00ad\25\3\2" + "\2\2\u00ae\u00af\7\37\2\2\u00af\u00b2\7C\2\2\u00b0\u00b1\7=\2\2\u00b1" + "\u00b3\7C\2\2\u00b2\u00b0\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b4\3\2" + "\2\2\u00b4\u00b6\7\65\2\2\u00b5\u00b7\5\30\r\2\u00b6\u00b5\3\2\2\2\u00b7" + "\u00b8\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00ba\3\2" + "\2\2\u00ba\u00bb\7\66\2\2\u00bb\27\3\2\2\2\u00bc\u00be\5\32\16\2\u00bd" + "\u00bc\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00c1\3\2\2\2\u00bf\u00c2\5\20" + "\t\2\u00c0\u00c2\5\34\17\2\u00c1\u00bf\3\2\2\2\u00c1\u00c0\3\2\2\2\u00c2" + "\31\3\2\2\2\u00c3\u00c4\t\2\2\2\u00c4\33\3\2\2\2\u00c5\u00c6\7\67\2\2" + "\u00c6\u00c7\5\f\7\2\u00c7\u00c8\78\2\2\u00c8\u00c9\7\64\2\2\u00c9\u00cb" + "\3\2\2\2\u00ca\u00c5\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc" + "\u00cd\7\17\2\2\u00cd\u00ce\7C\2\2\u00ce\u00d0\7\67\2\2\u00cf\u00d1\5" + "\f\7\2\u00d0\u00cf\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2" + "\u00d3\78\2\2\u00d3\u00d4\5\36\20\2\u00d4\35\3\2\2\2\u00d5\u00da\7\65" + "\2\2\u00d6\u00d9\5\20\t\2\u00d7\u00d9\5 \21\2\u00d8\u00d6\3\2\2\2\u00d8" + "\u00d7\3\2\2\2\u00d9\u00dc\3\2\2\2\u00da\u00d8\3\2\2\2\u00da\u00db\3\2" + "\2\2\u00db\u00dd\3\2\2\2\u00dc\u00da\3\2\2\2\u00dd\u00de\7\66\2\2\u00de" + "\37\3\2\2\2\u00df\u00e0\5\"\22\2\u00e0\u00e1\7>\2\2\u00e1\u00f8\3\2\2" + "\2\u00e2\u00e3\5*\26\2\u00e3\u00e4\7>\2\2\u00e4\u00f8\3\2\2\2\u00e5\u00f8" + "\5\62\32\2\u00e6\u00f8\5\64\33\2\u00e7\u00e8\7\32\2\2\u00e8\u00f8\7>\2" + "\2\u00e9\u00ea\7\7\2\2\u00ea\u00f8\7>\2\2\u00eb\u00ec\7\n\2\2\u00ec\u00f8" + "\7>\2\2\u00ed\u00f2\7\r\2\2\u00ee\u00ef\79\2\2\u00ef\u00f1\7:\2\2\u00f0" + "\u00ee\3\2\2\2\u00f1\u00f4\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f2\u00f3\3\2" + "\2\2\u00f3\u00f5\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f5\u00f6\7C\2\2\u00f6" + "\u00f8\7>\2\2\u00f7\u00df\3\2\2\2\u00f7\u00e2\3\2\2\2\u00f7\u00e5\3\2" + "\2\2\u00f7\u00e6\3\2\2\2\u00f7\u00e7\3\2\2\2\u00f7\u00e9\3\2\2\2\u00f7" + "\u00eb\3\2\2\2\u00f7\u00ed\3\2\2\2\u00f8!\3\2\2\2\u00f9\u0106\5$\23\2" + "\u00fa\u00fb\7\67\2\2\u00fb\u0100\5$\23\2\u00fc\u00fd\7<\2\2\u00fd\u00ff" + "\5$\23\2\u00fe\u00fc\3\2\2\2\u00ff\u0102\3\2\2\2\u0100\u00fe\3\2\2\2\u0100" + "\u0101\3\2\2\2\u0101\u0103\3\2\2\2\u0102\u0100\3\2\2\2\u0103\u0104\78" + "\2\2\u0104\u0106\3\2\2\2\u0105\u00f9\3\2\2\2\u0105\u00fa\3\2\2\2\u0106" + "\u0107\3\2\2\2\u0107\u0108\7\64\2\2\u0108\u0109\5(\25\2\u0109#\3\2\2\2" + "\u010a\u010b\t\3\2\2\u010b\u010d\7;\2\2\u010c\u010a\3\2\2\2\u010c\u010d" + "\3\2\2\2\u010d\u010e\3\2\2\2\u010e\u0113\5&\24\2\u010f\u0110\7;\2\2\u0110" + "\u0112\5&\24\2\u0111\u010f\3\2\2\2\u0112\u0115\3\2\2\2\u0113\u0111\3\2" + "\2\2\u0113\u0114\3\2\2\2\u0114%\3\2\2\2\u0115\u0113\3\2\2\2\u0116\u011d" + "\7C\2\2\u0117\u0118\79\2\2\u0118\u0119\5(\25\2\u0119\u011a\7:\2\2\u011a" + "\u011c\3\2\2\2\u011b\u0117\3\2\2\2\u011c\u011f\3\2\2\2\u011d\u011b\3\2" + "\2\2\u011d\u011e\3\2\2\2\u011e\'\3\2\2\2\u011f\u011d\3\2\2\2\u0120\u0121" + "\b\25\1\2\u0121\u0122\7\67\2\2\u0122\u0123\5(\25\2\u0123\u0124\78\2\2" + "\u0124\u0125\b\25\1\2\u0125\u0138\3\2\2\2\u0126\u0127\5:\36\2\u0127\u0128" + "\5(\25\22\u0128\u0129\b\25\1\2\u0129\u0138\3\2\2\2\u012a\u012b\58\35\2" + "\u012b\u012c\b\25\1\2\u012c\u0138\3\2\2\2\u012d\u012e\7\5\2\2\u012e\u012f" + "\5.\30\2\u012f\u0130\b\25\1\2\u0130\u0138\3\2\2\2\u0131\u0132\5*\26\2" + "\u0132\u0133\b\25\1\2\u0133\u0138\3\2\2\2\u0134\u0138\5$\23\2\u0135\u0138" + "\5,\27\2\u0136\u0138\7\24\2\2\u0137\u0120\3\2\2\2\u0137\u0126\3\2\2\2" + "\u0137\u012a\3\2\2\2\u0137\u012d\3\2\2\2\u0137\u0131\3\2\2\2\u0137\u0134" + "\3\2\2\2\u0137\u0135\3\2\2\2\u0137\u0136\3\2\2\2\u0138\u0168\3\2\2\2\u0139" + "\u013a\f\21\2\2\u013a\u013b\5<\37\2\u013b\u013c\5(\25\22\u013c\u013d\b" + "\25\1\2\u013d\u0167\3\2\2\2\u013e\u013f\f\20\2\2\u013f\u0140\5> \2\u0140" + "\u0141\5(\25\21\u0141\u0142\b\25\1\2\u0142\u0167\3\2\2\2\u0143\u0144\f" + "\17\2\2\u0144\u0145\5@!\2\u0145\u0146\5(\25\20\u0146\u0147\b\25\1\2\u0147" + "\u0167\3\2\2\2\u0148\u0149\f\16\2\2\u0149\u014a\5B\"\2\u014a\u014b\5(" + "\25\17\u014b\u014c\b\25\1\2\u014c\u0167\3\2\2\2\u014d\u014e\f\r\2\2\u014e" + "\u014f\7*\2\2\u014f\u0150\5(\25\16\u0150\u0151\b\25\1\2\u0151\u0167\3" + "\2\2\2\u0152\u0153\f\f\2\2\u0153\u0154\7+\2\2\u0154\u0155\5(\25\r\u0155" + "\u0156\b\25\1\2\u0156\u0167\3\2\2\2\u0157\u0158\f\13\2\2\u0158\u0159\7" + ")\2\2\u0159\u015a\5(\25\f\u015a\u015b\b\25\1\2\u015b\u0167\3\2\2\2\u015c" + "\u015d\f\n\2\2\u015d\u015e\7-\2\2\u015e\u015f\5(\25\13\u015f\u0160\b\25" + "\1\2\u0160\u0167\3\2\2\2\u0161\u0162\f\t\2\2\u0162\u0163\7,\2\2\u0163" + "\u0164\5(\25\n\u0164\u0165\b\25\1\2\u0165\u0167\3\2\2\2\u0166\u0139\3" + "\2\2\2\u0166\u013e\3\2\2\2\u0166\u0143\3\2\2\2\u0166\u0148\3\2\2\2\u0166" + "\u014d\3\2\2\2\u0166\u0152\3\2\2\2\u0166\u0157\3\2\2\2\u0166\u015c\3\2" + "\2\2\u0166\u0161\3\2\2\2\u0167\u016a\3\2\2\2\u0168\u0166\3\2\2\2\u0168" + "\u0169\3\2\2\2\u0169)\3\2\2\2\u016a\u0168\3\2\2\2\u016b\u016c\5$\23\2" + "\u016c\u016d\7;\2\2\u016d\u016f\3\2\2\2\u016e\u016b\3\2\2\2\u016e\u016f" + "\3\2\2\2\u016f\u0170\3\2\2\2\u0170\u017c\5.\30\2\u0171\u0172\7\31\2\2" + "\u0172\u0173\7\67\2\2\u0173\u0174\5$\23\2\u0174\u0175\78\2\2\u0175\u017c" + "\3\2\2\2\u0176\u0177\7!\2\2\u0177\u0178\7\67\2\2\u0178\u0179\5$\23\2\u0179" + "\u017a\78\2\2\u017a\u017c\3\2\2\2\u017b\u016e\3\2\2\2\u017b\u0171\3\2" + "\2\2\u017b\u0176\3\2\2\2\u017c+\3\2\2\2\u017d\u0180\79\2\2\u017e\u0181" + "\5(\25\2\u017f\u0181\5,\27\2\u0180\u017e\3\2\2\2\u0180\u017f\3\2\2\2\u0181" + "\u0189\3\2\2\2\u0182\u0185\7<\2\2\u0183\u0186\5(\25\2\u0184\u0186\5,\27" + "\2\u0185\u0183\3\2\2\2\u0185\u0184\3\2\2\2\u0186\u0188\3\2\2\2\u0187\u0182" + "\3\2\2\2\u0188\u018b\3\2\2\2\u0189\u0187\3\2\2\2\u0189\u018a\3\2\2\2\u018a" + "\u018c\3\2\2\2\u018b\u0189\3\2\2\2\u018c\u018d\7:\2\2\u018d-\3\2\2\2\u018e" + "\u018f\7C\2\2\u018f\u0191\7\67\2\2\u0190\u0192\5\60\31\2\u0191\u0190\3" + "\2\2\2\u0191\u0192\3\2\2\2\u0192\u0193\3\2\2\2\u0193\u0194\78\2\2\u0194" + "/\3\2\2\2\u0195\u019b\5(\25\2\u0196\u0197\5(\25\2\u0197\u0198\7<\2\2\u0198" + "\u0199\5\60\31\2\u0199\u019b\3\2\2\2\u019a\u0195\3\2\2\2\u019a\u0196\3" + "\2\2\2\u019b\61\3\2\2\2\u019c\u019d\7\22\2\2\u019d\u019e\5(\25\2\u019e" + "\u01a1\5\36\20\2\u019f\u01a0\7\16\2\2\u01a0\u01a2\5\36\20\2\u01a1\u019f" + "\3\2\2\2\u01a1\u01a2\3\2\2\2\u01a2\u01b5\3\2\2\2\u01a3\u01a4\7\35\2\2" + "\u01a4\u01a5\5$\23\2\u01a5\u01ac\7\65\2\2\u01a6\u01a7\7\b\2\2\u01a7\u01a8" + "\7?\2\2\u01a8\u01a9\7=\2\2\u01a9\u01ab\5\36\20\2\u01aa\u01a6\3\2\2\2\u01ab" + "\u01ae\3\2\2\2\u01ac\u01aa\3\2\2\2\u01ac\u01ad\3\2\2\2\u01ad\u01af\3\2" + "\2\2\u01ae\u01ac\3\2\2\2\u01af\u01b0\7\f\2\2\u01b0\u01b1\7=\2\2\u01b1" + "\u01b2\5\36\20\2\u01b2\u01b3\7\66\2\2\u01b3\u01b5\3\2\2\2\u01b4\u019c" + "\3\2\2\2\u01b4\u01a3\3\2\2\2\u01b5\63\3\2\2\2\u01b6\u01bb\7\21\2\2\u01b7" + "\u01b9\5\66\34\2\u01b8\u01b7\3\2\2\2\u01b8\u01b9\3\2\2\2\u01b9\u01ba\3" + "\2\2\2\u01ba\u01bc\5\"\22\2\u01bb\u01b8\3\2\2\2\u01bb\u01bc\3\2\2\2\u01bc" + "\u01bd\3\2\2\2\u01bd\u01be\7>\2\2\u01be\u01bf\5(\25\2\u01bf\u01c1\7>\2" + "\2\u01c0\u01c2\5\"\22\2\u01c1\u01c0\3\2\2\2\u01c1\u01c2\3\2\2\2\u01c2" + "\u01c3\3\2\2\2\u01c3\u01c4\5\36\20\2\u01c4\u01ca\3\2\2\2\u01c5\u01c6\7" + " \2\2\u01c6\u01c7\5(\25\2\u01c7\u01c8\5\36\20\2\u01c8\u01ca\3\2\2\2\u01c9" + "\u01b6\3\2\2\2\u01c9\u01c5\3\2\2\2\u01ca\65\3\2\2\2\u01cb\u01cc\7\23\2" + "\2\u01cc\u01d6\b\34\1\2\u01cd\u01ce\7\6\2\2\u01ce\u01d6\b\34\1\2\u01cf" + "\u01d0\7\20\2\2\u01d0\u01d6\b\34\1\2\u01d1\u01d2\7\33\2\2\u01d2\u01d6" + "\b\34\1\2\u01d3\u01d4\7C\2\2\u01d4\u01d6\b\34\1\2\u01d5\u01cb\3\2\2\2" + "\u01d5\u01cd\3\2\2\2\u01d5\u01cf\3\2\2\2\u01d5\u01d1\3\2\2\2\u01d5\u01d3" + "\3\2\2\2\u01d6\67\3\2\2\2\u01d7\u01d8\7?\2\2\u01d8\u01e0\b\35\1\2\u01d9" + "\u01da\7@\2\2\u01da\u01e0\b\35\1\2\u01db\u01dc\7B\2\2\u01dc\u01e0\b\35" + "\1\2\u01dd\u01de\7A\2\2\u01de\u01e0\b\35\1\2\u01df\u01d7\3\2\2\2\u01df" + "\u01d9\3\2\2\2\u01df\u01db\3\2\2\2\u01df\u01dd\3\2\2\2\u01e09\3\2\2\2" + "\u01e1\u01e2\t\4\2\2\u01e2;\3\2\2\2\u01e3\u01e4\t\5\2\2\u01e4=\3\2\2\2" + "\u01e5\u01e6\t\6\2\2\u01e6?\3\2\2\2\u01e7\u01e8\t\7\2\2\u01e8A\3\2\2\2" + "\u01e9\u01ea\t\b\2\2\u01eaC\3\2\2\2\63EJSU^dnx\u0080\u008a\u0091\u0098" + "\u00a0\u00a8\u00ac\u00b2\u00b8\u00bd\u00c1\u00ca\u00d0\u00d8\u00da\u00f2" + "\u00f7\u0100\u0105\u010c\u0113\u011d\u0137\u0166\u0168\u016e\u017b\u0180" + "\u0185\u0189\u0191\u019a\u01a1\u01ac\u01b4\u01b8\u01bb\u01c1\u01c9\u01d5" + "\u01df";
    /**
     * @deprecated Use {@link #VOCABULARY} instead.
     */
    @Deprecated
    public static final String[] tokenNames;
    public static final ATN _ATN = new ATNDeserializer().deserialize(_serializedATN.toCharArray());
    protected static final DFA[] _decisionToDFA;
    protected static final PredictionContextCache _sharedContextCache = new PredictionContextCache();
    private static final String[] _SYMBOLIC_NAMES = {
            null,
            "SingleLineComment",
            "MultiLineComment",
            "ALLOCATE",
            "BOOL",
            "BREAK",
            "CASE",
            "CONST",
            "CONTINUE",
            "DECLARE",
            "DEFAULT",
            "DESTRUCT",
            "ELSE",
            "FUNCTION",
            "FLOAT",
            "FOR",
            "IF",
            "INT",
            "NIL",
            "OF",
            "PRIVATE",
            "PROTECTED",
            "PUBLIC",
            "READ",
            "RETURN",
            "STRING",
            "SUPER",
            "SWITCH",
            "THIS",
            "TYPE",
            "WHILE",
            "WRITE",
            "EQUAL",
            "NotEqual",
            "LessThanOrEqual",
            "LessThan",
            "BiggerThan",
            "BiggerThanOrEqual",
            "BitwiseNegation",
            "BitwiseOr",
            "BitwiseAnd",
            "BitwiseLogicalXor",
            "LogicalOr",
            "LogicalAnd",
            "LogicalNot",
            "SUBTRACTION",
            "ADDITION",
            "MULTIPLICATION",
            "DIVISION",
            "MODULUS",
            "ASSIGN",
            "OpenCurlyBrace",
            "CloseCurlyBrace",
            "OpenPar",
            "ClosePar",
            "OpenBrace",
            "CloseBrace",
            "DOT",
            "COMMA",
            "COLON",
            "SEMICOLON",
            "IntLiteral",
            "FloatLiteral",
            "StringLiteral",
            "BoolLiteral",
            "ID",
            "WhiteSpace"
    };
    private static final String[] STRINGS = {
            null,
            null,
            null,
            "'allocate'",
            "'bool'",
            "'break'",
            "'case'",
            "'const'",
            "'continue'",
            "'declare'",
            "'default'",
            "'destruct'",
            "'else'",
            "'function'",
            "'float'",
            "'for'",
            "'if'",
            "'int'",
            "'nil'",
            "'of'",
            "'private'",
            "'protected'",
            "'public'",
            "'read'",
            "'return'",
            "'string'",
            "'super'",
            "'switch'",
            "'this'",
            "'type'",
            "'while'",
            "'write'",
            "'=='",
            "'!='",
            "'<='",
            "'<'",
            "'>'",
            "'>='",
            "'~'",
            "'|'",
            "'&'",
            "'^'",
            "'||'",
            "'&&'",
            "'!'",
            "'-'",
            "'+'",
            "'*'",
            "'/'",
            "'%'",
            "'='",
            "'{'",
            "'}'",
            "'('",
            "')'",
            "'['",
            "']'",
            "'.'",
            "','",
            "':'",
            "';'"
    };
    public static final Vocabulary VOCABULARY = new VocabularyImpl(STRINGS, _SYMBOLIC_NAMES);

    static
    {
        RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION);
    }

    static
    {
        tokenNames = new String[_SYMBOLIC_NAMES.length];
        for (int i = 0; i < tokenNames.length; i++)
        {
            tokenNames[i] = VOCABULARY.getLiteralName(i);
            if (tokenNames[i] == null)
            {
                tokenNames[i] = VOCABULARY.getSymbolicName(i);
            }

            if (tokenNames[i] == null)
            {
                tokenNames[i] = "<INVALID>";
            }
        }
    }

    static
    {
        _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
        for (int i = 0; i < _ATN.getNumberOfDecisions(); i++)
        {
            _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
        }
    }


    public Lulu2Parser(TokenStream input)
    {
        super(input);
        _interp = new ParserATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
    }

    @Override
    @Deprecated
    public String[] getTokenNames()
    {
        return tokenNames;
    }

    @Override

    public Vocabulary getVocabulary()
    {
        return VOCABULARY;
    }

    @Override
    public String[] getRuleNames()
    {
        return ruleNames;
    }

    @Override
    public String getSerializedATN()
    {
        return _serializedATN;
    }

    @Override
    public ATN getATN()
    {
        return _ATN;
    }

    @Override
    public String getGrammarFileName()
    {
        return "Lulu2.g4";
    }

    public final MainContext main() throws RecognitionException
    {
        MainContext _localctx = new MainContext(_ctx, getState());
        enterRule(_localctx, 0, RULE_main);
        int _la;
        try
        {
            enterOuterAlt(_localctx, 1);
            {
                setState(67);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == DECLARE)
                {
                    {
                        setState(66);
                        ftDcl();
                    }
                }

                setState(70);
                _errHandler.sync(this);
                _la = _input.LA(1);
                do
                {
                    {
                        {
                            setState(69);
                            ftDef();
                        }
                    }
                    setState(72);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FUNCTION) | (1L << TYPE) | (1L << OpenPar))) != 0));
                setState(74);
                match(EOF);
            }
        }
        catch (RecognitionException re)
        {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally
        {
            exitRule();
        }
        return _localctx;
    }

    public final FtDclContext ftDcl() throws RecognitionException
    {
        FtDclContext _localctx = new FtDclContext(_ctx, getState());
        enterRule(_localctx, 2, RULE_ftDcl);
        int _la;
        try
        {
            enterOuterAlt(_localctx, 1);
            {
                setState(76);
                match(DECLARE);
                setState(77);
                match(OpenCurlyBrace);
                setState(81);
                _errHandler.sync(this);
                _la = _input.LA(1);
                do
                {
                    {
                        setState(81);
                        _errHandler.sync(this);
                        switch (getInterpreter().adaptivePredict(_input, 2, _ctx))
                        {
                            case 1:
                            {
                                setState(78);
                                funcDcl();
                            }
                            break;
                            case 2:
                            {
                                setState(79);
                                typeDcl();
                            }
                            break;
                            case 3:
                            {
                                setState(80);
                                varDef();
                            }
                            break;
                        }
                    }
                    setState(83);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                while (((((_la - 4)) & ~0x3f) == 0 && ((1L << (_la - 4)) & ((1L << (BOOL - 4)) | (1L << (CONST - 4)) | (1L << (FLOAT - 4)) | (1L << (INT - 4)) | (1L << (STRING - 4)) | (1L << (OpenPar - 4)) | (1L << (ID - 4)))) != 0));
                setState(85);
                match(CloseCurlyBrace);
            }
        }
        catch (RecognitionException re)
        {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally
        {
            exitRule();
        }
        return _localctx;
    }

    public final FuncDclContext funcDcl() throws RecognitionException
    {
        FuncDclContext _localctx = new FuncDclContext(_ctx, getState());
        enterRule(_localctx, 4, RULE_funcDcl);
        int _la;
        try
        {
            enterOuterAlt(_localctx, 1);
            {
                setState(92);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == OpenPar)
                {
                    {
                        setState(87);
                        match(OpenPar);
                        setState(88);
                        args();
                        setState(89);
                        match(ClosePar);
                        setState(90);
                        match(ASSIGN);
                    }
                }

                setState(94);
                match(ID);
                setState(95);
                match(OpenPar);
                setState(98);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 5, _ctx))
                {
                    case 1:
                    {
                        setState(96);
                        args();
                    }
                    break;
                    case 2:
                    {
                        setState(97);
                        argsVar();
                    }
                    break;
                }
                setState(100);
                match(ClosePar);
                setState(101);
                match(SEMICOLON);
            }
        }
        catch (RecognitionException re)
        {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally
        {
            exitRule();
        }
        return _localctx;
    }

    public final TypeBraceContext typeBrace() throws RecognitionException
    {
        TypeBraceContext _localctx = new TypeBraceContext(_ctx, getState());
        enterRule(_localctx, 6, RULE_typeBrace);
        int _la;
        try
        {
            enterOuterAlt(_localctx, 1);
            {
                setState(103);
                ((TypeBraceContext) _localctx).type = type();
                setState(108);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == OpenBrace)
                {
                    {
                        {
                            setState(104);
                            match(OpenBrace);
                            setState(105);
                            match(CloseBrace);
                        }
                    }
                    setState(110);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                ((TypeBraceContext) _localctx).t = ((TypeBraceContext) _localctx).type.t;
            }
        }
        catch (RecognitionException re)
        {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally
        {
            exitRule();
        }
        return _localctx;
    }

    public final ArgsContext args() throws RecognitionException
    {
        ArgsContext _localctx = new ArgsContext(_ctx, getState());
        enterRule(_localctx, 8, RULE_args);
        int _la;
        try
        {
            enterOuterAlt(_localctx, 1);
            {
                setState(113);
                typeBrace();
                setState(118);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == COMMA)
                {
                    {
                        {
                            setState(114);
                            match(COMMA);
                            setState(115);
                            typeBrace();
                        }
                    }
                    setState(120);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
            }
        }
        catch (RecognitionException re)
        {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally
        {
            exitRule();
        }
        return _localctx;
    }

    public final ArgsVarContext argsVar() throws RecognitionException
    {
        ArgsVarContext _localctx = new ArgsVarContext(_ctx, getState());
        enterRule(_localctx, 10, RULE_argsVar);
        int _la;
        try
        {
            enterOuterAlt(_localctx, 1);
            {
                setState(121);
                type();
                setState(126);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == OpenBrace)
                {
                    {
                        {
                            setState(122);
                            match(OpenBrace);
                            setState(123);
                            match(CloseBrace);
                        }
                    }
                    setState(128);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(129);
                match(ID);
                setState(143);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == COMMA)
                {
                    {
                        {
                            setState(130);
                            match(COMMA);
                            setState(131);
                            type();
                            setState(136);
                            _errHandler.sync(this);
                            _la = _input.LA(1);
                            while (_la == OpenBrace)
                            {
                                {
                                    {
                                        setState(132);
                                        match(OpenBrace);
                                        setState(133);
                                        match(CloseBrace);
                                    }
                                }
                                setState(138);
                                _errHandler.sync(this);
                                _la = _input.LA(1);
                            }
                            setState(139);
                            match(ID);
                        }
                    }
                    setState(145);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
            }
        }
        catch (RecognitionException re)
        {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally
        {
            exitRule();
        }
        return _localctx;
    }

    public final TypeDclContext typeDcl() throws RecognitionException
    {
        TypeDclContext _localctx = new TypeDclContext(_ctx, getState());
        enterRule(_localctx, 12, RULE_typeDcl);
        try
        {
            enterOuterAlt(_localctx, 1);
            {
                setState(146);
                match(ID);
                setState(147);
                match(SEMICOLON);
            }
        }
        catch (RecognitionException re)
        {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally
        {
            exitRule();
        }
        return _localctx;
    }

    public final VarDefContext varDef() throws RecognitionException
    {
        VarDefContext _localctx = new VarDefContext(_ctx, getState());
        enterRule(_localctx, 14, RULE_varDef);
        int _la;
        try
        {
            enterOuterAlt(_localctx, 1);
            {
                setState(150);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == CONST)
                {
                    {
                        setState(149);
                        match(CONST);
                    }
                }

                setState(152);
                type();
                setState(153);
                varVal();
                setState(158);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == COMMA)
                {
                    {
                        {
                            setState(154);
                            match(COMMA);
                            setState(155);
                            varVal();
                        }
                    }
                    setState(160);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(161);
                match(SEMICOLON);
            }
        }
        catch (RecognitionException re)
        {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally
        {
            exitRule();
        }
        return _localctx;
    }

    public final VarValContext varVal() throws RecognitionException
    {
        VarValContext _localctx = new VarValContext(_ctx, getState());
        enterRule(_localctx, 16, RULE_varVal);
        int _la;
        try
        {
            enterOuterAlt(_localctx, 1);
            {
                setState(163);
                ref();
                setState(166);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == ASSIGN)
                {
                    {
                        setState(164);
                        match(ASSIGN);
                        setState(165);
                        expr(0);
                    }
                }

            }
        }
        catch (RecognitionException re)
        {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally
        {
            exitRule();
        }
        return _localctx;
    }

    public final FtDefContext ftDef() throws RecognitionException
    {
        FtDefContext _localctx = new FtDefContext(_ctx, getState());
        enterRule(_localctx, 18, RULE_ftDef);
        try
        {
            enterOuterAlt(_localctx, 1);
            {
                setState(170);
                _errHandler.sync(this);
                switch (_input.LA(1))
                {
                    case TYPE:
                    {
                        setState(168);
                        typeDef();
                    }
                    break;
                    case FUNCTION:
                    case OpenPar:
                    {
                        setState(169);
                        funcDef();
                    }
                    break;
                    default:
                        throw new NoViableAltException(this);
                }
            }
        }
        catch (RecognitionException re)
        {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally
        {
            exitRule();
        }
        return _localctx;
    }

    public final TypeDefContext typeDef() throws RecognitionException
    {
        TypeDefContext _localctx = new TypeDefContext(_ctx, getState());
        enterRule(_localctx, 20, RULE_typeDef);
        int _la;
        try
        {
            enterOuterAlt(_localctx, 1);
            {
                setState(172);
                match(TYPE);
                setState(173);
                match(ID);
                setState(176);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == COLON)
                {
                    {
                        setState(174);
                        match(COLON);
                        setState(175);
                        match(ID);
                    }
                }

                setState(178);
                match(OpenCurlyBrace);
                setState(180);
                _errHandler.sync(this);
                _la = _input.LA(1);
                do
                {
                    {
                        {
                            setState(179);
                            component();
                        }
                    }
                    setState(182);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                while (((((_la - 4)) & ~0x3f) == 0 && ((1L << (_la - 4)) & ((1L << (BOOL - 4)) | (1L << (CONST - 4)) | (1L << (FUNCTION - 4)) | (1L << (FLOAT - 4)) | (1L << (INT - 4)) | (1L << (PRIVATE - 4)) | (1L << (PROTECTED - 4)) | (1L << (PUBLIC - 4)) | (1L << (STRING - 4)) | (1L << (OpenPar - 4)) | (1L << (ID - 4)))) != 0));
                setState(184);
                match(CloseCurlyBrace);
            }
        }
        catch (RecognitionException re)
        {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally
        {
            exitRule();
        }
        return _localctx;
    }

    public final ComponentContext component() throws RecognitionException
    {
        ComponentContext _localctx = new ComponentContext(_ctx, getState());
        enterRule(_localctx, 22, RULE_component);
        int _la;
        try
        {
            enterOuterAlt(_localctx, 1);
            {
                setState(187);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC))) != 0))
                {
                    {
                        setState(186);
                        accessModifier();
                    }
                }

                setState(191);
                _errHandler.sync(this);
                switch (_input.LA(1))
                {
                    case BOOL:
                    case CONST:
                    case FLOAT:
                    case INT:
                    case STRING:
                    case ID:
                    {
                        setState(189);
                        varDef();
                    }
                    break;
                    case FUNCTION:
                    case OpenPar:
                    {
                        setState(190);
                        funcDef();
                    }
                    break;
                    default:
                        throw new NoViableAltException(this);
                }
            }
        }
        catch (RecognitionException re)
        {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally
        {
            exitRule();
        }
        return _localctx;
    }

    public final AccessModifierContext accessModifier() throws RecognitionException
    {
        AccessModifierContext _localctx = new AccessModifierContext(_ctx, getState());
        enterRule(_localctx, 24, RULE_accessModifier);
        int _la;
        try
        {
            enterOuterAlt(_localctx, 1);
            {
                setState(193);
                _la = _input.LA(1);
                if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC))) != 0)))
                {
                    _errHandler.recoverInline(this);
                }
                else
                {
                    if (_input.LA(1) == Token.EOF)
                    {
                        matchedEOF = true;
                    }
                    _errHandler.reportMatch(this);
                    consume();
                }
            }
        }
        catch (RecognitionException re)
        {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally
        {
            exitRule();
        }
        return _localctx;
    }

    public final FuncDefContext funcDef() throws RecognitionException
    {
        FuncDefContext _localctx = new FuncDefContext(_ctx, getState());
        enterRule(_localctx, 26, RULE_funcDef);
        int _la;
        try
        {
            enterOuterAlt(_localctx, 1);
            {
                setState(200);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == OpenPar)
                {
                    {
                        setState(195);
                        match(OpenPar);
                        setState(196);
                        argsVar();
                        setState(197);
                        match(ClosePar);
                        setState(198);
                        match(ASSIGN);
                    }
                }

                setState(202);
                match(FUNCTION);
                setState(203);
                match(ID);
                setState(204);
                match(OpenPar);
                setState(206);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (((((_la - 4)) & ~0x3f) == 0 && ((1L << (_la - 4)) & ((1L << (BOOL - 4)) | (1L << (FLOAT - 4)) | (1L << (INT - 4)) | (1L << (STRING - 4)) | (1L << (ID - 4)))) != 0))
                {
                    {
                        setState(205);
                        argsVar();
                    }
                }

                setState(208);
                match(ClosePar);
                setState(209);
                block();
            }
        }
        catch (RecognitionException re)
        {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally
        {
            exitRule();
        }
        return _localctx;
    }

    public final BlockContext block() throws RecognitionException
    {
        BlockContext _localctx = new BlockContext(_ctx, getState());
        enterRule(_localctx, 28, RULE_block);
        int _la;
        try
        {
            enterOuterAlt(_localctx, 1);
            {
                setState(211);
                match(OpenCurlyBrace);
                setState(216);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (((((_la - 4)) & ~0x3f) == 0 && ((1L << (_la - 4)) & ((1L << (BOOL - 4)) | (1L << (BREAK - 4)) | (1L << (CONST - 4)) | (1L << (CONTINUE - 4)) | (1L << (DESTRUCT - 4)) | (1L << (FLOAT - 4)) | (1L << (FOR - 4)) | (1L << (IF - 4)) | (1L << (INT - 4)) | (1L << (READ - 4)) | (1L << (RETURN - 4)) | (1L << (STRING - 4)) | (1L << (SUPER - 4)) | (1L << (SWITCH - 4)) | (1L << (THIS - 4)) | (1L << (WHILE - 4)) | (1L << (WRITE - 4)) | (1L << (OpenPar - 4)) | (1L << (ID - 4)))) != 0))
                {
                    {
                        setState(214);
                        _errHandler.sync(this);
                        switch (getInterpreter().adaptivePredict(_input, 21, _ctx))
                        {
                            case 1:
                            {
                                setState(212);
                                varDef();
                            }
                            break;
                            case 2:
                            {
                                setState(213);
                                stmt();
                            }
                            break;
                        }
                    }
                    setState(218);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(219);
                match(CloseCurlyBrace);
            }
        }
        catch (RecognitionException re)
        {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally
        {
            exitRule();
        }
        return _localctx;
    }

    public final StmtContext stmt() throws RecognitionException
    {
        StmtContext _localctx = new StmtContext(_ctx, getState());
        enterRule(_localctx, 30, RULE_stmt);
        int _la;
        try
        {
            setState(245);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 24, _ctx))
            {
                case 1:
                    _localctx = new ASSIGNAltContext(_localctx);
                    enterOuterAlt(_localctx, 1);
                {
                    setState(221);
                    assign();
                    setState(222);
                    match(SEMICOLON);
                }
                break;
                case 2:
                    _localctx = new FUNCCALLSTMTAltContext(_localctx);
                    enterOuterAlt(_localctx, 2);
                {
                    setState(224);
                    funcCall();
                    setState(225);
                    match(SEMICOLON);
                }
                break;
                case 3:
                    _localctx = new CONDSTMTAltContext(_localctx);
                    enterOuterAlt(_localctx, 3);
                {
                    setState(227);
                    condStmt();
                }
                break;
                case 4:
                    _localctx = new LOOPSTMTAltContext(_localctx);
                    enterOuterAlt(_localctx, 4);
                {
                    setState(228);
                    loopStmt();
                }
                break;
                case 5:
                    _localctx = new RETURNAltContext(_localctx);
                    enterOuterAlt(_localctx, 5);
                {
                    setState(229);
                    match(RETURN);
                    setState(230);
                    match(SEMICOLON);
                }
                break;
                case 6:
                    _localctx = new BREAKAltContext(_localctx);
                    enterOuterAlt(_localctx, 6);
                {
                    setState(231);
                    match(BREAK);
                    setState(232);
                    match(SEMICOLON);
                }
                break;
                case 7:
                    _localctx = new CONTINUEAltContext(_localctx);
                    enterOuterAlt(_localctx, 7);
                {
                    setState(233);
                    match(CONTINUE);
                    setState(234);
                    match(SEMICOLON);
                }
                break;
                case 8:
                    _localctx = new DESTRUCTAltContext(_localctx);
                    enterOuterAlt(_localctx, 8);
                {
                    setState(235);
                    match(DESTRUCT);
                    setState(240);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    while (_la == OpenBrace)
                    {
                        {
                            {
                                setState(236);
                                match(OpenBrace);
                                setState(237);
                                match(CloseBrace);
                            }
                        }
                        setState(242);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                    }
                    setState(243);
                    match(ID);
                    setState(244);
                    match(SEMICOLON);
                }
                break;
            }
        }
        catch (RecognitionException re)
        {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally
        {
            exitRule();
        }
        return _localctx;
    }

    public final AssignContext assign() throws RecognitionException
    {
        AssignContext _localctx = new AssignContext(_ctx, getState());
        enterRule(_localctx, 32, RULE_assign);
        int _la;
        try
        {
            enterOuterAlt(_localctx, 1);
            {
                setState(259);
                _errHandler.sync(this);
                switch (_input.LA(1))
                {
                    case SUPER:
                    case THIS:
                    case ID:
                    {
                        setState(247);
                        var();
                    }
                    break;
                    case OpenPar:
                    {
                        setState(248);
                        match(OpenPar);
                        setState(249);
                        var();
                        setState(254);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        while (_la == COMMA)
                        {
                            {
                                {
                                    setState(250);
                                    match(COMMA);
                                    setState(251);
                                    var();
                                }
                            }
                            setState(256);
                            _errHandler.sync(this);
                            _la = _input.LA(1);
                        }
                        setState(257);
                        match(ClosePar);
                    }
                    break;
                    default:
                        throw new NoViableAltException(this);
                }
                setState(261);
                match(ASSIGN);
                setState(262);
                expr(0);
            }
        }
        catch (RecognitionException re)
        {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally
        {
            exitRule();
        }
        return _localctx;
    }

    public final VarContext var() throws RecognitionException
    {
        VarContext _localctx = new VarContext(_ctx, getState());
        enterRule(_localctx, 34, RULE_var);
        int _la;
        try
        {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(266);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == SUPER || _la == THIS)
                {
                    {
                        setState(264);
                        _la = _input.LA(1);
                        if (!(_la == SUPER || _la == THIS))
                        {
                            _errHandler.recoverInline(this);
                        }
                        else
                        {
                            if (_input.LA(1) == Token.EOF)
                            {
                                matchedEOF = true;
                            }
                            _errHandler.reportMatch(this);
                            consume();
                        }
                        setState(265);
                        match(DOT);
                    }
                }

                setState(268);
                ref();
                setState(273);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 28, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER)
                {
                    if (_alt == 1)
                    {
                        {
                            {
                                setState(269);
                                match(DOT);
                                setState(270);
                                ref();
                            }
                        }
                    }
                    setState(275);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 28, _ctx);
                }
            }
        }
        catch (RecognitionException re)
        {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally
        {
            exitRule();
        }
        return _localctx;
    }

    public final RefContext ref() throws RecognitionException
    {
        RefContext _localctx = new RefContext(_ctx, getState());
        enterRule(_localctx, 36, RULE_ref);
        try
        {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(276);
                match(ID);
                setState(283);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 29, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER)
                {
                    if (_alt == 1)
                    {
                        {
                            {
                                setState(277);
                                match(OpenBrace);
                                setState(278);
                                expr(0);
                                setState(279);
                                match(CloseBrace);
                            }
                        }
                    }
                    setState(285);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 29, _ctx);
                }
            }
        }
        catch (RecognitionException re)
        {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally
        {
            exitRule();
        }
        return _localctx;
    }

    public final ExprContext expr() throws RecognitionException
    {
        return expr(0);
    }

    private ExprContext expr(int _p) throws RecognitionException
    {
        ParserRuleContext _parentctx = _ctx;
        int _parentState = getState();
        ExprContext _localctx = new ExprContext(_ctx, _parentState);
        ExprContext _prevctx = _localctx;
        int _startState = 38;
        enterRecursionRule(_localctx, 38, RULE_expr, _p);
        try
        {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(309);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 30, _ctx))
                {
                    case 1:
                    {
                        _localctx = new PAREXPRAltContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;

                        setState(287);
                        match(OpenPar);
                        setState(288);
                        ((PAREXPRAltContext) _localctx).expr = expr(0);
                        setState(289);
                        match(ClosePar);

                        ((PAREXPRAltContext) _localctx).t = ((PAREXPRAltContext) _localctx).expr.t;

                    }
                    break;
                    case 2:
                    {
                        _localctx = new UNARYOPAltContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(292);
                        ((UNARYOPAltContext) _localctx).unaryOp = unaryOp();
                        setState(293);
                        ((UNARYOPAltContext) _localctx).expr = expr(16);

                        if (((UNARYOPAltContext) _localctx).expr.t != TypeEnum.Int || ((UNARYOPAltContext) _localctx).expr.t != TypeEnum.Bool)
                        {
                            throw new CompileError("bad operand types for unary operator " + (((UNARYOPAltContext) _localctx).unaryOp != null ? _input
                                    .getText(((UNARYOPAltContext) _localctx).unaryOp.start, ((UNARYOPAltContext) _localctx).unaryOp.stop) : null) + " ");
                        }
                        else
                        {
                            ((UNARYOPAltContext) _localctx).t = TypeEnum.Int;
                        }

                    }
                    break;
                    case 3:
                    {
                        _localctx = new CONSTVALAltContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(296);
                        ((CONSTVALAltContext) _localctx).constVal = constVal();

                        ((CONSTVALAltContext) _localctx).t = ((CONSTVALAltContext) _localctx).constVal.t;

                    }
                    break;
                    case 4:
                    {
                        _localctx = new ALLOCATIONAltContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(299);
                        match(ALLOCATE);
                        setState(300);
                        handleCall();

                        ((ALLOCATIONAltContext) _localctx).t = TypeEnum.nullable;

                    }
                    break;
                    case 5:
                    {
                        _localctx = new FUNCCALLAltContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(303);
                        funcCall();

                        ((FUNCCALLAltContext) _localctx).t = TypeEnum.nullable;

                    }
                    break;
                    case 6:
                    {
                        _localctx = new VARAltContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(306);
                        var();
                    }
                    break;
                    case 7:
                    {
                        _localctx = new LISTAltContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(307);
                        list();
                    }
                    break;
                    case 8:
                    {
                        _localctx = new NILAltContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(308);
                        match(NIL);
                    }
                    break;
                }
                _ctx.stop = _input.LT(-1);
                setState(358);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 32, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER)
                {
                    if (_alt == 1)
                    {
                        if (_parseListeners != null)
                        {
                            triggerExitRuleEvent();
                        }
                        _prevctx = _localctx;
                        {
                            setState(356);
                            _errHandler.sync(this);
                            switch (getInterpreter().adaptivePredict(_input, 31, _ctx))
                            {
                                case 1:
                                {
                                    _localctx = new MULDIVAltContext(new ExprContext(_parentctx, _parentState));
                                    ((MULDIVAltContext) _localctx).a = _prevctx;
                                    pushNewRecursionContext(_localctx, _startState, RULE_expr);
                                    setState(311);
                                    if (!(precpred(_ctx, 15)))
                                    {
                                        throw new FailedPredicateException(this, "precpred(_ctx, 15)");
                                    }
                                    setState(312);
                                    ((MULDIVAltContext) _localctx).firstLevelBinaryArithmeticOp = firstLevelBinaryArithmeticOp();
                                    setState(313);
                                    ((MULDIVAltContext) _localctx).b = ((MULDIVAltContext) _localctx).expr = expr(16);

                                    if (((MULDIVAltContext) _localctx).a.t == ((MULDIVAltContext) _localctx).b.t)
                                    {
                                        ((MULDIVAltContext) _localctx).t = ((MULDIVAltContext) _localctx).a.t;
                                    }
                                    else
                                    {
                                        switch (((MULDIVAltContext) _localctx).a.t)
                                        {
                                            case Int:
                                                switch (((MULDIVAltContext) _localctx).b.t)
                                                {
                                                    case Float:
                                                        ((MULDIVAltContext) _localctx).t = TypeEnum.Float;
                                                        break;
                                                    case Bool:
                                                        ((MULDIVAltContext) _localctx).t = TypeEnum.Int;
                                                        break;
                                                    case string:
                                                        ((MULDIVAltContext) _localctx).t = TypeEnum.string;
                                                        break;
                                                    default:
                                                        throw new CompileError("bad operand types for binary operator " + (((MULDIVAltContext) _localctx).firstLevelBinaryArithmeticOp != null ? _input
                                                                .getText(((MULDIVAltContext) _localctx).firstLevelBinaryArithmeticOp.start, ((MULDIVAltContext) _localctx).firstLevelBinaryArithmeticOp.stop) : null) + " ");
                                                }
                                                break;
                                            case Float:
                                                switch (((MULDIVAltContext) _localctx).b.t)
                                                {
                                                    case Bool:
                                                        ((MULDIVAltContext) _localctx).t = TypeEnum.Float;
                                                        break;
                                                    case Int:
                                                        ((MULDIVAltContext) _localctx).t = TypeEnum.Float;
                                                        break;
                                                    default:
                                                        throw new CompileError("bad operand types for binary operator " + (((MULDIVAltContext) _localctx).firstLevelBinaryArithmeticOp != null ? _input
                                                                .getText(((MULDIVAltContext) _localctx).firstLevelBinaryArithmeticOp.start, ((MULDIVAltContext) _localctx).firstLevelBinaryArithmeticOp.stop) : null) + " ");
                                                }
                                                break;
                                            case Bool:
                                                switch (((MULDIVAltContext) _localctx).b.t)
                                                {
                                                    case Float:
                                                        ((MULDIVAltContext) _localctx).t = TypeEnum.Float;
                                                        break;
                                                    case Int:
                                                        ((MULDIVAltContext) _localctx).t = TypeEnum.Int;
                                                        break;
                                                    case string:
                                                        ((MULDIVAltContext) _localctx).t = TypeEnum.string;
                                                        break;
                                                    default:
                                                        throw new CompileError("bad operand types for binary operator " + (((MULDIVAltContext) _localctx).firstLevelBinaryArithmeticOp != null ? _input
                                                                .getText(((MULDIVAltContext) _localctx).firstLevelBinaryArithmeticOp.start, ((MULDIVAltContext) _localctx).firstLevelBinaryArithmeticOp.stop) : null) + " ");
                                                }
                                                break;
                                            case string:
                                                switch (((MULDIVAltContext) _localctx).b.t)
                                                {
                                                    case Bool:
                                                        ((MULDIVAltContext) _localctx).t = TypeEnum.string;
                                                        break;
                                                    case Int:
                                                        ((MULDIVAltContext) _localctx).t = TypeEnum.string;
                                                        break;
                                                    default:
                                                        throw new CompileError("bad operand types for binary operator " + (((MULDIVAltContext) _localctx).firstLevelBinaryArithmeticOp != null ? _input
                                                                .getText(((MULDIVAltContext) _localctx).firstLevelBinaryArithmeticOp.start, ((MULDIVAltContext) _localctx).firstLevelBinaryArithmeticOp.stop) : null) + " ");
                                                }
                                                break;
                                        }
                                    }

                                }
                                break;
                                case 2:
                                {
                                    _localctx = new ADDSUBAltContext(new ExprContext(_parentctx, _parentState));
                                    ((ADDSUBAltContext) _localctx).a = _prevctx;
                                    pushNewRecursionContext(_localctx, _startState, RULE_expr);
                                    setState(316);
                                    if (!(precpred(_ctx, 14)))
                                    {
                                        throw new FailedPredicateException(this, "precpred(_ctx, 14)");
                                    }
                                    setState(317);
                                    ((ADDSUBAltContext) _localctx).secondLevelBinaryArithmeticOp = secondLevelBinaryArithmeticOp();
                                    setState(318);
                                    ((ADDSUBAltContext) _localctx).b = ((ADDSUBAltContext) _localctx).expr = expr(15);

                                    if (((ADDSUBAltContext) _localctx).a.t == ((ADDSUBAltContext) _localctx).b.t)
                                    {
                                        ((ADDSUBAltContext) _localctx).t = ((ADDSUBAltContext) _localctx).a.t;
                                    }
                                    else
                                    {
                                        switch (((ADDSUBAltContext) _localctx).a.t)
                                        {
                                            case Int:
                                                switch (((ADDSUBAltContext) _localctx).b.t)
                                                {
                                                    case Float:
                                                        ((ADDSUBAltContext) _localctx).t = TypeEnum.Float;
                                                        break;
                                                    case Bool:
                                                        ((ADDSUBAltContext) _localctx).t = TypeEnum.Int;
                                                        break;
                                                    case string:
                                                        ((ADDSUBAltContext) _localctx).t = TypeEnum.string;
                                                        break;
                                                    default:
                                                        throw new CompileError("bad operand types for binary operator " + (((ADDSUBAltContext) _localctx).secondLevelBinaryArithmeticOp != null ? _input
                                                                .getText(((ADDSUBAltContext) _localctx).secondLevelBinaryArithmeticOp.start, ((ADDSUBAltContext) _localctx).secondLevelBinaryArithmeticOp.stop) : null) + " ");
                                                }
                                                break;
                                            case Float:
                                                switch (((ADDSUBAltContext) _localctx).b.t)
                                                {
                                                    case Bool:
                                                        ((ADDSUBAltContext) _localctx).t = TypeEnum.Float;
                                                        break;
                                                    case Int:
                                                        ((ADDSUBAltContext) _localctx).t = TypeEnum.Float;
                                                        break;
                                                    default:
                                                        throw new CompileError("bad operand types for binary operator " + (((ADDSUBAltContext) _localctx).secondLevelBinaryArithmeticOp != null ? _input
                                                                .getText(((ADDSUBAltContext) _localctx).secondLevelBinaryArithmeticOp.start, ((ADDSUBAltContext) _localctx).secondLevelBinaryArithmeticOp.stop) : null) + " ");
                                                }
                                                break;
                                            case Bool:
                                                switch (((ADDSUBAltContext) _localctx).b.t)
                                                {
                                                    case Float:
                                                        ((ADDSUBAltContext) _localctx).t = TypeEnum.Float;
                                                        break;
                                                    case Int:
                                                        ((ADDSUBAltContext) _localctx).t = TypeEnum.Int;
                                                        break;
                                                    case string:
                                                        ((ADDSUBAltContext) _localctx).t = TypeEnum.string;
                                                        break;
                                                    default:
                                                        throw new CompileError("bad operand types for binary operator " + (((ADDSUBAltContext) _localctx).secondLevelBinaryArithmeticOp != null ? _input
                                                                .getText(((ADDSUBAltContext) _localctx).secondLevelBinaryArithmeticOp.start, ((ADDSUBAltContext) _localctx).secondLevelBinaryArithmeticOp.stop) : null) + " ");
                                                }
                                                break;
                                            case string:
                                                switch (((ADDSUBAltContext) _localctx).b.t)
                                                {
                                                    case Bool:
                                                        ((ADDSUBAltContext) _localctx).t = TypeEnum.string;
                                                        break;
                                                    case Int:
                                                        ((ADDSUBAltContext) _localctx).t = TypeEnum.string;
                                                        break;
                                                    default:
                                                        throw new CompileError("bad operand types for binary operator " + (((ADDSUBAltContext) _localctx).secondLevelBinaryArithmeticOp != null ? _input
                                                                .getText(((ADDSUBAltContext) _localctx).secondLevelBinaryArithmeticOp.start, ((ADDSUBAltContext) _localctx).secondLevelBinaryArithmeticOp.stop) : null) + " ");
                                                }
                                        }
                                    }

                                }
                                break;
                                case 3:
                                {
                                    _localctx = new COMPAREAltContext(new ExprContext(_parentctx, _parentState));
                                    ((COMPAREAltContext) _localctx).a = _prevctx;
                                    pushNewRecursionContext(_localctx, _startState, RULE_expr);
                                    setState(321);
                                    if (!(precpred(_ctx, 13)))
                                    {
                                        throw new FailedPredicateException(this, "precpred(_ctx, 13)");
                                    }
                                    setState(322);
                                    ((COMPAREAltContext) _localctx).firstLevelBinaryRelationalOp = firstLevelBinaryRelationalOp();
                                    setState(323);
                                    ((COMPAREAltContext) _localctx).b = ((COMPAREAltContext) _localctx).expr = expr(14);

                                    if (((COMPAREAltContext) _localctx).a.t == ((COMPAREAltContext) _localctx).b.t)
                                    {
                                        ((COMPAREAltContext) _localctx).t = TypeEnum.Bool;
                                    }
                                    else
                                    {
                                        switch (((COMPAREAltContext) _localctx).a.t)
                                        {
                                            case Int:
                                                switch (((COMPAREAltContext) _localctx).b.t)
                                                {
                                                    case Float:
                                                        ((COMPAREAltContext) _localctx).t = TypeEnum.Bool;
                                                        break;
                                                    case Bool:
                                                        ((COMPAREAltContext) _localctx).t = TypeEnum.Bool;
                                                        break;
                                                    case string:
                                                        ((COMPAREAltContext) _localctx).t = TypeEnum.Bool;
                                                        break;
                                                    default:
                                                        throw new CompileError("bad operand types for binary operator " + (((COMPAREAltContext) _localctx).firstLevelBinaryRelationalOp != null ? _input
                                                                .getText(((COMPAREAltContext) _localctx).firstLevelBinaryRelationalOp.start, ((COMPAREAltContext) _localctx).firstLevelBinaryRelationalOp.stop) : null) + " ");
                                                }
                                                break;
                                            case Float:
                                                switch (((COMPAREAltContext) _localctx).b.t)
                                                {
                                                    case Bool:
                                                        ((COMPAREAltContext) _localctx).t = TypeEnum.Bool;
                                                        break;
                                                    case Int:
                                                        ((COMPAREAltContext) _localctx).t = TypeEnum.Bool;
                                                        break;
                                                    default:
                                                        throw new CompileError("bad operand types for binary operator " + (((COMPAREAltContext) _localctx).firstLevelBinaryRelationalOp != null ? _input
                                                                .getText(((COMPAREAltContext) _localctx).firstLevelBinaryRelationalOp.start, ((COMPAREAltContext) _localctx).firstLevelBinaryRelationalOp.stop) : null) + " ");
                                                }
                                                break;
                                            case Bool:
                                                switch (((COMPAREAltContext) _localctx).b.t)
                                                {
                                                    case Float:
                                                        ((COMPAREAltContext) _localctx).t = TypeEnum.Bool;
                                                        break;
                                                    case Int:
                                                        ((COMPAREAltContext) _localctx).t = TypeEnum.Bool;
                                                        break;
                                                    case string:
                                                        ((COMPAREAltContext) _localctx).t = TypeEnum.Bool;
                                                        break;
                                                    default:
                                                        throw new CompileError("bad operand types for binary operator " + (((COMPAREAltContext) _localctx).firstLevelBinaryRelationalOp != null ? _input
                                                                .getText(((COMPAREAltContext) _localctx).firstLevelBinaryRelationalOp.start, ((COMPAREAltContext) _localctx).firstLevelBinaryRelationalOp.stop) : null) + " ");
                                                }
                                                break;
                                            case string:
                                                switch (((COMPAREAltContext) _localctx).b.t)
                                                {
                                                    case Bool:
                                                        ((COMPAREAltContext) _localctx).t = TypeEnum.Bool;
                                                        break;
                                                    case Int:
                                                        ((COMPAREAltContext) _localctx).t = TypeEnum.Bool;
                                                        break;
                                                    default:
                                                        throw new CompileError("bad operand types for binary operator " + (((COMPAREAltContext) _localctx).firstLevelBinaryRelationalOp != null ? _input
                                                                .getText(((COMPAREAltContext) _localctx).firstLevelBinaryRelationalOp.start, ((COMPAREAltContext) _localctx).firstLevelBinaryRelationalOp.stop) : null) + " ");
                                                }
                                                break;
                                        }
                                    }

                                }
                                break;
                                case 4:
                                {
                                    _localctx = new EQUALITYAltContext(new ExprContext(_parentctx, _parentState));
                                    ((EQUALITYAltContext) _localctx).a = _prevctx;
                                    pushNewRecursionContext(_localctx, _startState, RULE_expr);
                                    setState(326);
                                    if (!(precpred(_ctx, 12)))
                                    {
                                        throw new FailedPredicateException(this, "precpred(_ctx, 12)");
                                    }
                                    setState(327);
                                    ((EQUALITYAltContext) _localctx).secondLevelBinaryRelationalOp = secondLevelBinaryRelationalOp();
                                    setState(328);
                                    ((EQUALITYAltContext) _localctx).b = ((EQUALITYAltContext) _localctx).expr = expr(13);

                                    if (((EQUALITYAltContext) _localctx).a.t == ((EQUALITYAltContext) _localctx).b.t)
                                    {
                                        ((EQUALITYAltContext) _localctx).t = TypeEnum.Bool;
                                    }
                                    else
                                    {
                                        switch (((EQUALITYAltContext) _localctx).a.t)
                                        {
                                            case Int:
                                                switch (((EQUALITYAltContext) _localctx).b.t)
                                                {
                                                    case Float:
                                                        ((EQUALITYAltContext) _localctx).t = TypeEnum.Bool;
                                                        break;
                                                    case Bool:
                                                        ((EQUALITYAltContext) _localctx).t = TypeEnum.Bool;
                                                        break;
                                                    case string:
                                                        ((EQUALITYAltContext) _localctx).t = TypeEnum.Bool;
                                                        break;
                                                    default:
                                                        throw new CompileError("bad operand types for binary operator " + (((EQUALITYAltContext) _localctx).secondLevelBinaryRelationalOp != null ? _input
                                                                .getText(((EQUALITYAltContext) _localctx).secondLevelBinaryRelationalOp.start, ((EQUALITYAltContext) _localctx).secondLevelBinaryRelationalOp.stop) : null) + " ");
                                                }
                                                break;
                                            case Float:
                                                switch (((EQUALITYAltContext) _localctx).b.t)
                                                {
                                                    case Bool:
                                                        ((EQUALITYAltContext) _localctx).t = TypeEnum.Bool;
                                                        break;
                                                    case Int:
                                                        ((EQUALITYAltContext) _localctx).t = TypeEnum.Bool;
                                                        break;
                                                    default:
                                                        throw new CompileError("bad operand types for binary operator " + (((EQUALITYAltContext) _localctx).secondLevelBinaryRelationalOp != null ? _input
                                                                .getText(((EQUALITYAltContext) _localctx).secondLevelBinaryRelationalOp.start, ((EQUALITYAltContext) _localctx).secondLevelBinaryRelationalOp.stop) : null) + " ");
                                                }
                                                break;
                                            case Bool:
                                                switch (((EQUALITYAltContext) _localctx).b.t)
                                                {
                                                    case Float:
                                                        ((EQUALITYAltContext) _localctx).t = TypeEnum.Bool;
                                                        break;
                                                    case Int:
                                                        ((EQUALITYAltContext) _localctx).t = TypeEnum.Bool;
                                                        break;
                                                    case string:
                                                        ((EQUALITYAltContext) _localctx).t = TypeEnum.Bool;
                                                        break;
                                                    default:
                                                        throw new CompileError("bad operand types for binary operator " + (((EQUALITYAltContext) _localctx).secondLevelBinaryRelationalOp != null ? _input
                                                                .getText(((EQUALITYAltContext) _localctx).secondLevelBinaryRelationalOp.start, ((EQUALITYAltContext) _localctx).secondLevelBinaryRelationalOp.stop) : null) + " ");
                                                }
                                                break;
                                            case string:
                                                switch (((EQUALITYAltContext) _localctx).b.t)
                                                {
                                                    case Bool:
                                                        ((EQUALITYAltContext) _localctx).t = TypeEnum.Bool;
                                                        break;
                                                    case Int:
                                                        ((EQUALITYAltContext) _localctx).t = TypeEnum.Bool;
                                                        break;
                                                    default:
                                                        throw new CompileError("bad operand types for binary operator " + (((EQUALITYAltContext) _localctx).secondLevelBinaryRelationalOp != null ? _input
                                                                .getText(((EQUALITYAltContext) _localctx).secondLevelBinaryRelationalOp.start, ((EQUALITYAltContext) _localctx).secondLevelBinaryRelationalOp.stop) : null) + " ");
                                                }
                                                break;
                                        }
                                    }

                                }
                                break;
                                case 5:
                                {
                                    _localctx = new BITWISEANDAltContext(new ExprContext(_parentctx, _parentState));
                                    ((BITWISEANDAltContext) _localctx).a = _prevctx;
                                    pushNewRecursionContext(_localctx, _startState, RULE_expr);
                                    setState(331);
                                    if (!(precpred(_ctx, 11)))
                                    {
                                        throw new FailedPredicateException(this, "precpred(_ctx, 11)");
                                    }
                                    setState(332);
                                    ((BITWISEANDAltContext) _localctx).BitwiseAnd = match(BitwiseAnd);
                                    setState(333);
                                    ((BITWISEANDAltContext) _localctx).b = ((BITWISEANDAltContext) _localctx).expr = expr(12);

                                    if ((((BITWISEANDAltContext) _localctx).a.t == TypeEnum.Int || ((BITWISEANDAltContext) _localctx).a.t == TypeEnum.Bool) && (((BITWISEANDAltContext) _localctx).b.t == TypeEnum.Int || ((BITWISEANDAltContext) _localctx).b.t == TypeEnum.Bool))
                                    {
                                        ((BITWISEANDAltContext) _localctx).t = TypeEnum.Int;
                                    }
                                    else
                                    {
                                        throw new CompileError("bad operand types for binary operator " + (((BITWISEANDAltContext) _localctx).BitwiseAnd != null ? ((BITWISEANDAltContext) _localctx).BitwiseAnd
                                                .getText() : null) + " ");
                                    }

                                }
                                break;
                                case 6:
                                {
                                    _localctx = new BITWISELOGICALXORAltContext(new ExprContext(_parentctx, _parentState));
                                    ((BITWISELOGICALXORAltContext) _localctx).a = _prevctx;
                                    pushNewRecursionContext(_localctx, _startState, RULE_expr);
                                    setState(336);
                                    if (!(precpred(_ctx, 10)))
                                    {
                                        throw new FailedPredicateException(this, "precpred(_ctx, 10)");
                                    }
                                    setState(337);
                                    ((BITWISELOGICALXORAltContext) _localctx).BitwiseLogicalXor = match(BitwiseLogicalXor);
                                    setState(338);
                                    ((BITWISELOGICALXORAltContext) _localctx).b = ((BITWISELOGICALXORAltContext) _localctx).expr = expr(11);

                                    if ((((BITWISELOGICALXORAltContext) _localctx).a.t == TypeEnum.Int || ((BITWISELOGICALXORAltContext) _localctx).a.t == TypeEnum.Bool) && (((BITWISELOGICALXORAltContext) _localctx).b.t == TypeEnum.Int || ((BITWISELOGICALXORAltContext) _localctx).b.t == TypeEnum.Bool))
                                    {
                                        ((BITWISELOGICALXORAltContext) _localctx).t = TypeEnum.Int;
                                    }
                                    else
                                    {
                                        throw new CompileError("bad operand types for binary operator " + (((BITWISELOGICALXORAltContext) _localctx).BitwiseLogicalXor != null ? ((BITWISELOGICALXORAltContext) _localctx).BitwiseLogicalXor
                                                .getText() : null) + " ");
                                    }

                                }
                                break;
                                case 7:
                                {
                                    _localctx = new BITWISEORAltContext(new ExprContext(_parentctx, _parentState));
                                    ((BITWISEORAltContext) _localctx).a = _prevctx;
                                    pushNewRecursionContext(_localctx, _startState, RULE_expr);
                                    setState(341);
                                    if (!(precpred(_ctx, 9)))
                                    {
                                        throw new FailedPredicateException(this, "precpred(_ctx, 9)");
                                    }
                                    setState(342);
                                    ((BITWISEORAltContext) _localctx).BitwiseOr = match(BitwiseOr);
                                    setState(343);
                                    ((BITWISEORAltContext) _localctx).b = ((BITWISEORAltContext) _localctx).expr = expr(10);

                                    if ((((BITWISEORAltContext) _localctx).a.t == TypeEnum.Int || ((BITWISEORAltContext) _localctx).a.t == TypeEnum.Bool) && (((BITWISEORAltContext) _localctx).b.t == TypeEnum.Int || ((BITWISEORAltContext) _localctx).b.t == TypeEnum.Bool))
                                    {
                                        ((BITWISEORAltContext) _localctx).t = TypeEnum.Int;
                                    }
                                    else
                                    {
                                        throw new CompileError("bad operand types for binary operator " + (((BITWISEORAltContext) _localctx).BitwiseOr != null ? ((BITWISEORAltContext) _localctx).BitwiseOr
                                                .getText() : null) + " ");
                                    }

                                }
                                break;
                                case 8:
                                {
                                    _localctx = new LOGICALANDAltContext(new ExprContext(_parentctx, _parentState));
                                    ((LOGICALANDAltContext) _localctx).a = _prevctx;
                                    pushNewRecursionContext(_localctx, _startState, RULE_expr);
                                    setState(346);
                                    if (!(precpred(_ctx, 8)))
                                    {
                                        throw new FailedPredicateException(this, "precpred(_ctx, 8)");
                                    }
                                    setState(347);
                                    ((LOGICALANDAltContext) _localctx).LogicalAnd = match(LogicalAnd);
                                    setState(348);
                                    ((LOGICALANDAltContext) _localctx).b = ((LOGICALANDAltContext) _localctx).expr = expr(9);

                                    if ((((LOGICALANDAltContext) _localctx).a.t == TypeEnum.Int || ((LOGICALANDAltContext) _localctx).a.t == TypeEnum.Bool) && (((LOGICALANDAltContext) _localctx).b.t == TypeEnum.Int || ((LOGICALANDAltContext) _localctx).b.t == TypeEnum.Bool))
                                    {
                                        ((LOGICALANDAltContext) _localctx).t = TypeEnum.Bool;
                                    }
                                    else
                                    {
                                        throw new CompileError("bad operand types for binary operator " + (((LOGICALANDAltContext) _localctx).LogicalAnd != null ? ((LOGICALANDAltContext) _localctx).LogicalAnd
                                                .getText() : null) + " ");
                                    }

                                }
                                break;
                                case 9:
                                {
                                    _localctx = new LOGICALORAltContext(new ExprContext(_parentctx, _parentState));
                                    ((LOGICALORAltContext) _localctx).a = _prevctx;
                                    pushNewRecursionContext(_localctx, _startState, RULE_expr);
                                    setState(351);
                                    if (!(precpred(_ctx, 7)))
                                    {
                                        throw new FailedPredicateException(this, "precpred(_ctx, 7)");
                                    }
                                    setState(352);
                                    ((LOGICALORAltContext) _localctx).LogicalOr = match(LogicalOr);
                                    setState(353);
                                    ((LOGICALORAltContext) _localctx).b = ((LOGICALORAltContext) _localctx).expr = expr(8);

                                    if ((((LOGICALORAltContext) _localctx).a.t == TypeEnum.Int || ((LOGICALORAltContext) _localctx).a.t == TypeEnum.Bool) && (((LOGICALORAltContext) _localctx).b.t == TypeEnum.Int || ((LOGICALORAltContext) _localctx).b.t == TypeEnum.Bool))
                                    {
                                        ((LOGICALORAltContext) _localctx).t = TypeEnum.Bool;
                                    }
                                    else
                                    {
                                        throw new CompileError("bad operand types for binary operator " + (((LOGICALORAltContext) _localctx).LogicalOr != null ? ((LOGICALORAltContext) _localctx).LogicalOr
                                                .getText() : null) + " ");
                                    }

                                }
                                break;
                            }
                        }
                    }
                    setState(360);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 32, _ctx);
                }
            }
        }
        catch (RecognitionException re)
        {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally
        {
            unrollRecursionContexts(_parentctx);
        }
        return _localctx;
    }

    public final FuncCallContext funcCall() throws RecognitionException
    {
        FuncCallContext _localctx = new FuncCallContext(_ctx, getState());
        enterRule(_localctx, 40, RULE_funcCall);
        try
        {
            setState(377);
            _errHandler.sync(this);
            switch (_input.LA(1))
            {
                case SUPER:
                case THIS:
                case ID:
                    _localctx = new METHODCALLAltContext(_localctx);
                    enterOuterAlt(_localctx, 1);
                {
                    setState(364);
                    _errHandler.sync(this);
                    switch (getInterpreter().adaptivePredict(_input, 33, _ctx))
                    {
                        case 1:
                        {
                            setState(361);
                            var();
                            setState(362);
                            match(DOT);
                        }
                        break;
                    }
                    setState(366);
                    handleCall();
                }
                break;
                case READ:
                    _localctx = new READAltContext(_localctx);
                    enterOuterAlt(_localctx, 2);
                {
                    setState(367);
                    match(READ);
                    setState(368);
                    match(OpenPar);
                    setState(369);
                    var();
                    setState(370);
                    match(ClosePar);
                }
                break;
                case WRITE:
                    _localctx = new WRITEAltContext(_localctx);
                    enterOuterAlt(_localctx, 3);
                {
                    setState(372);
                    match(WRITE);
                    setState(373);
                    match(OpenPar);
                    setState(374);
                    var();
                    setState(375);
                    match(ClosePar);
                }
                break;
                default:
                    throw new NoViableAltException(this);
            }
        }
        catch (RecognitionException re)
        {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally
        {
            exitRule();
        }
        return _localctx;
    }

    public final ListContext list() throws RecognitionException
    {
        ListContext _localctx = new ListContext(_ctx, getState());
        enterRule(_localctx, 42, RULE_list);
        int _la;
        try
        {
            enterOuterAlt(_localctx, 1);
            {
                setState(379);
                match(OpenBrace);
                setState(382);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 35, _ctx))
                {
                    case 1:
                    {
                        setState(380);
                        expr(0);
                    }
                    break;
                    case 2:
                    {
                        setState(381);
                        list();
                    }
                    break;
                }
                setState(391);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == COMMA)
                {
                    {
                        {
                            setState(384);
                            match(COMMA);
                            setState(387);
                            _errHandler.sync(this);
                            switch (getInterpreter().adaptivePredict(_input, 36, _ctx))
                            {
                                case 1:
                                {
                                    setState(385);
                                    expr(0);
                                }
                                break;
                                case 2:
                                {
                                    setState(386);
                                    list();
                                }
                                break;
                            }
                        }
                    }
                    setState(393);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(394);
                match(CloseBrace);
            }
        }
        catch (RecognitionException re)
        {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally
        {
            exitRule();
        }
        return _localctx;
    }

    public final HandleCallContext handleCall() throws RecognitionException
    {
        HandleCallContext _localctx = new HandleCallContext(_ctx, getState());
        enterRule(_localctx, 44, RULE_handleCall);
        int _la;
        try
        {
            enterOuterAlt(_localctx, 1);
            {
                setState(396);
                match(ID);
                setState(397);
                match(OpenPar);
                setState(399);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (((((_la - 3)) & ~0x3f) == 0 && ((1L << (_la - 3)) & ((1L << (ALLOCATE - 3)) | (1L << (NIL - 3)) | (1L << (READ - 3)) | (1L << (SUPER - 3)) | (1L << (THIS - 3)) | (1L << (WRITE - 3)) | (1L << (BitwiseNegation - 3)) | (1L << (LogicalNot - 3)) | (1L << (SUBTRACTION - 3)) | (1L << (OpenPar - 3)) | (1L << (OpenBrace - 3)) | (1L << (IntLiteral - 3)) | (1L << (FloatLiteral - 3)) | (1L << (StringLiteral - 3)) | (1L << (BoolLiteral - 3)) | (1L << (ID - 3)))) != 0))
                {
                    {
                        setState(398);
                        params();
                    }
                }

                setState(401);
                match(ClosePar);
            }
        }
        catch (RecognitionException re)
        {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally
        {
            exitRule();
        }
        return _localctx;
    }

    public final ParamsContext params() throws RecognitionException
    {
        ParamsContext _localctx = new ParamsContext(_ctx, getState());
        enterRule(_localctx, 46, RULE_params);
        try
        {
            setState(408);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 39, _ctx))
            {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(403);
                    expr(0);
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(404);
                    expr(0);
                    setState(405);
                    match(COMMA);
                    setState(406);
                    params();
                }
                break;
            }
        }
        catch (RecognitionException re)
        {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally
        {
            exitRule();
        }
        return _localctx;
    }

    public final CondStmtContext condStmt() throws RecognitionException
    {
        CondStmtContext _localctx = new CondStmtContext(_ctx, getState());
        enterRule(_localctx, 48, RULE_condStmt);
        int _la;
        try
        {
            setState(434);
            _errHandler.sync(this);
            switch (_input.LA(1))
            {
                case IF:
                    _localctx = new IFAltContext(_localctx);
                    enterOuterAlt(_localctx, 1);
                {
                    setState(410);
                    match(IF);
                    setState(411);
                    expr(0);
                    setState(412);
                    block();
                    setState(415);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (_la == ELSE)
                    {
                        {
                            setState(413);
                            match(ELSE);
                            setState(414);
                            block();
                        }
                    }

                }
                break;
                case SWITCH:
                    _localctx = new SWITCHAltContext(_localctx);
                    enterOuterAlt(_localctx, 2);
                {
                    setState(417);
                    match(SWITCH);
                    setState(418);
                    var();
                    setState(419);
                    match(OpenCurlyBrace);
                    setState(426);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    while (_la == CASE)
                    {
                        {
                            {
                                setState(420);
                                match(CASE);
                                setState(421);
                                match(IntLiteral);
                                setState(422);
                                match(COLON);
                                setState(423);
                                block();
                            }
                        }
                        setState(428);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                    }
                    setState(429);
                    match(DEFAULT);
                    setState(430);
                    match(COLON);
                    setState(431);
                    block();
                    setState(432);
                    match(CloseCurlyBrace);
                }
                break;
                default:
                    throw new NoViableAltException(this);
            }
        }
        catch (RecognitionException re)
        {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally
        {
            exitRule();
        }
        return _localctx;
    }

    public final LoopStmtContext loopStmt() throws RecognitionException
    {
        LoopStmtContext _localctx = new LoopStmtContext(_ctx, getState());
        enterRule(_localctx, 50, RULE_loopStmt);
        int _la;
        try
        {
            setState(455);
            _errHandler.sync(this);
            switch (_input.LA(1))
            {
                case FOR:
                    _localctx = new FORAltContext(_localctx);
                    enterOuterAlt(_localctx, 1);
                {
                    setState(436);
                    match(FOR);
                    setState(441);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (((((_la - 4)) & ~0x3f) == 0 && ((1L << (_la - 4)) & ((1L << (BOOL - 4)) | (1L << (FLOAT - 4)) | (1L << (INT - 4)) | (1L << (STRING - 4)) | (1L << (SUPER - 4)) | (1L << (THIS - 4)) | (1L << (OpenPar - 4)) | (1L << (ID - 4)))) != 0))
                    {
                        {
                            setState(438);
                            _errHandler.sync(this);
                            switch (getInterpreter().adaptivePredict(_input, 43, _ctx))
                            {
                                case 1:
                                {
                                    setState(437);
                                    type();
                                }
                                break;
                            }
                            setState(440);
                            assign();
                        }
                    }

                    setState(443);
                    match(SEMICOLON);
                    setState(444);
                    expr(0);
                    setState(445);
                    match(SEMICOLON);
                    setState(447);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (((((_la - 26)) & ~0x3f) == 0 && ((1L << (_la - 26)) & ((1L << (SUPER - 26)) | (1L << (THIS - 26)) | (1L << (OpenPar - 26)) | (1L << (ID - 26)))) != 0))
                    {
                        {
                            setState(446);
                            assign();
                        }
                    }

                    setState(449);
                    block();
                }
                break;
                case WHILE:
                    _localctx = new WHILEAltContext(_localctx);
                    enterOuterAlt(_localctx, 2);
                {
                    setState(451);
                    match(WHILE);
                    setState(452);
                    expr(0);
                    setState(453);
                    block();
                }
                break;
                default:
                    throw new NoViableAltException(this);
            }
        }
        catch (RecognitionException re)
        {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally
        {
            exitRule();
        }
        return _localctx;
    }

    public final TypeContext type() throws RecognitionException
    {
        TypeContext _localctx = new TypeContext(_ctx, getState());
        enterRule(_localctx, 52, RULE_type);
        try
        {
            setState(467);
            _errHandler.sync(this);
            switch (_input.LA(1))
            {
                case INT:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(457);
                    match(INT);
                    ((TypeContext) _localctx).t = Type.Int();
                }
                break;
                case BOOL:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(459);
                    match(BOOL);
                    ((TypeContext) _localctx).t = Type.Bool();
                }
                break;
                case FLOAT:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(461);
                    match(FLOAT);
                    ((TypeContext) _localctx).t = Type.Float();
                }
                break;
                case STRING:
                    enterOuterAlt(_localctx, 4);
                {
                    setState(463);
                    match(STRING);
                    ((TypeContext) _localctx).t = Type.String();
                }
                break;
                case ID:
                    enterOuterAlt(_localctx, 5);
                {
                    setState(465);
                    match(ID);
                    ((TypeContext) _localctx).t = null;
                }
                break;
                default:
                    throw new NoViableAltException(this);
            }
        }
        catch (RecognitionException re)
        {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally
        {
            exitRule();
        }
        return _localctx;
    }

    public final ConstValContext constVal() throws RecognitionException
    {
        ConstValContext _localctx = new ConstValContext(_ctx, getState());
        enterRule(_localctx, 54, RULE_constVal);
        try
        {
            setState(477);
            _errHandler.sync(this);
            switch (_input.LA(1))
            {
                case IntLiteral:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(469);
                    match(IntLiteral);
                    ((ConstValContext) _localctx).t = TypeEnum.Int;
                }
                break;
                case FloatLiteral:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(471);
                    match(FloatLiteral);
                    ((ConstValContext) _localctx).t = TypeEnum.Float;
                }
                break;
                case BoolLiteral:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(473);
                    match(BoolLiteral);
                    ((ConstValContext) _localctx).t = TypeEnum.Bool;
                }
                break;
                case StringLiteral:
                    enterOuterAlt(_localctx, 4);
                {
                    setState(475);
                    match(StringLiteral);
                    ((ConstValContext) _localctx).t = TypeEnum.string;
                }
                break;
                default:
                    throw new NoViableAltException(this);
            }
        }
        catch (RecognitionException re)
        {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally
        {
            exitRule();
        }
        return _localctx;
    }

    public final UnaryOpContext unaryOp() throws RecognitionException
    {
        UnaryOpContext _localctx = new UnaryOpContext(_ctx, getState());
        enterRule(_localctx, 56, RULE_unaryOp);
        int _la;
        try
        {
            enterOuterAlt(_localctx, 1);
            {
                setState(479);
                _la = _input.LA(1);
                if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BitwiseNegation) | (1L << LogicalNot) | (1L << SUBTRACTION))) != 0)))
                {
                    _errHandler.recoverInline(this);
                }
                else
                {
                    if (_input.LA(1) == Token.EOF)
                    {
                        matchedEOF = true;
                    }
                    _errHandler.reportMatch(this);
                    consume();
                }
            }
        }
        catch (RecognitionException re)
        {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally
        {
            exitRule();
        }
        return _localctx;
    }

    public final FirstLevelBinaryArithmeticOpContext firstLevelBinaryArithmeticOp() throws RecognitionException
    {
        FirstLevelBinaryArithmeticOpContext _localctx = new FirstLevelBinaryArithmeticOpContext(_ctx, getState());
        enterRule(_localctx, 58, RULE_firstLevelBinaryArithmeticOp);
        int _la;
        try
        {
            enterOuterAlt(_localctx, 1);
            {
                setState(481);
                _la = _input.LA(1);
                if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MULTIPLICATION) | (1L << DIVISION) | (1L << MODULUS))) != 0)))
                {
                    _errHandler.recoverInline(this);
                }
                else
                {
                    if (_input.LA(1) == Token.EOF)
                    {
                        matchedEOF = true;
                    }
                    _errHandler.reportMatch(this);
                    consume();
                }
            }
        }
        catch (RecognitionException re)
        {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally
        {
            exitRule();
        }
        return _localctx;
    }

    public final SecondLevelBinaryArithmeticOpContext secondLevelBinaryArithmeticOp() throws RecognitionException
    {
        SecondLevelBinaryArithmeticOpContext _localctx = new SecondLevelBinaryArithmeticOpContext(_ctx, getState());
        enterRule(_localctx, 60, RULE_secondLevelBinaryArithmeticOp);
        int _la;
        try
        {
            enterOuterAlt(_localctx, 1);
            {
                setState(483);
                _la = _input.LA(1);
                if (!(_la == SUBTRACTION || _la == ADDITION))
                {
                    _errHandler.recoverInline(this);
                }
                else
                {
                    if (_input.LA(1) == Token.EOF)
                    {
                        matchedEOF = true;
                    }
                    _errHandler.reportMatch(this);
                    consume();
                }
            }
        }
        catch (RecognitionException re)
        {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally
        {
            exitRule();
        }
        return _localctx;
    }

    public final FirstLevelBinaryRelationalOpContext firstLevelBinaryRelationalOp() throws RecognitionException
    {
        FirstLevelBinaryRelationalOpContext _localctx = new FirstLevelBinaryRelationalOpContext(_ctx, getState());
        enterRule(_localctx, 62, RULE_firstLevelBinaryRelationalOp);
        int _la;
        try
        {
            enterOuterAlt(_localctx, 1);
            {
                setState(485);
                _la = _input.LA(1);
                if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LessThanOrEqual) | (1L << LessThan) | (1L << BiggerThan) | (1L << BiggerThanOrEqual))) != 0)))
                {
                    _errHandler.recoverInline(this);
                }
                else
                {
                    if (_input.LA(1) == Token.EOF)
                    {
                        matchedEOF = true;
                    }
                    _errHandler.reportMatch(this);
                    consume();
                }
            }
        }
        catch (RecognitionException re)
        {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally
        {
            exitRule();
        }
        return _localctx;
    }

    public final SecondLevelBinaryRelationalOpContext secondLevelBinaryRelationalOp() throws RecognitionException
    {
        SecondLevelBinaryRelationalOpContext _localctx = new SecondLevelBinaryRelationalOpContext(_ctx, getState());
        enterRule(_localctx, 64, RULE_secondLevelBinaryRelationalOp);
        int _la;
        try
        {
            enterOuterAlt(_localctx, 1);
            {
                setState(487);
                _la = _input.LA(1);
                if (!(_la == EQUAL || _la == NotEqual))
                {
                    _errHandler.recoverInline(this);
                }
                else
                {
                    if (_input.LA(1) == Token.EOF)
                    {
                        matchedEOF = true;
                    }
                    _errHandler.reportMatch(this);
                    consume();
                }
            }
        }
        catch (RecognitionException re)
        {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally
        {
            exitRule();
        }
        return _localctx;
    }

    public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex)
    {
        switch (ruleIndex)
        {
            case 19:
                return expr_sempred((ExprContext) _localctx, predIndex);
        }
        return true;
    }

    private boolean expr_sempred(ExprContext _localctx, int predIndex)
    {
        switch (predIndex)
        {
            case 0:
                return precpred(_ctx, 15);
            case 1:
                return precpred(_ctx, 14);
            case 2:
                return precpred(_ctx, 13);
            case 3:
                return precpred(_ctx, 12);
            case 4:
                return precpred(_ctx, 11);
            case 5:
                return precpred(_ctx, 10);
            case 6:
                return precpred(_ctx, 9);
            case 7:
                return precpred(_ctx, 8);
            case 8:
                return precpred(_ctx, 7);
        }
        return true;
    }

    enum TypeEnum
    {
        Int, Bool, Float, string, nullable
    }

    public static class MainContext extends ParserRuleContext
    {
        public MainContext(ParserRuleContext parent, int invokingState)
        {
            super(parent, invokingState);
        }

        public TerminalNode EOF()
        {
            return getToken(Lulu2Parser.EOF, 0);
        }

        public FtDclContext ftDcl()
        {
            return getRuleContext(FtDclContext.class, 0);
        }

        public List<FtDefContext> ftDef()
        {
            return getRuleContexts(FtDefContext.class);
        }

        public FtDefContext ftDef(int i)
        {
            return getRuleContext(FtDefContext.class, i);
        }

        @Override
        public int getRuleIndex()
        {
            return RULE_main;
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof Lulu2Listener)
            {
                ((Lulu2Listener) listener).enterMain(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof Lulu2Listener)
            {
                ((Lulu2Listener) listener).exitMain(this);
            }
        }
    }

    public static class FtDclContext extends ParserRuleContext
    {
        public FtDclContext(ParserRuleContext parent, int invokingState)
        {
            super(parent, invokingState);
        }

        public TerminalNode DECLARE()
        {
            return getToken(Lulu2Parser.DECLARE, 0);
        }

        public TerminalNode OpenCurlyBrace()
        {
            return getToken(Lulu2Parser.OpenCurlyBrace, 0);
        }

        public TerminalNode CloseCurlyBrace()
        {
            return getToken(Lulu2Parser.CloseCurlyBrace, 0);
        }

        public List<FuncDclContext> funcDcl()
        {
            return getRuleContexts(FuncDclContext.class);
        }

        public FuncDclContext funcDcl(int i)
        {
            return getRuleContext(FuncDclContext.class, i);
        }

        public List<TypeDclContext> typeDcl()
        {
            return getRuleContexts(TypeDclContext.class);
        }

        public TypeDclContext typeDcl(int i)
        {
            return getRuleContext(TypeDclContext.class, i);
        }

        public List<VarDefContext> varDef()
        {
            return getRuleContexts(VarDefContext.class);
        }

        public VarDefContext varDef(int i)
        {
            return getRuleContext(VarDefContext.class, i);
        }

        @Override
        public int getRuleIndex()
        {
            return RULE_ftDcl;
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof Lulu2Listener)
            {
                ((Lulu2Listener) listener).enterFtDcl(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof Lulu2Listener)
            {
                ((Lulu2Listener) listener).exitFtDcl(this);
            }
        }
    }

    public static class FuncDclContext extends ParserRuleContext
    {
        public FuncDclContext(ParserRuleContext parent, int invokingState)
        {
            super(parent, invokingState);
        }

        public TerminalNode ID()
        {
            return getToken(Lulu2Parser.ID, 0);
        }

        public List<TerminalNode> OpenPar()
        {
            return getTokens(Lulu2Parser.OpenPar);
        }

        public TerminalNode OpenPar(int i)
        {
            return getToken(Lulu2Parser.OpenPar, i);
        }

        public List<TerminalNode> ClosePar()
        {
            return getTokens(Lulu2Parser.ClosePar);
        }

        public TerminalNode ClosePar(int i)
        {
            return getToken(Lulu2Parser.ClosePar, i);
        }

        public TerminalNode SEMICOLON()
        {
            return getToken(Lulu2Parser.SEMICOLON, 0);
        }

        public List<ArgsContext> args()
        {
            return getRuleContexts(ArgsContext.class);
        }

        public ArgsContext args(int i)
        {
            return getRuleContext(ArgsContext.class, i);
        }

        public TerminalNode ASSIGN()
        {
            return getToken(Lulu2Parser.ASSIGN, 0);
        }

        public ArgsVarContext argsVar()
        {
            return getRuleContext(ArgsVarContext.class, 0);
        }

        @Override
        public int getRuleIndex()
        {
            return RULE_funcDcl;
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof Lulu2Listener)
            {
                ((Lulu2Listener) listener).enterFuncDcl(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof Lulu2Listener)
            {
                ((Lulu2Listener) listener).exitFuncDcl(this);
            }
        }
    }

    public static class TypeDclContext extends ParserRuleContext
    {
        public TypeDclContext(ParserRuleContext parent, int invokingState)
        {
            super(parent, invokingState);
        }

        public TerminalNode ID()
        {
            return getToken(Lulu2Parser.ID, 0);
        }

        public TerminalNode SEMICOLON()
        {
            return getToken(Lulu2Parser.SEMICOLON, 0);
        }

        @Override
        public int getRuleIndex()
        {
            return RULE_typeDcl;
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof Lulu2Listener)
            {
                ((Lulu2Listener) listener).enterTypeDcl(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof Lulu2Listener)
            {
                ((Lulu2Listener) listener).exitTypeDcl(this);
            }
        }
    }

    public static class VarDefContext extends ParserRuleContext
    {
        public VarDefContext(ParserRuleContext parent, int invokingState)
        {
            super(parent, invokingState);
        }

        public TypeContext type()
        {
            return getRuleContext(TypeContext.class, 0);
        }

        public List<VarValContext> varVal()
        {
            return getRuleContexts(VarValContext.class);
        }

        public VarValContext varVal(int i)
        {
            return getRuleContext(VarValContext.class, i);
        }

        public TerminalNode SEMICOLON()
        {
            return getToken(Lulu2Parser.SEMICOLON, 0);
        }

        public TerminalNode CONST()
        {
            return getToken(Lulu2Parser.CONST, 0);
        }

        public List<TerminalNode> COMMA()
        {
            return getTokens(Lulu2Parser.COMMA);
        }

        public TerminalNode COMMA(int i)
        {
            return getToken(Lulu2Parser.COMMA, i);
        }

        @Override
        public int getRuleIndex()
        {
            return RULE_varDef;
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof Lulu2Listener)
            {
                ((Lulu2Listener) listener).enterVarDef(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof Lulu2Listener)
            {
                ((Lulu2Listener) listener).exitVarDef(this);
            }
        }
    }

    public static class VarValContext extends ParserRuleContext
    {
        public VarValContext(ParserRuleContext parent, int invokingState)
        {
            super(parent, invokingState);
        }

        public RefContext ref()
        {
            return getRuleContext(RefContext.class, 0);
        }

        public TerminalNode ASSIGN()
        {
            return getToken(Lulu2Parser.ASSIGN, 0);
        }

        public ExprContext expr()
        {
            return getRuleContext(ExprContext.class, 0);
        }

        @Override
        public int getRuleIndex()
        {
            return RULE_varVal;
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof Lulu2Listener)
            {
                ((Lulu2Listener) listener).enterVarVal(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof Lulu2Listener)
            {
                ((Lulu2Listener) listener).exitVarVal(this);
            }
        }
    }

    public static class FtDefContext extends ParserRuleContext
    {
        public FtDefContext(ParserRuleContext parent, int invokingState)
        {
            super(parent, invokingState);
        }

        public TypeDefContext typeDef()
        {
            return getRuleContext(TypeDefContext.class, 0);
        }

        public FuncDefContext funcDef()
        {
            return getRuleContext(FuncDefContext.class, 0);
        }

        @Override
        public int getRuleIndex()
        {
            return RULE_ftDef;
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof Lulu2Listener)
            {
                ((Lulu2Listener) listener).enterFtDef(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof Lulu2Listener)
            {
                ((Lulu2Listener) listener).exitFtDef(this);
            }
        }
    }

    public static class TypeDefContext extends ParserRuleContext
    {
        public TypeDefContext(ParserRuleContext parent, int invokingState)
        {
            super(parent, invokingState);
        }

        public TerminalNode TYPE()
        {
            return getToken(Lulu2Parser.TYPE, 0);
        }

        public List<TerminalNode> ID()
        {
            return getTokens(Lulu2Parser.ID);
        }

        public TerminalNode ID(int i)
        {
            return getToken(Lulu2Parser.ID, i);
        }

        public TerminalNode OpenCurlyBrace()
        {
            return getToken(Lulu2Parser.OpenCurlyBrace, 0);
        }

        public TerminalNode CloseCurlyBrace()
        {
            return getToken(Lulu2Parser.CloseCurlyBrace, 0);
        }

        public TerminalNode COLON()
        {
            return getToken(Lulu2Parser.COLON, 0);
        }

        public List<ComponentContext> component()
        {
            return getRuleContexts(ComponentContext.class);
        }

        public ComponentContext component(int i)
        {
            return getRuleContext(ComponentContext.class, i);
        }

        @Override
        public int getRuleIndex()
        {
            return RULE_typeDef;
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof Lulu2Listener)
            {
                ((Lulu2Listener) listener).enterTypeDef(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof Lulu2Listener)
            {
                ((Lulu2Listener) listener).exitTypeDef(this);
            }
        }
    }

    public static class ComponentContext extends ParserRuleContext
    {
        public ComponentContext(ParserRuleContext parent, int invokingState)
        {
            super(parent, invokingState);
        }

        public VarDefContext varDef()
        {
            return getRuleContext(VarDefContext.class, 0);
        }

        public FuncDefContext funcDef()
        {
            return getRuleContext(FuncDefContext.class, 0);
        }

        public AccessModifierContext accessModifier()
        {
            return getRuleContext(AccessModifierContext.class, 0);
        }

        @Override
        public int getRuleIndex()
        {
            return RULE_component;
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof Lulu2Listener)
            {
                ((Lulu2Listener) listener).enterComponent(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof Lulu2Listener)
            {
                ((Lulu2Listener) listener).exitComponent(this);
            }
        }
    }

    public static class AccessModifierContext extends ParserRuleContext
    {
        public AccessModifierContext(ParserRuleContext parent, int invokingState)
        {
            super(parent, invokingState);
        }

        public TerminalNode PRIVATE()
        {
            return getToken(Lulu2Parser.PRIVATE, 0);
        }

        public TerminalNode PUBLIC()
        {
            return getToken(Lulu2Parser.PUBLIC, 0);
        }

        public TerminalNode PROTECTED()
        {
            return getToken(Lulu2Parser.PROTECTED, 0);
        }

        @Override
        public int getRuleIndex()
        {
            return RULE_accessModifier;
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof Lulu2Listener)
            {
                ((Lulu2Listener) listener).enterAccessModifier(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof Lulu2Listener)
            {
                ((Lulu2Listener) listener).exitAccessModifier(this);
            }
        }
    }

    public static class FuncDefContext extends ParserRuleContext
    {
        public FuncDefContext(ParserRuleContext parent, int invokingState)
        {
            super(parent, invokingState);
        }

        public TerminalNode FUNCTION()
        {
            return getToken(Lulu2Parser.FUNCTION, 0);
        }

        public TerminalNode ID()
        {
            return getToken(Lulu2Parser.ID, 0);
        }

        public List<TerminalNode> OpenPar()
        {
            return getTokens(Lulu2Parser.OpenPar);
        }

        public TerminalNode OpenPar(int i)
        {
            return getToken(Lulu2Parser.OpenPar, i);
        }

        public List<TerminalNode> ClosePar()
        {
            return getTokens(Lulu2Parser.ClosePar);
        }

        public TerminalNode ClosePar(int i)
        {
            return getToken(Lulu2Parser.ClosePar, i);
        }

        public BlockContext block()
        {
            return getRuleContext(BlockContext.class, 0);
        }

        public List<ArgsVarContext> argsVar()
        {
            return getRuleContexts(ArgsVarContext.class);
        }

        public ArgsVarContext argsVar(int i)
        {
            return getRuleContext(ArgsVarContext.class, i);
        }

        public TerminalNode ASSIGN()
        {
            return getToken(Lulu2Parser.ASSIGN, 0);
        }

        @Override
        public int getRuleIndex()
        {
            return RULE_funcDef;
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof Lulu2Listener)
            {
                ((Lulu2Listener) listener).enterFuncDef(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof Lulu2Listener)
            {
                ((Lulu2Listener) listener).exitFuncDef(this);
            }
        }
    }

    public static class BlockContext extends ParserRuleContext
    {
        public BlockContext(ParserRuleContext parent, int invokingState)
        {
            super(parent, invokingState);
        }

        public TerminalNode OpenCurlyBrace()
        {
            return getToken(Lulu2Parser.OpenCurlyBrace, 0);
        }

        public TerminalNode CloseCurlyBrace()
        {
            return getToken(Lulu2Parser.CloseCurlyBrace, 0);
        }

        public List<VarDefContext> varDef()
        {
            return getRuleContexts(VarDefContext.class);
        }

        public VarDefContext varDef(int i)
        {
            return getRuleContext(VarDefContext.class, i);
        }

        public List<StmtContext> stmt()
        {
            return getRuleContexts(StmtContext.class);
        }

        public StmtContext stmt(int i)
        {
            return getRuleContext(StmtContext.class, i);
        }

        @Override
        public int getRuleIndex()
        {
            return RULE_block;
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof Lulu2Listener)
            {
                ((Lulu2Listener) listener).enterBlock(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof Lulu2Listener)
            {
                ((Lulu2Listener) listener).exitBlock(this);
            }
        }
    }

    public static class AssignContext extends ParserRuleContext
    {
        public AssignContext(ParserRuleContext parent, int invokingState)
        {
            super(parent, invokingState);
        }

        public TerminalNode ASSIGN()
        {
            return getToken(Lulu2Parser.ASSIGN, 0);
        }

        public ExprContext expr()
        {
            return getRuleContext(ExprContext.class, 0);
        }

        public List<VarContext> var()
        {
            return getRuleContexts(VarContext.class);
        }

        public VarContext var(int i)
        {
            return getRuleContext(VarContext.class, i);
        }

        public TerminalNode OpenPar()
        {
            return getToken(Lulu2Parser.OpenPar, 0);
        }

        public TerminalNode ClosePar()
        {
            return getToken(Lulu2Parser.ClosePar, 0);
        }

        public List<TerminalNode> COMMA()
        {
            return getTokens(Lulu2Parser.COMMA);
        }

        public TerminalNode COMMA(int i)
        {
            return getToken(Lulu2Parser.COMMA, i);
        }

        @Override
        public int getRuleIndex()
        {
            return RULE_assign;
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof Lulu2Listener)
            {
                ((Lulu2Listener) listener).enterAssign(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof Lulu2Listener)
            {
                ((Lulu2Listener) listener).exitAssign(this);
            }
        }
    }

    public static class VarContext extends ParserRuleContext
    {
        public VarContext(ParserRuleContext parent, int invokingState)
        {
            super(parent, invokingState);
        }

        public List<RefContext> ref()
        {
            return getRuleContexts(RefContext.class);
        }

        public RefContext ref(int i)
        {
            return getRuleContext(RefContext.class, i);
        }

        public List<TerminalNode> DOT()
        {
            return getTokens(Lulu2Parser.DOT);
        }

        public TerminalNode DOT(int i)
        {
            return getToken(Lulu2Parser.DOT, i);
        }

        public TerminalNode THIS()
        {
            return getToken(Lulu2Parser.THIS, 0);
        }

        public TerminalNode SUPER()
        {
            return getToken(Lulu2Parser.SUPER, 0);
        }

        @Override
        public int getRuleIndex()
        {
            return RULE_var;
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof Lulu2Listener)
            {
                ((Lulu2Listener) listener).enterVar(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof Lulu2Listener)
            {
                ((Lulu2Listener) listener).exitVar(this);
            }
        }
    }

    public static class RefContext extends ParserRuleContext
    {
        public RefContext(ParserRuleContext parent, int invokingState)
        {
            super(parent, invokingState);
        }

        public TerminalNode ID()
        {
            return getToken(Lulu2Parser.ID, 0);
        }

        public List<TerminalNode> OpenBrace()
        {
            return getTokens(Lulu2Parser.OpenBrace);
        }

        public TerminalNode OpenBrace(int i)
        {
            return getToken(Lulu2Parser.OpenBrace, i);
        }

        public List<ExprContext> expr()
        {
            return getRuleContexts(ExprContext.class);
        }

        public ExprContext expr(int i)
        {
            return getRuleContext(ExprContext.class, i);
        }

        public List<TerminalNode> CloseBrace()
        {
            return getTokens(Lulu2Parser.CloseBrace);
        }

        public TerminalNode CloseBrace(int i)
        {
            return getToken(Lulu2Parser.CloseBrace, i);
        }

        @Override
        public int getRuleIndex()
        {
            return RULE_ref;
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof Lulu2Listener)
            {
                ((Lulu2Listener) listener).enterRef(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof Lulu2Listener)
            {
                ((Lulu2Listener) listener).exitRef(this);
            }
        }
    }

    public static class TypeBraceContext extends ParserRuleContext
    {
        public Type.PrimitiveType t;
        public TypeContext type;

        public TypeBraceContext(ParserRuleContext parent, int invokingState)
        {
            super(parent, invokingState);
        }

        public TypeContext type()
        {
            return getRuleContext(TypeContext.class, 0);
        }

        public List<TerminalNode> OpenBrace()
        {
            return getTokens(Lulu2Parser.OpenBrace);
        }

        public TerminalNode OpenBrace(int i)
        {
            return getToken(Lulu2Parser.OpenBrace, i);
        }

        public List<TerminalNode> CloseBrace()
        {
            return getTokens(Lulu2Parser.CloseBrace);
        }

        public TerminalNode CloseBrace(int i)
        {
            return getToken(Lulu2Parser.CloseBrace, i);
        }

        @Override
        public int getRuleIndex()
        {
            return RULE_typeBrace;
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof Lulu2Listener)
            {
                ((Lulu2Listener) listener).enterTypeBrace(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof Lulu2Listener)
            {
                ((Lulu2Listener) listener).exitTypeBrace(this);
            }
        }
    }

    public static class ArgsContext extends ParserRuleContext
    {
        public ArgsContext(ParserRuleContext parent, int invokingState)
        {
            super(parent, invokingState);
        }

        public List<TypeBraceContext> typeBrace()
        {
            return getRuleContexts(TypeBraceContext.class);
        }

        public TypeBraceContext typeBrace(int i)
        {
            return getRuleContext(TypeBraceContext.class, i);
        }

        public List<TerminalNode> COMMA()
        {
            return getTokens(Lulu2Parser.COMMA);
        }

        public TerminalNode COMMA(int i)
        {
            return getToken(Lulu2Parser.COMMA, i);
        }

        @Override
        public int getRuleIndex()
        {
            return RULE_args;
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof Lulu2Listener)
            {
                ((Lulu2Listener) listener).enterArgs(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof Lulu2Listener)
            {
                ((Lulu2Listener) listener).exitArgs(this);
            }
        }
    }

    public static class ArgsVarContext extends ParserRuleContext
    {
        public ArgsVarContext(ParserRuleContext parent, int invokingState)
        {
            super(parent, invokingState);
        }

        public List<TypeContext> type()
        {
            return getRuleContexts(TypeContext.class);
        }

        public TypeContext type(int i)
        {
            return getRuleContext(TypeContext.class, i);
        }

        public List<TerminalNode> ID()
        {
            return getTokens(Lulu2Parser.ID);
        }

        public TerminalNode ID(int i)
        {
            return getToken(Lulu2Parser.ID, i);
        }

        public List<TerminalNode> OpenBrace()
        {
            return getTokens(Lulu2Parser.OpenBrace);
        }

        public TerminalNode OpenBrace(int i)
        {
            return getToken(Lulu2Parser.OpenBrace, i);
        }

        public List<TerminalNode> CloseBrace()
        {
            return getTokens(Lulu2Parser.CloseBrace);
        }

        public TerminalNode CloseBrace(int i)
        {
            return getToken(Lulu2Parser.CloseBrace, i);
        }

        public List<TerminalNode> COMMA()
        {
            return getTokens(Lulu2Parser.COMMA);
        }

        public TerminalNode COMMA(int i)
        {
            return getToken(Lulu2Parser.COMMA, i);
        }

        @Override
        public int getRuleIndex()
        {
            return RULE_argsVar;
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof Lulu2Listener)
            {
                ((Lulu2Listener) listener).enterArgsVar(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof Lulu2Listener)
            {
                ((Lulu2Listener) listener).exitArgsVar(this);
            }
        }
    }

    public static class StmtContext extends ParserRuleContext
    {
        public StmtContext(ParserRuleContext parent, int invokingState)
        {
            super(parent, invokingState);
        }

        public StmtContext()
        {
        }

        @Override
        public int getRuleIndex()
        {
            return RULE_stmt;
        }

        public void copyFrom(StmtContext ctx)
        {
            super.copyFrom(ctx);
        }
    }

    public static class CONDSTMTAltContext extends StmtContext
    {
        public CONDSTMTAltContext(StmtContext ctx)
        {
            copyFrom(ctx);
        }

        public CondStmtContext condStmt()
        {
            return getRuleContext(CondStmtContext.class, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof Lulu2Listener)
            {
                ((Lulu2Listener) listener).enterCONDSTMTAlt(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof Lulu2Listener)
            {
                ((Lulu2Listener) listener).exitCONDSTMTAlt(this);
            }
        }
    }

    public static class CONTINUEAltContext extends StmtContext
    {
        public CONTINUEAltContext(StmtContext ctx)
        {
            copyFrom(ctx);
        }

        public TerminalNode CONTINUE()
        {
            return getToken(Lulu2Parser.CONTINUE, 0);
        }

        public TerminalNode SEMICOLON()
        {
            return getToken(Lulu2Parser.SEMICOLON, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof Lulu2Listener)
            {
                ((Lulu2Listener) listener).enterCONTINUEAlt(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof Lulu2Listener)
            {
                ((Lulu2Listener) listener).exitCONTINUEAlt(this);
            }
        }
    }

    public static class FUNCCALLSTMTAltContext extends StmtContext
    {
        public FUNCCALLSTMTAltContext(StmtContext ctx)
        {
            copyFrom(ctx);
        }

        public FuncCallContext funcCall()
        {
            return getRuleContext(FuncCallContext.class, 0);
        }

        public TerminalNode SEMICOLON()
        {
            return getToken(Lulu2Parser.SEMICOLON, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof Lulu2Listener)
            {
                ((Lulu2Listener) listener).enterFUNCCALLSTMTAlt(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof Lulu2Listener)
            {
                ((Lulu2Listener) listener).exitFUNCCALLSTMTAlt(this);
            }
        }
    }

    public static class BREAKAltContext extends StmtContext
    {
        public BREAKAltContext(StmtContext ctx)
        {
            copyFrom(ctx);
        }

        public TerminalNode BREAK()
        {
            return getToken(Lulu2Parser.BREAK, 0);
        }

        public TerminalNode SEMICOLON()
        {
            return getToken(Lulu2Parser.SEMICOLON, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof Lulu2Listener)
            {
                ((Lulu2Listener) listener).enterBREAKAlt(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof Lulu2Listener)
            {
                ((Lulu2Listener) listener).exitBREAKAlt(this);
            }
        }
    }

    public static class RETURNAltContext extends StmtContext
    {
        public RETURNAltContext(StmtContext ctx)
        {
            copyFrom(ctx);
        }

        public TerminalNode RETURN()
        {
            return getToken(Lulu2Parser.RETURN, 0);
        }

        public TerminalNode SEMICOLON()
        {
            return getToken(Lulu2Parser.SEMICOLON, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof Lulu2Listener)
            {
                ((Lulu2Listener) listener).enterRETURNAlt(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof Lulu2Listener)
            {
                ((Lulu2Listener) listener).exitRETURNAlt(this);
            }
        }
    }

    public static class LOOPSTMTAltContext extends StmtContext
    {
        public LOOPSTMTAltContext(StmtContext ctx)
        {
            copyFrom(ctx);
        }

        public LoopStmtContext loopStmt()
        {
            return getRuleContext(LoopStmtContext.class, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof Lulu2Listener)
            {
                ((Lulu2Listener) listener).enterLOOPSTMTAlt(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof Lulu2Listener)
            {
                ((Lulu2Listener) listener).exitLOOPSTMTAlt(this);
            }
        }
    }

    public static class DESTRUCTAltContext extends StmtContext
    {
        public DESTRUCTAltContext(StmtContext ctx)
        {
            copyFrom(ctx);
        }

        public TerminalNode DESTRUCT()
        {
            return getToken(Lulu2Parser.DESTRUCT, 0);
        }

        public TerminalNode ID()
        {
            return getToken(Lulu2Parser.ID, 0);
        }

        public TerminalNode SEMICOLON()
        {
            return getToken(Lulu2Parser.SEMICOLON, 0);
        }

        public List<TerminalNode> OpenBrace()
        {
            return getTokens(Lulu2Parser.OpenBrace);
        }

        public TerminalNode OpenBrace(int i)
        {
            return getToken(Lulu2Parser.OpenBrace, i);
        }

        public List<TerminalNode> CloseBrace()
        {
            return getTokens(Lulu2Parser.CloseBrace);
        }

        public TerminalNode CloseBrace(int i)
        {
            return getToken(Lulu2Parser.CloseBrace, i);
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof Lulu2Listener)
            {
                ((Lulu2Listener) listener).enterDESTRUCTAlt(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof Lulu2Listener)
            {
                ((Lulu2Listener) listener).exitDESTRUCTAlt(this);
            }
        }
    }

    public static class ASSIGNAltContext extends StmtContext
    {
        public ASSIGNAltContext(StmtContext ctx)
        {
            copyFrom(ctx);
        }

        public AssignContext assign()
        {
            return getRuleContext(AssignContext.class, 0);
        }

        public TerminalNode SEMICOLON()
        {
            return getToken(Lulu2Parser.SEMICOLON, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof Lulu2Listener)
            {
                ((Lulu2Listener) listener).enterASSIGNAlt(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof Lulu2Listener)
            {
                ((Lulu2Listener) listener).exitASSIGNAlt(this);
            }
        }
    }

    public static class ExprContext extends ParserRuleContext
    {
        public TypeEnum t;

        public ExprContext(ParserRuleContext parent, int invokingState)
        {
            super(parent, invokingState);
        }

        public ExprContext()
        {
        }

        @Override
        public int getRuleIndex()
        {
            return RULE_expr;
        }

        public void copyFrom(ExprContext ctx)
        {
            super.copyFrom(ctx);
            this.t = ctx.t;
        }
    }

    public static class LOGICALANDAltContext extends ExprContext
    {
        public ExprContext a;
        public Token LogicalAnd;
        public ExprContext b;
        public ExprContext expr;

        public LOGICALANDAltContext(ExprContext ctx)
        {
            copyFrom(ctx);
        }

        public TerminalNode LogicalAnd()
        {
            return getToken(Lulu2Parser.LogicalAnd, 0);
        }

        public List<ExprContext> expr()
        {
            return getRuleContexts(ExprContext.class);
        }

        public ExprContext expr(int i)
        {
            return getRuleContext(ExprContext.class, i);
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof Lulu2Listener)
            {
                ((Lulu2Listener) listener).enterLOGICALANDAlt(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof Lulu2Listener)
            {
                ((Lulu2Listener) listener).exitLOGICALANDAlt(this);
            }
        }
    }

    public static class ALLOCATIONAltContext extends ExprContext
    {
        public ALLOCATIONAltContext(ExprContext ctx)
        {
            copyFrom(ctx);
        }

        public TerminalNode ALLOCATE()
        {
            return getToken(Lulu2Parser.ALLOCATE, 0);
        }

        public HandleCallContext handleCall()
        {
            return getRuleContext(HandleCallContext.class, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof Lulu2Listener)
            {
                ((Lulu2Listener) listener).enterALLOCATIONAlt(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof Lulu2Listener)
            {
                ((Lulu2Listener) listener).exitALLOCATIONAlt(this);
            }
        }
    }

    public static class BITWISEORAltContext extends ExprContext
    {
        public ExprContext a;
        public Token BitwiseOr;
        public ExprContext b;
        public ExprContext expr;

        public BITWISEORAltContext(ExprContext ctx)
        {
            copyFrom(ctx);
        }

        public TerminalNode BitwiseOr()
        {
            return getToken(Lulu2Parser.BitwiseOr, 0);
        }

        public List<ExprContext> expr()
        {
            return getRuleContexts(ExprContext.class);
        }

        public ExprContext expr(int i)
        {
            return getRuleContext(ExprContext.class, i);
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof Lulu2Listener)
            {
                ((Lulu2Listener) listener).enterBITWISEORAlt(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof Lulu2Listener)
            {
                ((Lulu2Listener) listener).exitBITWISEORAlt(this);
            }
        }
    }

    public static class CONSTVALAltContext extends ExprContext
    {
        public ConstValContext constVal;

        public CONSTVALAltContext(ExprContext ctx)
        {
            copyFrom(ctx);
        }

        public ConstValContext constVal()
        {
            return getRuleContext(ConstValContext.class, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof Lulu2Listener)
            {
                ((Lulu2Listener) listener).enterCONSTVALAlt(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof Lulu2Listener)
            {
                ((Lulu2Listener) listener).exitCONSTVALAlt(this);
            }
        }
    }

    public static class PAREXPRAltContext extends ExprContext
    {
        public ExprContext expr;

        public PAREXPRAltContext(ExprContext ctx)
        {
            copyFrom(ctx);
        }

        public TerminalNode OpenPar()
        {
            return getToken(Lulu2Parser.OpenPar, 0);
        }

        public ExprContext expr()
        {
            return getRuleContext(ExprContext.class, 0);
        }

        public TerminalNode ClosePar()
        {
            return getToken(Lulu2Parser.ClosePar, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof Lulu2Listener)
            {
                ((Lulu2Listener) listener).enterPAREXPRAlt(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof Lulu2Listener)
            {
                ((Lulu2Listener) listener).exitPAREXPRAlt(this);
            }
        }
    }

    public static class ADDSUBAltContext extends ExprContext
    {
        public ExprContext a;
        public SecondLevelBinaryArithmeticOpContext secondLevelBinaryArithmeticOp;
        public ExprContext b;
        public ExprContext expr;

        public ADDSUBAltContext(ExprContext ctx)
        {
            copyFrom(ctx);
        }

        public SecondLevelBinaryArithmeticOpContext secondLevelBinaryArithmeticOp()
        {
            return getRuleContext(SecondLevelBinaryArithmeticOpContext.class, 0);
        }

        public List<ExprContext> expr()
        {
            return getRuleContexts(ExprContext.class);
        }

        public ExprContext expr(int i)
        {
            return getRuleContext(ExprContext.class, i);
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof Lulu2Listener)
            {
                ((Lulu2Listener) listener).enterADDSUBAlt(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof Lulu2Listener)
            {
                ((Lulu2Listener) listener).exitADDSUBAlt(this);
            }
        }
    }

    public static class ListContext extends ParserRuleContext
    {
        public ListContext(ParserRuleContext parent, int invokingState)
        {
            super(parent, invokingState);
        }

        public TerminalNode OpenBrace()
        {
            return getToken(Lulu2Parser.OpenBrace, 0);
        }

        public TerminalNode CloseBrace()
        {
            return getToken(Lulu2Parser.CloseBrace, 0);
        }

        public List<ExprContext> expr()
        {
            return getRuleContexts(ExprContext.class);
        }

        public ExprContext expr(int i)
        {
            return getRuleContext(ExprContext.class, i);
        }

        public List<ListContext> list()
        {
            return getRuleContexts(ListContext.class);
        }

        public ListContext list(int i)
        {
            return getRuleContext(ListContext.class, i);
        }

        public List<TerminalNode> COMMA()
        {
            return getTokens(Lulu2Parser.COMMA);
        }

        public TerminalNode COMMA(int i)
        {
            return getToken(Lulu2Parser.COMMA, i);
        }

        @Override
        public int getRuleIndex()
        {
            return RULE_list;
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof Lulu2Listener)
            {
                ((Lulu2Listener) listener).enterList(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof Lulu2Listener)
            {
                ((Lulu2Listener) listener).exitList(this);
            }
        }
    }

    public static class LISTAltContext extends ExprContext
    {
        public LISTAltContext(ExprContext ctx)
        {
            copyFrom(ctx);
        }

        public ListContext list()
        {
            return getRuleContext(ListContext.class, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof Lulu2Listener)
            {
                ((Lulu2Listener) listener).enterLISTAlt(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof Lulu2Listener)
            {
                ((Lulu2Listener) listener).exitLISTAlt(this);
            }
        }
    }

    public static class HandleCallContext extends ParserRuleContext
    {
        public HandleCallContext(ParserRuleContext parent, int invokingState)
        {
            super(parent, invokingState);
        }

        public TerminalNode ID()
        {
            return getToken(Lulu2Parser.ID, 0);
        }

        public TerminalNode OpenPar()
        {
            return getToken(Lulu2Parser.OpenPar, 0);
        }

        public TerminalNode ClosePar()
        {
            return getToken(Lulu2Parser.ClosePar, 0);
        }

        public ParamsContext params()
        {
            return getRuleContext(ParamsContext.class, 0);
        }

        @Override
        public int getRuleIndex()
        {
            return RULE_handleCall;
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof Lulu2Listener)
            {
                ((Lulu2Listener) listener).enterHandleCall(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof Lulu2Listener)
            {
                ((Lulu2Listener) listener).exitHandleCall(this);
            }
        }
    }

    public static class FUNCCALLAltContext extends ExprContext
    {
        public FUNCCALLAltContext(ExprContext ctx)
        {
            copyFrom(ctx);
        }

        public FuncCallContext funcCall()
        {
            return getRuleContext(FuncCallContext.class, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof Lulu2Listener)
            {
                ((Lulu2Listener) listener).enterFUNCCALLAlt(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof Lulu2Listener)
            {
                ((Lulu2Listener) listener).exitFUNCCALLAlt(this);
            }
        }
    }

    public static class ParamsContext extends ParserRuleContext
    {
        public ParamsContext(ParserRuleContext parent, int invokingState)
        {
            super(parent, invokingState);
        }

        public ExprContext expr()
        {
            return getRuleContext(ExprContext.class, 0);
        }

        public TerminalNode COMMA()
        {
            return getToken(Lulu2Parser.COMMA, 0);
        }

        public ParamsContext params()
        {
            return getRuleContext(ParamsContext.class, 0);
        }

        @Override
        public int getRuleIndex()
        {
            return RULE_params;
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof Lulu2Listener)
            {
                ((Lulu2Listener) listener).enterParams(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof Lulu2Listener)
            {
                ((Lulu2Listener) listener).exitParams(this);
            }
        }
    }

    public static class MULDIVAltContext extends ExprContext
    {
        public ExprContext a;
        public FirstLevelBinaryArithmeticOpContext firstLevelBinaryArithmeticOp;
        public ExprContext b;
        public ExprContext expr;

        public MULDIVAltContext(ExprContext ctx)
        {
            copyFrom(ctx);
        }

        public FirstLevelBinaryArithmeticOpContext firstLevelBinaryArithmeticOp()
        {
            return getRuleContext(FirstLevelBinaryArithmeticOpContext.class, 0);
        }

        public List<ExprContext> expr()
        {
            return getRuleContexts(ExprContext.class);
        }

        public ExprContext expr(int i)
        {
            return getRuleContext(ExprContext.class, i);
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof Lulu2Listener)
            {
                ((Lulu2Listener) listener).enterMULDIVAlt(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof Lulu2Listener)
            {
                ((Lulu2Listener) listener).exitMULDIVAlt(this);
            }
        }
    }

    public static class EQUALITYAltContext extends ExprContext
    {
        public ExprContext a;
        public SecondLevelBinaryRelationalOpContext secondLevelBinaryRelationalOp;
        public ExprContext b;
        public ExprContext expr;

        public EQUALITYAltContext(ExprContext ctx)
        {
            copyFrom(ctx);
        }

        public SecondLevelBinaryRelationalOpContext secondLevelBinaryRelationalOp()
        {
            return getRuleContext(SecondLevelBinaryRelationalOpContext.class, 0);
        }

        public List<ExprContext> expr()
        {
            return getRuleContexts(ExprContext.class);
        }

        public ExprContext expr(int i)
        {
            return getRuleContext(ExprContext.class, i);
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof Lulu2Listener)
            {
                ((Lulu2Listener) listener).enterEQUALITYAlt(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof Lulu2Listener)
            {
                ((Lulu2Listener) listener).exitEQUALITYAlt(this);
            }
        }
    }

    public static class COMPAREAltContext extends ExprContext
    {
        public ExprContext a;
        public FirstLevelBinaryRelationalOpContext firstLevelBinaryRelationalOp;
        public ExprContext b;
        public ExprContext expr;

        public COMPAREAltContext(ExprContext ctx)
        {
            copyFrom(ctx);
        }

        public FirstLevelBinaryRelationalOpContext firstLevelBinaryRelationalOp()
        {
            return getRuleContext(FirstLevelBinaryRelationalOpContext.class, 0);
        }

        public List<ExprContext> expr()
        {
            return getRuleContexts(ExprContext.class);
        }

        public ExprContext expr(int i)
        {
            return getRuleContext(ExprContext.class, i);
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof Lulu2Listener)
            {
                ((Lulu2Listener) listener).enterCOMPAREAlt(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof Lulu2Listener)
            {
                ((Lulu2Listener) listener).exitCOMPAREAlt(this);
            }
        }
    }

    public static class NILAltContext extends ExprContext
    {
        public NILAltContext(ExprContext ctx)
        {
            copyFrom(ctx);
        }

        public TerminalNode NIL()
        {
            return getToken(Lulu2Parser.NIL, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof Lulu2Listener)
            {
                ((Lulu2Listener) listener).enterNILAlt(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof Lulu2Listener)
            {
                ((Lulu2Listener) listener).exitNILAlt(this);
            }
        }
    }

    public static class LOGICALORAltContext extends ExprContext
    {
        public ExprContext a;
        public Token LogicalOr;
        public ExprContext b;
        public ExprContext expr;

        public LOGICALORAltContext(ExprContext ctx)
        {
            copyFrom(ctx);
        }

        public TerminalNode LogicalOr()
        {
            return getToken(Lulu2Parser.LogicalOr, 0);
        }

        public List<ExprContext> expr()
        {
            return getRuleContexts(ExprContext.class);
        }

        public ExprContext expr(int i)
        {
            return getRuleContext(ExprContext.class, i);
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof Lulu2Listener)
            {
                ((Lulu2Listener) listener).enterLOGICALORAlt(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof Lulu2Listener)
            {
                ((Lulu2Listener) listener).exitLOGICALORAlt(this);
            }
        }
    }

    public static class VARAltContext extends ExprContext
    {
        public VARAltContext(ExprContext ctx)
        {
            copyFrom(ctx);
        }

        public VarContext var()
        {
            return getRuleContext(VarContext.class, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof Lulu2Listener)
            {
                ((Lulu2Listener) listener).enterVARAlt(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof Lulu2Listener)
            {
                ((Lulu2Listener) listener).exitVARAlt(this);
            }
        }
    }

    public static class BITWISEANDAltContext extends ExprContext
    {
        public ExprContext a;
        public Token BitwiseAnd;
        public ExprContext b;
        public ExprContext expr;

        public BITWISEANDAltContext(ExprContext ctx)
        {
            copyFrom(ctx);
        }

        public TerminalNode BitwiseAnd()
        {
            return getToken(Lulu2Parser.BitwiseAnd, 0);
        }

        public List<ExprContext> expr()
        {
            return getRuleContexts(ExprContext.class);
        }

        public ExprContext expr(int i)
        {
            return getRuleContext(ExprContext.class, i);
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof Lulu2Listener)
            {
                ((Lulu2Listener) listener).enterBITWISEANDAlt(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof Lulu2Listener)
            {
                ((Lulu2Listener) listener).exitBITWISEANDAlt(this);
            }
        }
    }

    public static class FuncCallContext extends ParserRuleContext
    {
        public FuncCallContext(ParserRuleContext parent, int invokingState)
        {
            super(parent, invokingState);
        }

        public FuncCallContext()
        {
        }

        @Override
        public int getRuleIndex()
        {
            return RULE_funcCall;
        }

        public void copyFrom(FuncCallContext ctx)
        {
            super.copyFrom(ctx);
        }
    }

    public static class UNARYOPAltContext extends ExprContext
    {
        public UnaryOpContext unaryOp;
        public ExprContext expr;

        public UNARYOPAltContext(ExprContext ctx)
        {
            copyFrom(ctx);
        }

        public UnaryOpContext unaryOp()
        {
            return getRuleContext(UnaryOpContext.class, 0);
        }

        public ExprContext expr()
        {
            return getRuleContext(ExprContext.class, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof Lulu2Listener)
            {
                ((Lulu2Listener) listener).enterUNARYOPAlt(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof Lulu2Listener)
            {
                ((Lulu2Listener) listener).exitUNARYOPAlt(this);
            }
        }
    }

    public static class BITWISELOGICALXORAltContext extends ExprContext
    {
        public ExprContext a;
        public Token BitwiseLogicalXor;
        public ExprContext b;
        public ExprContext expr;

        public BITWISELOGICALXORAltContext(ExprContext ctx)
        {
            copyFrom(ctx);
        }

        public TerminalNode BitwiseLogicalXor()
        {
            return getToken(Lulu2Parser.BitwiseLogicalXor, 0);
        }

        public List<ExprContext> expr()
        {
            return getRuleContexts(ExprContext.class);
        }

        public ExprContext expr(int i)
        {
            return getRuleContext(ExprContext.class, i);
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof Lulu2Listener)
            {
                ((Lulu2Listener) listener).enterBITWISELOGICALXORAlt(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof Lulu2Listener)
            {
                ((Lulu2Listener) listener).exitBITWISELOGICALXORAlt(this);
            }
        }
    }

    public static class METHODCALLAltContext extends FuncCallContext
    {
        public METHODCALLAltContext(FuncCallContext ctx)
        {
            copyFrom(ctx);
        }

        public HandleCallContext handleCall()
        {
            return getRuleContext(HandleCallContext.class, 0);
        }

        public VarContext var()
        {
            return getRuleContext(VarContext.class, 0);
        }

        public TerminalNode DOT()
        {
            return getToken(Lulu2Parser.DOT, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof Lulu2Listener)
            {
                ((Lulu2Listener) listener).enterMETHODCALLAlt(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof Lulu2Listener)
            {
                ((Lulu2Listener) listener).exitMETHODCALLAlt(this);
            }
        }
    }

    public static class READAltContext extends FuncCallContext
    {
        public READAltContext(FuncCallContext ctx)
        {
            copyFrom(ctx);
        }

        public TerminalNode READ()
        {
            return getToken(Lulu2Parser.READ, 0);
        }

        public TerminalNode OpenPar()
        {
            return getToken(Lulu2Parser.OpenPar, 0);
        }

        public VarContext var()
        {
            return getRuleContext(VarContext.class, 0);
        }

        public TerminalNode ClosePar()
        {
            return getToken(Lulu2Parser.ClosePar, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof Lulu2Listener)
            {
                ((Lulu2Listener) listener).enterREADAlt(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof Lulu2Listener)
            {
                ((Lulu2Listener) listener).exitREADAlt(this);
            }
        }
    }

    public static class WRITEAltContext extends FuncCallContext
    {
        public WRITEAltContext(FuncCallContext ctx)
        {
            copyFrom(ctx);
        }

        public TerminalNode WRITE()
        {
            return getToken(Lulu2Parser.WRITE, 0);
        }

        public TerminalNode OpenPar()
        {
            return getToken(Lulu2Parser.OpenPar, 0);
        }

        public VarContext var()
        {
            return getRuleContext(VarContext.class, 0);
        }

        public TerminalNode ClosePar()
        {
            return getToken(Lulu2Parser.ClosePar, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof Lulu2Listener)
            {
                ((Lulu2Listener) listener).enterWRITEAlt(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof Lulu2Listener)
            {
                ((Lulu2Listener) listener).exitWRITEAlt(this);
            }
        }
    }

    public static class UnaryOpContext extends ParserRuleContext
    {
        public UnaryOpContext(ParserRuleContext parent, int invokingState)
        {
            super(parent, invokingState);
        }

        public TerminalNode SUBTRACTION()
        {
            return getToken(Lulu2Parser.SUBTRACTION, 0);
        }

        public TerminalNode LogicalNot()
        {
            return getToken(Lulu2Parser.LogicalNot, 0);
        }

        public TerminalNode BitwiseNegation()
        {
            return getToken(Lulu2Parser.BitwiseNegation, 0);
        }

        @Override
        public int getRuleIndex()
        {
            return RULE_unaryOp;
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof Lulu2Listener)
            {
                ((Lulu2Listener) listener).enterUnaryOp(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof Lulu2Listener)
            {
                ((Lulu2Listener) listener).exitUnaryOp(this);
            }
        }
    }

    public static class CondStmtContext extends ParserRuleContext
    {
        public CondStmtContext(ParserRuleContext parent, int invokingState)
        {
            super(parent, invokingState);
        }

        public CondStmtContext()
        {
        }

        @Override
        public int getRuleIndex()
        {
            return RULE_condStmt;
        }

        public void copyFrom(CondStmtContext ctx)
        {
            super.copyFrom(ctx);
        }
    }

    public static class FirstLevelBinaryArithmeticOpContext extends ParserRuleContext
    {
        public FirstLevelBinaryArithmeticOpContext(ParserRuleContext parent, int invokingState)
        {
            super(parent, invokingState);
        }

        public TerminalNode MULTIPLICATION()
        {
            return getToken(Lulu2Parser.MULTIPLICATION, 0);
        }

        public TerminalNode DIVISION()
        {
            return getToken(Lulu2Parser.DIVISION, 0);
        }

        public TerminalNode MODULUS()
        {
            return getToken(Lulu2Parser.MODULUS, 0);
        }

        @Override
        public int getRuleIndex()
        {
            return RULE_firstLevelBinaryArithmeticOp;
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof Lulu2Listener)
            {
                ((Lulu2Listener) listener).enterFirstLevelBinaryArithmeticOp(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof Lulu2Listener)
            {
                ((Lulu2Listener) listener).exitFirstLevelBinaryArithmeticOp(this);
            }
        }
    }

    public static class SWITCHAltContext extends CondStmtContext
    {
        public TerminalNode SWITCH()
        {
            return getToken(Lulu2Parser.SWITCH, 0);
        }

        public VarContext var()
        {
            return getRuleContext(VarContext.class, 0);
        }

        public TerminalNode OpenCurlyBrace()
        {
            return getToken(Lulu2Parser.OpenCurlyBrace, 0);
        }

        public TerminalNode DEFAULT()
        {
            return getToken(Lulu2Parser.DEFAULT, 0);
        }

        public List<TerminalNode> COLON()
        {
            return getTokens(Lulu2Parser.COLON);
        }

        public TerminalNode COLON(int i)
        {
            return getToken(Lulu2Parser.COLON, i);
        }

        public SWITCHAltContext(CondStmtContext ctx)
        {
            copyFrom(ctx);
        }

        public List<BlockContext> block()
        {
            return getRuleContexts(BlockContext.class);
        }

        public TerminalNode CloseCurlyBrace()
        {
            return getToken(Lulu2Parser.CloseCurlyBrace, 0);
        }

        public List<TerminalNode> CASE()
        {
            return getTokens(Lulu2Parser.CASE);
        }

        public TerminalNode CASE(int i)
        {
            return getToken(Lulu2Parser.CASE, i);
        }

        public List<TerminalNode> IntLiteral()
        {
            return getTokens(Lulu2Parser.IntLiteral);
        }

        public TerminalNode IntLiteral(int i)
        {
            return getToken(Lulu2Parser.IntLiteral, i);
        }

        public BlockContext block(int i)
        {
            return getRuleContext(BlockContext.class, i);
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof Lulu2Listener)
            {
                ((Lulu2Listener) listener).enterSWITCHAlt(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof Lulu2Listener)
            {
                ((Lulu2Listener) listener).exitSWITCHAlt(this);
            }
        }
    }

    public static class SecondLevelBinaryArithmeticOpContext extends ParserRuleContext
    {
        public SecondLevelBinaryArithmeticOpContext(ParserRuleContext parent, int invokingState)
        {
            super(parent, invokingState);
        }

        public TerminalNode ADDITION()
        {
            return getToken(Lulu2Parser.ADDITION, 0);
        }

        public TerminalNode SUBTRACTION()
        {
            return getToken(Lulu2Parser.SUBTRACTION, 0);
        }

        @Override
        public int getRuleIndex()
        {
            return RULE_secondLevelBinaryArithmeticOp;
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof Lulu2Listener)
            {
                ((Lulu2Listener) listener).enterSecondLevelBinaryArithmeticOp(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof Lulu2Listener)
            {
                ((Lulu2Listener) listener).exitSecondLevelBinaryArithmeticOp(this);
            }
        }
    }

    public static class LoopStmtContext extends ParserRuleContext
    {
        public LoopStmtContext(ParserRuleContext parent, int invokingState)
        {
            super(parent, invokingState);
        }

        public LoopStmtContext()
        {
        }

        @Override
        public int getRuleIndex()
        {
            return RULE_loopStmt;
        }

        public void copyFrom(LoopStmtContext ctx)
        {
            super.copyFrom(ctx);
        }
    }

    public static class IFAltContext extends CondStmtContext
    {
        public IFAltContext(CondStmtContext ctx)
        {
            copyFrom(ctx);
        }

        public TerminalNode IF()
        {
            return getToken(Lulu2Parser.IF, 0);
        }

        public ExprContext expr()
        {
            return getRuleContext(ExprContext.class, 0);
        }

        public List<BlockContext> block()
        {
            return getRuleContexts(BlockContext.class);
        }

        public BlockContext block(int i)
        {
            return getRuleContext(BlockContext.class, i);
        }

        public TerminalNode ELSE()
        {
            return getToken(Lulu2Parser.ELSE, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof Lulu2Listener)
            {
                ((Lulu2Listener) listener).enterIFAlt(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof Lulu2Listener)
            {
                ((Lulu2Listener) listener).exitIFAlt(this);
            }
        }
    }

    public static class WHILEAltContext extends LoopStmtContext
    {
        public WHILEAltContext(LoopStmtContext ctx)
        {
            copyFrom(ctx);
        }

        public TerminalNode WHILE()
        {
            return getToken(Lulu2Parser.WHILE, 0);
        }

        public ExprContext expr()
        {
            return getRuleContext(ExprContext.class, 0);
        }

        public BlockContext block()
        {
            return getRuleContext(BlockContext.class, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof Lulu2Listener)
            {
                ((Lulu2Listener) listener).enterWHILEAlt(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof Lulu2Listener)
            {
                ((Lulu2Listener) listener).exitWHILEAlt(this);
            }
        }
    }

    public static class FirstLevelBinaryRelationalOpContext extends ParserRuleContext
    {
        public FirstLevelBinaryRelationalOpContext(ParserRuleContext parent, int invokingState)
        {
            super(parent, invokingState);
        }

        public TerminalNode LessThanOrEqual()
        {
            return getToken(Lulu2Parser.LessThanOrEqual, 0);
        }

        public TerminalNode LessThan()
        {
            return getToken(Lulu2Parser.LessThan, 0);
        }

        public TerminalNode BiggerThanOrEqual()
        {
            return getToken(Lulu2Parser.BiggerThanOrEqual, 0);
        }

        public TerminalNode BiggerThan()
        {
            return getToken(Lulu2Parser.BiggerThan, 0);
        }

        @Override
        public int getRuleIndex()
        {
            return RULE_firstLevelBinaryRelationalOp;
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof Lulu2Listener)
            {
                ((Lulu2Listener) listener).enterFirstLevelBinaryRelationalOp(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof Lulu2Listener)
            {
                ((Lulu2Listener) listener).exitFirstLevelBinaryRelationalOp(this);
            }
        }
    }

    public static class SecondLevelBinaryRelationalOpContext extends ParserRuleContext
    {
        public SecondLevelBinaryRelationalOpContext(ParserRuleContext parent, int invokingState)
        {
            super(parent, invokingState);
        }

        public TerminalNode EQUAL()
        {
            return getToken(Lulu2Parser.EQUAL, 0);
        }

        public TerminalNode NotEqual()
        {
            return getToken(Lulu2Parser.NotEqual, 0);
        }

        @Override
        public int getRuleIndex()
        {
            return RULE_secondLevelBinaryRelationalOp;
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof Lulu2Listener)
            {
                ((Lulu2Listener) listener).enterSecondLevelBinaryRelationalOp(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof Lulu2Listener)
            {
                ((Lulu2Listener) listener).exitSecondLevelBinaryRelationalOp(this);
            }
        }
    }

    public static class FORAltContext extends LoopStmtContext
    {
        public FORAltContext(LoopStmtContext ctx)
        {
            copyFrom(ctx);
        }

        public TerminalNode FOR()
        {
            return getToken(Lulu2Parser.FOR, 0);
        }

        public List<TerminalNode> SEMICOLON()
        {
            return getTokens(Lulu2Parser.SEMICOLON);
        }

        public TerminalNode SEMICOLON(int i)
        {
            return getToken(Lulu2Parser.SEMICOLON, i);
        }

        public ExprContext expr()
        {
            return getRuleContext(ExprContext.class, 0);
        }

        public BlockContext block()
        {
            return getRuleContext(BlockContext.class, 0);
        }

        public List<AssignContext> assign()
        {
            return getRuleContexts(AssignContext.class);
        }

        public AssignContext assign(int i)
        {
            return getRuleContext(AssignContext.class, i);
        }

        public TypeContext type()
        {
            return getRuleContext(TypeContext.class, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof Lulu2Listener)
            {
                ((Lulu2Listener) listener).enterFORAlt(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof Lulu2Listener)
            {
                ((Lulu2Listener) listener).exitFORAlt(this);
            }
        }
    }

    public static class TypeContext extends ParserRuleContext
    {
        public Type.PrimitiveType t;

        public TypeContext(ParserRuleContext parent, int invokingState)
        {
            super(parent, invokingState);
        }

        public TerminalNode INT()
        {
            return getToken(Lulu2Parser.INT, 0);
        }

        public TerminalNode BOOL()
        {
            return getToken(Lulu2Parser.BOOL, 0);
        }

        public TerminalNode FLOAT()
        {
            return getToken(Lulu2Parser.FLOAT, 0);
        }

        public TerminalNode STRING()
        {
            return getToken(Lulu2Parser.STRING, 0);
        }

        public TerminalNode ID()
        {
            return getToken(Lulu2Parser.ID, 0);
        }

        @Override
        public int getRuleIndex()
        {
            return RULE_type;
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof Lulu2Listener)
            {
                ((Lulu2Listener) listener).enterType(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof Lulu2Listener)
            {
                ((Lulu2Listener) listener).exitType(this);
            }
        }
    }

    public static class ConstValContext extends ParserRuleContext
    {
        public TypeEnum t;

        public ConstValContext(ParserRuleContext parent, int invokingState)
        {
            super(parent, invokingState);
        }

        public TerminalNode IntLiteral()
        {
            return getToken(Lulu2Parser.IntLiteral, 0);
        }

        public TerminalNode FloatLiteral()
        {
            return getToken(Lulu2Parser.FloatLiteral, 0);
        }

        public TerminalNode BoolLiteral()
        {
            return getToken(Lulu2Parser.BoolLiteral, 0);
        }

        public TerminalNode StringLiteral()
        {
            return getToken(Lulu2Parser.StringLiteral, 0);
        }

        @Override
        public int getRuleIndex()
        {
            return RULE_constVal;
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof Lulu2Listener)
            {
                ((Lulu2Listener) listener).enterConstVal(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof Lulu2Listener)
            {
                ((Lulu2Listener) listener).exitConstVal(this);
            }
        }
    }
}