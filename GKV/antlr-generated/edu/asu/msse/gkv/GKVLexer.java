// $ANTLR 3.5.2 /home/gowtham/CompilerDesign/workspace/GKV/src/edu/asu/msse/gkv/GKV.g 2016-04-08 22:53:06

  package edu.asu.msse.gkv;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class GKVLexer extends Lexer {
	public static final int EOF=-1;
	public static final int T__16=16;
	public static final int T__17=17;
	public static final int T__18=18;
	public static final int T__19=19;
	public static final int T__20=20;
	public static final int T__21=21;
	public static final int ADDING_OPERATOR=4;
	public static final int BOOLEAN=5;
	public static final int COMMA=6;
	public static final int COMPK_KEYWORDS=7;
	public static final int DATATYPE=8;
	public static final int DECIMAL=9;
	public static final int FK_CALL=10;
	public static final int FK_WITH=11;
	public static final int IDENTIFIER=12;
	public static final int INTEGER=13;
	public static final int MULTIPLYING_OPERATOR=14;
	public static final int NUMERIC_LITERAL=15;

	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public GKVLexer() {} 
	public GKVLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public GKVLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "/home/gowtham/CompilerDesign/workspace/GKV/src/edu/asu/msse/gkv/GKV.g"; }

	// $ANTLR start "T__16"
	public final void mT__16() throws RecognitionException {
		try {
			int _type = T__16;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/gowtham/CompilerDesign/workspace/GKV/src/edu/asu/msse/gkv/GKV.g:11:7: ( '(' )
			// /home/gowtham/CompilerDesign/workspace/GKV/src/edu/asu/msse/gkv/GKV.g:11:9: '('
			{
			match('('); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__16"

	// $ANTLR start "T__17"
	public final void mT__17() throws RecognitionException {
		try {
			int _type = T__17;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/gowtham/CompilerDesign/workspace/GKV/src/edu/asu/msse/gkv/GKV.g:12:7: ( ')' )
			// /home/gowtham/CompilerDesign/workspace/GKV/src/edu/asu/msse/gkv/GKV.g:12:9: ')'
			{
			match(')'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__17"

	// $ANTLR start "T__18"
	public final void mT__18() throws RecognitionException {
		try {
			int _type = T__18;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/gowtham/CompilerDesign/workspace/GKV/src/edu/asu/msse/gkv/GKV.g:13:7: ( '\\n' )
			// /home/gowtham/CompilerDesign/workspace/GKV/src/edu/asu/msse/gkv/GKV.g:13:9: '\\n'
			{
			match('\n'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__18"

	// $ANTLR start "T__19"
	public final void mT__19() throws RecognitionException {
		try {
			int _type = T__19;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/gowtham/CompilerDesign/workspace/GKV/src/edu/asu/msse/gkv/GKV.g:14:7: ( 'and' )
			// /home/gowtham/CompilerDesign/workspace/GKV/src/edu/asu/msse/gkv/GKV.g:14:9: 'and'
			{
			match("and"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__19"

	// $ANTLR start "T__20"
	public final void mT__20() throws RecognitionException {
		try {
			int _type = T__20;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/gowtham/CompilerDesign/workspace/GKV/src/edu/asu/msse/gkv/GKV.g:15:7: ( 'is' )
			// /home/gowtham/CompilerDesign/workspace/GKV/src/edu/asu/msse/gkv/GKV.g:15:9: 'is'
			{
			match("is"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__20"

	// $ANTLR start "T__21"
	public final void mT__21() throws RecognitionException {
		try {
			int _type = T__21;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/gowtham/CompilerDesign/workspace/GKV/src/edu/asu/msse/gkv/GKV.g:16:7: ( 'or' )
			// /home/gowtham/CompilerDesign/workspace/GKV/src/edu/asu/msse/gkv/GKV.g:16:9: 'or'
			{
			match("or"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__21"

	// $ANTLR start "NUMERIC_LITERAL"
	public final void mNUMERIC_LITERAL() throws RecognitionException {
		try {
			int _type = NUMERIC_LITERAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/gowtham/CompilerDesign/workspace/GKV/src/edu/asu/msse/gkv/GKV.g:40:16: ( ( DECIMAL | INTEGER ) )
			// /home/gowtham/CompilerDesign/workspace/GKV/src/edu/asu/msse/gkv/GKV.g:40:18: ( DECIMAL | INTEGER )
			{
			// /home/gowtham/CompilerDesign/workspace/GKV/src/edu/asu/msse/gkv/GKV.g:40:18: ( DECIMAL | INTEGER )
			int alt1=2;
			alt1 = dfa1.predict(input);
			switch (alt1) {
				case 1 :
					// /home/gowtham/CompilerDesign/workspace/GKV/src/edu/asu/msse/gkv/GKV.g:40:19: DECIMAL
					{
					mDECIMAL(); 

					}
					break;
				case 2 :
					// /home/gowtham/CompilerDesign/workspace/GKV/src/edu/asu/msse/gkv/GKV.g:40:29: INTEGER
					{
					mINTEGER(); 

					}
					break;

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NUMERIC_LITERAL"

	// $ANTLR start "DECIMAL"
	public final void mDECIMAL() throws RecognitionException {
		try {
			// /home/gowtham/CompilerDesign/workspace/GKV/src/edu/asu/msse/gkv/GKV.g:41:17: ( ( ( '+' | '-' )? ( '0' .. '9' )+ '.' ( '0' .. '9' )+ ) )
			// /home/gowtham/CompilerDesign/workspace/GKV/src/edu/asu/msse/gkv/GKV.g:41:18: ( ( '+' | '-' )? ( '0' .. '9' )+ '.' ( '0' .. '9' )+ )
			{
			// /home/gowtham/CompilerDesign/workspace/GKV/src/edu/asu/msse/gkv/GKV.g:41:18: ( ( '+' | '-' )? ( '0' .. '9' )+ '.' ( '0' .. '9' )+ )
			// /home/gowtham/CompilerDesign/workspace/GKV/src/edu/asu/msse/gkv/GKV.g:41:19: ( '+' | '-' )? ( '0' .. '9' )+ '.' ( '0' .. '9' )+
			{
			// /home/gowtham/CompilerDesign/workspace/GKV/src/edu/asu/msse/gkv/GKV.g:41:19: ( '+' | '-' )?
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0=='+'||LA2_0=='-') ) {
				alt2=1;
			}
			switch (alt2) {
				case 1 :
					// /home/gowtham/CompilerDesign/workspace/GKV/src/edu/asu/msse/gkv/GKV.g:
					{
					if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

			}

			// /home/gowtham/CompilerDesign/workspace/GKV/src/edu/asu/msse/gkv/GKV.g:41:29: ( '0' .. '9' )+
			int cnt3=0;
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( ((LA3_0 >= '0' && LA3_0 <= '9')) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// /home/gowtham/CompilerDesign/workspace/GKV/src/edu/asu/msse/gkv/GKV.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt3 >= 1 ) break loop3;
					EarlyExitException eee = new EarlyExitException(3, input);
					throw eee;
				}
				cnt3++;
			}

			match('.'); 
			// /home/gowtham/CompilerDesign/workspace/GKV/src/edu/asu/msse/gkv/GKV.g:41:43: ( '0' .. '9' )+
			int cnt4=0;
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( ((LA4_0 >= '0' && LA4_0 <= '9')) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// /home/gowtham/CompilerDesign/workspace/GKV/src/edu/asu/msse/gkv/GKV.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt4 >= 1 ) break loop4;
					EarlyExitException eee = new EarlyExitException(4, input);
					throw eee;
				}
				cnt4++;
			}

			}

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DECIMAL"

	// $ANTLR start "INTEGER"
	public final void mINTEGER() throws RecognitionException {
		try {
			// /home/gowtham/CompilerDesign/workspace/GKV/src/edu/asu/msse/gkv/GKV.g:42:17: ( ( ( '+' | '-' )? ( '0' .. '9' )+ ) )
			// /home/gowtham/CompilerDesign/workspace/GKV/src/edu/asu/msse/gkv/GKV.g:42:19: ( ( '+' | '-' )? ( '0' .. '9' )+ )
			{
			// /home/gowtham/CompilerDesign/workspace/GKV/src/edu/asu/msse/gkv/GKV.g:42:19: ( ( '+' | '-' )? ( '0' .. '9' )+ )
			// /home/gowtham/CompilerDesign/workspace/GKV/src/edu/asu/msse/gkv/GKV.g:42:20: ( '+' | '-' )? ( '0' .. '9' )+
			{
			// /home/gowtham/CompilerDesign/workspace/GKV/src/edu/asu/msse/gkv/GKV.g:42:20: ( '+' | '-' )?
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0=='+'||LA5_0=='-') ) {
				alt5=1;
			}
			switch (alt5) {
				case 1 :
					// /home/gowtham/CompilerDesign/workspace/GKV/src/edu/asu/msse/gkv/GKV.g:
					{
					if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

			}

			// /home/gowtham/CompilerDesign/workspace/GKV/src/edu/asu/msse/gkv/GKV.g:42:30: ( '0' .. '9' )+
			int cnt6=0;
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( ((LA6_0 >= '0' && LA6_0 <= '9')) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// /home/gowtham/CompilerDesign/workspace/GKV/src/edu/asu/msse/gkv/GKV.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt6 >= 1 ) break loop6;
					EarlyExitException eee = new EarlyExitException(6, input);
					throw eee;
				}
				cnt6++;
			}

			}

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INTEGER"

	// $ANTLR start "BOOLEAN"
	public final void mBOOLEAN() throws RecognitionException {
		try {
			int _type = BOOLEAN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/gowtham/CompilerDesign/workspace/GKV/src/edu/asu/msse/gkv/GKV.g:43:8: ( ( 'true' | 'false' ) )
			// /home/gowtham/CompilerDesign/workspace/GKV/src/edu/asu/msse/gkv/GKV.g:43:10: ( 'true' | 'false' )
			{
			// /home/gowtham/CompilerDesign/workspace/GKV/src/edu/asu/msse/gkv/GKV.g:43:10: ( 'true' | 'false' )
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0=='t') ) {
				alt7=1;
			}
			else if ( (LA7_0=='f') ) {
				alt7=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 7, 0, input);
				throw nvae;
			}

			switch (alt7) {
				case 1 :
					// /home/gowtham/CompilerDesign/workspace/GKV/src/edu/asu/msse/gkv/GKV.g:43:11: 'true'
					{
					match("true"); 

					}
					break;
				case 2 :
					// /home/gowtham/CompilerDesign/workspace/GKV/src/edu/asu/msse/gkv/GKV.g:43:20: 'false'
					{
					match("false"); 

					}
					break;

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BOOLEAN"

	// $ANTLR start "DATATYPE"
	public final void mDATATYPE() throws RecognitionException {
		try {
			int _type = DATATYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/gowtham/CompilerDesign/workspace/GKV/src/edu/asu/msse/gkv/GKV.g:44:9: ( ( 'integer' | 'decimal' | 'boolean' ) )
			// /home/gowtham/CompilerDesign/workspace/GKV/src/edu/asu/msse/gkv/GKV.g:44:11: ( 'integer' | 'decimal' | 'boolean' )
			{
			// /home/gowtham/CompilerDesign/workspace/GKV/src/edu/asu/msse/gkv/GKV.g:44:11: ( 'integer' | 'decimal' | 'boolean' )
			int alt8=3;
			switch ( input.LA(1) ) {
			case 'i':
				{
				alt8=1;
				}
				break;
			case 'd':
				{
				alt8=2;
				}
				break;
			case 'b':
				{
				alt8=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				throw nvae;
			}
			switch (alt8) {
				case 1 :
					// /home/gowtham/CompilerDesign/workspace/GKV/src/edu/asu/msse/gkv/GKV.g:44:12: 'integer'
					{
					match("integer"); 

					}
					break;
				case 2 :
					// /home/gowtham/CompilerDesign/workspace/GKV/src/edu/asu/msse/gkv/GKV.g:44:24: 'decimal'
					{
					match("decimal"); 

					}
					break;
				case 3 :
					// /home/gowtham/CompilerDesign/workspace/GKV/src/edu/asu/msse/gkv/GKV.g:44:36: 'boolean'
					{
					match("boolean"); 

					}
					break;

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DATATYPE"

	// $ANTLR start "FK_CALL"
	public final void mFK_CALL() throws RecognitionException {
		try {
			int _type = FK_CALL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/gowtham/CompilerDesign/workspace/GKV/src/edu/asu/msse/gkv/GKV.g:46:8: ( 'call' )
			// /home/gowtham/CompilerDesign/workspace/GKV/src/edu/asu/msse/gkv/GKV.g:46:9: 'call'
			{
			match("call"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FK_CALL"

	// $ANTLR start "FK_WITH"
	public final void mFK_WITH() throws RecognitionException {
		try {
			int _type = FK_WITH;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/gowtham/CompilerDesign/workspace/GKV/src/edu/asu/msse/gkv/GKV.g:47:8: ( 'with' )
			// /home/gowtham/CompilerDesign/workspace/GKV/src/edu/asu/msse/gkv/GKV.g:47:10: 'with'
			{
			match("with"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FK_WITH"

	// $ANTLR start "COMMA"
	public final void mCOMMA() throws RecognitionException {
		try {
			int _type = COMMA;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/gowtham/CompilerDesign/workspace/GKV/src/edu/asu/msse/gkv/GKV.g:49:6: ( ',' )
			// /home/gowtham/CompilerDesign/workspace/GKV/src/edu/asu/msse/gkv/GKV.g:49:8: ','
			{
			match(','); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMA"

	// $ANTLR start "COMPK_KEYWORDS"
	public final void mCOMPK_KEYWORDS() throws RecognitionException {
		try {
			int _type = COMPK_KEYWORDS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/gowtham/CompilerDesign/workspace/GKV/src/edu/asu/msse/gkv/GKV.g:50:15: ( ( 'equalTo' | 'lessThan' | 'greaterThan' | 'lessThanOrEqualTo' | 'greateThanOrEqualTo' | 'notEqualTo' ) )
			// /home/gowtham/CompilerDesign/workspace/GKV/src/edu/asu/msse/gkv/GKV.g:50:17: ( 'equalTo' | 'lessThan' | 'greaterThan' | 'lessThanOrEqualTo' | 'greateThanOrEqualTo' | 'notEqualTo' )
			{
			// /home/gowtham/CompilerDesign/workspace/GKV/src/edu/asu/msse/gkv/GKV.g:50:17: ( 'equalTo' | 'lessThan' | 'greaterThan' | 'lessThanOrEqualTo' | 'greateThanOrEqualTo' | 'notEqualTo' )
			int alt9=6;
			switch ( input.LA(1) ) {
			case 'e':
				{
				alt9=1;
				}
				break;
			case 'l':
				{
				int LA9_2 = input.LA(2);
				if ( (LA9_2=='e') ) {
					int LA9_5 = input.LA(3);
					if ( (LA9_5=='s') ) {
						int LA9_7 = input.LA(4);
						if ( (LA9_7=='s') ) {
							int LA9_9 = input.LA(5);
							if ( (LA9_9=='T') ) {
								int LA9_11 = input.LA(6);
								if ( (LA9_11=='h') ) {
									int LA9_13 = input.LA(7);
									if ( (LA9_13=='a') ) {
										int LA9_15 = input.LA(8);
										if ( (LA9_15=='n') ) {
											int LA9_18 = input.LA(9);
											if ( (LA9_18=='O') ) {
												alt9=4;
											}

											else {
												alt9=2;
											}

										}

										else {
											int nvaeMark = input.mark();
											try {
												for (int nvaeConsume = 0; nvaeConsume < 8 - 1; nvaeConsume++) {
													input.consume();
												}
												NoViableAltException nvae =
													new NoViableAltException("", 9, 15, input);
												throw nvae;
											} finally {
												input.rewind(nvaeMark);
											}
										}

									}

									else {
										int nvaeMark = input.mark();
										try {
											for (int nvaeConsume = 0; nvaeConsume < 7 - 1; nvaeConsume++) {
												input.consume();
											}
											NoViableAltException nvae =
												new NoViableAltException("", 9, 13, input);
											throw nvae;
										} finally {
											input.rewind(nvaeMark);
										}
									}

								}

								else {
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
											input.consume();
										}
										NoViableAltException nvae =
											new NoViableAltException("", 9, 11, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

							}

							else {
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 9, 9, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}

						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 9, 7, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 9, 5, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 9, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 'g':
				{
				int LA9_3 = input.LA(2);
				if ( (LA9_3=='r') ) {
					int LA9_6 = input.LA(3);
					if ( (LA9_6=='e') ) {
						int LA9_8 = input.LA(4);
						if ( (LA9_8=='a') ) {
							int LA9_10 = input.LA(5);
							if ( (LA9_10=='t') ) {
								int LA9_12 = input.LA(6);
								if ( (LA9_12=='e') ) {
									int LA9_14 = input.LA(7);
									if ( (LA9_14=='r') ) {
										alt9=3;
									}
									else if ( (LA9_14=='T') ) {
										alt9=5;
									}

									else {
										int nvaeMark = input.mark();
										try {
											for (int nvaeConsume = 0; nvaeConsume < 7 - 1; nvaeConsume++) {
												input.consume();
											}
											NoViableAltException nvae =
												new NoViableAltException("", 9, 14, input);
											throw nvae;
										} finally {
											input.rewind(nvaeMark);
										}
									}

								}

								else {
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
											input.consume();
										}
										NoViableAltException nvae =
											new NoViableAltException("", 9, 12, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

							}

							else {
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 9, 10, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}

						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 9, 8, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 9, 6, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 9, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 'n':
				{
				alt9=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 9, 0, input);
				throw nvae;
			}
			switch (alt9) {
				case 1 :
					// /home/gowtham/CompilerDesign/workspace/GKV/src/edu/asu/msse/gkv/GKV.g:50:18: 'equalTo'
					{
					match("equalTo"); 

					}
					break;
				case 2 :
					// /home/gowtham/CompilerDesign/workspace/GKV/src/edu/asu/msse/gkv/GKV.g:50:30: 'lessThan'
					{
					match("lessThan"); 

					}
					break;
				case 3 :
					// /home/gowtham/CompilerDesign/workspace/GKV/src/edu/asu/msse/gkv/GKV.g:50:43: 'greaterThan'
					{
					match("greaterThan"); 

					}
					break;
				case 4 :
					// /home/gowtham/CompilerDesign/workspace/GKV/src/edu/asu/msse/gkv/GKV.g:50:59: 'lessThanOrEqualTo'
					{
					match("lessThanOrEqualTo"); 

					}
					break;
				case 5 :
					// /home/gowtham/CompilerDesign/workspace/GKV/src/edu/asu/msse/gkv/GKV.g:50:81: 'greateThanOrEqualTo'
					{
					match("greateThanOrEqualTo"); 

					}
					break;
				case 6 :
					// /home/gowtham/CompilerDesign/workspace/GKV/src/edu/asu/msse/gkv/GKV.g:50:105: 'notEqualTo'
					{
					match("notEqualTo"); 

					}
					break;

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMPK_KEYWORDS"

	// $ANTLR start "IDENTIFIER"
	public final void mIDENTIFIER() throws RecognitionException {
		try {
			int _type = IDENTIFIER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/gowtham/CompilerDesign/workspace/GKV/src/edu/asu/msse/gkv/GKV.g:51:12: ( ( 'a' .. 'z' | 'A' .. 'Z' )+ )
			// /home/gowtham/CompilerDesign/workspace/GKV/src/edu/asu/msse/gkv/GKV.g:51:14: ( 'a' .. 'z' | 'A' .. 'Z' )+
			{
			// /home/gowtham/CompilerDesign/workspace/GKV/src/edu/asu/msse/gkv/GKV.g:51:14: ( 'a' .. 'z' | 'A' .. 'Z' )+
			int cnt10=0;
			loop10:
			while (true) {
				int alt10=2;
				int LA10_0 = input.LA(1);
				if ( ((LA10_0 >= 'A' && LA10_0 <= 'Z')||(LA10_0 >= 'a' && LA10_0 <= 'z')) ) {
					alt10=1;
				}

				switch (alt10) {
				case 1 :
					// /home/gowtham/CompilerDesign/workspace/GKV/src/edu/asu/msse/gkv/GKV.g:
					{
					if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt10 >= 1 ) break loop10;
					EarlyExitException eee = new EarlyExitException(10, input);
					throw eee;
				}
				cnt10++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "IDENTIFIER"

	// $ANTLR start "ADDING_OPERATOR"
	public final void mADDING_OPERATOR() throws RecognitionException {
		try {
			int _type = ADDING_OPERATOR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/gowtham/CompilerDesign/workspace/GKV/src/edu/asu/msse/gkv/GKV.g:52:17: ( ( '+' | '-' ) )
			// /home/gowtham/CompilerDesign/workspace/GKV/src/edu/asu/msse/gkv/GKV.g:
			{
			if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ADDING_OPERATOR"

	// $ANTLR start "MULTIPLYING_OPERATOR"
	public final void mMULTIPLYING_OPERATOR() throws RecognitionException {
		try {
			int _type = MULTIPLYING_OPERATOR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/gowtham/CompilerDesign/workspace/GKV/src/edu/asu/msse/gkv/GKV.g:53:21: ( ( '*' | '/' ) )
			// /home/gowtham/CompilerDesign/workspace/GKV/src/edu/asu/msse/gkv/GKV.g:
			{
			if ( input.LA(1)=='*'||input.LA(1)=='/' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MULTIPLYING_OPERATOR"

	@Override
	public void mTokens() throws RecognitionException {
		// /home/gowtham/CompilerDesign/workspace/GKV/src/edu/asu/msse/gkv/GKV.g:1:8: ( T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | NUMERIC_LITERAL | BOOLEAN | DATATYPE | FK_CALL | FK_WITH | COMMA | COMPK_KEYWORDS | IDENTIFIER | ADDING_OPERATOR | MULTIPLYING_OPERATOR )
		int alt11=16;
		alt11 = dfa11.predict(input);
		switch (alt11) {
			case 1 :
				// /home/gowtham/CompilerDesign/workspace/GKV/src/edu/asu/msse/gkv/GKV.g:1:10: T__16
				{
				mT__16(); 

				}
				break;
			case 2 :
				// /home/gowtham/CompilerDesign/workspace/GKV/src/edu/asu/msse/gkv/GKV.g:1:16: T__17
				{
				mT__17(); 

				}
				break;
			case 3 :
				// /home/gowtham/CompilerDesign/workspace/GKV/src/edu/asu/msse/gkv/GKV.g:1:22: T__18
				{
				mT__18(); 

				}
				break;
			case 4 :
				// /home/gowtham/CompilerDesign/workspace/GKV/src/edu/asu/msse/gkv/GKV.g:1:28: T__19
				{
				mT__19(); 

				}
				break;
			case 5 :
				// /home/gowtham/CompilerDesign/workspace/GKV/src/edu/asu/msse/gkv/GKV.g:1:34: T__20
				{
				mT__20(); 

				}
				break;
			case 6 :
				// /home/gowtham/CompilerDesign/workspace/GKV/src/edu/asu/msse/gkv/GKV.g:1:40: T__21
				{
				mT__21(); 

				}
				break;
			case 7 :
				// /home/gowtham/CompilerDesign/workspace/GKV/src/edu/asu/msse/gkv/GKV.g:1:46: NUMERIC_LITERAL
				{
				mNUMERIC_LITERAL(); 

				}
				break;
			case 8 :
				// /home/gowtham/CompilerDesign/workspace/GKV/src/edu/asu/msse/gkv/GKV.g:1:62: BOOLEAN
				{
				mBOOLEAN(); 

				}
				break;
			case 9 :
				// /home/gowtham/CompilerDesign/workspace/GKV/src/edu/asu/msse/gkv/GKV.g:1:70: DATATYPE
				{
				mDATATYPE(); 

				}
				break;
			case 10 :
				// /home/gowtham/CompilerDesign/workspace/GKV/src/edu/asu/msse/gkv/GKV.g:1:79: FK_CALL
				{
				mFK_CALL(); 

				}
				break;
			case 11 :
				// /home/gowtham/CompilerDesign/workspace/GKV/src/edu/asu/msse/gkv/GKV.g:1:87: FK_WITH
				{
				mFK_WITH(); 

				}
				break;
			case 12 :
				// /home/gowtham/CompilerDesign/workspace/GKV/src/edu/asu/msse/gkv/GKV.g:1:95: COMMA
				{
				mCOMMA(); 

				}
				break;
			case 13 :
				// /home/gowtham/CompilerDesign/workspace/GKV/src/edu/asu/msse/gkv/GKV.g:1:101: COMPK_KEYWORDS
				{
				mCOMPK_KEYWORDS(); 

				}
				break;
			case 14 :
				// /home/gowtham/CompilerDesign/workspace/GKV/src/edu/asu/msse/gkv/GKV.g:1:116: IDENTIFIER
				{
				mIDENTIFIER(); 

				}
				break;
			case 15 :
				// /home/gowtham/CompilerDesign/workspace/GKV/src/edu/asu/msse/gkv/GKV.g:1:127: ADDING_OPERATOR
				{
				mADDING_OPERATOR(); 

				}
				break;
			case 16 :
				// /home/gowtham/CompilerDesign/workspace/GKV/src/edu/asu/msse/gkv/GKV.g:1:143: MULTIPLYING_OPERATOR
				{
				mMULTIPLYING_OPERATOR(); 

				}
				break;

		}
	}


	protected DFA1 dfa1 = new DFA1(this);
	protected DFA11 dfa11 = new DFA11(this);
	static final String DFA1_eotS =
		"\2\uffff\1\4\2\uffff";
	static final String DFA1_eofS =
		"\5\uffff";
	static final String DFA1_minS =
		"\1\53\1\60\1\56\2\uffff";
	static final String DFA1_maxS =
		"\3\71\2\uffff";
	static final String DFA1_acceptS =
		"\3\uffff\1\1\1\2";
	static final String DFA1_specialS =
		"\5\uffff}>";
	static final String[] DFA1_transitionS = {
			"\1\1\1\uffff\1\1\2\uffff\12\2",
			"\12\2",
			"\1\3\1\uffff\12\2",
			"",
			""
	};

	static final short[] DFA1_eot = DFA.unpackEncodedString(DFA1_eotS);
	static final short[] DFA1_eof = DFA.unpackEncodedString(DFA1_eofS);
	static final char[] DFA1_min = DFA.unpackEncodedStringToUnsignedChars(DFA1_minS);
	static final char[] DFA1_max = DFA.unpackEncodedStringToUnsignedChars(DFA1_maxS);
	static final short[] DFA1_accept = DFA.unpackEncodedString(DFA1_acceptS);
	static final short[] DFA1_special = DFA.unpackEncodedString(DFA1_specialS);
	static final short[][] DFA1_transition;

	static {
		int numStates = DFA1_transitionS.length;
		DFA1_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA1_transition[i] = DFA.unpackEncodedString(DFA1_transitionS[i]);
		}
	}

	protected class DFA1 extends DFA {

		public DFA1(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 1;
			this.eot = DFA1_eot;
			this.eof = DFA1_eof;
			this.min = DFA1_min;
			this.max = DFA1_max;
			this.accept = DFA1_accept;
			this.special = DFA1_special;
			this.transition = DFA1_transition;
		}
		@Override
		public String getDescription() {
			return "40:18: ( DECIMAL | INTEGER )";
		}
	}

	static final String DFA11_eotS =
		"\4\uffff\3\24\1\32\1\uffff\6\24\1\uffff\4\24\2\uffff\1\24\1\46\1\24\1"+
		"\50\1\uffff\12\24\1\63\1\uffff\1\24\1\uffff\12\24\1\uffff\1\24\1\100\3"+
		"\24\1\104\1\105\5\24\1\uffff\1\100\2\24\2\uffff\13\24\3\131\1\132\4\24"+
		"\2\uffff\1\132\12\24\1\132\1\24\1\132\13\24\1\132\2\24\1\132";
	static final String DFA11_eofS =
		"\170\uffff";
	static final String DFA11_minS =
		"\1\12\3\uffff\2\156\1\162\1\60\1\uffff\1\162\1\141\1\145\1\157\1\141\1"+
		"\151\1\uffff\1\161\1\145\1\162\1\157\2\uffff\1\144\1\101\1\164\1\101\1"+
		"\uffff\1\165\1\154\1\143\1\157\1\154\1\164\1\165\1\163\1\145\1\164\1\101"+
		"\1\uffff\1\145\1\uffff\1\145\1\163\1\151\2\154\1\150\1\141\1\163\1\141"+
		"\1\105\1\uffff\1\147\1\101\1\145\1\155\1\145\2\101\1\154\1\124\1\164\1"+
		"\161\1\145\1\uffff\1\101\2\141\2\uffff\1\124\1\150\1\145\1\165\1\162\1"+
		"\154\1\156\1\157\1\141\1\124\1\141\4\101\1\156\1\124\1\150\1\154\2\uffff"+
		"\1\101\1\150\1\141\1\124\1\162\1\141\1\156\1\157\1\105\1\156\1\117\1\101"+
		"\1\161\1\101\1\162\1\165\1\105\1\141\1\161\1\154\1\165\1\124\1\141\1\157"+
		"\1\154\1\101\1\124\1\157\1\101";
	static final String DFA11_maxS =
		"\1\172\3\uffff\1\156\1\163\1\162\1\71\1\uffff\1\162\1\141\1\145\1\157"+
		"\1\141\1\151\1\uffff\1\161\1\145\1\162\1\157\2\uffff\1\144\1\172\1\164"+
		"\1\172\1\uffff\1\165\1\154\1\143\1\157\1\154\1\164\1\165\1\163\1\145\1"+
		"\164\1\172\1\uffff\1\145\1\uffff\1\145\1\163\1\151\2\154\1\150\1\141\1"+
		"\163\1\141\1\105\1\uffff\1\147\1\172\1\145\1\155\1\145\2\172\1\154\1\124"+
		"\1\164\1\161\1\145\1\uffff\1\172\2\141\2\uffff\1\124\1\150\1\145\1\165"+
		"\1\162\1\154\1\156\1\157\1\141\1\162\1\141\4\172\1\156\1\124\1\150\1\154"+
		"\2\uffff\1\172\1\150\1\141\1\124\1\162\1\141\1\156\1\157\1\105\1\156\1"+
		"\117\1\172\1\161\1\172\1\162\1\165\1\105\1\141\1\161\1\154\1\165\1\124"+
		"\1\141\1\157\1\154\1\172\1\124\1\157\1\172";
	static final String DFA11_acceptS =
		"\1\uffff\1\1\1\2\1\3\4\uffff\1\7\6\uffff\1\14\4\uffff\1\16\1\20\4\uffff"+
		"\1\17\13\uffff\1\5\1\uffff\1\6\12\uffff\1\4\14\uffff\1\10\3\uffff\1\12"+
		"\1\13\23\uffff\1\11\1\15\35\uffff";
	static final String DFA11_specialS =
		"\170\uffff}>";
	static final String[] DFA11_transitionS = {
			"\1\3\35\uffff\1\1\1\2\1\25\1\7\1\17\1\7\1\uffff\1\25\12\10\7\uffff\32"+
			"\24\6\uffff\1\4\1\14\1\15\1\13\1\20\1\12\1\22\1\24\1\5\2\24\1\21\1\24"+
			"\1\23\1\6\4\24\1\11\2\24\1\16\3\24",
			"",
			"",
			"",
			"\1\26",
			"\1\30\4\uffff\1\27",
			"\1\31",
			"\12\10",
			"",
			"\1\33",
			"\1\34",
			"\1\35",
			"\1\36",
			"\1\37",
			"\1\40",
			"",
			"\1\41",
			"\1\42",
			"\1\43",
			"\1\44",
			"",
			"",
			"\1\45",
			"\32\24\6\uffff\32\24",
			"\1\47",
			"\32\24\6\uffff\32\24",
			"",
			"\1\51",
			"\1\52",
			"\1\53",
			"\1\54",
			"\1\55",
			"\1\56",
			"\1\57",
			"\1\60",
			"\1\61",
			"\1\62",
			"\32\24\6\uffff\32\24",
			"",
			"\1\64",
			"",
			"\1\65",
			"\1\66",
			"\1\67",
			"\1\70",
			"\1\71",
			"\1\72",
			"\1\73",
			"\1\74",
			"\1\75",
			"\1\76",
			"",
			"\1\77",
			"\32\24\6\uffff\32\24",
			"\1\101",
			"\1\102",
			"\1\103",
			"\32\24\6\uffff\32\24",
			"\32\24\6\uffff\32\24",
			"\1\106",
			"\1\107",
			"\1\110",
			"\1\111",
			"\1\112",
			"",
			"\32\24\6\uffff\32\24",
			"\1\113",
			"\1\114",
			"",
			"",
			"\1\115",
			"\1\116",
			"\1\117",
			"\1\120",
			"\1\121",
			"\1\122",
			"\1\123",
			"\1\124",
			"\1\125",
			"\1\127\35\uffff\1\126",
			"\1\130",
			"\32\24\6\uffff\32\24",
			"\32\24\6\uffff\32\24",
			"\32\24\6\uffff\32\24",
			"\32\24\6\uffff\32\24",
			"\1\133",
			"\1\134",
			"\1\135",
			"\1\136",
			"",
			"",
			"\16\24\1\137\13\24\6\uffff\32\24",
			"\1\140",
			"\1\141",
			"\1\142",
			"\1\143",
			"\1\144",
			"\1\145",
			"\1\146",
			"\1\147",
			"\1\150",
			"\1\151",
			"\32\24\6\uffff\32\24",
			"\1\152",
			"\32\24\6\uffff\32\24",
			"\1\153",
			"\1\154",
			"\1\155",
			"\1\156",
			"\1\157",
			"\1\160",
			"\1\161",
			"\1\162",
			"\1\163",
			"\1\164",
			"\1\165",
			"\32\24\6\uffff\32\24",
			"\1\166",
			"\1\167",
			"\32\24\6\uffff\32\24"
	};

	static final short[] DFA11_eot = DFA.unpackEncodedString(DFA11_eotS);
	static final short[] DFA11_eof = DFA.unpackEncodedString(DFA11_eofS);
	static final char[] DFA11_min = DFA.unpackEncodedStringToUnsignedChars(DFA11_minS);
	static final char[] DFA11_max = DFA.unpackEncodedStringToUnsignedChars(DFA11_maxS);
	static final short[] DFA11_accept = DFA.unpackEncodedString(DFA11_acceptS);
	static final short[] DFA11_special = DFA.unpackEncodedString(DFA11_specialS);
	static final short[][] DFA11_transition;

	static {
		int numStates = DFA11_transitionS.length;
		DFA11_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA11_transition[i] = DFA.unpackEncodedString(DFA11_transitionS[i]);
		}
	}

	protected class DFA11 extends DFA {

		public DFA11(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 11;
			this.eot = DFA11_eot;
			this.eof = DFA11_eof;
			this.min = DFA11_min;
			this.max = DFA11_max;
			this.accept = DFA11_accept;
			this.special = DFA11_special;
			this.transition = DFA11_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | NUMERIC_LITERAL | BOOLEAN | DATATYPE | FK_CALL | FK_WITH | COMMA | COMPK_KEYWORDS | IDENTIFIER | ADDING_OPERATOR | MULTIPLYING_OPERATOR );";
		}
	}

}
