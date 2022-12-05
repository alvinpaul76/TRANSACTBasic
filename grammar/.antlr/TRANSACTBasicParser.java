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
		INSERT=8, INTEGER=9, REAL=10, EQUALS=11, POSITIVE=12, NEGATIVE=13, COMMENT=14, 
		COMMA=15, LPAREN=16, DOT=17, RPAREN=18, NEWLINE=19, IDENT=20, WHITESPACE=21, 
		DIM=22, MAT=23;
	public static final int
		RULE_routine = 0, RULE_statements = 1, RULE_statement = 2, RULE_headers = 3, 
		RULE_program = 4, RULE_programName = 5, RULE_programHeading = 6, RULE_programEnd = 7, 
		RULE_subroutine = 8, RULE_subroutineName = 9, RULE_subroutineHeading = 10, 
		RULE_subroutineEnd = 11, RULE_function = 12, RULE_functionName = 13, RULE_functionHeading = 14, 
		RULE_functionEnd = 15, RULE_insertStatement = 16, RULE_insertFile = 17, 
		RULE_packageStatement = 18, RULE_packageName = 19, RULE_comments = 20, 
		RULE_comment = 21, RULE_variables = 22, RULE_variable = 23, RULE_dimStatement = 24, 
		RULE_dimArray = 25, RULE_matStatement = 26, RULE_numeric = 27, RULE_sign = 28, 
		RULE_integerValue = 29, RULE_realValue = 30;
	private static String[] makeRuleNames() {
		return new String[] {
			"routine", "statements", "statement", "headers", "program", "programName", 
			"programHeading", "programEnd", "subroutine", "subroutineName", "subroutineHeading", 
			"subroutineEnd", "function", "functionName", "functionHeading", "functionEnd", 
			"insertStatement", "insertFile", "packageStatement", "packageName", "comments", 
			"comment", "variables", "variable", "dimStatement", "dimArray", "matStatement", 
			"numeric", "sign", "integerValue", "realValue"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'PROGRAM'", null, "'FUNCTION'", "'RETURN'", "'STOP'", "'END'", 
			"'$PACKAGE'", null, null, null, "'='", "'+'", "'-'", null, "','", "'('", 
			"'.'", "')'", null, null, null, null, "'MAT'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PROGRAM", "SUBROUTINE", "FUNCTION", "RETURN", "STOP", "END", "PACKAGE", 
			"INSERT", "INTEGER", "REAL", "EQUALS", "POSITIVE", "NEGATIVE", "COMMENT", 
			"COMMA", "LPAREN", "DOT", "RPAREN", "NEWLINE", "IDENT", "WHITESPACE", 
			"DIM", "MAT"
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
			setState(65);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PROGRAM:
			case PACKAGE:
			case COMMENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(62);
				program();
				}
				break;
			case SUBROUTINE:
				enterOuterAlt(_localctx, 2);
				{
				setState(63);
				subroutine();
				}
				break;
			case FUNCTION:
				enterOuterAlt(_localctx, 3);
				{
				setState(64);
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
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INSERT) | (1L << COMMENT) | (1L << DIM) | (1L << MAT))) != 0)) {
				{
				{
				setState(67);
				statement();
				}
				}
				setState(72);
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

	public static class StatementContext extends ParserRuleContext {
		public CommentContext comment() {
			return getRuleContext(CommentContext.class,0);
		}
		public InsertStatementContext insertStatement() {
			return getRuleContext(InsertStatementContext.class,0);
		}
		public MatStatementContext matStatement() {
			return getRuleContext(MatStatementContext.class,0);
		}
		public DimStatementContext dimStatement() {
			return getRuleContext(DimStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		try {
			setState(77);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMMENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(73);
				comment();
				}
				break;
			case INSERT:
				enterOuterAlt(_localctx, 2);
				{
				setState(74);
				insertStatement();
				}
				break;
			case MAT:
				enterOuterAlt(_localctx, 3);
				{
				setState(75);
				matStatement();
				}
				break;
			case DIM:
				enterOuterAlt(_localctx, 4);
				{
				setState(76);
				dimStatement();
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

	public static class HeadersContext extends ParserRuleContext {
		public CommentsContext comments() {
			return getRuleContext(CommentsContext.class,0);
		}
		public PackageStatementContext packageStatement() {
			return getRuleContext(PackageStatementContext.class,0);
		}
		public HeadersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_headers; }
	}

	public final HeadersContext headers() throws RecognitionException {
		HeadersContext _localctx = new HeadersContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_headers);
		try {
			setState(81);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PROGRAM:
			case COMMENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(79);
				comments();
				}
				break;
			case PACKAGE:
				enterOuterAlt(_localctx, 2);
				{
				setState(80);
				packageStatement();
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
		enterRule(_localctx, 8, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(83);
				headers();
				}
				break;
			}
			setState(86);
			programHeading();
			setState(88);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(87);
				statements();
				}
				break;
			}
			setState(90);
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
		enterRule(_localctx, 10, RULE_programName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
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
		enterRule(_localctx, 12, RULE_programHeading);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			match(PROGRAM);
			setState(95);
			programName();
			setState(96);
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
		enterRule(_localctx, 14, RULE_programEnd);
		int _la;
		try {
			setState(110);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STOP:
				enterOuterAlt(_localctx, 1);
				{
				setState(98);
				match(STOP);
				setState(99);
				match(NEWLINE);
				setState(100);
				match(END);
				setState(102);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(101);
					match(NEWLINE);
					}
				}

				setState(104);
				match(EOF);
				}
				break;
			case END:
				enterOuterAlt(_localctx, 2);
				{
				setState(105);
				match(END);
				setState(107);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(106);
					match(NEWLINE);
					}
				}

				setState(109);
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
		enterRule(_localctx, 16, RULE_subroutine);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			subroutineHeading();
			setState(113);
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
		enterRule(_localctx, 18, RULE_subroutineName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
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
		enterRule(_localctx, 20, RULE_subroutineHeading);
		try {
			setState(128);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(117);
				match(SUBROUTINE);
				setState(118);
				subroutineName();
				setState(119);
				match(NEWLINE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(121);
				match(SUBROUTINE);
				setState(122);
				subroutineName();
				setState(123);
				match(LPAREN);
				setState(124);
				variables();
				setState(125);
				match(RPAREN);
				setState(126);
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
		enterRule(_localctx, 22, RULE_subroutineEnd);
		int _la;
		try {
			setState(142);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RETURN:
				enterOuterAlt(_localctx, 1);
				{
				setState(130);
				match(RETURN);
				setState(131);
				match(NEWLINE);
				setState(132);
				match(END);
				setState(134);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(133);
					match(NEWLINE);
					}
				}

				setState(136);
				match(EOF);
				}
				break;
			case END:
				enterOuterAlt(_localctx, 2);
				{
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
		enterRule(_localctx, 24, RULE_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			functionHeading();
			setState(145);
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
		enterRule(_localctx, 26, RULE_functionName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
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
		public VariablesContext variables() {
			return getRuleContext(VariablesContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(TRANSACTBasicParser.RPAREN, 0); }
		public FunctionHeadingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionHeading; }
	}

	public final FunctionHeadingContext functionHeading() throws RecognitionException {
		FunctionHeadingContext _localctx = new FunctionHeadingContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_functionHeading);
		try {
			setState(160);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(149);
				match(FUNCTION);
				setState(150);
				functionName();
				setState(151);
				match(NEWLINE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(153);
				match(FUNCTION);
				setState(154);
				functionName();
				setState(155);
				match(LPAREN);
				setState(156);
				variables();
				setState(157);
				match(RPAREN);
				setState(158);
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
		enterRule(_localctx, 30, RULE_functionEnd);
		int _la;
		try {
			setState(182);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(162);
				match(RETURN);
				setState(163);
				variable();
				setState(164);
				match(NEWLINE);
				setState(165);
				match(END);
				setState(167);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(166);
					match(NEWLINE);
					}
				}

				setState(169);
				match(EOF);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(171);
				match(RETURN);
				setState(172);
				match(LPAREN);
				setState(173);
				variable();
				setState(174);
				match(RPAREN);
				setState(175);
				match(NEWLINE);
				setState(176);
				match(END);
				setState(178);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(177);
					match(NEWLINE);
					}
				}

				setState(180);
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

	public static class InsertStatementContext extends ParserRuleContext {
		public TerminalNode INSERT() { return getToken(TRANSACTBasicParser.INSERT, 0); }
		public InsertFileContext insertFile() {
			return getRuleContext(InsertFileContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(TRANSACTBasicParser.NEWLINE, 0); }
		public InsertStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insertStatement; }
	}

	public final InsertStatementContext insertStatement() throws RecognitionException {
		InsertStatementContext _localctx = new InsertStatementContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_insertStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			match(INSERT);
			setState(185);
			insertFile();
			setState(186);
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

	public static class InsertFileContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(TRANSACTBasicParser.IDENT, 0); }
		public InsertFileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insertFile; }
	}

	public final InsertFileContext insertFile() throws RecognitionException {
		InsertFileContext _localctx = new InsertFileContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_insertFile);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
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

	public static class PackageStatementContext extends ParserRuleContext {
		public TerminalNode PACKAGE() { return getToken(TRANSACTBasicParser.PACKAGE, 0); }
		public PackageNameContext packageName() {
			return getRuleContext(PackageNameContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(TRANSACTBasicParser.NEWLINE, 0); }
		public PackageStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageStatement; }
	}

	public final PackageStatementContext packageStatement() throws RecognitionException {
		PackageStatementContext _localctx = new PackageStatementContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_packageStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			match(PACKAGE);
			setState(191);
			packageName();
			setState(192);
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
		enterRule(_localctx, 38, RULE_packageName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
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
		enterRule(_localctx, 40, RULE_comments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMENT) {
				{
				{
				setState(196);
				comment();
				}
				}
				setState(201);
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
		public TerminalNode NEWLINE() { return getToken(TRANSACTBasicParser.NEWLINE, 0); }
		public CommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comment; }
	}

	public final CommentContext comment() throws RecognitionException {
		CommentContext _localctx = new CommentContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_comment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			match(COMMENT);
			setState(203);
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
		enterRule(_localctx, 44, RULE_variables);
		int _la;
		try {
			setState(214);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(205);
				variable();
				setState(210);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(206);
					match(COMMA);
					setState(207);
					variable();
					}
					}
					setState(212);
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
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
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

	public static class DimStatementContext extends ParserRuleContext {
		public TerminalNode DIM() { return getToken(TRANSACTBasicParser.DIM, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(TRANSACTBasicParser.LPAREN, 0); }
		public DimArrayContext dimArray() {
			return getRuleContext(DimArrayContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(TRANSACTBasicParser.RPAREN, 0); }
		public TerminalNode NEWLINE() { return getToken(TRANSACTBasicParser.NEWLINE, 0); }
		public DimStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dimStatement; }
	}

	public final DimStatementContext dimStatement() throws RecognitionException {
		DimStatementContext _localctx = new DimStatementContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_dimStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			match(DIM);
			setState(219);
			variable();
			setState(220);
			match(LPAREN);
			setState(221);
			dimArray();
			setState(222);
			match(RPAREN);
			setState(223);
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

	public static class DimArrayContext extends ParserRuleContext {
		public List<IntegerValueContext> integerValue() {
			return getRuleContexts(IntegerValueContext.class);
		}
		public IntegerValueContext integerValue(int i) {
			return getRuleContext(IntegerValueContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(TRANSACTBasicParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(TRANSACTBasicParser.COMMA, i);
		}
		public DimArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dimArray; }
	}

	public final DimArrayContext dimArray() throws RecognitionException {
		DimArrayContext _localctx = new DimArrayContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_dimArray);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			integerValue();
			setState(230);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(226);
				match(COMMA);
				setState(227);
				integerValue();
				}
				}
				setState(232);
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

	public static class MatStatementContext extends ParserRuleContext {
		public TerminalNode MAT() { return getToken(TRANSACTBasicParser.MAT, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(TRANSACTBasicParser.NEWLINE, 0); }
		public MatStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matStatement; }
	}

	public final MatStatementContext matStatement() throws RecognitionException {
		MatStatementContext _localctx = new MatStatementContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_matStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			match(MAT);
			setState(234);
			variable();
			setState(235);
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

	public static class NumericContext extends ParserRuleContext {
		public IntegerValueContext integerValue() {
			return getRuleContext(IntegerValueContext.class,0);
		}
		public SignContext sign() {
			return getRuleContext(SignContext.class,0);
		}
		public RealValueContext realValue() {
			return getRuleContext(RealValueContext.class,0);
		}
		public NumericContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numeric; }
	}

	public final NumericContext numeric() throws RecognitionException {
		NumericContext _localctx = new NumericContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_numeric);
		int _la;
		try {
			setState(245);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(238);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==POSITIVE || _la==NEGATIVE) {
					{
					setState(237);
					sign();
					}
				}

				setState(240);
				integerValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(242);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==POSITIVE || _la==NEGATIVE) {
					{
					setState(241);
					sign();
					}
				}

				setState(244);
				realValue();
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

	public static class SignContext extends ParserRuleContext {
		public TerminalNode POSITIVE() { return getToken(TRANSACTBasicParser.POSITIVE, 0); }
		public TerminalNode NEGATIVE() { return getToken(TRANSACTBasicParser.NEGATIVE, 0); }
		public SignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sign; }
	}

	public final SignContext sign() throws RecognitionException {
		SignContext _localctx = new SignContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_sign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			_la = _input.LA(1);
			if ( !(_la==POSITIVE || _la==NEGATIVE) ) {
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

	public static class IntegerValueContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(TRANSACTBasicParser.INTEGER, 0); }
		public IntegerValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integerValue; }
	}

	public final IntegerValueContext integerValue() throws RecognitionException {
		IntegerValueContext _localctx = new IntegerValueContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_integerValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			match(INTEGER);
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

	public static class RealValueContext extends ParserRuleContext {
		public TerminalNode REAL() { return getToken(TRANSACTBasicParser.REAL, 0); }
		public RealValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_realValue; }
	}

	public final RealValueContext realValue() throws RecognitionException {
		RealValueContext _localctx = new RealValueContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_realValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			match(REAL);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\31\u0100\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \3\2"+
		"\3\2\3\2\5\2D\n\2\3\3\7\3G\n\3\f\3\16\3J\13\3\3\4\3\4\3\4\3\4\5\4P\n\4"+
		"\3\5\3\5\5\5T\n\5\3\6\5\6W\n\6\3\6\3\6\5\6[\n\6\3\6\3\6\3\7\3\7\3\b\3"+
		"\b\3\b\3\b\3\t\3\t\3\t\3\t\5\ti\n\t\3\t\3\t\3\t\5\tn\n\t\3\t\5\tq\n\t"+
		"\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f"+
		"\u0083\n\f\3\r\3\r\3\r\3\r\5\r\u0089\n\r\3\r\3\r\3\r\5\r\u008e\n\r\3\r"+
		"\5\r\u0091\n\r\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\5\20\u00a3\n\20\3\21\3\21\3\21\3\21\3\21\5\21"+
		"\u00aa\n\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00b5\n"+
		"\21\3\21\3\21\5\21\u00b9\n\21\3\22\3\22\3\22\3\22\3\23\3\23\3\24\3\24"+
		"\3\24\3\24\3\25\3\25\3\26\7\26\u00c8\n\26\f\26\16\26\u00cb\13\26\3\27"+
		"\3\27\3\27\3\30\3\30\3\30\7\30\u00d3\n\30\f\30\16\30\u00d6\13\30\3\30"+
		"\5\30\u00d9\n\30\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33"+
		"\3\33\7\33\u00e7\n\33\f\33\16\33\u00ea\13\33\3\34\3\34\3\34\3\34\3\35"+
		"\5\35\u00f1\n\35\3\35\3\35\5\35\u00f5\n\35\3\35\5\35\u00f8\n\35\3\36\3"+
		"\36\3\37\3\37\3 \3 \3 \2\2!\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \""+
		"$&(*,.\60\62\64\668:<>\2\3\3\2\16\17\2\u00fb\2C\3\2\2\2\4H\3\2\2\2\6O"+
		"\3\2\2\2\bS\3\2\2\2\nV\3\2\2\2\f^\3\2\2\2\16`\3\2\2\2\20p\3\2\2\2\22r"+
		"\3\2\2\2\24u\3\2\2\2\26\u0082\3\2\2\2\30\u0090\3\2\2\2\32\u0092\3\2\2"+
		"\2\34\u0095\3\2\2\2\36\u00a2\3\2\2\2 \u00b8\3\2\2\2\"\u00ba\3\2\2\2$\u00be"+
		"\3\2\2\2&\u00c0\3\2\2\2(\u00c4\3\2\2\2*\u00c9\3\2\2\2,\u00cc\3\2\2\2."+
		"\u00d8\3\2\2\2\60\u00da\3\2\2\2\62\u00dc\3\2\2\2\64\u00e3\3\2\2\2\66\u00eb"+
		"\3\2\2\28\u00f7\3\2\2\2:\u00f9\3\2\2\2<\u00fb\3\2\2\2>\u00fd\3\2\2\2@"+
		"D\5\n\6\2AD\5\22\n\2BD\5\32\16\2C@\3\2\2\2CA\3\2\2\2CB\3\2\2\2D\3\3\2"+
		"\2\2EG\5\6\4\2FE\3\2\2\2GJ\3\2\2\2HF\3\2\2\2HI\3\2\2\2I\5\3\2\2\2JH\3"+
		"\2\2\2KP\5,\27\2LP\5\"\22\2MP\5\66\34\2NP\5\62\32\2OK\3\2\2\2OL\3\2\2"+
		"\2OM\3\2\2\2ON\3\2\2\2P\7\3\2\2\2QT\5*\26\2RT\5&\24\2SQ\3\2\2\2SR\3\2"+
		"\2\2T\t\3\2\2\2UW\5\b\5\2VU\3\2\2\2VW\3\2\2\2WX\3\2\2\2XZ\5\16\b\2Y[\5"+
		"\4\3\2ZY\3\2\2\2Z[\3\2\2\2[\\\3\2\2\2\\]\5\20\t\2]\13\3\2\2\2^_\7\26\2"+
		"\2_\r\3\2\2\2`a\7\3\2\2ab\5\f\7\2bc\7\25\2\2c\17\3\2\2\2de\7\7\2\2ef\7"+
		"\25\2\2fh\7\b\2\2gi\7\25\2\2hg\3\2\2\2hi\3\2\2\2ij\3\2\2\2jq\7\2\2\3k"+
		"m\7\b\2\2ln\7\25\2\2ml\3\2\2\2mn\3\2\2\2no\3\2\2\2oq\7\2\2\3pd\3\2\2\2"+
		"pk\3\2\2\2q\21\3\2\2\2rs\5\26\f\2st\5\30\r\2t\23\3\2\2\2uv\7\26\2\2v\25"+
		"\3\2\2\2wx\7\4\2\2xy\5\24\13\2yz\7\25\2\2z\u0083\3\2\2\2{|\7\4\2\2|}\5"+
		"\24\13\2}~\7\22\2\2~\177\5.\30\2\177\u0080\7\24\2\2\u0080\u0081\7\25\2"+
		"\2\u0081\u0083\3\2\2\2\u0082w\3\2\2\2\u0082{\3\2\2\2\u0083\27\3\2\2\2"+
		"\u0084\u0085\7\6\2\2\u0085\u0086\7\25\2\2\u0086\u0088\7\b\2\2\u0087\u0089"+
		"\7\25\2\2\u0088\u0087\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008a\3\2\2\2"+
		"\u008a\u0091\7\2\2\3\u008b\u008d\7\b\2\2\u008c\u008e\7\25\2\2\u008d\u008c"+
		"\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0091\7\2\2\3\u0090"+
		"\u0084\3\2\2\2\u0090\u008b\3\2\2\2\u0091\31\3\2\2\2\u0092\u0093\5\36\20"+
		"\2\u0093\u0094\5 \21\2\u0094\33\3\2\2\2\u0095\u0096\7\26\2\2\u0096\35"+
		"\3\2\2\2\u0097\u0098\7\5\2\2\u0098\u0099\5\34\17\2\u0099\u009a\7\25\2"+
		"\2\u009a\u00a3\3\2\2\2\u009b\u009c\7\5\2\2\u009c\u009d\5\34\17\2\u009d"+
		"\u009e\7\22\2\2\u009e\u009f\5.\30\2\u009f\u00a0\7\24\2\2\u00a0\u00a1\7"+
		"\25\2\2\u00a1\u00a3\3\2\2\2\u00a2\u0097\3\2\2\2\u00a2\u009b\3\2\2\2\u00a3"+
		"\37\3\2\2\2\u00a4\u00a5\7\6\2\2\u00a5\u00a6\5\60\31\2\u00a6\u00a7\7\25"+
		"\2\2\u00a7\u00a9\7\b\2\2\u00a8\u00aa\7\25\2\2\u00a9\u00a8\3\2\2\2\u00a9"+
		"\u00aa\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00ac\7\2\2\3\u00ac\u00b9\3\2"+
		"\2\2\u00ad\u00ae\7\6\2\2\u00ae\u00af\7\22\2\2\u00af\u00b0\5\60\31\2\u00b0"+
		"\u00b1\7\24\2\2\u00b1\u00b2\7\25\2\2\u00b2\u00b4\7\b\2\2\u00b3\u00b5\7"+
		"\25\2\2\u00b4\u00b3\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6"+
		"\u00b7\7\2\2\3\u00b7\u00b9\3\2\2\2\u00b8\u00a4\3\2\2\2\u00b8\u00ad\3\2"+
		"\2\2\u00b9!\3\2\2\2\u00ba\u00bb\7\n\2\2\u00bb\u00bc\5$\23\2\u00bc\u00bd"+
		"\7\25\2\2\u00bd#\3\2\2\2\u00be\u00bf\7\26\2\2\u00bf%\3\2\2\2\u00c0\u00c1"+
		"\7\t\2\2\u00c1\u00c2\5(\25\2\u00c2\u00c3\7\25\2\2\u00c3\'\3\2\2\2\u00c4"+
		"\u00c5\7\26\2\2\u00c5)\3\2\2\2\u00c6\u00c8\5,\27\2\u00c7\u00c6\3\2\2\2"+
		"\u00c8\u00cb\3\2\2\2\u00c9\u00c7\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca+\3"+
		"\2\2\2\u00cb\u00c9\3\2\2\2\u00cc\u00cd\7\20\2\2\u00cd\u00ce\7\25\2\2\u00ce"+
		"-\3\2\2\2\u00cf\u00d4\5\60\31\2\u00d0\u00d1\7\21\2\2\u00d1\u00d3\5\60"+
		"\31\2\u00d2\u00d0\3\2\2\2\u00d3\u00d6\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d4"+
		"\u00d5\3\2\2\2\u00d5\u00d9\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d7\u00d9\3\2"+
		"\2\2\u00d8\u00cf\3\2\2\2\u00d8\u00d7\3\2\2\2\u00d9/\3\2\2\2\u00da\u00db"+
		"\7\26\2\2\u00db\61\3\2\2\2\u00dc\u00dd\7\30\2\2\u00dd\u00de\5\60\31\2"+
		"\u00de\u00df\7\22\2\2\u00df\u00e0\5\64\33\2\u00e0\u00e1\7\24\2\2\u00e1"+
		"\u00e2\7\25\2\2\u00e2\63\3\2\2\2\u00e3\u00e8\5<\37\2\u00e4\u00e5\7\21"+
		"\2\2\u00e5\u00e7\5<\37\2\u00e6\u00e4\3\2\2\2\u00e7\u00ea\3\2\2\2\u00e8"+
		"\u00e6\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\65\3\2\2\2\u00ea\u00e8\3\2\2"+
		"\2\u00eb\u00ec\7\31\2\2\u00ec\u00ed\5\60\31\2\u00ed\u00ee\7\25\2\2\u00ee"+
		"\67\3\2\2\2\u00ef\u00f1\5:\36\2\u00f0\u00ef\3\2\2\2\u00f0\u00f1\3\2\2"+
		"\2\u00f1\u00f2\3\2\2\2\u00f2\u00f8\5<\37\2\u00f3\u00f5\5:\36\2\u00f4\u00f3"+
		"\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00f8\5> \2\u00f7"+
		"\u00f0\3\2\2\2\u00f7\u00f4\3\2\2\2\u00f89\3\2\2\2\u00f9\u00fa\t\2\2\2"+
		"\u00fa;\3\2\2\2\u00fb\u00fc\7\13\2\2\u00fc=\3\2\2\2\u00fd\u00fe\7\f\2"+
		"\2\u00fe?\3\2\2\2\32CHOSVZhmp\u0082\u0088\u008d\u0090\u00a2\u00a9\u00b4"+
		"\u00b8\u00c9\u00d4\u00d8\u00e8\u00f0\u00f4\u00f7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}