// Generated from d:\Development\workspace\products\TRANSACTBasic\grammar\TRANSACTBasic.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TRANSACTBasicLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PROGRAM=1, SUBROUTINE=2, FUNCTION=3, RETURN=4, STOP=5, END=6, PACKAGE=7, 
		INSERT=8, COMMENT=9, MAT=10, COMMA=11, LPAREN=12, DOT=13, RPAREN=14, NEWLINE=15, 
		IDENT=16, WHITESPACE=17;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"PROGRAM", "SUBROUTINE", "FUNCTION", "RETURN", "STOP", "END", "PACKAGE", 
			"INSERT", "COMMENT", "MAT", "COMMA", "LPAREN", "DOT", "RPAREN", "NEWLINE", 
			"IDENT", "WHITESPACE"
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


	public TRANSACTBasicLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "TRANSACTBasic.g4"; }

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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\23\u009f\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\5\3;\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5"+
		"\t{\n\t\3\n\3\n\7\n\177\n\n\f\n\16\n\u0082\13\n\3\13\3\13\3\13\3\13\3"+
		"\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\6\20\u0091\n\20\r\20\16\20\u0092"+
		"\3\21\3\21\7\21\u0097\n\21\f\21\16\21\u009a\13\21\3\22\3\22\3\22\3\22"+
		"\2\2\23\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17"+
		"\35\20\37\21!\22#\23\3\2\6\5\2\f\f\17\17==\4\2C\\c|\b\2&&\60\60\62;C\\"+
		"aac|\4\2\13\13\"\"\2\u00a5\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2"+
		"\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2"+
		"\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3"+
		"\2\2\2\2!\3\2\2\2\2#\3\2\2\2\3%\3\2\2\2\5:\3\2\2\2\7<\3\2\2\2\tE\3\2\2"+
		"\2\13L\3\2\2\2\rQ\3\2\2\2\17U\3\2\2\2\21z\3\2\2\2\23|\3\2\2\2\25\u0083"+
		"\3\2\2\2\27\u0087\3\2\2\2\31\u0089\3\2\2\2\33\u008b\3\2\2\2\35\u008d\3"+
		"\2\2\2\37\u0090\3\2\2\2!\u0094\3\2\2\2#\u009b\3\2\2\2%&\7R\2\2&\'\7T\2"+
		"\2\'(\7Q\2\2()\7I\2\2)*\7T\2\2*+\7C\2\2+,\7O\2\2,\4\3\2\2\2-.\7U\2\2."+
		"/\7W\2\2/;\7D\2\2\60\61\7U\2\2\61\62\7W\2\2\62\63\7D\2\2\63\64\7T\2\2"+
		"\64\65\7Q\2\2\65\66\7W\2\2\66\67\7V\2\2\678\7K\2\289\7P\2\29;\7G\2\2:"+
		"-\3\2\2\2:\60\3\2\2\2;\6\3\2\2\2<=\7H\2\2=>\7W\2\2>?\7P\2\2?@\7E\2\2@"+
		"A\7V\2\2AB\7K\2\2BC\7Q\2\2CD\7P\2\2D\b\3\2\2\2EF\7T\2\2FG\7G\2\2GH\7V"+
		"\2\2HI\7W\2\2IJ\7T\2\2JK\7P\2\2K\n\3\2\2\2LM\7U\2\2MN\7V\2\2NO\7Q\2\2"+
		"OP\7R\2\2P\f\3\2\2\2QR\7G\2\2RS\7P\2\2ST\7F\2\2T\16\3\2\2\2UV\7&\2\2V"+
		"W\7R\2\2WX\7C\2\2XY\7E\2\2YZ\7M\2\2Z[\7C\2\2[\\\7I\2\2\\]\7G\2\2]\20\3"+
		"\2\2\2^_\7K\2\2_`\7P\2\2`a\7U\2\2ab\7G\2\2bc\7T\2\2c{\7V\2\2de\7&\2\2"+
		"ef\7K\2\2fg\7P\2\2gh\7U\2\2hi\7G\2\2ij\7T\2\2j{\7V\2\2kl\7K\2\2lm\7P\2"+
		"\2mn\7E\2\2no\7N\2\2op\7W\2\2pq\7F\2\2q{\7G\2\2rs\7&\2\2st\7K\2\2tu\7"+
		"P\2\2uv\7E\2\2vw\7N\2\2wx\7W\2\2xy\7F\2\2y{\7G\2\2z^\3\2\2\2zd\3\2\2\2"+
		"zk\3\2\2\2zr\3\2\2\2{\22\3\2\2\2|\u0080\7,\2\2}\177\n\2\2\2~}\3\2\2\2"+
		"\177\u0082\3\2\2\2\u0080~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\24\3\2\2\2"+
		"\u0082\u0080\3\2\2\2\u0083\u0084\7O\2\2\u0084\u0085\7C\2\2\u0085\u0086"+
		"\7V\2\2\u0086\26\3\2\2\2\u0087\u0088\7.\2\2\u0088\30\3\2\2\2\u0089\u008a"+
		"\7*\2\2\u008a\32\3\2\2\2\u008b\u008c\7\60\2\2\u008c\34\3\2\2\2\u008d\u008e"+
		"\7+\2\2\u008e\36\3\2\2\2\u008f\u0091\t\2\2\2\u0090\u008f\3\2\2\2\u0091"+
		"\u0092\3\2\2\2\u0092\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093 \3\2\2\2"+
		"\u0094\u0098\t\3\2\2\u0095\u0097\t\4\2\2\u0096\u0095\3\2\2\2\u0097\u009a"+
		"\3\2\2\2\u0098\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099\"\3\2\2\2\u009a"+
		"\u0098\3\2\2\2\u009b\u009c\t\5\2\2\u009c\u009d\3\2\2\2\u009d\u009e\b\22"+
		"\2\2\u009e$\3\2\2\2\b\2:z\u0080\u0092\u0098\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}