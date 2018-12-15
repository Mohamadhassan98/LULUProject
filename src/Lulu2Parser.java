// Generated from C:/Users/ASC/IdeaProjects/LULUProject/src\Lulu2.g4 by ANTLR 4.7
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Lulu2Parser extends Parser {
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
	public static final int
		RULE_main = 0, RULE_ftDcl = 1, RULE_funcDcl = 2, RULE_args = 3, RULE_argsVar = 4, 
		RULE_typeDcl = 5, RULE_varDef = 6, RULE_varVal = 7, RULE_ftDef = 8, RULE_typeDef = 9, 
		RULE_component = 10, RULE_accessModifier = 11, RULE_funcDef = 12, RULE_block = 13, 
		RULE_stmt = 14, RULE_assign = 15, RULE_var = 16, RULE_ref = 17, RULE_expr = 18, 
		RULE_funcCall = 19, RULE_list = 20, RULE_handleCall = 21, RULE_params = 22, 
		RULE_condStmt = 23, RULE_loopStmt = 24, RULE_type = 25, RULE_constVal = 26, 
		RULE_unaryOp = 27, RULE_firstLevelBinaryArithmeticOp = 28, RULE_secondLevelBinaryArithmeticOp = 29, 
		RULE_firstLevelBinaryRelationalOp = 30, RULE_secondLevelBinaryRelationalOp = 31;
	public static final String[] ruleNames = {
		"main", "ftDcl", "funcDcl", "args", "argsVar", "typeDcl", "varDef", "varVal", 
		"ftDef", "typeDef", "component", "accessModifier", "funcDef", "block", 
		"stmt", "assign", "var", "ref", "expr", "funcCall", "list", "handleCall", 
		"params", "condStmt", "loopStmt", "type", "constVal", "unaryOp", "firstLevelBinaryArithmeticOp", 
		"secondLevelBinaryArithmeticOp", "firstLevelBinaryRelationalOp", "secondLevelBinaryRelationalOp"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, "'allocate'", "'bool'", "'break'", "'case'", "'const'", 
		"'continue'", "'declare'", "'default'", "'destruct'", "'else'", "'function'", 
		"'float'", "'for'", "'if'", "'int'", "'nil'", "'of'", "'private'", "'protected'", 
		"'public'", "'read'", "'return'", "'StringType'", "'super'", "'switch'", "'this'",
		"'type'", "'while'", "'write'", "'=='", "'!='", "'<='", "'<'", "'>'", 
		"'>='", "'~'", "'|'", "'&'", "'^'", "'||'", "'&&'", "'!'", "'-'", "'+'", 
		"'*'", "'/'", "'%'", "'='", "'{'", "'}'", "'('", "')'", "'['", "']'", 
		"'.'", "','", "':'", "';'"
	};
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

	@Override
	public String getGrammarFileName() { return "Lulu2.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public Lulu2Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class MainContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(Lulu2Parser.EOF, 0); }
		public FtDclContext ftDcl() {
			return getRuleContext(FtDclContext.class,0);
		}
		public List<FtDefContext> ftDef() {
			return getRuleContexts(FtDefContext.class);
		}
		public FtDefContext ftDef(int i) {
			return getRuleContext(FtDefContext.class,i);
		}
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Lulu2Listener ) ((Lulu2Listener)listener).enterMain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Lulu2Listener ) ((Lulu2Listener)listener).exitMain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Lulu2Visitor ) return ((Lulu2Visitor<? extends T>)visitor).visitMain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_main);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DECLARE) {
				{
				setState(64);
				ftDcl();
				}
			}

			setState(68); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(67);
				ftDef();
				}
				}
				setState(70); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FUNCTION) | (1L << TYPE) | (1L << OpenPar))) != 0) );
			setState(72);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FtDclContext extends ParserRuleContext {
		public TerminalNode DECLARE() { return getToken(Lulu2Parser.DECLARE, 0); }
		public TerminalNode OpenCurlyBrace() { return getToken(Lulu2Parser.OpenCurlyBrace, 0); }
		public TerminalNode CloseCurlyBrace() { return getToken(Lulu2Parser.CloseCurlyBrace, 0); }
		public List<FuncDclContext> funcDcl() {
			return getRuleContexts(FuncDclContext.class);
		}
		public FuncDclContext funcDcl(int i) {
			return getRuleContext(FuncDclContext.class,i);
		}
		public List<TypeDclContext> typeDcl() {
			return getRuleContexts(TypeDclContext.class);
		}
		public TypeDclContext typeDcl(int i) {
			return getRuleContext(TypeDclContext.class,i);
		}
		public List<VarDefContext> varDef() {
			return getRuleContexts(VarDefContext.class);
		}
		public VarDefContext varDef(int i) {
			return getRuleContext(VarDefContext.class,i);
		}
		public FtDclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ftDcl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Lulu2Listener ) ((Lulu2Listener)listener).enterFtDcl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Lulu2Listener ) ((Lulu2Listener)listener).exitFtDcl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Lulu2Visitor ) return ((Lulu2Visitor<? extends T>)visitor).visitFtDcl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FtDclContext ftDcl() throws RecognitionException {
		FtDclContext _localctx = new FtDclContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_ftDcl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			match(DECLARE);
			setState(75);
			match(OpenCurlyBrace);
			setState(79); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(79);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(76);
					funcDcl();
					}
					break;
				case 2:
					{
					setState(77);
					typeDcl();
					}
					break;
				case 3:
					{
					setState(78);
					varDef();
					}
					break;
				}
				}
				setState(81); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 4)) & ~0x3f) == 0 && ((1L << (_la - 4)) & ((1L << (BOOL - 4)) | (1L << (CONST - 4)) | (1L << (FLOAT - 4)) | (1L << (INT - 4)) | (1L << (STRING - 4)) | (1L << (OpenPar - 4)) | (1L << (ID - 4)))) != 0) );
			setState(83);
			match(CloseCurlyBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FuncDclContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(Lulu2Parser.ID, 0); }
		public List<TerminalNode> OpenPar() { return getTokens(Lulu2Parser.OpenPar); }
		public TerminalNode OpenPar(int i) {
			return getToken(Lulu2Parser.OpenPar, i);
		}
		public List<TerminalNode> ClosePar() { return getTokens(Lulu2Parser.ClosePar); }
		public TerminalNode ClosePar(int i) {
			return getToken(Lulu2Parser.ClosePar, i);
		}
		public TerminalNode SEMICOLON() { return getToken(Lulu2Parser.SEMICOLON, 0); }
		public List<ArgsContext> args() {
			return getRuleContexts(ArgsContext.class);
		}
		public ArgsContext args(int i) {
			return getRuleContext(ArgsContext.class,i);
		}
		public TerminalNode ASSIGN() { return getToken(Lulu2Parser.ASSIGN, 0); }
		public ArgsVarContext argsVar() {
			return getRuleContext(ArgsVarContext.class,0);
		}
		public FuncDclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcDcl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Lulu2Listener ) ((Lulu2Listener)listener).enterFuncDcl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Lulu2Listener ) ((Lulu2Listener)listener).exitFuncDcl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Lulu2Visitor ) return ((Lulu2Visitor<? extends T>)visitor).visitFuncDcl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncDclContext funcDcl() throws RecognitionException {
		FuncDclContext _localctx = new FuncDclContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_funcDcl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OpenPar) {
				{
				setState(85);
				match(OpenPar);
				setState(86);
				args(0);
				setState(87);
				match(ClosePar);
				setState(88);
				match(ASSIGN);
				}
			}

			setState(92);
			match(ID);
			setState(93);
			match(OpenPar);
			setState(96);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(94);
				args(0);
				}
				break;
			case 2:
				{
				setState(95);
				argsVar(0);
				}
				break;
			}
			setState(98);
			match(ClosePar);
			setState(99);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgsContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> OpenBrace() { return getTokens(Lulu2Parser.OpenBrace); }
		public TerminalNode OpenBrace(int i) {
			return getToken(Lulu2Parser.OpenBrace, i);
		}
		public List<TerminalNode> CloseBrace() { return getTokens(Lulu2Parser.CloseBrace); }
		public TerminalNode CloseBrace(int i) {
			return getToken(Lulu2Parser.CloseBrace, i);
		}
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(Lulu2Parser.COMMA, 0); }
		public ArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Lulu2Listener ) ((Lulu2Listener)listener).enterArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Lulu2Listener ) ((Lulu2Listener)listener).exitArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Lulu2Visitor ) return ((Lulu2Visitor<? extends T>)visitor).visitArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgsContext args() throws RecognitionException {
		return args(0);
	}

	private ArgsContext args(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ArgsContext _localctx = new ArgsContext(_ctx, _parentState);
		ArgsContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_args, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(102);
			type();
			setState(107);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(103);
					match(OpenBrace);
					setState(104);
					match(CloseBrace);
					}
					} 
				}
				setState(109);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			}
			_ctx.stop = _input.LT(-1);
			setState(122);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ArgsContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_args);
					setState(110);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(111);
					match(COMMA);
					setState(112);
					type();
					setState(117);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(113);
							match(OpenBrace);
							setState(114);
							match(CloseBrace);
							}
							} 
						}
						setState(119);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
					}
					}
					} 
				}
				setState(124);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ArgsVarContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(Lulu2Parser.ID, 0); }
		public List<TerminalNode> OpenBrace() { return getTokens(Lulu2Parser.OpenBrace); }
		public TerminalNode OpenBrace(int i) {
			return getToken(Lulu2Parser.OpenBrace, i);
		}
		public List<TerminalNode> CloseBrace() { return getTokens(Lulu2Parser.CloseBrace); }
		public TerminalNode CloseBrace(int i) {
			return getToken(Lulu2Parser.CloseBrace, i);
		}
		public ArgsVarContext argsVar() {
			return getRuleContext(ArgsVarContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(Lulu2Parser.COMMA, 0); }
		public ArgsVarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argsVar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Lulu2Listener ) ((Lulu2Listener)listener).enterArgsVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Lulu2Listener ) ((Lulu2Listener)listener).exitArgsVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Lulu2Visitor ) return ((Lulu2Visitor<? extends T>)visitor).visitArgsVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgsVarContext argsVar() throws RecognitionException {
		return argsVar(0);
	}

	private ArgsVarContext argsVar(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ArgsVarContext _localctx = new ArgsVarContext(_ctx, _parentState);
		ArgsVarContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_argsVar, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(126);
			type();
			setState(131);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OpenBrace) {
				{
				{
				setState(127);
				match(OpenBrace);
				setState(128);
				match(CloseBrace);
				}
				}
				setState(133);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(134);
			match(ID);
			}
			_ctx.stop = _input.LT(-1);
			setState(150);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ArgsVarContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_argsVar);
					setState(136);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(137);
					match(COMMA);
					setState(138);
					type();
					setState(143);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==OpenBrace) {
						{
						{
						setState(139);
						match(OpenBrace);
						setState(140);
						match(CloseBrace);
						}
						}
						setState(145);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(146);
					match(ID);
					}
					} 
				}
				setState(152);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class TypeDclContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(Lulu2Parser.ID, 0); }
		public TerminalNode SEMICOLON() { return getToken(Lulu2Parser.SEMICOLON, 0); }
		public TypeDclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDcl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Lulu2Listener ) ((Lulu2Listener)listener).enterTypeDcl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Lulu2Listener ) ((Lulu2Listener)listener).exitTypeDcl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Lulu2Visitor ) return ((Lulu2Visitor<? extends T>)visitor).visitTypeDcl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeDclContext typeDcl() throws RecognitionException {
		TypeDclContext _localctx = new TypeDclContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_typeDcl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			match(ID);
			setState(154);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarDefContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<VarValContext> varVal() {
			return getRuleContexts(VarValContext.class);
		}
		public VarValContext varVal(int i) {
			return getRuleContext(VarValContext.class,i);
		}
		public TerminalNode SEMICOLON() { return getToken(Lulu2Parser.SEMICOLON, 0); }
		public TerminalNode CONST() { return getToken(Lulu2Parser.CONST, 0); }
		public List<TerminalNode> COMMA() { return getTokens(Lulu2Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Lulu2Parser.COMMA, i);
		}
		public VarDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Lulu2Listener ) ((Lulu2Listener)listener).enterVarDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Lulu2Listener ) ((Lulu2Listener)listener).exitVarDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Lulu2Visitor ) return ((Lulu2Visitor<? extends T>)visitor).visitVarDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDefContext varDef() throws RecognitionException {
		VarDefContext _localctx = new VarDefContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_varDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONST) {
				{
				setState(156);
				match(CONST);
				}
			}

			setState(159);
			type();
			setState(160);
			varVal();
			setState(165);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(161);
				match(COMMA);
				setState(162);
				varVal();
				}
				}
				setState(167);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(168);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarValContext extends ParserRuleContext {
		public RefContext ref() {
			return getRuleContext(RefContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(Lulu2Parser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public VarValContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varVal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Lulu2Listener ) ((Lulu2Listener)listener).enterVarVal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Lulu2Listener ) ((Lulu2Listener)listener).exitVarVal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Lulu2Visitor ) return ((Lulu2Visitor<? extends T>)visitor).visitVarVal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarValContext varVal() throws RecognitionException {
		VarValContext _localctx = new VarValContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_varVal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			ref();
			setState(173);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(171);
				match(ASSIGN);
				setState(172);
				expr(0);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FtDefContext extends ParserRuleContext {
		public TypeDefContext typeDef() {
			return getRuleContext(TypeDefContext.class,0);
		}
		public FuncDefContext funcDef() {
			return getRuleContext(FuncDefContext.class,0);
		}
		public FtDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ftDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Lulu2Listener ) ((Lulu2Listener)listener).enterFtDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Lulu2Listener ) ((Lulu2Listener)listener).exitFtDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Lulu2Visitor ) return ((Lulu2Visitor<? extends T>)visitor).visitFtDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FtDefContext ftDef() throws RecognitionException {
		FtDefContext _localctx = new FtDefContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_ftDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TYPE:
				{
				setState(175);
				typeDef();
				}
				break;
			case FUNCTION:
			case OpenPar:
				{
				setState(176);
				funcDef();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeDefContext extends ParserRuleContext {
		public TerminalNode TYPE() { return getToken(Lulu2Parser.TYPE, 0); }
		public List<TerminalNode> ID() { return getTokens(Lulu2Parser.ID); }
		public TerminalNode ID(int i) {
			return getToken(Lulu2Parser.ID, i);
		}
		public TerminalNode OpenCurlyBrace() { return getToken(Lulu2Parser.OpenCurlyBrace, 0); }
		public TerminalNode CloseCurlyBrace() { return getToken(Lulu2Parser.CloseCurlyBrace, 0); }
		public TerminalNode COLON() { return getToken(Lulu2Parser.COLON, 0); }
		public List<ComponentContext> component() {
			return getRuleContexts(ComponentContext.class);
		}
		public ComponentContext component(int i) {
			return getRuleContext(ComponentContext.class,i);
		}
		public TypeDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Lulu2Listener ) ((Lulu2Listener)listener).enterTypeDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Lulu2Listener ) ((Lulu2Listener)listener).exitTypeDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Lulu2Visitor ) return ((Lulu2Visitor<? extends T>)visitor).visitTypeDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeDefContext typeDef() throws RecognitionException {
		TypeDefContext _localctx = new TypeDefContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_typeDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			match(TYPE);
			setState(180);
			match(ID);
			setState(183);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(181);
				match(COLON);
				setState(182);
				match(ID);
				}
			}

			setState(185);
			match(OpenCurlyBrace);
			setState(187); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(186);
				component();
				}
				}
				setState(189); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 4)) & ~0x3f) == 0 && ((1L << (_la - 4)) & ((1L << (BOOL - 4)) | (1L << (CONST - 4)) | (1L << (FUNCTION - 4)) | (1L << (FLOAT - 4)) | (1L << (INT - 4)) | (1L << (PRIVATE - 4)) | (1L << (PROTECTED - 4)) | (1L << (PUBLIC - 4)) | (1L << (STRING - 4)) | (1L << (OpenPar - 4)) | (1L << (ID - 4)))) != 0) );
			setState(191);
			match(CloseCurlyBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComponentContext extends ParserRuleContext {
		public VarDefContext varDef() {
			return getRuleContext(VarDefContext.class,0);
		}
		public FuncDefContext funcDef() {
			return getRuleContext(FuncDefContext.class,0);
		}
		public AccessModifierContext accessModifier() {
			return getRuleContext(AccessModifierContext.class,0);
		}
		public ComponentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_component; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Lulu2Listener ) ((Lulu2Listener)listener).enterComponent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Lulu2Listener ) ((Lulu2Listener)listener).exitComponent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Lulu2Visitor ) return ((Lulu2Visitor<? extends T>)visitor).visitComponent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComponentContext component() throws RecognitionException {
		ComponentContext _localctx = new ComponentContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_component);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC))) != 0)) {
				{
				setState(193);
				accessModifier();
				}
			}

			setState(198);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOL:
			case CONST:
			case FLOAT:
			case INT:
			case STRING:
			case ID:
				{
				setState(196);
				varDef();
				}
				break;
			case FUNCTION:
			case OpenPar:
				{
				setState(197);
				funcDef();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AccessModifierContext extends ParserRuleContext {
		public TerminalNode PRIVATE() { return getToken(Lulu2Parser.PRIVATE, 0); }
		public TerminalNode PUBLIC() { return getToken(Lulu2Parser.PUBLIC, 0); }
		public TerminalNode PROTECTED() { return getToken(Lulu2Parser.PROTECTED, 0); }
		public AccessModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accessModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Lulu2Listener ) ((Lulu2Listener)listener).enterAccessModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Lulu2Listener ) ((Lulu2Listener)listener).exitAccessModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Lulu2Visitor ) return ((Lulu2Visitor<? extends T>)visitor).visitAccessModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AccessModifierContext accessModifier() throws RecognitionException {
		AccessModifierContext _localctx = new AccessModifierContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_accessModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FuncDefContext extends ParserRuleContext {
		public TerminalNode FUNCTION() { return getToken(Lulu2Parser.FUNCTION, 0); }
		public TerminalNode ID() { return getToken(Lulu2Parser.ID, 0); }
		public List<TerminalNode> OpenPar() { return getTokens(Lulu2Parser.OpenPar); }
		public TerminalNode OpenPar(int i) {
			return getToken(Lulu2Parser.OpenPar, i);
		}
		public List<TerminalNode> ClosePar() { return getTokens(Lulu2Parser.ClosePar); }
		public TerminalNode ClosePar(int i) {
			return getToken(Lulu2Parser.ClosePar, i);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<ArgsVarContext> argsVar() {
			return getRuleContexts(ArgsVarContext.class);
		}
		public ArgsVarContext argsVar(int i) {
			return getRuleContext(ArgsVarContext.class,i);
		}
		public TerminalNode ASSIGN() { return getToken(Lulu2Parser.ASSIGN, 0); }
		public FuncDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Lulu2Listener ) ((Lulu2Listener)listener).enterFuncDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Lulu2Listener ) ((Lulu2Listener)listener).exitFuncDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Lulu2Visitor ) return ((Lulu2Visitor<? extends T>)visitor).visitFuncDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncDefContext funcDef() throws RecognitionException {
		FuncDefContext _localctx = new FuncDefContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_funcDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OpenPar) {
				{
				setState(202);
				match(OpenPar);
				setState(203);
				argsVar(0);
				setState(204);
				match(ClosePar);
				setState(205);
				match(ASSIGN);
				}
			}

			setState(209);
			match(FUNCTION);
			setState(210);
			match(ID);
			setState(211);
			match(OpenPar);
			setState(213);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 4)) & ~0x3f) == 0 && ((1L << (_la - 4)) & ((1L << (BOOL - 4)) | (1L << (FLOAT - 4)) | (1L << (INT - 4)) | (1L << (STRING - 4)) | (1L << (ID - 4)))) != 0)) {
				{
				setState(212);
				argsVar(0);
				}
			}

			setState(215);
			match(ClosePar);
			setState(216);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode OpenCurlyBrace() { return getToken(Lulu2Parser.OpenCurlyBrace, 0); }
		public TerminalNode CloseCurlyBrace() { return getToken(Lulu2Parser.CloseCurlyBrace, 0); }
		public List<VarDefContext> varDef() {
			return getRuleContexts(VarDefContext.class);
		}
		public VarDefContext varDef(int i) {
			return getRuleContext(VarDefContext.class,i);
		}
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Lulu2Listener ) ((Lulu2Listener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Lulu2Listener ) ((Lulu2Listener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Lulu2Visitor ) return ((Lulu2Visitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			match(OpenCurlyBrace);
			setState(223);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 4)) & ~0x3f) == 0 && ((1L << (_la - 4)) & ((1L << (BOOL - 4)) | (1L << (BREAK - 4)) | (1L << (CONST - 4)) | (1L << (CONTINUE - 4)) | (1L << (DESTRUCT - 4)) | (1L << (FLOAT - 4)) | (1L << (FOR - 4)) | (1L << (IF - 4)) | (1L << (INT - 4)) | (1L << (READ - 4)) | (1L << (RETURN - 4)) | (1L << (STRING - 4)) | (1L << (SUPER - 4)) | (1L << (SWITCH - 4)) | (1L << (THIS - 4)) | (1L << (WHILE - 4)) | (1L << (WRITE - 4)) | (1L << (OpenPar - 4)) | (1L << (ID - 4)))) != 0)) {
				{
				setState(221);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
				case 1:
					{
					setState(219);
					varDef();
					}
					break;
				case 2:
					{
					setState(220);
					stmt();
					}
					break;
				}
				}
				setState(225);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(226);
			match(CloseCurlyBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StmtContext extends ParserRuleContext {
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(Lulu2Parser.SEMICOLON, 0); }
		public FuncCallContext funcCall() {
			return getRuleContext(FuncCallContext.class,0);
		}
		public CondStmtContext condStmt() {
			return getRuleContext(CondStmtContext.class,0);
		}
		public LoopStmtContext loopStmt() {
			return getRuleContext(LoopStmtContext.class,0);
		}
		public TerminalNode RETURN() { return getToken(Lulu2Parser.RETURN, 0); }
		public TerminalNode BREAK() { return getToken(Lulu2Parser.BREAK, 0); }
		public TerminalNode CONTINUE() { return getToken(Lulu2Parser.CONTINUE, 0); }
		public TerminalNode DESTRUCT() { return getToken(Lulu2Parser.DESTRUCT, 0); }
		public TerminalNode ID() { return getToken(Lulu2Parser.ID, 0); }
		public List<TerminalNode> OpenBrace() { return getTokens(Lulu2Parser.OpenBrace); }
		public TerminalNode OpenBrace(int i) {
			return getToken(Lulu2Parser.OpenBrace, i);
		}
		public List<TerminalNode> CloseBrace() { return getTokens(Lulu2Parser.CloseBrace); }
		public TerminalNode CloseBrace(int i) {
			return getToken(Lulu2Parser.CloseBrace, i);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Lulu2Listener ) ((Lulu2Listener)listener).enterStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Lulu2Listener ) ((Lulu2Listener)listener).exitStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Lulu2Visitor ) return ((Lulu2Visitor<? extends T>)visitor).visitStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_stmt);
		int _la;
		try {
			setState(252);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(228);
				assign();
				setState(229);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(231);
				funcCall();
				setState(232);
				match(SEMICOLON);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(234);
				condStmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(235);
				loopStmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(236);
				match(RETURN);
				setState(237);
				match(SEMICOLON);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(238);
				match(BREAK);
				setState(239);
				match(SEMICOLON);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(240);
				match(CONTINUE);
				setState(241);
				match(SEMICOLON);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(242);
				match(DESTRUCT);
				setState(247);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==OpenBrace) {
					{
					{
					setState(243);
					match(OpenBrace);
					setState(244);
					match(CloseBrace);
					}
					}
					setState(249);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(250);
				match(ID);
				setState(251);
				match(SEMICOLON);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignContext extends ParserRuleContext {
		public TerminalNode ASSIGN() { return getToken(Lulu2Parser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public TerminalNode OpenPar() { return getToken(Lulu2Parser.OpenPar, 0); }
		public TerminalNode ClosePar() { return getToken(Lulu2Parser.ClosePar, 0); }
		public List<TerminalNode> COMMA() { return getTokens(Lulu2Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Lulu2Parser.COMMA, i);
		}
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Lulu2Listener ) ((Lulu2Listener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Lulu2Listener ) ((Lulu2Listener)listener).exitAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Lulu2Visitor ) return ((Lulu2Visitor<? extends T>)visitor).visitAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_assign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SUPER:
			case THIS:
			case ID:
				{
				setState(254);
				var();
				}
				break;
			case OpenPar:
				{
				setState(255);
				match(OpenPar);
				setState(256);
				var();
				setState(261);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(257);
					match(COMMA);
					setState(258);
					var();
					}
					}
					setState(263);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(264);
				match(ClosePar);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(268);
			match(ASSIGN);
			setState(269);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarContext extends ParserRuleContext {
		public List<RefContext> ref() {
			return getRuleContexts(RefContext.class);
		}
		public RefContext ref(int i) {
			return getRuleContext(RefContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(Lulu2Parser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(Lulu2Parser.DOT, i);
		}
		public TerminalNode THIS() { return getToken(Lulu2Parser.THIS, 0); }
		public TerminalNode SUPER() { return getToken(Lulu2Parser.SUPER, 0); }
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Lulu2Listener ) ((Lulu2Listener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Lulu2Listener ) ((Lulu2Listener)listener).exitVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Lulu2Visitor ) return ((Lulu2Visitor<? extends T>)visitor).visitVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_var);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SUPER || _la==THIS) {
				{
				setState(271);
				_la = _input.LA(1);
				if ( !(_la==SUPER || _la==THIS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(272);
				match(DOT);
				}
			}

			setState(275);
			ref();
			setState(280);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(276);
					match(DOT);
					setState(277);
					ref();
					}
					} 
				}
				setState(282);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RefContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(Lulu2Parser.ID, 0); }
		public List<TerminalNode> OpenBrace() { return getTokens(Lulu2Parser.OpenBrace); }
		public TerminalNode OpenBrace(int i) {
			return getToken(Lulu2Parser.OpenBrace, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> CloseBrace() { return getTokens(Lulu2Parser.CloseBrace); }
		public TerminalNode CloseBrace(int i) {
			return getToken(Lulu2Parser.CloseBrace, i);
		}
		public RefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ref; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Lulu2Listener ) ((Lulu2Listener)listener).enterRef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Lulu2Listener ) ((Lulu2Listener)listener).exitRef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Lulu2Visitor ) return ((Lulu2Visitor<? extends T>)visitor).visitRef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RefContext ref() throws RecognitionException {
		RefContext _localctx = new RefContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_ref);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
			match(ID);
			setState(290);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(284);
					match(OpenBrace);
					setState(285);
					expr(0);
					setState(286);
					match(CloseBrace);
					}
					} 
				}
				setState(292);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public TerminalNode OpenPar() { return getToken(Lulu2Parser.OpenPar, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode ClosePar() { return getToken(Lulu2Parser.ClosePar, 0); }
		public UnaryOpContext unaryOp() {
			return getRuleContext(UnaryOpContext.class,0);
		}
		public ConstValContext constVal() {
			return getRuleContext(ConstValContext.class,0);
		}
		public TerminalNode ALLOCATE() { return getToken(Lulu2Parser.ALLOCATE, 0); }
		public HandleCallContext handleCall() {
			return getRuleContext(HandleCallContext.class,0);
		}
		public FuncCallContext funcCall() {
			return getRuleContext(FuncCallContext.class,0);
		}
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public TerminalNode NIL() { return getToken(Lulu2Parser.NIL, 0); }
		public FirstLevelBinaryArithmeticOpContext firstLevelBinaryArithmeticOp() {
			return getRuleContext(FirstLevelBinaryArithmeticOpContext.class,0);
		}
		public SecondLevelBinaryArithmeticOpContext secondLevelBinaryArithmeticOp() {
			return getRuleContext(SecondLevelBinaryArithmeticOpContext.class,0);
		}
		public FirstLevelBinaryRelationalOpContext firstLevelBinaryRelationalOp() {
			return getRuleContext(FirstLevelBinaryRelationalOpContext.class,0);
		}
		public SecondLevelBinaryRelationalOpContext secondLevelBinaryRelationalOp() {
			return getRuleContext(SecondLevelBinaryRelationalOpContext.class,0);
		}
		public TerminalNode BitwiseAnd() { return getToken(Lulu2Parser.BitwiseAnd, 0); }
		public TerminalNode BitwiseLogicalXor() { return getToken(Lulu2Parser.BitwiseLogicalXor, 0); }
		public TerminalNode BitwiseOr() { return getToken(Lulu2Parser.BitwiseOr, 0); }
		public TerminalNode LogicalAnd() { return getToken(Lulu2Parser.LogicalAnd, 0); }
		public TerminalNode LogicalOr() { return getToken(Lulu2Parser.LogicalOr, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Lulu2Listener ) ((Lulu2Listener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Lulu2Listener ) ((Lulu2Listener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Lulu2Visitor ) return ((Lulu2Visitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 36;
		enterRecursionRule(_localctx, 36, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(308);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				setState(294);
				match(OpenPar);
				setState(295);
				expr(0);
				setState(296);
				match(ClosePar);
				}
				break;
			case 2:
				{
				setState(298);
				unaryOp();
				setState(299);
				expr(16);
				}
				break;
			case 3:
				{
				setState(301);
				constVal();
				}
				break;
			case 4:
				{
				setState(302);
				match(ALLOCATE);
				setState(303);
				handleCall();
				}
				break;
			case 5:
				{
				setState(304);
				funcCall();
				}
				break;
			case 6:
				{
				setState(305);
				var();
				}
				break;
			case 7:
				{
				setState(306);
				list();
				}
				break;
			case 8:
				{
				setState(307);
				match(NIL);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(343);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(341);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(310);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(311);
						firstLevelBinaryArithmeticOp();
						setState(312);
						expr(16);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(314);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(315);
						secondLevelBinaryArithmeticOp();
						setState(316);
						expr(15);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(318);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(319);
						firstLevelBinaryRelationalOp();
						setState(320);
						expr(14);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(322);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(323);
						secondLevelBinaryRelationalOp();
						setState(324);
						expr(13);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(326);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(327);
						match(BitwiseAnd);
						setState(328);
						expr(12);
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(329);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(330);
						match(BitwiseLogicalXor);
						setState(331);
						expr(11);
						}
						break;
					case 7:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(332);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(333);
						match(BitwiseOr);
						setState(334);
						expr(10);
						}
						break;
					case 8:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(335);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(336);
						match(LogicalAnd);
						setState(337);
						expr(9);
						}
						break;
					case 9:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(338);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(339);
						match(LogicalOr);
						setState(340);
						expr(8);
						}
						break;
					}
					} 
				}
				setState(345);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class FuncCallContext extends ParserRuleContext {
		public HandleCallContext handleCall() {
			return getRuleContext(HandleCallContext.class,0);
		}
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public TerminalNode DOT() { return getToken(Lulu2Parser.DOT, 0); }
		public TerminalNode READ() { return getToken(Lulu2Parser.READ, 0); }
		public TerminalNode OpenPar() { return getToken(Lulu2Parser.OpenPar, 0); }
		public TerminalNode ClosePar() { return getToken(Lulu2Parser.ClosePar, 0); }
		public TerminalNode WRITE() { return getToken(Lulu2Parser.WRITE, 0); }
		public FuncCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Lulu2Listener ) ((Lulu2Listener)listener).enterFuncCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Lulu2Listener ) ((Lulu2Listener)listener).exitFuncCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Lulu2Visitor ) return ((Lulu2Visitor<? extends T>)visitor).visitFuncCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncCallContext funcCall() throws RecognitionException {
		FuncCallContext _localctx = new FuncCallContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_funcCall);
		try {
			setState(362);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SUPER:
			case THIS:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(349);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
				case 1:
					{
					setState(346);
					var();
					setState(347);
					match(DOT);
					}
					break;
				}
				setState(351);
				handleCall();
				}
				break;
			case READ:
				enterOuterAlt(_localctx, 2);
				{
				setState(352);
				match(READ);
				setState(353);
				match(OpenPar);
				setState(354);
				var();
				setState(355);
				match(ClosePar);
				}
				break;
			case WRITE:
				enterOuterAlt(_localctx, 3);
				{
				setState(357);
				match(WRITE);
				setState(358);
				match(OpenPar);
				setState(359);
				var();
				setState(360);
				match(ClosePar);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ListContext extends ParserRuleContext {
		public TerminalNode OpenBrace() { return getToken(Lulu2Parser.OpenBrace, 0); }
		public TerminalNode CloseBrace() { return getToken(Lulu2Parser.CloseBrace, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<ListContext> list() {
			return getRuleContexts(ListContext.class);
		}
		public ListContext list(int i) {
			return getRuleContext(ListContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Lulu2Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Lulu2Parser.COMMA, i);
		}
		public ListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Lulu2Listener ) ((Lulu2Listener)listener).enterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Lulu2Listener ) ((Lulu2Listener)listener).exitList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Lulu2Visitor ) return ((Lulu2Visitor<? extends T>)visitor).visitList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListContext list() throws RecognitionException {
		ListContext _localctx = new ListContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(364);
			match(OpenBrace);
			setState(367);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				{
				setState(365);
				expr(0);
				}
				break;
			case 2:
				{
				setState(366);
				list();
				}
				break;
			}
			setState(376);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(369);
				match(COMMA);
				setState(372);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
				case 1:
					{
					setState(370);
					expr(0);
					}
					break;
				case 2:
					{
					setState(371);
					list();
					}
					break;
				}
				}
				}
				setState(378);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(379);
			match(CloseBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HandleCallContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(Lulu2Parser.ID, 0); }
		public TerminalNode OpenPar() { return getToken(Lulu2Parser.OpenPar, 0); }
		public TerminalNode ClosePar() { return getToken(Lulu2Parser.ClosePar, 0); }
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public HandleCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_handleCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Lulu2Listener ) ((Lulu2Listener)listener).enterHandleCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Lulu2Listener ) ((Lulu2Listener)listener).exitHandleCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Lulu2Visitor ) return ((Lulu2Visitor<? extends T>)visitor).visitHandleCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HandleCallContext handleCall() throws RecognitionException {
		HandleCallContext _localctx = new HandleCallContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_handleCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(381);
			match(ID);
			setState(382);
			match(OpenPar);
			setState(384);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 3)) & ~0x3f) == 0 && ((1L << (_la - 3)) & ((1L << (ALLOCATE - 3)) | (1L << (NIL - 3)) | (1L << (READ - 3)) | (1L << (SUPER - 3)) | (1L << (THIS - 3)) | (1L << (WRITE - 3)) | (1L << (BitwiseNegation - 3)) | (1L << (LogicalNot - 3)) | (1L << (SUBTRACTION - 3)) | (1L << (OpenPar - 3)) | (1L << (OpenBrace - 3)) | (1L << (IntLiteral - 3)) | (1L << (FloatLiteral - 3)) | (1L << (StringLiteral - 3)) | (1L << (BoolLiteral - 3)) | (1L << (ID - 3)))) != 0)) {
				{
				setState(383);
				params();
				}
			}

			setState(386);
			match(ClosePar);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamsContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(Lulu2Parser.COMMA, 0); }
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public ParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Lulu2Listener ) ((Lulu2Listener)listener).enterParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Lulu2Listener ) ((Lulu2Listener)listener).exitParams(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Lulu2Visitor ) return ((Lulu2Visitor<? extends T>)visitor).visitParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_params);
		try {
			setState(393);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(388);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(389);
				expr(0);
				setState(390);
				match(COMMA);
				setState(391);
				params();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CondStmtContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(Lulu2Parser.IF, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(Lulu2Parser.ELSE, 0); }
		public TerminalNode SWITCH() { return getToken(Lulu2Parser.SWITCH, 0); }
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public TerminalNode OpenCurlyBrace() { return getToken(Lulu2Parser.OpenCurlyBrace, 0); }
		public TerminalNode DEFAULT() { return getToken(Lulu2Parser.DEFAULT, 0); }
		public List<TerminalNode> COLON() { return getTokens(Lulu2Parser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(Lulu2Parser.COLON, i);
		}
		public TerminalNode CloseCurlyBrace() { return getToken(Lulu2Parser.CloseCurlyBrace, 0); }
		public List<TerminalNode> CASE() { return getTokens(Lulu2Parser.CASE); }
		public TerminalNode CASE(int i) {
			return getToken(Lulu2Parser.CASE, i);
		}
		public List<TerminalNode> IntLiteral() { return getTokens(Lulu2Parser.IntLiteral); }
		public TerminalNode IntLiteral(int i) {
			return getToken(Lulu2Parser.IntLiteral, i);
		}
		public CondStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Lulu2Listener ) ((Lulu2Listener)listener).enterCondStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Lulu2Listener ) ((Lulu2Listener)listener).exitCondStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Lulu2Visitor ) return ((Lulu2Visitor<? extends T>)visitor).visitCondStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondStmtContext condStmt() throws RecognitionException {
		CondStmtContext _localctx = new CondStmtContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_condStmt);
		int _la;
		try {
			setState(419);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(395);
				match(IF);
				setState(396);
				expr(0);
				setState(397);
				block();
				setState(400);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(398);
					match(ELSE);
					setState(399);
					block();
					}
				}

				}
				break;
			case SWITCH:
				enterOuterAlt(_localctx, 2);
				{
				setState(402);
				match(SWITCH);
				setState(403);
				var();
				setState(404);
				match(OpenCurlyBrace);
				setState(411);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CASE) {
					{
					{
					setState(405);
					match(CASE);
					setState(406);
					match(IntLiteral);
					setState(407);
					match(COLON);
					setState(408);
					block();
					}
					}
					setState(413);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(414);
				match(DEFAULT);
				setState(415);
				match(COLON);
				setState(416);
				block();
				setState(417);
				match(CloseCurlyBrace);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LoopStmtContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(Lulu2Parser.FOR, 0); }
		public List<TerminalNode> SEMICOLON() { return getTokens(Lulu2Parser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(Lulu2Parser.SEMICOLON, i);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<AssignContext> assign() {
			return getRuleContexts(AssignContext.class);
		}
		public AssignContext assign(int i) {
			return getRuleContext(AssignContext.class,i);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode WHILE() { return getToken(Lulu2Parser.WHILE, 0); }
		public LoopStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Lulu2Listener ) ((Lulu2Listener)listener).enterLoopStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Lulu2Listener ) ((Lulu2Listener)listener).exitLoopStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Lulu2Visitor ) return ((Lulu2Visitor<? extends T>)visitor).visitLoopStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopStmtContext loopStmt() throws RecognitionException {
		LoopStmtContext _localctx = new LoopStmtContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_loopStmt);
		int _la;
		try {
			setState(440);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(421);
				match(FOR);
				setState(426);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 4)) & ~0x3f) == 0 && ((1L << (_la - 4)) & ((1L << (BOOL - 4)) | (1L << (FLOAT - 4)) | (1L << (INT - 4)) | (1L << (STRING - 4)) | (1L << (SUPER - 4)) | (1L << (THIS - 4)) | (1L << (OpenPar - 4)) | (1L << (ID - 4)))) != 0)) {
					{
					setState(423);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
					case 1:
						{
						setState(422);
						type();
						}
						break;
					}
					setState(425);
					assign();
					}
				}

				setState(428);
				match(SEMICOLON);
				setState(429);
				expr(0);
				setState(430);
				match(SEMICOLON);
				setState(432);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 26)) & ~0x3f) == 0 && ((1L << (_la - 26)) & ((1L << (SUPER - 26)) | (1L << (THIS - 26)) | (1L << (OpenPar - 26)) | (1L << (ID - 26)))) != 0)) {
					{
					setState(431);
					assign();
					}
				}

				setState(434);
				block();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(436);
				match(WHILE);
				setState(437);
				expr(0);
				setState(438);
				block();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(Lulu2Parser.INT, 0); }
		public TerminalNode BOOL() { return getToken(Lulu2Parser.BOOL, 0); }
		public TerminalNode FLOAT() { return getToken(Lulu2Parser.FLOAT, 0); }
		public TerminalNode STRING() { return getToken(Lulu2Parser.STRING, 0); }
		public TerminalNode ID() { return getToken(Lulu2Parser.ID, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Lulu2Listener ) ((Lulu2Listener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Lulu2Listener ) ((Lulu2Listener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Lulu2Visitor ) return ((Lulu2Visitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(442);
			_la = _input.LA(1);
			if ( !(((((_la - 4)) & ~0x3f) == 0 && ((1L << (_la - 4)) & ((1L << (BOOL - 4)) | (1L << (FLOAT - 4)) | (1L << (INT - 4)) | (1L << (STRING - 4)) | (1L << (ID - 4)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstValContext extends ParserRuleContext {
		public TerminalNode IntLiteral() { return getToken(Lulu2Parser.IntLiteral, 0); }
		public TerminalNode FloatLiteral() { return getToken(Lulu2Parser.FloatLiteral, 0); }
		public TerminalNode BoolLiteral() { return getToken(Lulu2Parser.BoolLiteral, 0); }
		public TerminalNode StringLiteral() { return getToken(Lulu2Parser.StringLiteral, 0); }
		public ConstValContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constVal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Lulu2Listener ) ((Lulu2Listener)listener).enterConstVal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Lulu2Listener ) ((Lulu2Listener)listener).exitConstVal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Lulu2Visitor ) return ((Lulu2Visitor<? extends T>)visitor).visitConstVal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstValContext constVal() throws RecognitionException {
		ConstValContext _localctx = new ConstValContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_constVal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(444);
			_la = _input.LA(1);
			if ( !(((((_la - 61)) & ~0x3f) == 0 && ((1L << (_la - 61)) & ((1L << (IntLiteral - 61)) | (1L << (FloatLiteral - 61)) | (1L << (StringLiteral - 61)) | (1L << (BoolLiteral - 61)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnaryOpContext extends ParserRuleContext {
		public TerminalNode SUBTRACTION() { return getToken(Lulu2Parser.SUBTRACTION, 0); }
		public TerminalNode LogicalNot() { return getToken(Lulu2Parser.LogicalNot, 0); }
		public TerminalNode BitwiseNegation() { return getToken(Lulu2Parser.BitwiseNegation, 0); }
		public UnaryOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Lulu2Listener ) ((Lulu2Listener)listener).enterUnaryOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Lulu2Listener ) ((Lulu2Listener)listener).exitUnaryOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Lulu2Visitor ) return ((Lulu2Visitor<? extends T>)visitor).visitUnaryOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryOpContext unaryOp() throws RecognitionException {
		UnaryOpContext _localctx = new UnaryOpContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_unaryOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(446);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BitwiseNegation) | (1L << LogicalNot) | (1L << SUBTRACTION))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FirstLevelBinaryArithmeticOpContext extends ParserRuleContext {
		public TerminalNode MULTIPLICATION() { return getToken(Lulu2Parser.MULTIPLICATION, 0); }
		public TerminalNode DIVISION() { return getToken(Lulu2Parser.DIVISION, 0); }
		public TerminalNode MODULUS() { return getToken(Lulu2Parser.MODULUS, 0); }
		public FirstLevelBinaryArithmeticOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_firstLevelBinaryArithmeticOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Lulu2Listener ) ((Lulu2Listener)listener).enterFirstLevelBinaryArithmeticOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Lulu2Listener ) ((Lulu2Listener)listener).exitFirstLevelBinaryArithmeticOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Lulu2Visitor ) return ((Lulu2Visitor<? extends T>)visitor).visitFirstLevelBinaryArithmeticOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FirstLevelBinaryArithmeticOpContext firstLevelBinaryArithmeticOp() throws RecognitionException {
		FirstLevelBinaryArithmeticOpContext _localctx = new FirstLevelBinaryArithmeticOpContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_firstLevelBinaryArithmeticOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(448);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MULTIPLICATION) | (1L << DIVISION) | (1L << MODULUS))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SecondLevelBinaryArithmeticOpContext extends ParserRuleContext {
		public TerminalNode ADDITION() { return getToken(Lulu2Parser.ADDITION, 0); }
		public TerminalNode SUBTRACTION() { return getToken(Lulu2Parser.SUBTRACTION, 0); }
		public SecondLevelBinaryArithmeticOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_secondLevelBinaryArithmeticOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Lulu2Listener ) ((Lulu2Listener)listener).enterSecondLevelBinaryArithmeticOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Lulu2Listener ) ((Lulu2Listener)listener).exitSecondLevelBinaryArithmeticOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Lulu2Visitor ) return ((Lulu2Visitor<? extends T>)visitor).visitSecondLevelBinaryArithmeticOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SecondLevelBinaryArithmeticOpContext secondLevelBinaryArithmeticOp() throws RecognitionException {
		SecondLevelBinaryArithmeticOpContext _localctx = new SecondLevelBinaryArithmeticOpContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_secondLevelBinaryArithmeticOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(450);
			_la = _input.LA(1);
			if ( !(_la==SUBTRACTION || _la==ADDITION) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FirstLevelBinaryRelationalOpContext extends ParserRuleContext {
		public TerminalNode LessThanOrEqual() { return getToken(Lulu2Parser.LessThanOrEqual, 0); }
		public TerminalNode LessThan() { return getToken(Lulu2Parser.LessThan, 0); }
		public TerminalNode BiggerThanOrEqual() { return getToken(Lulu2Parser.BiggerThanOrEqual, 0); }
		public TerminalNode BiggerThan() { return getToken(Lulu2Parser.BiggerThan, 0); }
		public FirstLevelBinaryRelationalOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_firstLevelBinaryRelationalOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Lulu2Listener ) ((Lulu2Listener)listener).enterFirstLevelBinaryRelationalOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Lulu2Listener ) ((Lulu2Listener)listener).exitFirstLevelBinaryRelationalOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Lulu2Visitor ) return ((Lulu2Visitor<? extends T>)visitor).visitFirstLevelBinaryRelationalOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FirstLevelBinaryRelationalOpContext firstLevelBinaryRelationalOp() throws RecognitionException {
		FirstLevelBinaryRelationalOpContext _localctx = new FirstLevelBinaryRelationalOpContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_firstLevelBinaryRelationalOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(452);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LessThanOrEqual) | (1L << LessThan) | (1L << BiggerThan) | (1L << BiggerThanOrEqual))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SecondLevelBinaryRelationalOpContext extends ParserRuleContext {
		public TerminalNode EQUAL() { return getToken(Lulu2Parser.EQUAL, 0); }
		public TerminalNode NotEqual() { return getToken(Lulu2Parser.NotEqual, 0); }
		public SecondLevelBinaryRelationalOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_secondLevelBinaryRelationalOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Lulu2Listener ) ((Lulu2Listener)listener).enterSecondLevelBinaryRelationalOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Lulu2Listener ) ((Lulu2Listener)listener).exitSecondLevelBinaryRelationalOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Lulu2Visitor ) return ((Lulu2Visitor<? extends T>)visitor).visitSecondLevelBinaryRelationalOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SecondLevelBinaryRelationalOpContext secondLevelBinaryRelationalOp() throws RecognitionException {
		SecondLevelBinaryRelationalOpContext _localctx = new SecondLevelBinaryRelationalOpContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_secondLevelBinaryRelationalOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(454);
			_la = _input.LA(1);
			if ( !(_la==EQUAL || _la==NotEqual) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 3:
			return args_sempred((ArgsContext)_localctx, predIndex);
		case 4:
			return argsVar_sempred((ArgsVarContext)_localctx, predIndex);
		case 18:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean args_sempred(ArgsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean argsVar_sempred(ArgsVarContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 15);
		case 3:
			return precpred(_ctx, 14);
		case 4:
			return precpred(_ctx, 13);
		case 5:
			return precpred(_ctx, 12);
		case 6:
			return precpred(_ctx, 11);
		case 7:
			return precpred(_ctx, 10);
		case 8:
			return precpred(_ctx, 9);
		case 9:
			return precpred(_ctx, 8);
		case 10:
			return precpred(_ctx, 7);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3D\u01cb\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\3\2\5\2D\n\2\3\2\6\2G\n\2\r\2\16\2H\3\2\3\2\3\3\3\3\3\3\3\3\3\3\6"+
		"\3R\n\3\r\3\16\3S\3\3\3\3\3\4\3\4\3\4\3\4\3\4\5\4]\n\4\3\4\3\4\3\4\3\4"+
		"\5\4c\n\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\7\5l\n\5\f\5\16\5o\13\5\3\5\3\5"+
		"\3\5\3\5\3\5\7\5v\n\5\f\5\16\5y\13\5\7\5{\n\5\f\5\16\5~\13\5\3\6\3\6\3"+
		"\6\3\6\7\6\u0084\n\6\f\6\16\6\u0087\13\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7"+
		"\6\u0090\n\6\f\6\16\6\u0093\13\6\3\6\3\6\7\6\u0097\n\6\f\6\16\6\u009a"+
		"\13\6\3\7\3\7\3\7\3\b\5\b\u00a0\n\b\3\b\3\b\3\b\3\b\7\b\u00a6\n\b\f\b"+
		"\16\b\u00a9\13\b\3\b\3\b\3\t\3\t\3\t\5\t\u00b0\n\t\3\n\3\n\5\n\u00b4\n"+
		"\n\3\13\3\13\3\13\3\13\5\13\u00ba\n\13\3\13\3\13\6\13\u00be\n\13\r\13"+
		"\16\13\u00bf\3\13\3\13\3\f\5\f\u00c5\n\f\3\f\3\f\5\f\u00c9\n\f\3\r\3\r"+
		"\3\16\3\16\3\16\3\16\3\16\5\16\u00d2\n\16\3\16\3\16\3\16\3\16\5\16\u00d8"+
		"\n\16\3\16\3\16\3\16\3\17\3\17\3\17\7\17\u00e0\n\17\f\17\16\17\u00e3\13"+
		"\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\7\20\u00f8\n\20\f\20\16\20\u00fb\13\20\3"+
		"\20\3\20\5\20\u00ff\n\20\3\21\3\21\3\21\3\21\3\21\7\21\u0106\n\21\f\21"+
		"\16\21\u0109\13\21\3\21\3\21\5\21\u010d\n\21\3\21\3\21\3\21\3\22\3\22"+
		"\5\22\u0114\n\22\3\22\3\22\3\22\7\22\u0119\n\22\f\22\16\22\u011c\13\22"+
		"\3\23\3\23\3\23\3\23\3\23\7\23\u0123\n\23\f\23\16\23\u0126\13\23\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\5\24\u0137\n\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\7\24\u0158\n\24\f\24\16\24\u015b\13\24"+
		"\3\25\3\25\3\25\5\25\u0160\n\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\5\25\u016d\n\25\3\26\3\26\3\26\5\26\u0172\n\26\3\26\3"+
		"\26\3\26\5\26\u0177\n\26\7\26\u0179\n\26\f\26\16\26\u017c\13\26\3\26\3"+
		"\26\3\27\3\27\3\27\5\27\u0183\n\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30"+
		"\5\30\u018c\n\30\3\31\3\31\3\31\3\31\3\31\5\31\u0193\n\31\3\31\3\31\3"+
		"\31\3\31\3\31\3\31\3\31\7\31\u019c\n\31\f\31\16\31\u019f\13\31\3\31\3"+
		"\31\3\31\3\31\3\31\5\31\u01a6\n\31\3\32\3\32\5\32\u01aa\n\32\3\32\5\32"+
		"\u01ad\n\32\3\32\3\32\3\32\3\32\5\32\u01b3\n\32\3\32\3\32\3\32\3\32\3"+
		"\32\3\32\5\32\u01bb\n\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37"+
		"\3\37\3 \3 \3!\3!\3!\2\5\b\n&\"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"$&(*,.\60\62\64\668:<>@\2\13\3\2\26\30\4\2\34\34\36\36\7\2\6\6\20\20"+
		"\23\23\33\33CC\3\2?B\4\2((./\3\2\61\63\3\2/\60\3\2$\'\3\2\"#\2\u01f0\2"+
		"C\3\2\2\2\4L\3\2\2\2\6\\\3\2\2\2\bg\3\2\2\2\n\177\3\2\2\2\f\u009b\3\2"+
		"\2\2\16\u009f\3\2\2\2\20\u00ac\3\2\2\2\22\u00b3\3\2\2\2\24\u00b5\3\2\2"+
		"\2\26\u00c4\3\2\2\2\30\u00ca\3\2\2\2\32\u00d1\3\2\2\2\34\u00dc\3\2\2\2"+
		"\36\u00fe\3\2\2\2 \u010c\3\2\2\2\"\u0113\3\2\2\2$\u011d\3\2\2\2&\u0136"+
		"\3\2\2\2(\u016c\3\2\2\2*\u016e\3\2\2\2,\u017f\3\2\2\2.\u018b\3\2\2\2\60"+
		"\u01a5\3\2\2\2\62\u01ba\3\2\2\2\64\u01bc\3\2\2\2\66\u01be\3\2\2\28\u01c0"+
		"\3\2\2\2:\u01c2\3\2\2\2<\u01c4\3\2\2\2>\u01c6\3\2\2\2@\u01c8\3\2\2\2B"+
		"D\5\4\3\2CB\3\2\2\2CD\3\2\2\2DF\3\2\2\2EG\5\22\n\2FE\3\2\2\2GH\3\2\2\2"+
		"HF\3\2\2\2HI\3\2\2\2IJ\3\2\2\2JK\7\2\2\3K\3\3\2\2\2LM\7\13\2\2MQ\7\65"+
		"\2\2NR\5\6\4\2OR\5\f\7\2PR\5\16\b\2QN\3\2\2\2QO\3\2\2\2QP\3\2\2\2RS\3"+
		"\2\2\2SQ\3\2\2\2ST\3\2\2\2TU\3\2\2\2UV\7\66\2\2V\5\3\2\2\2WX\7\67\2\2"+
		"XY\5\b\5\2YZ\78\2\2Z[\7\64\2\2[]\3\2\2\2\\W\3\2\2\2\\]\3\2\2\2]^\3\2\2"+
		"\2^_\7C\2\2_b\7\67\2\2`c\5\b\5\2ac\5\n\6\2b`\3\2\2\2ba\3\2\2\2bc\3\2\2"+
		"\2cd\3\2\2\2de\78\2\2ef\7>\2\2f\7\3\2\2\2gh\b\5\1\2hm\5\64\33\2ij\79\2"+
		"\2jl\7:\2\2ki\3\2\2\2lo\3\2\2\2mk\3\2\2\2mn\3\2\2\2n|\3\2\2\2om\3\2\2"+
		"\2pq\f\3\2\2qr\7<\2\2rw\5\64\33\2st\79\2\2tv\7:\2\2us\3\2\2\2vy\3\2\2"+
		"\2wu\3\2\2\2wx\3\2\2\2x{\3\2\2\2yw\3\2\2\2zp\3\2\2\2{~\3\2\2\2|z\3\2\2"+
		"\2|}\3\2\2\2}\t\3\2\2\2~|\3\2\2\2\177\u0080\b\6\1\2\u0080\u0085\5\64\33"+
		"\2\u0081\u0082\79\2\2\u0082\u0084\7:\2\2\u0083\u0081\3\2\2\2\u0084\u0087"+
		"\3\2\2\2\u0085\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0088\3\2\2\2\u0087"+
		"\u0085\3\2\2\2\u0088\u0089\7C\2\2\u0089\u0098\3\2\2\2\u008a\u008b\f\3"+
		"\2\2\u008b\u008c\7<\2\2\u008c\u0091\5\64\33\2\u008d\u008e\79\2\2\u008e"+
		"\u0090\7:\2\2\u008f\u008d\3\2\2\2\u0090\u0093\3\2\2\2\u0091\u008f\3\2"+
		"\2\2\u0091\u0092\3\2\2\2\u0092\u0094\3\2\2\2\u0093\u0091\3\2\2\2\u0094"+
		"\u0095\7C\2\2\u0095\u0097\3\2\2\2\u0096\u008a\3\2\2\2\u0097\u009a\3\2"+
		"\2\2\u0098\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099\13\3\2\2\2\u009a\u0098"+
		"\3\2\2\2\u009b\u009c\7C\2\2\u009c\u009d\7>\2\2\u009d\r\3\2\2\2\u009e\u00a0"+
		"\7\t\2\2\u009f\u009e\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1"+
		"\u00a2\5\64\33\2\u00a2\u00a7\5\20\t\2\u00a3\u00a4\7<\2\2\u00a4\u00a6\5"+
		"\20\t\2\u00a5\u00a3\3\2\2\2\u00a6\u00a9\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a7"+
		"\u00a8\3\2\2\2\u00a8\u00aa\3\2\2\2\u00a9\u00a7\3\2\2\2\u00aa\u00ab\7>"+
		"\2\2\u00ab\17\3\2\2\2\u00ac\u00af\5$\23\2\u00ad\u00ae\7\64\2\2\u00ae\u00b0"+
		"\5&\24\2\u00af\u00ad\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\21\3\2\2\2\u00b1"+
		"\u00b4\5\24\13\2\u00b2\u00b4\5\32\16\2\u00b3\u00b1\3\2\2\2\u00b3\u00b2"+
		"\3\2\2\2\u00b4\23\3\2\2\2\u00b5\u00b6\7\37\2\2\u00b6\u00b9\7C\2\2\u00b7"+
		"\u00b8\7=\2\2\u00b8\u00ba\7C\2\2\u00b9\u00b7\3\2\2\2\u00b9\u00ba\3\2\2"+
		"\2\u00ba\u00bb\3\2\2\2\u00bb\u00bd\7\65\2\2\u00bc\u00be\5\26\f\2\u00bd"+
		"\u00bc\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00bd\3\2\2\2\u00bf\u00c0\3\2"+
		"\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00c2\7\66\2\2\u00c2\25\3\2\2\2\u00c3\u00c5"+
		"\5\30\r\2\u00c4\u00c3\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c8\3\2\2\2"+
		"\u00c6\u00c9\5\16\b\2\u00c7\u00c9\5\32\16\2\u00c8\u00c6\3\2\2\2\u00c8"+
		"\u00c7\3\2\2\2\u00c9\27\3\2\2\2\u00ca\u00cb\t\2\2\2\u00cb\31\3\2\2\2\u00cc"+
		"\u00cd\7\67\2\2\u00cd\u00ce\5\n\6\2\u00ce\u00cf\78\2\2\u00cf\u00d0\7\64"+
		"\2\2\u00d0\u00d2\3\2\2\2\u00d1\u00cc\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2"+
		"\u00d3\3\2\2\2\u00d3\u00d4\7\17\2\2\u00d4\u00d5\7C\2\2\u00d5\u00d7\7\67"+
		"\2\2\u00d6\u00d8\5\n\6\2\u00d7\u00d6\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8"+
		"\u00d9\3\2\2\2\u00d9\u00da\78\2\2\u00da\u00db\5\34\17\2\u00db\33\3\2\2"+
		"\2\u00dc\u00e1\7\65\2\2\u00dd\u00e0\5\16\b\2\u00de\u00e0\5\36\20\2\u00df"+
		"\u00dd\3\2\2\2\u00df\u00de\3\2\2\2\u00e0\u00e3\3\2\2\2\u00e1\u00df\3\2"+
		"\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e4\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e4"+
		"\u00e5\7\66\2\2\u00e5\35\3\2\2\2\u00e6\u00e7\5 \21\2\u00e7\u00e8\7>\2"+
		"\2\u00e8\u00ff\3\2\2\2\u00e9\u00ea\5(\25\2\u00ea\u00eb\7>\2\2\u00eb\u00ff"+
		"\3\2\2\2\u00ec\u00ff\5\60\31\2\u00ed\u00ff\5\62\32\2\u00ee\u00ef\7\32"+
		"\2\2\u00ef\u00ff\7>\2\2\u00f0\u00f1\7\7\2\2\u00f1\u00ff\7>\2\2\u00f2\u00f3"+
		"\7\n\2\2\u00f3\u00ff\7>\2\2\u00f4\u00f9\7\r\2\2\u00f5\u00f6\79\2\2\u00f6"+
		"\u00f8\7:\2\2\u00f7\u00f5\3\2\2\2\u00f8\u00fb\3\2\2\2\u00f9\u00f7\3\2"+
		"\2\2\u00f9\u00fa\3\2\2\2\u00fa\u00fc\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fc"+
		"\u00fd\7C\2\2\u00fd\u00ff\7>\2\2\u00fe\u00e6\3\2\2\2\u00fe\u00e9\3\2\2"+
		"\2\u00fe\u00ec\3\2\2\2\u00fe\u00ed\3\2\2\2\u00fe\u00ee\3\2\2\2\u00fe\u00f0"+
		"\3\2\2\2\u00fe\u00f2\3\2\2\2\u00fe\u00f4\3\2\2\2\u00ff\37\3\2\2\2\u0100"+
		"\u010d\5\"\22\2\u0101\u0102\7\67\2\2\u0102\u0107\5\"\22\2\u0103\u0104"+
		"\7<\2\2\u0104\u0106\5\"\22\2\u0105\u0103\3\2\2\2\u0106\u0109\3\2\2\2\u0107"+
		"\u0105\3\2\2\2\u0107\u0108\3\2\2\2\u0108\u010a\3\2\2\2\u0109\u0107\3\2"+
		"\2\2\u010a\u010b\78\2\2\u010b\u010d\3\2\2\2\u010c\u0100\3\2\2\2\u010c"+
		"\u0101\3\2\2\2\u010d\u010e\3\2\2\2\u010e\u010f\7\64\2\2\u010f\u0110\5"+
		"&\24\2\u0110!\3\2\2\2\u0111\u0112\t\3\2\2\u0112\u0114\7;\2\2\u0113\u0111"+
		"\3\2\2\2\u0113\u0114\3\2\2\2\u0114\u0115\3\2\2\2\u0115\u011a\5$\23\2\u0116"+
		"\u0117\7;\2\2\u0117\u0119\5$\23\2\u0118\u0116\3\2\2\2\u0119\u011c\3\2"+
		"\2\2\u011a\u0118\3\2\2\2\u011a\u011b\3\2\2\2\u011b#\3\2\2\2\u011c\u011a"+
		"\3\2\2\2\u011d\u0124\7C\2\2\u011e\u011f\79\2\2\u011f\u0120\5&\24\2\u0120"+
		"\u0121\7:\2\2\u0121\u0123\3\2\2\2\u0122\u011e\3\2\2\2\u0123\u0126\3\2"+
		"\2\2\u0124\u0122\3\2\2\2\u0124\u0125\3\2\2\2\u0125%\3\2\2\2\u0126\u0124"+
		"\3\2\2\2\u0127\u0128\b\24\1\2\u0128\u0129\7\67\2\2\u0129\u012a\5&\24\2"+
		"\u012a\u012b\78\2\2\u012b\u0137\3\2\2\2\u012c\u012d\58\35\2\u012d\u012e"+
		"\5&\24\22\u012e\u0137\3\2\2\2\u012f\u0137\5\66\34\2\u0130\u0131\7\5\2"+
		"\2\u0131\u0137\5,\27\2\u0132\u0137\5(\25\2\u0133\u0137\5\"\22\2\u0134"+
		"\u0137\5*\26\2\u0135\u0137\7\24\2\2\u0136\u0127\3\2\2\2\u0136\u012c\3"+
		"\2\2\2\u0136\u012f\3\2\2\2\u0136\u0130\3\2\2\2\u0136\u0132\3\2\2\2\u0136"+
		"\u0133\3\2\2\2\u0136\u0134\3\2\2\2\u0136\u0135\3\2\2\2\u0137\u0159\3\2"+
		"\2\2\u0138\u0139\f\21\2\2\u0139\u013a\5:\36\2\u013a\u013b\5&\24\22\u013b"+
		"\u0158\3\2\2\2\u013c\u013d\f\20\2\2\u013d\u013e\5<\37\2\u013e\u013f\5"+
		"&\24\21\u013f\u0158\3\2\2\2\u0140\u0141\f\17\2\2\u0141\u0142\5> \2\u0142"+
		"\u0143\5&\24\20\u0143\u0158\3\2\2\2\u0144\u0145\f\16\2\2\u0145\u0146\5"+
		"@!\2\u0146\u0147\5&\24\17\u0147\u0158\3\2\2\2\u0148\u0149\f\r\2\2\u0149"+
		"\u014a\7*\2\2\u014a\u0158\5&\24\16\u014b\u014c\f\f\2\2\u014c\u014d\7+"+
		"\2\2\u014d\u0158\5&\24\r\u014e\u014f\f\13\2\2\u014f\u0150\7)\2\2\u0150"+
		"\u0158\5&\24\f\u0151\u0152\f\n\2\2\u0152\u0153\7-\2\2\u0153\u0158\5&\24"+
		"\13\u0154\u0155\f\t\2\2\u0155\u0156\7,\2\2\u0156\u0158\5&\24\n\u0157\u0138"+
		"\3\2\2\2\u0157\u013c\3\2\2\2\u0157\u0140\3\2\2\2\u0157\u0144\3\2\2\2\u0157"+
		"\u0148\3\2\2\2\u0157\u014b\3\2\2\2\u0157\u014e\3\2\2\2\u0157\u0151\3\2"+
		"\2\2\u0157\u0154\3\2\2\2\u0158\u015b\3\2\2\2\u0159\u0157\3\2\2\2\u0159"+
		"\u015a\3\2\2\2\u015a\'\3\2\2\2\u015b\u0159\3\2\2\2\u015c\u015d\5\"\22"+
		"\2\u015d\u015e\7;\2\2\u015e\u0160\3\2\2\2\u015f\u015c\3\2\2\2\u015f\u0160"+
		"\3\2\2\2\u0160\u0161\3\2\2\2\u0161\u016d\5,\27\2\u0162\u0163\7\31\2\2"+
		"\u0163\u0164\7\67\2\2\u0164\u0165\5\"\22\2\u0165\u0166\78\2\2\u0166\u016d"+
		"\3\2\2\2\u0167\u0168\7!\2\2\u0168\u0169\7\67\2\2\u0169\u016a\5\"\22\2"+
		"\u016a\u016b\78\2\2\u016b\u016d\3\2\2\2\u016c\u015f\3\2\2\2\u016c\u0162"+
		"\3\2\2\2\u016c\u0167\3\2\2\2\u016d)\3\2\2\2\u016e\u0171\79\2\2\u016f\u0172"+
		"\5&\24\2\u0170\u0172\5*\26\2\u0171\u016f\3\2\2\2\u0171\u0170\3\2\2\2\u0172"+
		"\u017a\3\2\2\2\u0173\u0176\7<\2\2\u0174\u0177\5&\24\2\u0175\u0177\5*\26"+
		"\2\u0176\u0174\3\2\2\2\u0176\u0175\3\2\2\2\u0177\u0179\3\2\2\2\u0178\u0173"+
		"\3\2\2\2\u0179\u017c\3\2\2\2\u017a\u0178\3\2\2\2\u017a\u017b\3\2\2\2\u017b"+
		"\u017d\3\2\2\2\u017c\u017a\3\2\2\2\u017d\u017e\7:\2\2\u017e+\3\2\2\2\u017f"+
		"\u0180\7C\2\2\u0180\u0182\7\67\2\2\u0181\u0183\5.\30\2\u0182\u0181\3\2"+
		"\2\2\u0182\u0183\3\2\2\2\u0183\u0184\3\2\2\2\u0184\u0185\78\2\2\u0185"+
		"-\3\2\2\2\u0186\u018c\5&\24\2\u0187\u0188\5&\24\2\u0188\u0189\7<\2\2\u0189"+
		"\u018a\5.\30\2\u018a\u018c\3\2\2\2\u018b\u0186\3\2\2\2\u018b\u0187\3\2"+
		"\2\2\u018c/\3\2\2\2\u018d\u018e\7\22\2\2\u018e\u018f\5&\24\2\u018f\u0192"+
		"\5\34\17\2\u0190\u0191\7\16\2\2\u0191\u0193\5\34\17\2\u0192\u0190\3\2"+
		"\2\2\u0192\u0193\3\2\2\2\u0193\u01a6\3\2\2\2\u0194\u0195\7\35\2\2\u0195"+
		"\u0196\5\"\22\2\u0196\u019d\7\65\2\2\u0197\u0198\7\b\2\2\u0198\u0199\7"+
		"?\2\2\u0199\u019a\7=\2\2\u019a\u019c\5\34\17\2\u019b\u0197\3\2\2\2\u019c"+
		"\u019f\3\2\2\2\u019d\u019b\3\2\2\2\u019d\u019e\3\2\2\2\u019e\u01a0\3\2"+
		"\2\2\u019f\u019d\3\2\2\2\u01a0\u01a1\7\f\2\2\u01a1\u01a2\7=\2\2\u01a2"+
		"\u01a3\5\34\17\2\u01a3\u01a4\7\66\2\2\u01a4\u01a6\3\2\2\2\u01a5\u018d"+
		"\3\2\2\2\u01a5\u0194\3\2\2\2\u01a6\61\3\2\2\2\u01a7\u01ac\7\21\2\2\u01a8"+
		"\u01aa\5\64\33\2\u01a9\u01a8\3\2\2\2\u01a9\u01aa\3\2\2\2\u01aa\u01ab\3"+
		"\2\2\2\u01ab\u01ad\5 \21\2\u01ac\u01a9\3\2\2\2\u01ac\u01ad\3\2\2\2\u01ad"+
		"\u01ae\3\2\2\2\u01ae\u01af\7>\2\2\u01af\u01b0\5&\24\2\u01b0\u01b2\7>\2"+
		"\2\u01b1\u01b3\5 \21\2\u01b2\u01b1\3\2\2\2\u01b2\u01b3\3\2\2\2\u01b3\u01b4"+
		"\3\2\2\2\u01b4\u01b5\5\34\17\2\u01b5\u01bb\3\2\2\2\u01b6\u01b7\7 \2\2"+
		"\u01b7\u01b8\5&\24\2\u01b8\u01b9\5\34\17\2\u01b9\u01bb\3\2\2\2\u01ba\u01a7"+
		"\3\2\2\2\u01ba\u01b6\3\2\2\2\u01bb\63\3\2\2\2\u01bc\u01bd\t\4\2\2\u01bd"+
		"\65\3\2\2\2\u01be\u01bf\t\5\2\2\u01bf\67\3\2\2\2\u01c0\u01c1\t\6\2\2\u01c1"+
		"9\3\2\2\2\u01c2\u01c3\t\7\2\2\u01c3;\3\2\2\2\u01c4\u01c5\t\b\2\2\u01c5"+
		"=\3\2\2\2\u01c6\u01c7\t\t\2\2\u01c7?\3\2\2\2\u01c8\u01c9\t\n\2\2\u01c9"+
		"A\3\2\2\2\62CHQS\\bmw|\u0085\u0091\u0098\u009f\u00a7\u00af\u00b3\u00b9"+
		"\u00bf\u00c4\u00c8\u00d1\u00d7\u00df\u00e1\u00f9\u00fe\u0107\u010c\u0113"+
		"\u011a\u0124\u0136\u0157\u0159\u015f\u016c\u0171\u0176\u017a\u0182\u018b"+
		"\u0192\u019d\u01a5\u01a9\u01ac\u01b2\u01ba";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}