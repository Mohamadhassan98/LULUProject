// Generated from C:/Users/Mohamadhassan/IdeaProjects/LULUProject/src/LULU\Lulu2.g4 by ANTLR 4.7
package LULU;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.LexerATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Lulu2Lexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SingleLineComment=1, MultiLineComment=2, ALLOCATE=3, BOOL=4, BREAK=5, 
		CASE=6, CONST=7, CONTINUE=8, DECLARE=9, DEFAULT=10, DESTRUCT=11, ELSE=12, 
		FUNCTION=13, FLOAT=14, FOR=15, IF=16, INT=17, NIL=18, OF=19, PRIVATE=20, 
		PROTECTED=21, PUBLIC=22, READ=23, RETURN=24, STRING=25, SUPER=26, SWITCH=27, 
		THIS=28, TYPE=29, WHILE=30, WRITE=31, EQUAL=32, NotEqual=33, LessThanOrEqual=34, 
		LessThan=35, BiggerThan=36, BiggerThanOrEqual=37, BitwiseNegation=38, 
		BitwiseOr=39, BitwiseAnd=40, BitwiseLogicalXor=41, LogicalOr=42, LogicalAnd=43, 
		LogicalNot=44, SUBTRACTION=45, ADDITION=46, MULTIPLICATION=47, DIVISION=48, 
		MODULUS=49, ASSIGN=50, OpenCurlyBrace=51, CloseCurlyBrace=52, OpenPar=53, 
		ClosePar=54, OpenBrace=55, CloseBrace=56, DOT=57, COMMA=58, COLON=59, 
		SEMICOLON=60, IntLiteral=61, FloatLiteral=62, StringLiteral=63, BoolLiteral=64, 
		ID=65, WhiteSpace=66;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"SingleLineComment", "MultiLineComment", "ALLOCATE", "BOOL", "BREAK", 
		"CASE", "CONST", "CONTINUE", "DECLARE", "DEFAULT", "DESTRUCT", "ELSE", 
		"FALSE", "FUNCTION", "FLOAT", "FOR", "IF", "INT", "NIL", "OF", "PRIVATE", 
		"PROTECTED", "PUBLIC", "READ", "RETURN", "STRING", "SUPER", "SWITCH", 
		"THIS", "TRUE", "TYPE", "WHILE", "WRITE", "EQUAL", "NotEqual", "LessThanOrEqual", 
		"LessThan", "BiggerThan", "BiggerThanOrEqual", "BitwiseNegation", "BitwiseOr", 
		"BitwiseAnd", "BitwiseLogicalXor", "LogicalOr", "LogicalAnd", "LogicalNot", 
		"SUBTRACTION", "ADDITION", "MULTIPLICATION", "DIVISION", "MODULUS", "ASSIGN", 
		"OpenCurlyBrace", "CloseCurlyBrace", "OpenPar", "ClosePar", "OpenBrace", 
		"CloseBrace", "DOT", "COMMA", "COLON", "SEMICOLON", "DIGIT", "DECIMAL", 
		"HEX", "HEXADECIMAL", "IntLiteral", "EXPONENT", "FloatLiteral", "StringSample", 
		"UNICODE", "ESCAPE", "StringLiteral", "BoolLiteral", "ID", "WhiteSpace"
	};

	public static final String _serializedATN = "\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2D\u0212\b\1\4\2\t" + "\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13" + "\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22" + "\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31" + "\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!" + "\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4" + ",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t" + "\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t=" + "\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I" + "\tI\4J\tJ\4K\tK\4L\tL\4M\tM\3\2\3\2\3\2\3\2\7\2\u00a0\n\2\f\2\16\2\u00a3" + "\13\2\3\2\5\2\u00a6\n\2\3\2\3\2\3\3\3\3\3\3\3\3\7\3\u00ae\n\3\f\3\16\3" + "\u00b1\13\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3" + "\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b" + "\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3" + "\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f" + "\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16" + "\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20" + "\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3\24" + "\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27" + "\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30" + "\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32" + "\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\35" + "\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37" + "\3\37\3\37\3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3" + "#\3#\3#\3$\3$\3$\3%\3%\3%\3&\3&\3\'\3\'\3(\3(\3(\3)\3)\3*\3*\3+\3+\3," + "\3,\3-\3-\3-\3.\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3" + "\64\3\64\3\65\3\65\3\66\3\66\3\67\3\67\38\38\39\39\3:\3:\3;\3;\3<\3<\3" + "=\3=\3>\3>\3?\3?\3@\3@\3A\6A\u01bc\nA\rA\16A\u01bd\3B\3B\5B\u01c2\nB\3" + "C\3C\3C\6C\u01c7\nC\rC\16C\u01c8\3D\3D\5D\u01cd\nD\3E\3E\5E\u01d1\nE\3" + "E\3E\3F\7F\u01d6\nF\fF\16F\u01d9\13F\3F\3F\3F\3F\3F\3F\7F\u01e1\nF\fF" + "\16F\u01e4\13F\5F\u01e6\nF\3F\5F\u01e9\nF\3G\3G\3H\3H\3H\3H\3I\3I\3I\3" + "I\5I\u01f5\nI\3J\3J\3J\7J\u01fa\nJ\fJ\16J\u01fd\13J\3J\3J\3K\3K\5K\u0203" + "\nK\3L\3L\7L\u0207\nL\fL\16L\u020a\13L\3M\6M\u020d\nM\rM\16M\u020e\3M" + "\3M\4\u00af\u01fb\2N\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27" + "\r\31\16\33\2\35\17\37\20!\21#\22%\23\'\24)\25+\26-\27/\30\61\31\63\32" + "\65\33\67\349\35;\36=\2?\37A C!E\"G#I$K%M&O\'Q(S)U*W+Y,[-]._/a\60c\61" + "e\62g\63i\64k\65m\66o\67q8s9u:w;y<{=}>\177\2\u0081\2\u0083\2\u0085\2\u0087" + "?\u0089\2\u008b@\u008d\2\u008f\2\u0091\2\u0093A\u0095B\u0097C\u0099D\3" + "\2\16\3\2\f\f\3\3\f\f\3\2\62;\4\2CHch\4\2ZZzz\4\2GGgg\4\2--//\3\2^^\b" + "\2))\62\62ddppttvv\6\2%%C\\aac|\7\2%%\62;C\\aac|\5\2\13\f\17\17\"\"\2" + "\u0219\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2" + "\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3" + "\2\2\2\2\31\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2" + "%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61" + "\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2" + "\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K" + "\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2" + "\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2" + "\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q" + "\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2" + "\2\2\2\u0087\3\2\2\2\2\u008b\3\2\2\2\2\u0093\3\2\2\2\2\u0095\3\2\2\2\2" + "\u0097\3\2\2\2\2\u0099\3\2\2\2\3\u009b\3\2\2\2\5\u00a9\3\2\2\2\7\u00b7" + "\3\2\2\2\t\u00c0\3\2\2\2\13\u00c5\3\2\2\2\r\u00cb\3\2\2\2\17\u00d0\3\2" + "\2\2\21\u00d6\3\2\2\2\23\u00df\3\2\2\2\25\u00e7\3\2\2\2\27\u00ef\3\2\2" + "\2\31\u00f8\3\2\2\2\33\u00fd\3\2\2\2\35\u0103\3\2\2\2\37\u010c\3\2\2\2" + "!\u0112\3\2\2\2#\u0116\3\2\2\2%\u0119\3\2\2\2\'\u011d\3\2\2\2)\u0121\3" + "\2\2\2+\u0124\3\2\2\2-\u012c\3\2\2\2/\u0136\3\2\2\2\61\u013d\3\2\2\2\63" + "\u0142\3\2\2\2\65\u0149\3\2\2\2\67\u0150\3\2\2\29\u0156\3\2\2\2;\u015d" + "\3\2\2\2=\u0162\3\2\2\2?\u0167\3\2\2\2A\u016c\3\2\2\2C\u0172\3\2\2\2E" + "\u0178\3\2\2\2G\u017b\3\2\2\2I\u017e\3\2\2\2K\u0181\3\2\2\2M\u0183\3\2" + "\2\2O\u0185\3\2\2\2Q\u0188\3\2\2\2S\u018a\3\2\2\2U\u018c\3\2\2\2W\u018e" + "\3\2\2\2Y\u0190\3\2\2\2[\u0193\3\2\2\2]\u0196\3\2\2\2_\u0198\3\2\2\2a" + "\u019a\3\2\2\2c\u019c\3\2\2\2e\u019e\3\2\2\2g\u01a0\3\2\2\2i\u01a2\3\2" + "\2\2k\u01a4\3\2\2\2m\u01a6\3\2\2\2o\u01a8\3\2\2\2q\u01aa\3\2\2\2s\u01ac" + "\3\2\2\2u\u01ae\3\2\2\2w\u01b0\3\2\2\2y\u01b2\3\2\2\2{\u01b4\3\2\2\2}" + "\u01b6\3\2\2\2\177\u01b8\3\2\2\2\u0081\u01bb\3\2\2\2\u0083\u01c1\3\2\2" + "\2\u0085\u01c3\3\2\2\2\u0087\u01cc\3\2\2\2\u0089\u01ce\3\2\2\2\u008b\u01e5" + "\3\2\2\2\u008d\u01ea\3\2\2\2\u008f\u01ec\3\2\2\2\u0091\u01f0\3\2\2\2\u0093" + "\u01f6\3\2\2\2\u0095\u0202\3\2\2\2\u0097\u0204\3\2\2\2\u0099\u020c\3\2" + "\2\2\u009b\u009c\7\'\2\2\u009c\u009d\7\'\2\2\u009d\u00a1\3\2\2\2\u009e" + "\u00a0\n\2\2\2\u009f\u009e\3\2\2\2\u00a0\u00a3\3\2\2\2\u00a1\u009f\3\2" + "\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a5\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a4" + "\u00a6\t\3\2\2\u00a5\u00a4\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a8\b\2" + "\2\2\u00a8\4\3\2\2\2\u00a9\u00aa\7\'\2\2\u00aa\u00ab\7\u0080\2\2\u00ab" + "\u00af\3\2\2\2\u00ac\u00ae\13\2\2\2\u00ad\u00ac\3\2\2\2\u00ae\u00b1\3" + "\2\2\2\u00af\u00b0\3\2\2\2\u00af\u00ad\3\2\2\2\u00b0\u00b2\3\2\2\2\u00b1" + "\u00af\3\2\2\2\u00b2\u00b3\7\u0080\2\2\u00b3\u00b4\7\'\2\2\u00b4\u00b5" + "\3\2\2\2\u00b5\u00b6\b\3\2\2\u00b6\6\3\2\2\2\u00b7\u00b8\7c\2\2\u00b8" + "\u00b9\7n\2\2\u00b9\u00ba\7n\2\2\u00ba\u00bb\7q\2\2\u00bb\u00bc\7e\2\2" + "\u00bc\u00bd\7c\2\2\u00bd\u00be\7v\2\2\u00be\u00bf\7g\2\2\u00bf\b\3\2" + "\2\2\u00c0\u00c1\7d\2\2\u00c1\u00c2\7q\2\2\u00c2\u00c3\7q\2\2\u00c3\u00c4" + "\7n\2\2\u00c4\n\3\2\2\2\u00c5\u00c6\7d\2\2\u00c6\u00c7\7t\2\2\u00c7\u00c8" + "\7g\2\2\u00c8\u00c9\7c\2\2\u00c9\u00ca\7m\2\2\u00ca\f\3\2\2\2\u00cb\u00cc" + "\7e\2\2\u00cc\u00cd\7c\2\2\u00cd\u00ce\7u\2\2\u00ce\u00cf\7g\2\2\u00cf" + "\16\3\2\2\2\u00d0\u00d1\7e\2\2\u00d1\u00d2\7q\2\2\u00d2\u00d3\7p\2\2\u00d3" + "\u00d4\7u\2\2\u00d4\u00d5\7v\2\2\u00d5\20\3\2\2\2\u00d6\u00d7\7e\2\2\u00d7" + "\u00d8\7q\2\2\u00d8\u00d9\7p\2\2\u00d9\u00da\7v\2\2\u00da\u00db\7k\2\2" + "\u00db\u00dc\7p\2\2\u00dc\u00dd\7w\2\2\u00dd\u00de\7g\2\2\u00de\22\3\2" + "\2\2\u00df\u00e0\7f\2\2\u00e0\u00e1\7g\2\2\u00e1\u00e2\7e\2\2\u00e2\u00e3" + "\7n\2\2\u00e3\u00e4\7c\2\2\u00e4\u00e5\7t\2\2\u00e5\u00e6\7g\2\2\u00e6" + "\24\3\2\2\2\u00e7\u00e8\7f\2\2\u00e8\u00e9\7g\2\2\u00e9\u00ea\7h\2\2\u00ea" + "\u00eb\7c\2\2\u00eb\u00ec\7w\2\2\u00ec\u00ed\7n\2\2\u00ed\u00ee\7v\2\2" + "\u00ee\26\3\2\2\2\u00ef\u00f0\7f\2\2\u00f0\u00f1\7g\2\2\u00f1\u00f2\7" + "u\2\2\u00f2\u00f3\7v\2\2\u00f3\u00f4\7t\2\2\u00f4\u00f5\7w\2\2\u00f5\u00f6" + "\7e\2\2\u00f6\u00f7\7v\2\2\u00f7\30\3\2\2\2\u00f8\u00f9\7g\2\2\u00f9\u00fa" + "\7n\2\2\u00fa\u00fb\7u\2\2\u00fb\u00fc\7g\2\2\u00fc\32\3\2\2\2\u00fd\u00fe" + "\7h\2\2\u00fe\u00ff\7c\2\2\u00ff\u0100\7n\2\2\u0100\u0101\7u\2\2\u0101" + "\u0102\7g\2\2\u0102\34\3\2\2\2\u0103\u0104\7h\2\2\u0104\u0105\7w\2\2\u0105" + "\u0106\7p\2\2\u0106\u0107\7e\2\2\u0107\u0108\7v\2\2\u0108\u0109\7k\2\2" + "\u0109\u010a\7q\2\2\u010a\u010b\7p\2\2\u010b\36\3\2\2\2\u010c\u010d\7" + "h\2\2\u010d\u010e\7n\2\2\u010e\u010f\7q\2\2\u010f\u0110\7c\2\2\u0110\u0111" + "\7v\2\2\u0111 \3\2\2\2\u0112\u0113\7h\2\2\u0113\u0114\7q\2\2\u0114\u0115" + "\7t\2\2\u0115\"\3\2\2\2\u0116\u0117\7k\2\2\u0117\u0118\7h\2\2\u0118$\3" + "\2\2\2\u0119\u011a\7k\2\2\u011a\u011b\7p\2\2\u011b\u011c\7v\2\2\u011c" + "&\3\2\2\2\u011d\u011e\7p\2\2\u011e\u011f\7k\2\2\u011f\u0120\7n\2\2\u0120" + "(\3\2\2\2\u0121\u0122\7q\2\2\u0122\u0123\7h\2\2\u0123*\3\2\2\2\u0124\u0125" + "\7r\2\2\u0125\u0126\7t\2\2\u0126\u0127\7k\2\2\u0127\u0128\7x\2\2\u0128" + "\u0129\7c\2\2\u0129\u012a\7v\2\2\u012a\u012b\7g\2\2\u012b,\3\2\2\2\u012c" + "\u012d\7r\2\2\u012d\u012e\7t\2\2\u012e\u012f\7q\2\2\u012f\u0130\7v\2\2" + "\u0130\u0131\7g\2\2\u0131\u0132\7e\2\2\u0132\u0133\7v\2\2\u0133\u0134" + "\7g\2\2\u0134\u0135\7f\2\2\u0135.\3\2\2\2\u0136\u0137\7r\2\2\u0137\u0138" + "\7w\2\2\u0138\u0139\7d\2\2\u0139\u013a\7n\2\2\u013a\u013b\7k\2\2\u013b" + "\u013c\7e\2\2\u013c\60\3\2\2\2\u013d\u013e\7t\2\2\u013e\u013f\7g\2\2\u013f" + "\u0140\7c\2\2\u0140\u0141\7f\2\2\u0141\62\3\2\2\2\u0142\u0143\7t\2\2\u0143" + "\u0144\7g\2\2\u0144\u0145\7v\2\2\u0145\u0146\7w\2\2\u0146\u0147\7t\2\2" + "\u0147\u0148\7p\2\2\u0148\64\3\2\2\2\u0149\u014a\7u\2\2\u014a\u014b\7" + "v\2\2\u014b\u014c\7t\2\2\u014c\u014d\7k\2\2\u014d\u014e\7p\2\2\u014e\u014f" + "\7i\2\2\u014f\66\3\2\2\2\u0150\u0151\7u\2\2\u0151\u0152\7w\2\2\u0152\u0153" + "\7r\2\2\u0153\u0154\7g\2\2\u0154\u0155\7t\2\2\u01558\3\2\2\2\u0156\u0157" + "\7u\2\2\u0157\u0158\7y\2\2\u0158\u0159\7k\2\2\u0159\u015a\7v\2\2\u015a" + "\u015b\7e\2\2\u015b\u015c\7j\2\2\u015c:\3\2\2\2\u015d\u015e\7v\2\2\u015e" + "\u015f\7j\2\2\u015f\u0160\7k\2\2\u0160\u0161\7u\2\2\u0161<\3\2\2\2\u0162" + "\u0163\7v\2\2\u0163\u0164\7t\2\2\u0164\u0165\7w\2\2\u0165\u0166\7g\2\2" + "\u0166>\3\2\2\2\u0167\u0168\7v\2\2\u0168\u0169\7{\2\2\u0169\u016a\7r\2" + "\2\u016a\u016b\7g\2\2\u016b@\3\2\2\2\u016c\u016d\7y\2\2\u016d\u016e\7" + "j\2\2\u016e\u016f\7k\2\2\u016f\u0170\7n\2\2\u0170\u0171\7g\2\2\u0171B" + "\3\2\2\2\u0172\u0173\7y\2\2\u0173\u0174\7t\2\2\u0174\u0175\7k\2\2\u0175" + "\u0176\7v\2\2\u0176\u0177\7g\2\2\u0177D\3\2\2\2\u0178\u0179\7?\2\2\u0179" + "\u017a\7?\2\2\u017aF\3\2\2\2\u017b\u017c\7#\2\2\u017c\u017d\7?\2\2\u017d" + "H\3\2\2\2\u017e\u017f\7>\2\2\u017f\u0180\7?\2\2\u0180J\3\2\2\2\u0181\u0182" + "\7>\2\2\u0182L\3\2\2\2\u0183\u0184\7@\2\2\u0184N\3\2\2\2\u0185\u0186\7" + "@\2\2\u0186\u0187\7?\2\2\u0187P\3\2\2\2\u0188\u0189\7\u0080\2\2\u0189" + "R\3\2\2\2\u018a\u018b\7~\2\2\u018bT\3\2\2\2\u018c\u018d\7(\2\2\u018dV" + "\3\2\2\2\u018e\u018f\7`\2\2\u018fX\3\2\2\2\u0190\u0191\7~\2\2\u0191\u0192" + "\7~\2\2\u0192Z\3\2\2\2\u0193\u0194\7(\2\2\u0194\u0195\7(\2\2\u0195\\\3" + "\2\2\2\u0196\u0197\7#\2\2\u0197^\3\2\2\2\u0198\u0199\7/\2\2\u0199`\3\2" + "\2\2\u019a\u019b\7-\2\2\u019bb\3\2\2\2\u019c\u019d\7,\2\2\u019dd\3\2\2" + "\2\u019e\u019f\7\61\2\2\u019ff\3\2\2\2\u01a0\u01a1\7\'\2\2\u01a1h\3\2" + "\2\2\u01a2\u01a3\7?\2\2\u01a3j\3\2\2\2\u01a4\u01a5\7}\2\2\u01a5l\3\2\2" + "\2\u01a6\u01a7\7\177\2\2\u01a7n\3\2\2\2\u01a8\u01a9\7*\2\2\u01a9p\3\2" + "\2\2\u01aa\u01ab\7+\2\2\u01abr\3\2\2\2\u01ac\u01ad\7]\2\2\u01adt\3\2\2" + "\2\u01ae\u01af\7_\2\2\u01afv\3\2\2\2\u01b0\u01b1\7\60\2\2\u01b1x\3\2\2" + "\2\u01b2\u01b3\7.\2\2\u01b3z\3\2\2\2\u01b4\u01b5\7<\2\2\u01b5|\3\2\2\2" + "\u01b6\u01b7\7=\2\2\u01b7~\3\2\2\2\u01b8\u01b9\t\4\2\2\u01b9\u0080\3\2" + "\2\2\u01ba\u01bc\5\177@\2\u01bb\u01ba\3\2\2\2\u01bc\u01bd\3\2\2\2\u01bd" + "\u01bb\3\2\2\2\u01bd\u01be\3\2\2\2\u01be\u0082\3\2\2\2\u01bf\u01c2\5\177" + "@\2\u01c0\u01c2\t\5\2\2\u01c1\u01bf\3\2\2\2\u01c1\u01c0\3\2\2\2\u01c2" + "\u0084\3\2\2\2\u01c3\u01c4\7\62\2\2\u01c4\u01c6\t\6\2\2\u01c5\u01c7\5" + "\u0083B\2\u01c6\u01c5\3\2\2\2\u01c7\u01c8\3\2\2\2\u01c8\u01c6\3\2\2\2" + "\u01c8\u01c9\3\2\2\2\u01c9\u0086\3\2\2\2\u01ca\u01cd\5\u0081A\2\u01cb" + "\u01cd\5\u0085C\2\u01cc\u01ca\3\2\2\2\u01cc\u01cb\3\2\2\2\u01cd\u0088" + "\3\2\2\2\u01ce\u01d0\t\7\2\2\u01cf\u01d1\t\b\2\2\u01d0\u01cf\3\2\2\2\u01d0" + "\u01d1\3\2\2\2\u01d1\u01d2\3\2\2\2\u01d2\u01d3\5\u0081A\2\u01d3\u008a" + "\3\2\2\2\u01d4\u01d6\5\u0087D\2\u01d5\u01d4\3\2\2\2\u01d6\u01d9\3\2\2" + "\2\u01d7\u01d5\3\2\2\2\u01d7\u01d8\3\2\2\2\u01d8\u01da\3\2\2\2\u01d9\u01d7" + "\3\2\2\2\u01da\u01db\5w<\2\u01db\u01dc\5\u0081A\2\u01dc\u01e6\3\2\2\2" + "\u01dd\u01de\5\u0087D\2\u01de\u01e2\5w<\2\u01df\u01e1\5\u0081A\2\u01e0" + "\u01df\3\2\2\2\u01e1\u01e4\3\2\2\2\u01e2\u01e0\3\2\2\2\u01e2\u01e3\3\2" + "\2\2\u01e3\u01e6\3\2\2\2\u01e4\u01e2\3\2\2\2\u01e5\u01d7\3\2\2\2\u01e5" + "\u01dd\3\2\2\2\u01e6\u01e8\3\2\2\2\u01e7\u01e9\5\u0089E\2\u01e8\u01e7" + "\3\2\2\2\u01e8\u01e9\3\2\2\2\u01e9\u008c\3\2\2\2\u01ea\u01eb\n\t\2\2\u01eb" + "\u008e\3\2\2\2\u01ec\u01ed\t\6\2\2\u01ed\u01ee\5\u0083B\2\u01ee\u01ef" + "\5\u0083B\2\u01ef\u0090\3\2\2\2\u01f0\u01f4\7^\2\2\u01f1\u01f5\t\n\2\2" + "\u01f2\u01f5\5\u008fH\2\u01f3\u01f5\7^\2\2\u01f4\u01f1\3\2\2\2\u01f4\u01f2" + "\3\2\2\2\u01f4\u01f3\3\2\2\2\u01f5\u0092\3\2\2\2\u01f6\u01fb\7)\2\2\u01f7" + "\u01fa\5\u008dG\2\u01f8\u01fa\5\u0091I\2\u01f9\u01f7\3\2\2\2\u01f9\u01f8" + "\3\2\2\2\u01fa\u01fd\3\2\2\2\u01fb\u01fc\3\2\2\2\u01fb\u01f9\3\2\2\2\u01fc" + "\u01fe\3\2\2\2\u01fd\u01fb\3\2\2\2\u01fe\u01ff\7)\2\2\u01ff\u0094\3\2" + "\2\2\u0200\u0203\5\33\16\2\u0201\u0203\5=\37\2\u0202\u0200\3\2\2\2\u0202" + "\u0201\3\2\2\2\u0203\u0096\3\2\2\2\u0204\u0208\t\13\2\2\u0205\u0207\t" + "\f\2\2\u0206\u0205\3\2\2\2\u0207\u020a\3\2\2\2\u0208\u0206\3\2\2\2\u0208" + "\u0209\3\2\2\2\u0209\u0098\3\2\2\2\u020a\u0208\3\2\2\2\u020b\u020d\t\r" + "\2\2\u020c\u020b\3\2\2\2\u020d\u020e\3\2\2\2\u020e\u020c\3\2\2\2\u020e" + "\u020f\3\2\2\2\u020f\u0210\3\2\2\2\u0210\u0211\bM\3\2\u0211\u009a\3\2" + "\2\2\25\2\u00a1\u00a5\u00af\u01bd\u01c1\u01c8\u01cc\u01d0\u01d7\u01e2" + "\u01e5\u01e8\u01f4\u01f9\u01fb\u0202\u0208\u020e\4\2\3\2\b\2\2";
	private static final String[] _SYMBOLIC_NAMES = {
		null, "SingleLineComment", "MultiLineComment", "ALLOCATE", "BOOL", "BREAK", 
		"CASE", "CONST", "CONTINUE", "DECLARE", "DEFAULT", "DESTRUCT", "ELSE", 
		"FUNCTION", "FLOAT", "FOR", "IF", "INT", "NIL", "OF", "PRIVATE", "PROTECTED", 
		"PUBLIC", "READ", "RETURN", "STRING", "SUPER", "SWITCH", "THIS", "TYPE", 
		"WHILE", "WRITE", "EQUAL", "NotEqual", "LessThanOrEqual", "LessThan", 
		"BiggerThan", "BiggerThanOrEqual", "BitwiseNegation", "BitwiseOr", "BitwiseAnd", 
		"BitwiseLogicalXor", "LogicalOr", "LogicalAnd", "LogicalNot", "SUBTRACTION", 
		"ADDITION", "MULTIPLICATION", "DIVISION", "MODULUS", "ASSIGN", "OpenCurlyBrace", 
		"CloseCurlyBrace", "OpenPar", "ClosePar", "OpenBrace", "CloseBrace", "DOT", 
		"COMMA", "COLON", "SEMICOLON", "IntLiteral", "FloatLiteral", "StringLiteral", 
		"BoolLiteral", "ID", "WhiteSpace"
	};
	private static final String[] _LITERAL_NAMES = {
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
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public Lulu2Lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}


	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public String getGrammarFileName()
	{
		return "Lulu2.g4";
	}
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}