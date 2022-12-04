// Generated from d:\Development\workspace\products\TRANSACTBasic\grammar\TRANSACTBasic.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TRANSACTBasicParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PROGRAM=1, SUBROUTINE=2, FUNCTION=3, RETURN=4, STOP=5, END=6, PACKAGE=7, 
		INSERT=8, COMMENT=9, MAT=10, COMMA=11, LPAREN=12, DOT=13, RPAREN=14, NEWLINE=15, 
		IDENT=16, WHITESPACE=17;
	public static final int
		RULE_routine = 0, RULE_statements = 1, RULE_headers = 2, RULE_program = 3, 
		RULE_programName = 4, RULE_programHeading = 5, RULE_programEnd = 6, RULE_subroutine = 7, 
		RULE_subroutineName = 8, RULE_subroutineHeading = 9, RULE_subroutineEnd = 10, 
		RULE_function = 11, RULE_functionName = 12, RULE_functionHeading = 13, 
		RULE_functionEnd = 14, RULE_componentPackage = 15, RULE_packageName = 16, 
		RULE_comments = 17, RULE_comment = 18, RULE_ioVariables = 19, RULE_variables = 20, 
		RULE_variable = 21;
	private static String[] makeRuleNames() {
		return new String[] {
			"routine", "statements", "headers", "program", "programName", "programHeading", 
			"programEnd", "subroutine", "subroutineName", "subroutineHeading", "subroutineEnd", 
			"function", "functionName", "functionHeading", "functionEnd", "componentPackage", 
			"packageName", "comments", "comment", "ioVariables", "variables", "variable"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'PROGRAM'", null, "'FUNCTION'", "'RETURN'", "'STOP'", "'END'", 
			"'$PACKAGE'", null, null, "'MAT'", "','", "'('", "'.'", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PROGRAM", "SUBROUTINE", "FUNCTION", "RETURN", "STOP", "END", "PACKAGE", 
			"INSERT", "COMMENT", "MAT", "COMMA", "LPAREN", "DOT", "RPAREN", "NEWLINE", 
			"IDENT", "WHITESPACE"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
	public String getGrammarFileName() { return "TRANSACTBasic.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public TRANSACTBasicParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class RoutineContext extends ParserRuleContext {
		public ProgramContext program() {
			return getRuleContext(ProgramContext.class,0);
		}
		public SubroutineContext subroutine() {
			return getRuleContext(SubroutineContext.class,0);
		}
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public RoutineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_routine; }
	}

	public final RoutineContext routine() throws RecognitionException {
		RoutineContext _localctx = new RoutineContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_routine);
		try {
			setState(47);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PROGRAM:
			case PACKAGE:
			case COMMENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(44);
				program();
				}
				break;
			case SUBROUTINE:
				enterOuterAlt(_localctx, 2);
				{
				setState(45);
				subroutine();
				}
				break;
			case FUNCTION:
				enterOuterAlt(_localctx, 3);
				{
				setState(46);
				function();
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

	public static class StatementsContext extends ParserRuleContext {
		public CommentsContext comments() {
			return getRuleContext(CommentsContext.class,0);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statements);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			comments();
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

	public static class HeadersContext extends ParserRuleContext {
		public CommentsContext comments() {
			return getRuleContext(CommentsContext.class,0);
		}
		public ComponentPackageContext componentPackage() {
			return getRuleContext(ComponentPackageContext.class,0);
		}
		public HeadersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_headers; }
	}

	public final HeadersContext headers() throws RecognitionException {
		HeadersContext _localctx = new HeadersContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_headers);
		try {
			setState(53);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PROGRAM:
			case COMMENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(51);
				comments();
				}
				break;
			case PACKAGE:
				enterOuterAlt(_localctx, 2);
				{
				setState(52);
				componentPackage();
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

	public static class ProgramContext extends ParserRuleContext {
		public ProgramHeadingContext programHeading() {
			return getRuleContext(ProgramHeadingContext.class,0);
		}
		public ProgramEndContext programEnd() {
			return getRuleContext(ProgramEndContext.class,0);
		}
		public HeadersContext headers() {
			return getRuleContext(HeadersContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(55);
				headers();
				}
				break;
			}
			setState(58);
			programHeading();
			setState(60);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(59);
				statements();
				}
				break;
			}
			setState(62);
			programEnd();
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

	public static class ProgramNameContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(TRANSACTBasicParser.IDENT, 0); }
		public ProgramNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programName; }
	}

	public final ProgramNameContext programName() throws RecognitionException {
		ProgramNameContext _localctx = new ProgramNameContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_programName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			match(IDENT);
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

	public static class ProgramHeadingContext extends ParserRuleContext {
		public TerminalNode PROGRAM() { return getToken(TRANSACTBasicParser.PROGRAM, 0); }
		public ProgramNameContext programName() {
			return getRuleContext(ProgramNameContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(TRANSACTBasicParser.NEWLINE, 0); }
		public ProgramHeadingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programHeading; }
	}

	public final ProgramHeadingContext programHeading() throws RecognitionException {
		ProgramHeadingContext _localctx = new ProgramHeadingContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_programHeading);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			match(PROGRAM);
			setState(67);
			programName();
			setState(68);
			match(NEWLINE);
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

	public static class ProgramEndContext extends ParserRuleContext {
		public TerminalNode STOP() { return getToken(TRANSACTBasicParser.STOP, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(TRANSACTBasicParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(TRANSACTBasicParser.NEWLINE, i);
		}
		public TerminalNode END() { return getToken(TRANSACTBasicParser.END, 0); }
		public TerminalNode EOF() { return getToken(TRANSACTBasicParser.EOF, 0); }
		public ProgramEndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programEnd; }
	}

	public final ProgramEndContext programEnd() throws RecognitionException {
		ProgramEndContext _localctx = new ProgramEndContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_programEnd);
		int _la;
		try {
			setState(82);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STOP:
				enterOuterAlt(_localctx, 1);
				{
				setState(70);
				match(STOP);
				setState(71);
				match(NEWLINE);
				setState(72);
				match(END);
				setState(74);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(73);
					match(NEWLINE);
					}
				}

				setState(76);
				match(EOF);
				}
				break;
			case END:
				enterOuterAlt(_localctx, 2);
				{
				setState(77);
				match(END);
				setState(79);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(78);
					match(NEWLINE);
					}
				}

				setState(81);
				match(EOF);
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

	public static class SubroutineContext extends ParserRuleContext {
		public SubroutineHeadingContext subroutineHeading() {
			return getRuleContext(SubroutineHeadingContext.class,0);
		}
		public SubroutineEndContext subroutineEnd() {
			return getRuleContext(SubroutineEndContext.class,0);
		}
		public SubroutineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subroutine; }
	}

	public final SubroutineContext subroutine() throws RecognitionException {
		SubroutineContext _localctx = new SubroutineContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_subroutine);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			subroutineHeading();
			setState(85);
			subroutineEnd();
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

	public static class SubroutineNameContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(TRANSACTBasicParser.IDENT, 0); }
		public SubroutineNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subroutineName; }
	}

	public final SubroutineNameContext subroutineName() throws RecognitionException {
		SubroutineNameContext _localctx = new SubroutineNameContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_subroutineName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			match(IDENT);
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

	public static class SubroutineHeadingContext extends ParserRuleContext {
		public TerminalNode SUBROUTINE() { return getToken(TRANSACTBasicParser.SUBROUTINE, 0); }
		public SubroutineNameContext subroutineName() {
			return getRuleContext(SubroutineNameContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(TRANSACTBasicParser.NEWLINE, 0); }
		public TerminalNode LPAREN() { return getToken(TRANSACTBasicParser.LPAREN, 0); }
		public VariablesContext variables() {
			return getRuleContext(VariablesContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(TRANSACTBasicParser.RPAREN, 0); }
		public SubroutineHeadingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subroutineHeading; }
	}

	public final SubroutineHeadingContext subroutineHeading() throws RecognitionException {
		SubroutineHeadingContext _localctx = new SubroutineHeadingContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_subroutineHeading);
		try {
			setState(100);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(89);
				match(SUBROUTINE);
				setState(90);
				subroutineName();
				setState(91);
				match(NEWLINE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(93);
				match(SUBROUTINE);
				setState(94);
				subroutineName();
				setState(95);
				match(LPAREN);
				setState(96);
				variables();
				setState(97);
				match(RPAREN);
				setState(98);
				match(NEWLINE);
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

	public static class SubroutineEndContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(TRANSACTBasicParser.RETURN, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(TRANSACTBasicParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(TRANSACTBasicParser.NEWLINE, i);
		}
		public TerminalNode END() { return getToken(TRANSACTBasicParser.END, 0); }
		public TerminalNode EOF() { return getToken(TRANSACTBasicParser.EOF, 0); }
		public SubroutineEndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subroutineEnd; }
	}

	public final SubroutineEndContext subroutineEnd() throws RecognitionException {
		SubroutineEndContext _localctx = new SubroutineEndContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_subroutineEnd);
		int _la;
		try {
			setState(114);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RETURN:
				enterOuterAlt(_localctx, 1);
				{
				setState(102);
				match(RETURN);
				setState(103);
				match(NEWLINE);
				setState(104);
				match(END);
				setState(106);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(105);
					match(NEWLINE);
					}
				}

				setState(108);
				match(EOF);
				}
				break;
			case END:
				enterOuterAlt(_localctx, 2);
				{
				setState(109);
				match(END);
				setState(111);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(110);
					match(NEWLINE);
					}
				}

				setState(113);
				match(EOF);
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

	public static class FunctionContext extends ParserRuleContext {
		public FunctionHeadingContext functionHeading() {
			return getRuleContext(FunctionHeadingContext.class,0);
		}
		public FunctionEndContext functionEnd() {
			return getRuleContext(FunctionEndContext.class,0);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			functionHeading();
			setState(117);
			functionEnd();
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

	public static class FunctionNameContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(TRANSACTBasicParser.IDENT, 0); }
		public FunctionNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionName; }
	}

	public final FunctionNameContext functionName() throws RecognitionException {
		FunctionNameContext _localctx = new FunctionNameContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_functionName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			match(IDENT);
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

	public static class FunctionHeadingContext extends ParserRuleContext {
		public TerminalNode FUNCTION() { return getToken(TRANSACTBasicParser.FUNCTION, 0); }
		public FunctionNameContext functionName() {
			return getRuleContext(FunctionNameContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(TRANSACTBasicParser.NEWLINE, 0); }
		public TerminalNode LPAREN() { return getToken(TRANSACTBasicParser.LPAREN, 0); }
		public IoVariablesContext ioVariables() {
			return getRuleContext(IoVariablesContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(TRANSACTBasicParser.RPAREN, 0); }
		public FunctionHeadingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionHeading; }
	}

	public final FunctionHeadingContext functionHeading() throws RecognitionException {
		FunctionHeadingContext _localctx = new FunctionHeadingContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_functionHeading);
		try {
			setState(132);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(121);
				match(FUNCTION);
				setState(122);
				functionName();
				setState(123);
				match(NEWLINE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(125);
				match(FUNCTION);
				setState(126);
				functionName();
				setState(127);
				match(LPAREN);
				setState(128);
				ioVariables();
				setState(129);
				match(RPAREN);
				setState(130);
				match(NEWLINE);
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

	public static class FunctionEndContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(TRANSACTBasicParser.RETURN, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(TRANSACTBasicParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(TRANSACTBasicParser.NEWLINE, i);
		}
		public TerminalNode END() { return getToken(TRANSACTBasicParser.END, 0); }
		public TerminalNode EOF() { return getToken(TRANSACTBasicParser.EOF, 0); }
		public TerminalNode LPAREN() { return getToken(TRANSACTBasicParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(TRANSACTBasicParser.RPAREN, 0); }
		public FunctionEndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionEnd; }
	}

	public final FunctionEndContext functionEnd() throws RecognitionException {
		FunctionEndContext _localctx = new FunctionEndContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_functionEnd);
		int _la;
		try {
			setState(154);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(134);
				match(RETURN);
				setState(135);
				variable();
				setState(136);
				match(NEWLINE);
				setState(137);
				match(END);
				setState(139);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(138);
					match(NEWLINE);
					}
				}

				setState(141);
				match(EOF);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(143);
				match(RETURN);
				setState(144);
				match(LPAREN);
				setState(145);
				variable();
				setState(146);
				match(RPAREN);
				setState(147);
				match(NEWLINE);
				setState(148);
				match(END);
				setState(150);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(149);
					match(NEWLINE);
					}
				}

				setState(152);
				match(EOF);
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

	public static class ComponentPackageContext extends ParserRuleContext {
		public TerminalNode PACKAGE() { return getToken(TRANSACTBasicParser.PACKAGE, 0); }
		public PackageNameContext packageName() {
			return getRuleContext(PackageNameContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(TRANSACTBasicParser.NEWLINE, 0); }
		public ComponentPackageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_componentPackage; }
	}

	public final ComponentPackageContext componentPackage() throws RecognitionException {
		ComponentPackageContext _localctx = new ComponentPackageContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_componentPackage);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			match(PACKAGE);
			setState(157);
			packageName();
			setState(158);
			match(NEWLINE);
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

	public static class PackageNameContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(TRANSACTBasicParser.IDENT, 0); }
		public PackageNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageName; }
	}

	public final PackageNameContext packageName() throws RecognitionException {
		PackageNameContext _localctx = new PackageNameContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_packageName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			match(IDENT);
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

	public static class CommentsContext extends ParserRuleContext {
		public List<CommentContext> comment() {
			return getRuleContexts(CommentContext.class);
		}
		public CommentContext comment(int i) {
			return getRuleContext(CommentContext.class,i);
		}
		public CommentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comments; }
	}

	public final CommentsContext comments() throws RecognitionException {
		CommentsContext _localctx = new CommentsContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_comments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMENT) {
				{
				{
				setState(162);
				comment();
				}
				}
				setState(167);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class CommentContext extends ParserRuleContext {
		public TerminalNode COMMENT() { return getToken(TRANSACTBasicParser.COMMENT, 0); }
		public CommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comment; }
	}

	public final CommentContext comment() throws RecognitionException {
		CommentContext _localctx = new CommentContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_comment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			match(COMMENT);
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

	public static class IoVariablesContext extends ParserRuleContext {
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(TRANSACTBasicParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(TRANSACTBasicParser.COMMA, i);
		}
		public IoVariablesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ioVariables; }
	}

	public final IoVariablesContext ioVariables() throws RecognitionException {
		IoVariablesContext _localctx = new IoVariablesContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_ioVariables);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			variable();
			setState(175);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(171);
				match(COMMA);
				setState(172);
				variable();
				}
				}
				setState(177);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class VariablesContext extends ParserRuleContext {
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(TRANSACTBasicParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(TRANSACTBasicParser.COMMA, i);
		}
		public VariablesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variables; }
	}

	public final VariablesContext variables() throws RecognitionException {
		VariablesContext _localctx = new VariablesContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_variables);
		int _la;
		try {
			setState(187);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MAT:
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(178);
				variable();
				setState(183);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(179);
					match(COMMA);
					setState(180);
					variable();
					}
					}
					setState(185);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case RPAREN:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class VariableContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(TRANSACTBasicParser.IDENT, 0); }
		public TerminalNode MAT() { return getToken(TRANSACTBasicParser.MAT, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_variable);
		try {
			setState(192);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(189);
				match(IDENT);
				}
				break;
			case MAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(190);
				match(MAT);
				setState(191);
				variable();
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\23\u00c5\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\3\2\5\2\62"+
		"\n\2\3\3\3\3\3\4\3\4\5\48\n\4\3\5\5\5;\n\5\3\5\3\5\5\5?\n\5\3\5\3\5\3"+
		"\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\5\bM\n\b\3\b\3\b\3\b\5\bR\n\b\3"+
		"\b\5\bU\n\b\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\5\13g\n\13\3\f\3\f\3\f\3\f\5\fm\n\f\3\f\3\f\3\f\5\fr\n"+
		"\f\3\f\5\fu\n\f\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\5\17\u0087\n\17\3\20\3\20\3\20\3\20\3\20\5\20"+
		"\u008e\n\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u0099\n"+
		"\20\3\20\3\20\5\20\u009d\n\20\3\21\3\21\3\21\3\21\3\22\3\22\3\23\7\23"+
		"\u00a6\n\23\f\23\16\23\u00a9\13\23\3\24\3\24\3\25\3\25\3\25\7\25\u00b0"+
		"\n\25\f\25\16\25\u00b3\13\25\3\26\3\26\3\26\7\26\u00b8\n\26\f\26\16\26"+
		"\u00bb\13\26\3\26\5\26\u00be\n\26\3\27\3\27\3\27\5\27\u00c3\n\27\3\27"+
		"\2\2\30\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,\2\2\2\u00c3\2\61"+
		"\3\2\2\2\4\63\3\2\2\2\6\67\3\2\2\2\b:\3\2\2\2\nB\3\2\2\2\fD\3\2\2\2\16"+
		"T\3\2\2\2\20V\3\2\2\2\22Y\3\2\2\2\24f\3\2\2\2\26t\3\2\2\2\30v\3\2\2\2"+
		"\32y\3\2\2\2\34\u0086\3\2\2\2\36\u009c\3\2\2\2 \u009e\3\2\2\2\"\u00a2"+
		"\3\2\2\2$\u00a7\3\2\2\2&\u00aa\3\2\2\2(\u00ac\3\2\2\2*\u00bd\3\2\2\2,"+
		"\u00c2\3\2\2\2.\62\5\b\5\2/\62\5\20\t\2\60\62\5\30\r\2\61.\3\2\2\2\61"+
		"/\3\2\2\2\61\60\3\2\2\2\62\3\3\2\2\2\63\64\5$\23\2\64\5\3\2\2\2\658\5"+
		"$\23\2\668\5 \21\2\67\65\3\2\2\2\67\66\3\2\2\28\7\3\2\2\29;\5\6\4\2:9"+
		"\3\2\2\2:;\3\2\2\2;<\3\2\2\2<>\5\f\7\2=?\5\4\3\2>=\3\2\2\2>?\3\2\2\2?"+
		"@\3\2\2\2@A\5\16\b\2A\t\3\2\2\2BC\7\22\2\2C\13\3\2\2\2DE\7\3\2\2EF\5\n"+
		"\6\2FG\7\21\2\2G\r\3\2\2\2HI\7\7\2\2IJ\7\21\2\2JL\7\b\2\2KM\7\21\2\2L"+
		"K\3\2\2\2LM\3\2\2\2MN\3\2\2\2NU\7\2\2\3OQ\7\b\2\2PR\7\21\2\2QP\3\2\2\2"+
		"QR\3\2\2\2RS\3\2\2\2SU\7\2\2\3TH\3\2\2\2TO\3\2\2\2U\17\3\2\2\2VW\5\24"+
		"\13\2WX\5\26\f\2X\21\3\2\2\2YZ\7\22\2\2Z\23\3\2\2\2[\\\7\4\2\2\\]\5\22"+
		"\n\2]^\7\21\2\2^g\3\2\2\2_`\7\4\2\2`a\5\22\n\2ab\7\16\2\2bc\5*\26\2cd"+
		"\7\20\2\2de\7\21\2\2eg\3\2\2\2f[\3\2\2\2f_\3\2\2\2g\25\3\2\2\2hi\7\6\2"+
		"\2ij\7\21\2\2jl\7\b\2\2km\7\21\2\2lk\3\2\2\2lm\3\2\2\2mn\3\2\2\2nu\7\2"+
		"\2\3oq\7\b\2\2pr\7\21\2\2qp\3\2\2\2qr\3\2\2\2rs\3\2\2\2su\7\2\2\3th\3"+
		"\2\2\2to\3\2\2\2u\27\3\2\2\2vw\5\34\17\2wx\5\36\20\2x\31\3\2\2\2yz\7\22"+
		"\2\2z\33\3\2\2\2{|\7\5\2\2|}\5\32\16\2}~\7\21\2\2~\u0087\3\2\2\2\177\u0080"+
		"\7\5\2\2\u0080\u0081\5\32\16\2\u0081\u0082\7\16\2\2\u0082\u0083\5(\25"+
		"\2\u0083\u0084\7\20\2\2\u0084\u0085\7\21\2\2\u0085\u0087\3\2\2\2\u0086"+
		"{\3\2\2\2\u0086\177\3\2\2\2\u0087\35\3\2\2\2\u0088\u0089\7\6\2\2\u0089"+
		"\u008a\5,\27\2\u008a\u008b\7\21\2\2\u008b\u008d\7\b\2\2\u008c\u008e\7"+
		"\21\2\2\u008d\u008c\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u008f\3\2\2\2\u008f"+
		"\u0090\7\2\2\3\u0090\u009d\3\2\2\2\u0091\u0092\7\6\2\2\u0092\u0093\7\16"+
		"\2\2\u0093\u0094\5,\27\2\u0094\u0095\7\20\2\2\u0095\u0096\7\21\2\2\u0096"+
		"\u0098\7\b\2\2\u0097\u0099\7\21\2\2\u0098\u0097\3\2\2\2\u0098\u0099\3"+
		"\2\2\2\u0099\u009a\3\2\2\2\u009a\u009b\7\2\2\3\u009b\u009d\3\2\2\2\u009c"+
		"\u0088\3\2\2\2\u009c\u0091\3\2\2\2\u009d\37\3\2\2\2\u009e\u009f\7\t\2"+
		"\2\u009f\u00a0\5\"\22\2\u00a0\u00a1\7\21\2\2\u00a1!\3\2\2\2\u00a2\u00a3"+
		"\7\22\2\2\u00a3#\3\2\2\2\u00a4\u00a6\5&\24\2\u00a5\u00a4\3\2\2\2\u00a6"+
		"\u00a9\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8%\3\2\2\2"+
		"\u00a9\u00a7\3\2\2\2\u00aa\u00ab\7\13\2\2\u00ab\'\3\2\2\2\u00ac\u00b1"+
		"\5,\27\2\u00ad\u00ae\7\r\2\2\u00ae\u00b0\5,\27\2\u00af\u00ad\3\2\2\2\u00b0"+
		"\u00b3\3\2\2\2\u00b1\u00af\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2)\3\2\2\2"+
		"\u00b3\u00b1\3\2\2\2\u00b4\u00b9\5,\27\2\u00b5\u00b6\7\r\2\2\u00b6\u00b8"+
		"\5,\27\2\u00b7\u00b5\3\2\2\2\u00b8\u00bb\3\2\2\2\u00b9\u00b7\3\2\2\2\u00b9"+
		"\u00ba\3\2\2\2\u00ba\u00be\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bc\u00be\3\2"+
		"\2\2\u00bd\u00b4\3\2\2\2\u00bd\u00bc\3\2\2\2\u00be+\3\2\2\2\u00bf\u00c3"+
		"\7\22\2\2\u00c0\u00c1\7\f\2\2\u00c1\u00c3\5,\27\2\u00c2\u00bf\3\2\2\2"+
		"\u00c2\u00c0\3\2\2\2\u00c3-\3\2\2\2\26\61\67:>LQTflqt\u0086\u008d\u0098"+
		"\u009c\u00a7\u00b1\u00b9\u00bd\u00c2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}