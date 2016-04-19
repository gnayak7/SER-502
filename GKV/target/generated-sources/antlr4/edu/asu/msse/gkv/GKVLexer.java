// Generated from GKV.g4 by ANTLR 4.5.3

  package edu.asu.msse.gkv;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GKVLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, INTEGER_LITERAL=11, DECIMAL_LITERAL=12, STRING_LITERAL=13, BOOLEAN=14, 
		FK_FUNCTION=15, FK_USES=16, FK_RETURNS=17, FK_RETURN=18, O_BRACE=19, C_BRACE=20, 
		CK_IF=21, CK_ELSE=22, CK_THEN=23, CK_ELSIF=24, FK_CALL=25, FK_WITH=26, 
		ASSIGNMENT_SYMBOL=27, COMMA=28, COMPK_KEYWORDS=29, IDENTIFIER=30, ADDING_OPERATOR=31, 
		MULTIPLYING_OPERATOR=32, WHITESPACE=33;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "INTEGER_LITERAL", "DECIMAL_LITERAL", "STRING_LITERAL", "NUMBER", 
		"BOOLEAN", "FK_FUNCTION", "FK_USES", "FK_RETURNS", "FK_RETURN", "O_BRACE", 
		"C_BRACE", "CK_IF", "CK_ELSE", "CK_THEN", "CK_ELSIF", "FK_CALL", "FK_WITH", 
		"ASSIGNMENT_SYMBOL", "COMMA", "COMPK_KEYWORDS", "IDENTIFIER", "ADDING_OPERATOR", 
		"MULTIPLYING_OPERATOR", "WHITESPACE"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'while'", "'and'", "'or'", "'('", "')'", "'show'", "'integer'", 
		"'decimal'", "'boolean'", null, null, null, null, "'function'", "'uses'", 
		"'returns'", "'return'", "'{'", "'}'", "'if'", "'else'", "'then'", "'elsif'", 
		"'call'", "'with'", "'='", "','"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, "INTEGER_LITERAL", 
		"DECIMAL_LITERAL", "STRING_LITERAL", "BOOLEAN", "FK_FUNCTION", "FK_USES", 
		"FK_RETURNS", "FK_RETURN", "O_BRACE", "C_BRACE", "CK_IF", "CK_ELSE", "CK_THEN", 
		"CK_ELSIF", "FK_CALL", "FK_WITH", "ASSIGNMENT_SYMBOL", "COMMA", "COMPK_KEYWORDS", 
		"IDENTIFIER", "ADDING_OPERATOR", "MULTIPLYING_OPERATOR", "WHITESPACE"
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


	public GKVLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "GKV.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2#\u013b\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5"+
		"\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\f\5\fy\n\f\3\f\6\f|\n\f\r\f\16\f}\3\r\5\r\u0081\n\r\3\r\3\r"+
		"\3\r\6\r\u0086\n\r\r\r\16\r\u0087\3\16\3\16\7\16\u008c\n\16\f\16\16\16"+
		"\u008f\13\16\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\5\20\u009e\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\27\3\30"+
		"\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\36"+
		"\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\5\37\u012a\n\37\3 \6 \u012d\n \r \16 \u012e\3!\3!\3\""+
		"\3\"\3#\6#\u0136\n#\r#\16#\u0137\3#\3#\2\2$\3\3\5\4\7\5\t\6\13\7\r\b\17"+
		"\t\21\n\23\13\25\f\27\r\31\16\33\17\35\2\37\20!\21#\22%\23\'\24)\25+\26"+
		"-\27/\30\61\31\63\32\65\33\67\349\35;\36=\37? A!C\"E#\3\2\7\4\2--//\5"+
		"\2\f\f\17\17$$\4\2C\\c|\4\2,,\61\61\5\2\13\f\16\17\"\"\u0146\2\3\3\2\2"+
		"\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3"+
		"\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2"+
		"\2\2\33\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2"+
		"\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2"+
		"\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2"+
		"\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\3G\3\2\2\2\5I\3\2\2\2\7O\3\2\2\2"+
		"\tS\3\2\2\2\13V\3\2\2\2\rX\3\2\2\2\17Z\3\2\2\2\21_\3\2\2\2\23g\3\2\2\2"+
		"\25o\3\2\2\2\27x\3\2\2\2\31\u0080\3\2\2\2\33\u0089\3\2\2\2\35\u0092\3"+
		"\2\2\2\37\u009d\3\2\2\2!\u009f\3\2\2\2#\u00a8\3\2\2\2%\u00ad\3\2\2\2\'"+
		"\u00b5\3\2\2\2)\u00bc\3\2\2\2+\u00be\3\2\2\2-\u00c0\3\2\2\2/\u00c3\3\2"+
		"\2\2\61\u00c8\3\2\2\2\63\u00cd\3\2\2\2\65\u00d3\3\2\2\2\67\u00d8\3\2\2"+
		"\29\u00dd\3\2\2\2;\u00df\3\2\2\2=\u0129\3\2\2\2?\u012c\3\2\2\2A\u0130"+
		"\3\2\2\2C\u0132\3\2\2\2E\u0135\3\2\2\2GH\7=\2\2H\4\3\2\2\2IJ\7y\2\2JK"+
		"\7j\2\2KL\7k\2\2LM\7n\2\2MN\7g\2\2N\6\3\2\2\2OP\7c\2\2PQ\7p\2\2QR\7f\2"+
		"\2R\b\3\2\2\2ST\7q\2\2TU\7t\2\2U\n\3\2\2\2VW\7*\2\2W\f\3\2\2\2XY\7+\2"+
		"\2Y\16\3\2\2\2Z[\7u\2\2[\\\7j\2\2\\]\7q\2\2]^\7y\2\2^\20\3\2\2\2_`\7k"+
		"\2\2`a\7p\2\2ab\7v\2\2bc\7g\2\2cd\7i\2\2de\7g\2\2ef\7t\2\2f\22\3\2\2\2"+
		"gh\7f\2\2hi\7g\2\2ij\7e\2\2jk\7k\2\2kl\7o\2\2lm\7c\2\2mn\7n\2\2n\24\3"+
		"\2\2\2op\7d\2\2pq\7q\2\2qr\7q\2\2rs\7n\2\2st\7g\2\2tu\7c\2\2uv\7p\2\2"+
		"v\26\3\2\2\2wy\t\2\2\2xw\3\2\2\2xy\3\2\2\2y{\3\2\2\2z|\5\35\17\2{z\3\2"+
		"\2\2|}\3\2\2\2}{\3\2\2\2}~\3\2\2\2~\30\3\2\2\2\177\u0081\t\2\2\2\u0080"+
		"\177\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0083\5\35"+
		"\17\2\u0083\u0085\7\60\2\2\u0084\u0086\5\35\17\2\u0085\u0084\3\2\2\2\u0086"+
		"\u0087\3\2\2\2\u0087\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088\32\3\2\2"+
		"\2\u0089\u008d\7$\2\2\u008a\u008c\n\3\2\2\u008b\u008a\3\2\2\2\u008c\u008f"+
		"\3\2\2\2\u008d\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u0090\3\2\2\2\u008f"+
		"\u008d\3\2\2\2\u0090\u0091\7$\2\2\u0091\34\3\2\2\2\u0092\u0093\4\62;\2"+
		"\u0093\36\3\2\2\2\u0094\u0095\7v\2\2\u0095\u0096\7t\2\2\u0096\u0097\7"+
		"w\2\2\u0097\u009e\7g\2\2\u0098\u0099\7h\2\2\u0099\u009a\7c\2\2\u009a\u009b"+
		"\7n\2\2\u009b\u009c\7u\2\2\u009c\u009e\7g\2\2\u009d\u0094\3\2\2\2\u009d"+
		"\u0098\3\2\2\2\u009e \3\2\2\2\u009f\u00a0\7h\2\2\u00a0\u00a1\7w\2\2\u00a1"+
		"\u00a2\7p\2\2\u00a2\u00a3\7e\2\2\u00a3\u00a4\7v\2\2\u00a4\u00a5\7k\2\2"+
		"\u00a5\u00a6\7q\2\2\u00a6\u00a7\7p\2\2\u00a7\"\3\2\2\2\u00a8\u00a9\7w"+
		"\2\2\u00a9\u00aa\7u\2\2\u00aa\u00ab\7g\2\2\u00ab\u00ac\7u\2\2\u00ac$\3"+
		"\2\2\2\u00ad\u00ae\7t\2\2\u00ae\u00af\7g\2\2\u00af\u00b0\7v\2\2\u00b0"+
		"\u00b1\7w\2\2\u00b1\u00b2\7t\2\2\u00b2\u00b3\7p\2\2\u00b3\u00b4\7u\2\2"+
		"\u00b4&\3\2\2\2\u00b5\u00b6\7t\2\2\u00b6\u00b7\7g\2\2\u00b7\u00b8\7v\2"+
		"\2\u00b8\u00b9\7w\2\2\u00b9\u00ba\7t\2\2\u00ba\u00bb\7p\2\2\u00bb(\3\2"+
		"\2\2\u00bc\u00bd\7}\2\2\u00bd*\3\2\2\2\u00be\u00bf\7\177\2\2\u00bf,\3"+
		"\2\2\2\u00c0\u00c1\7k\2\2\u00c1\u00c2\7h\2\2\u00c2.\3\2\2\2\u00c3\u00c4"+
		"\7g\2\2\u00c4\u00c5\7n\2\2\u00c5\u00c6\7u\2\2\u00c6\u00c7\7g\2\2\u00c7"+
		"\60\3\2\2\2\u00c8\u00c9\7v\2\2\u00c9\u00ca\7j\2\2\u00ca\u00cb\7g\2\2\u00cb"+
		"\u00cc\7p\2\2\u00cc\62\3\2\2\2\u00cd\u00ce\7g\2\2\u00ce\u00cf\7n\2\2\u00cf"+
		"\u00d0\7u\2\2\u00d0\u00d1\7k\2\2\u00d1\u00d2\7h\2\2\u00d2\64\3\2\2\2\u00d3"+
		"\u00d4\7e\2\2\u00d4\u00d5\7c\2\2\u00d5\u00d6\7n\2\2\u00d6\u00d7\7n\2\2"+
		"\u00d7\66\3\2\2\2\u00d8\u00d9\7y\2\2\u00d9\u00da\7k\2\2\u00da\u00db\7"+
		"v\2\2\u00db\u00dc\7j\2\2\u00dc8\3\2\2\2\u00dd\u00de\7?\2\2\u00de:\3\2"+
		"\2\2\u00df\u00e0\7.\2\2\u00e0<\3\2\2\2\u00e1\u00e2\7g\2\2\u00e2\u00e3"+
		"\7s\2\2\u00e3\u00e4\7w\2\2\u00e4\u00e5\7c\2\2\u00e5\u00e6\7n\2\2\u00e6"+
		"\u00e7\7V\2\2\u00e7\u012a\7q\2\2\u00e8\u00e9\7n\2\2\u00e9\u00ea\7g\2\2"+
		"\u00ea\u00eb\7u\2\2\u00eb\u00ec\7u\2\2\u00ec\u00ed\7V\2\2\u00ed\u00ee"+
		"\7j\2\2\u00ee\u00ef\7c\2\2\u00ef\u012a\7p\2\2\u00f0\u00f1\7i\2\2\u00f1"+
		"\u00f2\7t\2\2\u00f2\u00f3\7g\2\2\u00f3\u00f4\7c\2\2\u00f4\u00f5\7v\2\2"+
		"\u00f5\u00f6\7g\2\2\u00f6\u00f7\7t\2\2\u00f7\u00f8\7V\2\2\u00f8\u00f9"+
		"\7j\2\2\u00f9\u00fa\7c\2\2\u00fa\u012a\7p\2\2\u00fb\u00fc\7n\2\2\u00fc"+
		"\u00fd\7g\2\2\u00fd\u00fe\7u\2\2\u00fe\u00ff\7u\2\2\u00ff\u0100\7V\2\2"+
		"\u0100\u0101\7j\2\2\u0101\u0102\7c\2\2\u0102\u0103\7p\2\2\u0103\u0104"+
		"\7Q\2\2\u0104\u0105\7t\2\2\u0105\u0106\7G\2\2\u0106\u0107\7s\2\2\u0107"+
		"\u0108\7w\2\2\u0108\u0109\7c\2\2\u0109\u010a\7n\2\2\u010a\u010b\7V\2\2"+
		"\u010b\u012a\7q\2\2\u010c\u010d\7i\2\2\u010d\u010e\7t\2\2\u010e\u010f"+
		"\7g\2\2\u010f\u0110\7c\2\2\u0110\u0111\7v\2\2\u0111\u0112\7g\2\2\u0112"+
		"\u0113\7V\2\2\u0113\u0114\7j\2\2\u0114\u0115\7c\2\2\u0115\u0116\7p\2\2"+
		"\u0116\u0117\7Q\2\2\u0117\u0118\7t\2\2\u0118\u0119\7G\2\2\u0119\u011a"+
		"\7s\2\2\u011a\u011b\7w\2\2\u011b\u011c\7c\2\2\u011c\u011d\7n\2\2\u011d"+
		"\u011e\7V\2\2\u011e\u012a\7q\2\2\u011f\u0120\7p\2\2\u0120\u0121\7q\2\2"+
		"\u0121\u0122\7v\2\2\u0122\u0123\7G\2\2\u0123\u0124\7s\2\2\u0124\u0125"+
		"\7w\2\2\u0125\u0126\7c\2\2\u0126\u0127\7n\2\2\u0127\u0128\7V\2\2\u0128"+
		"\u012a\7q\2\2\u0129\u00e1\3\2\2\2\u0129\u00e8\3\2\2\2\u0129\u00f0\3\2"+
		"\2\2\u0129\u00fb\3\2\2\2\u0129\u010c\3\2\2\2\u0129\u011f\3\2\2\2\u012a"+
		">\3\2\2\2\u012b\u012d\t\4\2\2\u012c\u012b\3\2\2\2\u012d\u012e\3\2\2\2"+
		"\u012e\u012c\3\2\2\2\u012e\u012f\3\2\2\2\u012f@\3\2\2\2\u0130\u0131\t"+
		"\2\2\2\u0131B\3\2\2\2\u0132\u0133\t\5\2\2\u0133D\3\2\2\2\u0134\u0136\t"+
		"\6\2\2\u0135\u0134\3\2\2\2\u0136\u0137\3\2\2\2\u0137\u0135\3\2\2\2\u0137"+
		"\u0138\3\2\2\2\u0138\u0139\3\2\2\2\u0139\u013a\b#\2\2\u013aF\3\2\2\2\f"+
		"\2x}\u0080\u0087\u008d\u009d\u0129\u012e\u0137\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}