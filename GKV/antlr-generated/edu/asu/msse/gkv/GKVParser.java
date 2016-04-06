// $ANTLR 3.5.2 /home/gowtham/CompilerDesign/workspace/GKV/src/edu/asu/msse/gkv/GKV.g 2016-04-05 23:15:43

  package edu.asu.msse.gkv;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class GKVParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "IDENTIFIER", "WHITESPACE"
	};
	public static final int EOF=-1;
	public static final int IDENTIFIER=4;
	public static final int WHITESPACE=5;

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



	// $ANTLR start "rule"
	// /home/gowtham/CompilerDesign/workspace/GKV/src/edu/asu/msse/gkv/GKV.g:15:1: rule : ( IDENTIFIER )+ ;
	public final void rule() throws RecognitionException {
		try {
			// /home/gowtham/CompilerDesign/workspace/GKV/src/edu/asu/msse/gkv/GKV.g:15:5: ( ( IDENTIFIER )+ )
			// /home/gowtham/CompilerDesign/workspace/GKV/src/edu/asu/msse/gkv/GKV.g:15:7: ( IDENTIFIER )+
			{
			// /home/gowtham/CompilerDesign/workspace/GKV/src/edu/asu/msse/gkv/GKV.g:15:7: ( IDENTIFIER )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==IDENTIFIER) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// /home/gowtham/CompilerDesign/workspace/GKV/src/edu/asu/msse/gkv/GKV.g:15:7: IDENTIFIER
					{
					match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_rule38); 
					}
					break;

				default :
					if ( cnt1 >= 1 ) break loop1;
					EarlyExitException eee = new EarlyExitException(1, input);
					throw eee;
				}
				cnt1++;
			}

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
	// $ANTLR end "rule"

	// Delegated rules



	public static final BitSet FOLLOW_IDENTIFIER_in_rule38 = new BitSet(new long[]{0x0000000000000012L});
}
