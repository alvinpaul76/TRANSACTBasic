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
		INSERT=8, INTEGER=9, REAL=10, EQUALS=11, POSITIVE=12, NEGATIVE=13, COMMENT=14, 
		COMMA=15, LPAREN=16, DOT=17, RPAREN=18, NEWLINE=19, IDENT=20, WHITESPACE=21, 
		DIM=22, MAT=23;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"PROGRAM", "SUBROUTINE", "FUNCTION", "RETURN", "STOP", "END", "PACKAGE", 
			"INSERT", "INTEGER", "REAL", "EQUALS", "POSITIVE", "NEGATIVE", "COMMENT", 
			"COMMA", "LPAREN", "DOT", "RPAREN", "NEWLINE", "IDENT", "WHITESPACE", 
			"DIM", "MAT"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\31\u00cf\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\5\3G\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0087\n"+
		"\t\3\n\6\n\u008a\n\n\r\n\16\n\u008b\3\13\6\13\u008f\n\13\r\13\16\13\u0090"+
		"\3\13\3\13\6\13\u0095\n\13\r\13\16\13\u0096\3\f\3\f\3\r\3\r\3\16\3\16"+
		"\3\17\3\17\7\17\u00a1\n\17\f\17\16\17\u00a4\13\17\3\20\3\20\3\21\3\21"+
		"\3\22\3\22\3\23\3\23\3\24\6\24\u00af\n\24\r\24\16\24\u00b0\3\25\3\25\7"+
		"\25\u00b5\n\25\f\25\16\25\u00b8\13\25\3\26\3\26\3\26\3\26\3\27\3\27\3"+
		"\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u00ca\n\27\3\30"+
		"\3\30\3\30\3\30\2\2\31\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27"+
		"\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\3\2\6\5\2"+
		"\f\f\17\17==\4\2C\\c|\b\2&&\60\60\62;C\\aac|\4\2\13\13\"\"\2\u00d9\2\3"+
		"\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2"+
		"\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31"+
		"\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2"+
		"\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\3"+
		"\61\3\2\2\2\5F\3\2\2\2\7H\3\2\2\2\tQ\3\2\2\2\13X\3\2\2\2\r]\3\2\2\2\17"+
		"a\3\2\2\2\21\u0086\3\2\2\2\23\u0089\3\2\2\2\25\u008e\3\2\2\2\27\u0098"+
		"\3\2\2\2\31\u009a\3\2\2\2\33\u009c\3\2\2\2\35\u009e\3\2\2\2\37\u00a5\3"+
		"\2\2\2!\u00a7\3\2\2\2#\u00a9\3\2\2\2%\u00ab\3\2\2\2\'\u00ae\3\2\2\2)\u00b2"+
		"\3\2\2\2+\u00b9\3\2\2\2-\u00c9\3\2\2\2/\u00cb\3\2\2\2\61\62\7R\2\2\62"+
		"\63\7T\2\2\63\64\7Q\2\2\64\65\7I\2\2\65\66\7T\2\2\66\67\7C\2\2\678\7O"+
		"\2\28\4\3\2\2\29:\7U\2\2:;\7W\2\2;G\7D\2\2<=\7U\2\2=>\7W\2\2>?\7D\2\2"+
		"?@\7T\2\2@A\7Q\2\2AB\7W\2\2BC\7V\2\2CD\7K\2\2DE\7P\2\2EG\7G\2\2F9\3\2"+
		"\2\2F<\3\2\2\2G\6\3\2\2\2HI\7H\2\2IJ\7W\2\2JK\7P\2\2KL\7E\2\2LM\7V\2\2"+
		"MN\7K\2\2NO\7Q\2\2OP\7P\2\2P\b\3\2\2\2QR\7T\2\2RS\7G\2\2ST\7V\2\2TU\7"+
		"W\2\2UV\7T\2\2VW\7P\2\2W\n\3\2\2\2XY\7U\2\2YZ\7V\2\2Z[\7Q\2\2[\\\7R\2"+
		"\2\\\f\3\2\2\2]^\7G\2\2^_\7P\2\2_`\7F\2\2`\16\3\2\2\2ab\7&\2\2bc\7R\2"+
		"\2cd\7C\2\2de\7E\2\2ef\7M\2\2fg\7C\2\2gh\7I\2\2hi\7G\2\2i\20\3\2\2\2j"+
		"k\7K\2\2kl\7P\2\2lm\7U\2\2mn\7G\2\2no\7T\2\2o\u0087\7V\2\2pq\7&\2\2qr"+
		"\7K\2\2rs\7P\2\2st\7U\2\2tu\7G\2\2uv\7T\2\2v\u0087\7V\2\2wx\7K\2\2xy\7"+
		"P\2\2yz\7E\2\2z{\7N\2\2{|\7W\2\2|}\7F\2\2}\u0087\7G\2\2~\177\7&\2\2\177"+
		"\u0080\7K\2\2\u0080\u0081\7P\2\2\u0081\u0082\7E\2\2\u0082\u0083\7N\2\2"+
		"\u0083\u0084\7W\2\2\u0084\u0085\7F\2\2\u0085\u0087\7G\2\2\u0086j\3\2\2"+
		"\2\u0086p\3\2\2\2\u0086w\3\2\2\2\u0086~\3\2\2\2\u0087\22\3\2\2\2\u0088"+
		"\u008a\4\62;\2\u0089\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u0089\3\2"+
		"\2\2\u008b\u008c\3\2\2\2\u008c\24\3\2\2\2\u008d\u008f\4\62;\2\u008e\u008d"+
		"\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091"+
		"\u0092\3\2\2\2\u0092\u0094\7\60\2\2\u0093\u0095\4\62;\2\u0094\u0093\3"+
		"\2\2\2\u0095\u0096\3\2\2\2\u0096\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097"+
		"\26\3\2\2\2\u0098\u0099\7?\2\2\u0099\30\3\2\2\2\u009a\u009b\7-\2\2\u009b"+
		"\32\3\2\2\2\u009c\u009d\7/\2\2\u009d\34\3\2\2\2\u009e\u00a2\7,\2\2\u009f"+
		"\u00a1\n\2\2\2\u00a0\u009f\3\2\2\2\u00a1\u00a4\3\2\2\2\u00a2\u00a0\3\2"+
		"\2\2\u00a2\u00a3\3\2\2\2\u00a3\36\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a5\u00a6"+
		"\7.\2\2\u00a6 \3\2\2\2\u00a7\u00a8\7*\2\2\u00a8\"\3\2\2\2\u00a9\u00aa"+
		"\7\60\2\2\u00aa$\3\2\2\2\u00ab\u00ac\7+\2\2\u00ac&\3\2\2\2\u00ad\u00af"+
		"\t\2\2\2\u00ae\u00ad\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b0"+
		"\u00b1\3\2\2\2\u00b1(\3\2\2\2\u00b2\u00b6\t\3\2\2\u00b3\u00b5\t\4\2\2"+
		"\u00b4\u00b3\3\2\2\2\u00b5\u00b8\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b6\u00b7"+
		"\3\2\2\2\u00b7*\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b9\u00ba\t\5\2\2\u00ba"+
		"\u00bb\3\2\2\2\u00bb\u00bc\b\26\2\2\u00bc,\3\2\2\2\u00bd\u00be\7F\2\2"+
		"\u00be\u00bf\7K\2\2\u00bf\u00ca\7O\2\2\u00c0\u00c1\7F\2\2\u00c1\u00c2"+
		"\7K\2\2\u00c2\u00c3\7O\2\2\u00c3\u00c4\7G\2\2\u00c4\u00c5\7P\2\2\u00c5"+
		"\u00c6\7U\2\2\u00c6\u00c7\7K\2\2\u00c7\u00c8\7Q\2\2\u00c8\u00ca\7P\2\2"+
		"\u00c9\u00bd\3\2\2\2\u00c9\u00c0\3\2\2\2\u00ca.\3\2\2\2\u00cb\u00cc\7"+
		"O\2\2\u00cc\u00cd\7C\2\2\u00cd\u00ce\7V\2\2\u00ce\60\3\2\2\2\f\2F\u0086"+
		"\u008b\u0090\u0096\u00a2\u00b0\u00b6\u00c9\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}