// $ANTLR 3.5.2 /home/gowtham/CompilerDesign/workspace/GKV/src/edu/asu/msse/gkv/GKV.g 2016-04-06 01:45:25

  package edu.asu.msse.gkv;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class GKVParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "COMMA", "DATATYPE", "IDENTIFIER", 
		"WHITESPAE", "'function'", "'returns'", "'uses'", "'{'", "'}'"
	};
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
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public GKVParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public GKVParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return GKVParser.tokenNames; }
	@Override public String getGrammarFileName() { return "/home/gowtham/CompilerDesign/workspace/GKV/src/edu/asu/msse/gkv/GKV.g"; }



	// $ANTLR start "function"
	// /home/gowtham/CompilerDesign/workspace/GKV/src/edu/asu/msse/gkv/GKV.g:15:1: function : 'function' IDENTIFIER ( 'uses' DATATYPE IDENTIFIER ( COMMA DATATYPE IDENTIFIER )* )? 'returns' DATATYPE '{' ( . )* '}' ;
	public final void function() throws RecognitionException {
		try {
			// /home/gowtham/CompilerDesign/workspace/GKV/src/edu/asu/msse/gkv/GKV.g:15:10: ( 'function' IDENTIFIER ( 'uses' DATATYPE IDENTIFIER ( COMMA DATATYPE IDENTIFIER )* )? 'returns' DATATYPE '{' ( . )* '}' )
			// /home/gowtham/CompilerDesign/workspace/GKV/src/edu/asu/msse/gkv/GKV.g:16:9: 'function' IDENTIFIER ( 'uses' DATATYPE IDENTIFIER ( COMMA DATATYPE IDENTIFIER )* )? 'returns' DATATYPE '{' ( . )* '}'
			{
			match(input,8,FOLLOW_8_in_function47); 
			match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_function49); 
			// /home/gowtham/CompilerDesign/workspace/GKV/src/edu/asu/msse/gkv/GKV.g:16:31: ( 'uses' DATATYPE IDENTIFIER ( COMMA DATATYPE IDENTIFIER )* )?
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==10) ) {
				alt2=1;
			}
			switch (alt2) {
				case 1 :
					// /home/gowtham/CompilerDesign/workspace/GKV/src/edu/asu/msse/gkv/GKV.g:16:32: 'uses' DATATYPE IDENTIFIER ( COMMA DATATYPE IDENTIFIER )*
					{
					match(input,10,FOLLOW_10_in_function52); 
					match(input,DATATYPE,FOLLOW_DATATYPE_in_function54); 
					match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_function56); 
					// /home/gowtham/CompilerDesign/workspace/GKV/src/edu/asu/msse/gkv/GKV.g:16:59: ( COMMA DATATYPE IDENTIFIER )*
					loop1:
					while (true) {
						int alt1=2;
						int LA1_0 = input.LA(1);
						if ( (LA1_0==COMMA) ) {
							alt1=1;
						}

						switch (alt1) {
						case 1 :
							// /home/gowtham/CompilerDesign/workspace/GKV/src/edu/asu/msse/gkv/GKV.g:16:60: COMMA DATATYPE IDENTIFIER
							{
							match(input,COMMA,FOLLOW_COMMA_in_function59); 
							match(input,DATATYPE,FOLLOW_DATATYPE_in_function61); 
							match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_function63); 
							}
							break;

						default :
							break loop1;
						}
					}

					}
					break;

			}

			match(input,9,FOLLOW_9_in_function69); 
			match(input,DATATYPE,FOLLOW_DATATYPE_in_function71); 
			match(input,11,FOLLOW_11_in_function81); 
			// /home/gowtham/CompilerDesign/workspace/GKV/src/edu/asu/msse/gkv/GKV.g:18:14: ( . )*
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( (LA3_0==12) ) {
					alt3=2;
				}
				else if ( ((LA3_0 >= COMMA && LA3_0 <= 11)) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// /home/gowtham/CompilerDesign/workspace/GKV/src/edu/asu/msse/gkv/GKV.g:18:14: .
					{
					matchAny(input); 
					}
					break;

				default :
					break loop3;
				}
			}

			match(input,12,FOLLOW_12_in_function107); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "function"

	// Delegated rules



	public static final BitSet FOLLOW_8_in_function47 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_IDENTIFIER_in_function49 = new BitSet(new long[]{0x0000000000000600L});
	public static final BitSet FOLLOW_10_in_function52 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_DATATYPE_in_function54 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_IDENTIFIER_in_function56 = new BitSet(new long[]{0x0000000000000210L});
	public static final BitSet FOLLOW_COMMA_in_function59 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_DATATYPE_in_function61 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_IDENTIFIER_in_function63 = new BitSet(new long[]{0x0000000000000210L});
	public static final BitSet FOLLOW_9_in_function69 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_DATATYPE_in_function71 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_function81 = new BitSet(new long[]{0x0000000000001FF0L});
	public static final BitSet FOLLOW_12_in_function107 = new BitSet(new long[]{0x0000000000000002L});
}
