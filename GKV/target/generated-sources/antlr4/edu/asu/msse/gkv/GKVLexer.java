// Generated from GKV.g4 by ANTLR 4.5.3
package edu.asu.msse.gkv;

  //package edu.asu.msse.gkv;

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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, INTEGER_LITERAL=8, 
		DECIMAL_LITERAL=9, STRING_LITERAL=10, BOOLEAN=11, DATATYPE=12, FK_FUNCTION=13, 
		FK_USES=14, FK_RETURNS=15, FK_RETURN=16, O_BRACE=17, C_BRACE=18, CK_IF=19, 
		CK_ELSE=20, CK_THEN=21, CK_ELSIF=22, FK_CALL=23, FK_WITH=24, ASSIGNMENT_SYMBOL=25, 
		COMMA=26, COMPK_KEYWORDS=27, IDENTIFIER=28, ADDING_OPERATOR=29, MULTIPLYING_OPERATOR=30, 
		WHITESPACE=31;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "INTEGER_LITERAL", 
		"DECIMAL_LITERAL", "STRING_LITERAL", "NUMBER", "BOOLEAN", "DATATYPE", 
		"FK_FUNCTION", "FK_USES", "FK_RETURNS", "FK_RETURN", "O_BRACE", "C_BRACE", 
		"CK_IF", "CK_ELSE", "CK_THEN", "CK_ELSIF", "FK_CALL", "FK_WITH", "ASSIGNMENT_SYMBOL", 
		"COMMA", "COMPK_KEYWORDS", "IDENTIFIER", "ADDING_OPERATOR", "MULTIPLYING_OPERATOR", 
		"WHITESPACE"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'while'", "'and'", "'or'", "'('", "')'", "'show'", null, 
		null, null, null, null, "'function'", "'uses'", "'returns'", "'return'", 
		"'{'", "'}'", "'if'", "'else'", "'then'", "'elsif'", "'call'", "'with'", 
		"'='", "','"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, "INTEGER_LITERAL", "DECIMAL_LITERAL", 
		"STRING_LITERAL", "BOOLEAN", "DATATYPE", "FK_FUNCTION", "FK_USES", "FK_RETURNS", 
		"FK_RETURN", "O_BRACE", "C_BRACE", "CK_IF", "CK_ELSE", "CK_THEN", "CK_ELSIF", 
		"FK_CALL", "FK_WITH", "ASSIGNMENT_SYMBOL", "COMMA", "COMPK_KEYWORDS", 
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2!\u0136\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3"+
		"\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\5\t]\n\t\3\t\6\t`\n\t\r\t\16\ta\3\n"+
		"\5\ne\n\n\3\n\3\n\3\n\6\nj\n\n\r\n\16\nk\3\13\3\13\7\13p\n\13\f\13\16"+
		"\13s\13\13\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u0082"+
		"\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u0099\n\16\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23"+
		"\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27"+
		"\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\32\3\32"+
		"\3\32\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u0125\n\35\3\36\6\36"+
		"\u0128\n\36\r\36\16\36\u0129\3\37\3\37\3 \3 \3!\6!\u0131\n!\r!\16!\u0132"+
		"\3!\3!\2\2\"\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\2\31\r\33"+
		"\16\35\17\37\20!\21#\22%\23\'\24)\25+\26-\27/\30\61\31\63\32\65\33\67"+
		"\349\35;\36=\37? A!\3\2\7\4\2--//\5\2\f\f\17\17$$\4\2C\\c|\4\2,,\61\61"+
		"\5\2\13\f\16\17\"\"\u0143\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2"+
		"\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2"+
		"\25\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2"+
		"\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2"+
		"\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3"+
		"\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\3C\3\2\2\2\5E\3\2\2"+
		"\2\7K\3\2\2\2\tO\3\2\2\2\13R\3\2\2\2\rT\3\2\2\2\17V\3\2\2\2\21\\\3\2\2"+
		"\2\23d\3\2\2\2\25m\3\2\2\2\27v\3\2\2\2\31\u0081\3\2\2\2\33\u0098\3\2\2"+
		"\2\35\u009a\3\2\2\2\37\u00a3\3\2\2\2!\u00a8\3\2\2\2#\u00b0\3\2\2\2%\u00b7"+
		"\3\2\2\2\'\u00b9\3\2\2\2)\u00bb\3\2\2\2+\u00be\3\2\2\2-\u00c3\3\2\2\2"+
		"/\u00c8\3\2\2\2\61\u00ce\3\2\2\2\63\u00d3\3\2\2\2\65\u00d8\3\2\2\2\67"+
		"\u00da\3\2\2\29\u0124\3\2\2\2;\u0127\3\2\2\2=\u012b\3\2\2\2?\u012d\3\2"+
		"\2\2A\u0130\3\2\2\2CD\7=\2\2D\4\3\2\2\2EF\7y\2\2FG\7j\2\2GH\7k\2\2HI\7"+
		"n\2\2IJ\7g\2\2J\6\3\2\2\2KL\7c\2\2LM\7p\2\2MN\7f\2\2N\b\3\2\2\2OP\7q\2"+
		"\2PQ\7t\2\2Q\n\3\2\2\2RS\7*\2\2S\f\3\2\2\2TU\7+\2\2U\16\3\2\2\2VW\7u\2"+
		"\2WX\7j\2\2XY\7q\2\2YZ\7y\2\2Z\20\3\2\2\2[]\t\2\2\2\\[\3\2\2\2\\]\3\2"+
		"\2\2]_\3\2\2\2^`\5\27\f\2_^\3\2\2\2`a\3\2\2\2a_\3\2\2\2ab\3\2\2\2b\22"+
		"\3\2\2\2ce\t\2\2\2dc\3\2\2\2de\3\2\2\2ef\3\2\2\2fg\5\27\f\2gi\7\60\2\2"+
		"hj\5\27\f\2ih\3\2\2\2jk\3\2\2\2ki\3\2\2\2kl\3\2\2\2l\24\3\2\2\2mq\7$\2"+
		"\2np\n\3\2\2on\3\2\2\2ps\3\2\2\2qo\3\2\2\2qr\3\2\2\2rt\3\2\2\2sq\3\2\2"+
		"\2tu\7$\2\2u\26\3\2\2\2vw\4\62;\2w\30\3\2\2\2xy\7v\2\2yz\7t\2\2z{\7w\2"+
		"\2{\u0082\7g\2\2|}\7h\2\2}~\7c\2\2~\177\7n\2\2\177\u0080\7u\2\2\u0080"+
		"\u0082\7g\2\2\u0081x\3\2\2\2\u0081|\3\2\2\2\u0082\32\3\2\2\2\u0083\u0084"+
		"\7k\2\2\u0084\u0085\7p\2\2\u0085\u0086\7v\2\2\u0086\u0087\7g\2\2\u0087"+
		"\u0088\7i\2\2\u0088\u0089\7g\2\2\u0089\u0099\7t\2\2\u008a\u008b\7f\2\2"+
		"\u008b\u008c\7g\2\2\u008c\u008d\7e\2\2\u008d\u008e\7k\2\2\u008e\u008f"+
		"\7o\2\2\u008f\u0090\7c\2\2\u0090\u0099\7n\2\2\u0091\u0092\7d\2\2\u0092"+
		"\u0093\7q\2\2\u0093\u0094\7q\2\2\u0094\u0095\7n\2\2\u0095\u0096\7g\2\2"+
		"\u0096\u0097\7c\2\2\u0097\u0099\7p\2\2\u0098\u0083\3\2\2\2\u0098\u008a"+
		"\3\2\2\2\u0098\u0091\3\2\2\2\u0099\34\3\2\2\2\u009a\u009b\7h\2\2\u009b"+
		"\u009c\7w\2\2\u009c\u009d\7p\2\2\u009d\u009e\7e\2\2\u009e\u009f\7v\2\2"+
		"\u009f\u00a0\7k\2\2\u00a0\u00a1\7q\2\2\u00a1\u00a2\7p\2\2\u00a2\36\3\2"+
		"\2\2\u00a3\u00a4\7w\2\2\u00a4\u00a5\7u\2\2\u00a5\u00a6\7g\2\2\u00a6\u00a7"+
		"\7u\2\2\u00a7 \3\2\2\2\u00a8\u00a9\7t\2\2\u00a9\u00aa\7g\2\2\u00aa\u00ab"+
		"\7v\2\2\u00ab\u00ac\7w\2\2\u00ac\u00ad\7t\2\2\u00ad\u00ae\7p\2\2\u00ae"+
		"\u00af\7u\2\2\u00af\"\3\2\2\2\u00b0\u00b1\7t\2\2\u00b1\u00b2\7g\2\2\u00b2"+
		"\u00b3\7v\2\2\u00b3\u00b4\7w\2\2\u00b4\u00b5\7t\2\2\u00b5\u00b6\7p\2\2"+
		"\u00b6$\3\2\2\2\u00b7\u00b8\7}\2\2\u00b8&\3\2\2\2\u00b9\u00ba\7\177\2"+
		"\2\u00ba(\3\2\2\2\u00bb\u00bc\7k\2\2\u00bc\u00bd\7h\2\2\u00bd*\3\2\2\2"+
		"\u00be\u00bf\7g\2\2\u00bf\u00c0\7n\2\2\u00c0\u00c1\7u\2\2\u00c1\u00c2"+
		"\7g\2\2\u00c2,\3\2\2\2\u00c3\u00c4\7v\2\2\u00c4\u00c5\7j\2\2\u00c5\u00c6"+
		"\7g\2\2\u00c6\u00c7\7p\2\2\u00c7.\3\2\2\2\u00c8\u00c9\7g\2\2\u00c9\u00ca"+
		"\7n\2\2\u00ca\u00cb\7u\2\2\u00cb\u00cc\7k\2\2\u00cc\u00cd\7h\2\2\u00cd"+
		"\60\3\2\2\2\u00ce\u00cf\7e\2\2\u00cf\u00d0\7c\2\2\u00d0\u00d1\7n\2\2\u00d1"+
		"\u00d2\7n\2\2\u00d2\62\3\2\2\2\u00d3\u00d4\7y\2\2\u00d4\u00d5\7k\2\2\u00d5"+
		"\u00d6\7v\2\2\u00d6\u00d7\7j\2\2\u00d7\64\3\2\2\2\u00d8\u00d9\7?\2\2\u00d9"+
		"\66\3\2\2\2\u00da\u00db\7.\2\2\u00db8\3\2\2\2\u00dc\u00dd\7g\2\2\u00dd"+
		"\u00de\7s\2\2\u00de\u00df\7w\2\2\u00df\u00e0\7c\2\2\u00e0\u00e1\7n\2\2"+
		"\u00e1\u00e2\7V\2\2\u00e2\u0125\7q\2\2\u00e3\u00e4\7n\2\2\u00e4\u00e5"+
		"\7g\2\2\u00e5\u00e6\7u\2\2\u00e6\u00e7\7u\2\2\u00e7\u00e8\7V\2\2\u00e8"+
		"\u00e9\7j\2\2\u00e9\u00ea\7c\2\2\u00ea\u0125\7p\2\2\u00eb\u00ec\7i\2\2"+
		"\u00ec\u00ed\7t\2\2\u00ed\u00ee\7g\2\2\u00ee\u00ef\7c\2\2\u00ef\u00f0"+
		"\7v\2\2\u00f0\u00f1\7g\2\2\u00f1\u00f2\7t\2\2\u00f2\u00f3\7V\2\2\u00f3"+
		"\u00f4\7j\2\2\u00f4\u00f5\7c\2\2\u00f5\u0125\7p\2\2\u00f6\u00f7\7n\2\2"+
		"\u00f7\u00f8\7g\2\2\u00f8\u00f9\7u\2\2\u00f9\u00fa\7u\2\2\u00fa\u00fb"+
		"\7V\2\2\u00fb\u00fc\7j\2\2\u00fc\u00fd\7c\2\2\u00fd\u00fe\7p\2\2\u00fe"+
		"\u00ff\7Q\2\2\u00ff\u0100\7t\2\2\u0100\u0101\7G\2\2\u0101\u0102\7s\2\2"+
		"\u0102\u0103\7w\2\2\u0103\u0104\7c\2\2\u0104\u0105\7n\2\2\u0105\u0106"+
		"\7V\2\2\u0106\u0125\7q\2\2\u0107\u0108\7i\2\2\u0108\u0109\7t\2\2\u0109"+
		"\u010a\7g\2\2\u010a\u010b\7c\2\2\u010b\u010c\7v\2\2\u010c\u010d\7g\2\2"+
		"\u010d\u010e\7V\2\2\u010e\u010f\7j\2\2\u010f\u0110\7c\2\2\u0110\u0111"+
		"\7p\2\2\u0111\u0112\7Q\2\2\u0112\u0113\7t\2\2\u0113\u0114\7G\2\2\u0114"+
		"\u0115\7s\2\2\u0115\u0116\7w\2\2\u0116\u0117\7c\2\2\u0117\u0118\7n\2\2"+
		"\u0118\u0119\7V\2\2\u0119\u0125\7q\2\2\u011a\u011b\7p\2\2\u011b\u011c"+
		"\7q\2\2\u011c\u011d\7v\2\2\u011d\u011e\7G\2\2\u011e\u011f\7s\2\2\u011f"+
		"\u0120\7w\2\2\u0120\u0121\7c\2\2\u0121\u0122\7n\2\2\u0122\u0123\7V\2\2"+
		"\u0123\u0125\7q\2\2\u0124\u00dc\3\2\2\2\u0124\u00e3\3\2\2\2\u0124\u00eb"+
		"\3\2\2\2\u0124\u00f6\3\2\2\2\u0124\u0107\3\2\2\2\u0124\u011a\3\2\2\2\u0125"+
		":\3\2\2\2\u0126\u0128\t\4\2\2\u0127\u0126\3\2\2\2\u0128\u0129\3\2\2\2"+
		"\u0129\u0127\3\2\2\2\u0129\u012a\3\2\2\2\u012a<\3\2\2\2\u012b\u012c\t"+
		"\2\2\2\u012c>\3\2\2\2\u012d\u012e\t\5\2\2\u012e@\3\2\2\2\u012f\u0131\t"+
		"\6\2\2\u0130\u012f\3\2\2\2\u0131\u0132\3\2\2\2\u0132\u0130\3\2\2\2\u0132"+
		"\u0133\3\2\2\2\u0133\u0134\3\2\2\2\u0134\u0135\b!\2\2\u0135B\3\2\2\2\r"+
		"\2\\adkq\u0081\u0098\u0124\u0129\u0132\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}