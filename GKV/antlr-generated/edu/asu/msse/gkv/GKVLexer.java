// $ANTLR 3.5.2 /home/gowtham/CompilerDesign/workspace/GKV/src/edu/asu/msse/gkv/GKV.g 2016-04-06 01:45:25

  package edu.asu.msse.gkv;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class GKVLexer extends Lexer {
	public static final int EOF=-1;
	public static final int T__8=8;
	public static final int T__9=9;
	public static final int T__10=10;
	public static final int T__11=11;
	public static final int T__12=12;
	public static final int COMMA=4;
	public static final int DATATYPE=5;
	public static final int IDENTIFIER=6;
	public static final int WHITESPAE=7;

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

	// $ANTLR start "T__8"
	public final void mT__8() throws RecognitionException {
		try {
			int _type = T__8;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/gowtham/CompilerDesign/workspace/GKV/src/edu/asu/msse/gkv/GKV.g:11:6: ( 'function' )
			// /home/gowtham/CompilerDesign/workspace/GKV/src/edu/asu/msse/gkv/GKV.g:11:8: 'function'
			{
			match("function"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__8"

	// $ANTLR start "T__9"
	public final void mT__9() throws RecognitionException {
		try {
			int _type = T__9;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/gowtham/CompilerDesign/workspace/GKV/src/edu/asu/msse/gkv/GKV.g:12:6: ( 'returns' )
			// /home/gowtham/CompilerDesign/workspace/GKV/src/edu/asu/msse/gkv/GKV.g:12:8: 'returns'
			{
			match("returns"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__9"

	// $ANTLR start "T__10"
	public final void mT__10() throws RecognitionException {
		try {
			int _type = T__10;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/gowtham/CompilerDesign/workspace/GKV/src/edu/asu/msse/gkv/GKV.g:13:7: ( 'uses' )
			// /home/gowtham/CompilerDesign/workspace/GKV/src/edu/asu/msse/gkv/GKV.g:13:9: 'uses'
			{
			match("uses"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__10"

	// $ANTLR start "T__11"
	public final void mT__11() throws RecognitionException {
		try {
			int _type = T__11;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/gowtham/CompilerDesign/workspace/GKV/src/edu/asu/msse/gkv/GKV.g:14:7: ( '{' )
			// /home/gowtham/CompilerDesign/workspace/GKV/src/edu/asu/msse/gkv/GKV.g:14:9: '{'
			{
			match('{'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__11"

	// $ANTLR start "T__12"
	public final void mT__12() throws RecognitionException {
		try {
			int _type = T__12;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/gowtham/CompilerDesign/workspace/GKV/src/edu/asu/msse/gkv/GKV.g:15:7: ( '}' )
			// /home/gowtham/CompilerDesign/workspace/GKV/src/edu/asu/msse/gkv/GKV.g:15:9: '}'
			{
			match('}'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__12"

	// $ANTLR start "DATATYPE"
	public final void mDATATYPE() throws RecognitionException {
		try {
			int _type = DATATYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/gowtham/CompilerDesign/workspace/GKV/src/edu/asu/msse/gkv/GKV.g:22:10: ( ( 'integer' | 'decimal' | 'boolean' | 'string' ) )
			// /home/gowtham/CompilerDesign/workspace/GKV/src/edu/asu/msse/gkv/GKV.g:22:12: ( 'integer' | 'decimal' | 'boolean' | 'string' )
			{
			// /home/gowtham/CompilerDesign/workspace/GKV/src/edu/asu/msse/gkv/GKV.g:22:12: ( 'integer' | 'decimal' | 'boolean' | 'string' )
			int alt1=4;
			switch ( input.LA(1) ) {
			case 'i':
				{
				alt1=1;
				}
				break;
			case 'd':
				{
				alt1=2;
				}
				break;
			case 'b':
				{
				alt1=3;
				}
				break;
			case 's':
				{
				alt1=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				throw nvae;
			}
			switch (alt1) {
				case 1 :
					// /home/gowtham/CompilerDesign/workspace/GKV/src/edu/asu/msse/gkv/GKV.g:22:13: 'integer'
					{
					match("integer"); 

					}
					break;
				case 2 :
					// /home/gowtham/CompilerDesign/workspace/GKV/src/edu/asu/msse/gkv/GKV.g:22:25: 'decimal'
					{
					match("decimal"); 

					}
					break;
				case 3 :
					// /home/gowtham/CompilerDesign/workspace/GKV/src/edu/asu/msse/gkv/GKV.g:22:37: 'boolean'
					{
					match("boolean"); 

					}
					break;
				case 4 :
					// /home/gowtham/CompilerDesign/workspace/GKV/src/edu/asu/msse/gkv/GKV.g:22:49: 'string'
					{
					match("string"); 

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

	// $ANTLR start "IDENTIFIER"
	public final void mIDENTIFIER() throws RecognitionException {
		try {
			int _type = IDENTIFIER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/gowtham/CompilerDesign/workspace/GKV/src/edu/asu/msse/gkv/GKV.g:23:12: ( ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )* )
			// /home/gowtham/CompilerDesign/workspace/GKV/src/edu/asu/msse/gkv/GKV.g:23:14: ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )*
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// /home/gowtham/CompilerDesign/workspace/GKV/src/edu/asu/msse/gkv/GKV.g:23:35: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= '0' && LA2_0 <= '9')||(LA2_0 >= 'A' && LA2_0 <= 'Z')||(LA2_0 >= 'a' && LA2_0 <= 'z')) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// /home/gowtham/CompilerDesign/workspace/GKV/src/edu/asu/msse/gkv/GKV.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
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
					break loop2;
				}
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

	// $ANTLR start "WHITESPAE"
	public final void mWHITESPAE() throws RecognitionException {
		try {
			int _type = WHITESPAE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/gowtham/CompilerDesign/workspace/GKV/src/edu/asu/msse/gkv/GKV.g:24:11: ( ( ' ' | '\\t' | '\\r' | '\\n' | '\\f' )+ )
			// /home/gowtham/CompilerDesign/workspace/GKV/src/edu/asu/msse/gkv/GKV.g:24:13: ( ' ' | '\\t' | '\\r' | '\\n' | '\\f' )+
			{
			// /home/gowtham/CompilerDesign/workspace/GKV/src/edu/asu/msse/gkv/GKV.g:24:13: ( ' ' | '\\t' | '\\r' | '\\n' | '\\f' )+
			int cnt3=0;
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( ((LA3_0 >= '\t' && LA3_0 <= '\n')||(LA3_0 >= '\f' && LA3_0 <= '\r')||LA3_0==' ') ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// /home/gowtham/CompilerDesign/workspace/GKV/src/edu/asu/msse/gkv/GKV.g:
					{
					if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||(input.LA(1) >= '\f' && input.LA(1) <= '\r')||input.LA(1)==' ' ) {
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

			_channel = HIDDEN;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WHITESPAE"

	// $ANTLR start "COMMA"
	public final void mCOMMA() throws RecognitionException {
		try {
			int _type = COMMA;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/gowtham/CompilerDesign/workspace/GKV/src/edu/asu/msse/gkv/GKV.g:25:7: ( ',' )
			// /home/gowtham/CompilerDesign/workspace/GKV/src/edu/asu/msse/gkv/GKV.g:25:9: ','
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

	@Override
	public void mTokens() throws RecognitionException {
		// /home/gowtham/CompilerDesign/workspace/GKV/src/edu/asu/msse/gkv/GKV.g:1:8: ( T__8 | T__9 | T__10 | T__11 | T__12 | DATATYPE | IDENTIFIER | WHITESPAE | COMMA )
		int alt4=9;
		switch ( input.LA(1) ) {
		case 'f':
			{
			int LA4_1 = input.LA(2);
			if ( (LA4_1=='u') ) {
				int LA4_13 = input.LA(3);
				if ( (LA4_13=='n') ) {
					int LA4_20 = input.LA(4);
					if ( (LA4_20=='c') ) {
						int LA4_27 = input.LA(5);
						if ( (LA4_27=='t') ) {
							int LA4_34 = input.LA(6);
							if ( (LA4_34=='i') ) {
								int LA4_41 = input.LA(7);
								if ( (LA4_41=='o') ) {
									int LA4_47 = input.LA(8);
									if ( (LA4_47=='n') ) {
										int LA4_53 = input.LA(9);
										if ( ((LA4_53 >= '0' && LA4_53 <= '9')||(LA4_53 >= 'A' && LA4_53 <= 'Z')||(LA4_53 >= 'a' && LA4_53 <= 'z')) ) {
											alt4=7;
										}

										else {
											alt4=1;
										}

									}

									else {
										alt4=7;
									}

								}

								else {
									alt4=7;
								}

							}

							else {
								alt4=7;
							}

						}

						else {
							alt4=7;
						}

					}

					else {
						alt4=7;
					}

				}

				else {
					alt4=7;
				}

			}

			else {
				alt4=7;
			}

			}
			break;
		case 'r':
			{
			int LA4_2 = input.LA(2);
			if ( (LA4_2=='e') ) {
				int LA4_14 = input.LA(3);
				if ( (LA4_14=='t') ) {
					int LA4_21 = input.LA(4);
					if ( (LA4_21=='u') ) {
						int LA4_28 = input.LA(5);
						if ( (LA4_28=='r') ) {
							int LA4_35 = input.LA(6);
							if ( (LA4_35=='n') ) {
								int LA4_42 = input.LA(7);
								if ( (LA4_42=='s') ) {
									int LA4_48 = input.LA(8);
									if ( ((LA4_48 >= '0' && LA4_48 <= '9')||(LA4_48 >= 'A' && LA4_48 <= 'Z')||(LA4_48 >= 'a' && LA4_48 <= 'z')) ) {
										alt4=7;
									}

									else {
										alt4=2;
									}

								}

								else {
									alt4=7;
								}

							}

							else {
								alt4=7;
							}

						}

						else {
							alt4=7;
						}

					}

					else {
						alt4=7;
					}

				}

				else {
					alt4=7;
				}

			}

			else {
				alt4=7;
			}

			}
			break;
		case 'u':
			{
			int LA4_3 = input.LA(2);
			if ( (LA4_3=='s') ) {
				int LA4_15 = input.LA(3);
				if ( (LA4_15=='e') ) {
					int LA4_22 = input.LA(4);
					if ( (LA4_22=='s') ) {
						int LA4_29 = input.LA(5);
						if ( ((LA4_29 >= '0' && LA4_29 <= '9')||(LA4_29 >= 'A' && LA4_29 <= 'Z')||(LA4_29 >= 'a' && LA4_29 <= 'z')) ) {
							alt4=7;
						}

						else {
							alt4=3;
						}

					}

					else {
						alt4=7;
					}

				}

				else {
					alt4=7;
				}

			}

			else {
				alt4=7;
			}

			}
			break;
		case '{':
			{
			alt4=4;
			}
			break;
		case '}':
			{
			alt4=5;
			}
			break;
		case 'i':
			{
			int LA4_6 = input.LA(2);
			if ( (LA4_6=='n') ) {
				int LA4_16 = input.LA(3);
				if ( (LA4_16=='t') ) {
					int LA4_23 = input.LA(4);
					if ( (LA4_23=='e') ) {
						int LA4_30 = input.LA(5);
						if ( (LA4_30=='g') ) {
							int LA4_37 = input.LA(6);
							if ( (LA4_37=='e') ) {
								int LA4_43 = input.LA(7);
								if ( (LA4_43=='r') ) {
									int LA4_49 = input.LA(8);
									if ( ((LA4_49 >= '0' && LA4_49 <= '9')||(LA4_49 >= 'A' && LA4_49 <= 'Z')||(LA4_49 >= 'a' && LA4_49 <= 'z')) ) {
										alt4=7;
									}

									else {
										alt4=6;
									}

								}

								else {
									alt4=7;
								}

							}

							else {
								alt4=7;
							}

						}

						else {
							alt4=7;
						}

					}

					else {
						alt4=7;
					}

				}

				else {
					alt4=7;
				}

			}

			else {
				alt4=7;
			}

			}
			break;
		case 'd':
			{
			int LA4_7 = input.LA(2);
			if ( (LA4_7=='e') ) {
				int LA4_17 = input.LA(3);
				if ( (LA4_17=='c') ) {
					int LA4_24 = input.LA(4);
					if ( (LA4_24=='i') ) {
						int LA4_31 = input.LA(5);
						if ( (LA4_31=='m') ) {
							int LA4_38 = input.LA(6);
							if ( (LA4_38=='a') ) {
								int LA4_44 = input.LA(7);
								if ( (LA4_44=='l') ) {
									int LA4_50 = input.LA(8);
									if ( ((LA4_50 >= '0' && LA4_50 <= '9')||(LA4_50 >= 'A' && LA4_50 <= 'Z')||(LA4_50 >= 'a' && LA4_50 <= 'z')) ) {
										alt4=7;
									}

									else {
										alt4=6;
									}

								}

								else {
									alt4=7;
								}

							}

							else {
								alt4=7;
							}

						}

						else {
							alt4=7;
						}

					}

					else {
						alt4=7;
					}

				}

				else {
					alt4=7;
				}

			}

			else {
				alt4=7;
			}

			}
			break;
		case 'b':
			{
			int LA4_8 = input.LA(2);
			if ( (LA4_8=='o') ) {
				int LA4_18 = input.LA(3);
				if ( (LA4_18=='o') ) {
					int LA4_25 = input.LA(4);
					if ( (LA4_25=='l') ) {
						int LA4_32 = input.LA(5);
						if ( (LA4_32=='e') ) {
							int LA4_39 = input.LA(6);
							if ( (LA4_39=='a') ) {
								int LA4_45 = input.LA(7);
								if ( (LA4_45=='n') ) {
									int LA4_51 = input.LA(8);
									if ( ((LA4_51 >= '0' && LA4_51 <= '9')||(LA4_51 >= 'A' && LA4_51 <= 'Z')||(LA4_51 >= 'a' && LA4_51 <= 'z')) ) {
										alt4=7;
									}

									else {
										alt4=6;
									}

								}

								else {
									alt4=7;
								}

							}

							else {
								alt4=7;
							}

						}

						else {
							alt4=7;
						}

					}

					else {
						alt4=7;
					}

				}

				else {
					alt4=7;
				}

			}

			else {
				alt4=7;
			}

			}
			break;
		case 's':
			{
			int LA4_9 = input.LA(2);
			if ( (LA4_9=='t') ) {
				int LA4_19 = input.LA(3);
				if ( (LA4_19=='r') ) {
					int LA4_26 = input.LA(4);
					if ( (LA4_26=='i') ) {
						int LA4_33 = input.LA(5);
						if ( (LA4_33=='n') ) {
							int LA4_40 = input.LA(6);
							if ( (LA4_40=='g') ) {
								int LA4_46 = input.LA(7);
								if ( ((LA4_46 >= '0' && LA4_46 <= '9')||(LA4_46 >= 'A' && LA4_46 <= 'Z')||(LA4_46 >= 'a' && LA4_46 <= 'z')) ) {
									alt4=7;
								}

								else {
									alt4=6;
								}

							}

							else {
								alt4=7;
							}

						}

						else {
							alt4=7;
						}

					}

					else {
						alt4=7;
					}

				}

				else {
					alt4=7;
				}

			}

			else {
				alt4=7;
			}

			}
			break;
		case 'A':
		case 'B':
		case 'C':
		case 'D':
		case 'E':
		case 'F':
		case 'G':
		case 'H':
		case 'I':
		case 'J':
		case 'K':
		case 'L':
		case 'M':
		case 'N':
		case 'O':
		case 'P':
		case 'Q':
		case 'R':
		case 'S':
		case 'T':
		case 'U':
		case 'V':
		case 'W':
		case 'X':
		case 'Y':
		case 'Z':
		case 'a':
		case 'c':
		case 'e':
		case 'g':
		case 'h':
		case 'j':
		case 'k':
		case 'l':
		case 'm':
		case 'n':
		case 'o':
		case 'p':
		case 'q':
		case 't':
		case 'v':
		case 'w':
		case 'x':
		case 'y':
		case 'z':
			{
			alt4=7;
			}
			break;
		case '\t':
		case '\n':
		case '\f':
		case '\r':
		case ' ':
			{
			alt4=8;
			}
			break;
		case ',':
			{
			alt4=9;
			}
			break;
		default:
			NoViableAltException nvae =
				new NoViableAltException("", 4, 0, input);
			throw nvae;
		}
		switch (alt4) {
			case 1 :
				// /home/gowtham/CompilerDesign/workspace/GKV/src/edu/asu/msse/gkv/GKV.g:1:10: T__8
				{
				mT__8(); 

				}
				break;
			case 2 :
				// /home/gowtham/CompilerDesign/workspace/GKV/src/edu/asu/msse/gkv/GKV.g:1:15: T__9
				{
				mT__9(); 

				}
				break;
			case 3 :
				// /home/gowtham/CompilerDesign/workspace/GKV/src/edu/asu/msse/gkv/GKV.g:1:20: T__10
				{
				mT__10(); 

				}
				break;
			case 4 :
				// /home/gowtham/CompilerDesign/workspace/GKV/src/edu/asu/msse/gkv/GKV.g:1:26: T__11
				{
				mT__11(); 

				}
				break;
			case 5 :
				// /home/gowtham/CompilerDesign/workspace/GKV/src/edu/asu/msse/gkv/GKV.g:1:32: T__12
				{
				mT__12(); 

				}
				break;
			case 6 :
				// /home/gowtham/CompilerDesign/workspace/GKV/src/edu/asu/msse/gkv/GKV.g:1:38: DATATYPE
				{
				mDATATYPE(); 

				}
				break;
			case 7 :
				// /home/gowtham/CompilerDesign/workspace/GKV/src/edu/asu/msse/gkv/GKV.g:1:47: IDENTIFIER
				{
				mIDENTIFIER(); 

				}
				break;
			case 8 :
				// /home/gowtham/CompilerDesign/workspace/GKV/src/edu/asu/msse/gkv/GKV.g:1:58: WHITESPAE
				{
				mWHITESPAE(); 

				}
				break;
			case 9 :
				// /home/gowtham/CompilerDesign/workspace/GKV/src/edu/asu/msse/gkv/GKV.g:1:68: COMMA
				{
				mCOMMA(); 

				}
				break;

		}
	}



}
