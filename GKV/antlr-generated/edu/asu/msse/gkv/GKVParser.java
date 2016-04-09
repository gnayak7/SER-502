// $ANTLR 3.5.2 /home/gowtham/CompilerDesign/workspace/GKV/src/edu/asu/msse/gkv/GKV.g 2016-04-08 22:53:06

  package edu.asu.msse.gkv;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class GKVParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ADDING_OPERATOR", "BOOLEAN", 
		"COMMA", "COMPK_KEYWORDS", "DATATYPE", "DECIMAL", "FK_CALL", "FK_WITH", 
		"IDENTIFIER", "INTEGER", "MULTIPLYING_OPERATOR", "NUMERIC_LITERAL", "'('", 
		"')'", "'\\n'", "'and'", "'is'", "'or'"
	};
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



	// $ANTLR start "program"
	// /home/gowtham/CompilerDesign/workspace/GKV/src/edu/asu/msse/gkv/GKV.g:15:1: program : sequenceOfStatements ;
	public final void program() throws RecognitionException {
		try {
			// /home/gowtham/CompilerDesign/workspace/GKV/src/edu/asu/msse/gkv/GKV.g:15:9: ( sequenceOfStatements )
			// /home/gowtham/CompilerDesign/workspace/GKV/src/edu/asu/msse/gkv/GKV.g:16:11: sequenceOfStatements
			{
			pushFollow(FOLLOW_sequenceOfStatements_in_program50);
			sequenceOfStatements();
			state._fsp--;

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
	// $ANTLR end "program"



	// $ANTLR start "sequenceOfStatements"
	// /home/gowtham/CompilerDesign/workspace/GKV/src/edu/asu/msse/gkv/GKV.g:18:1: sequenceOfStatements : ( simpleStatement )+ ;
	public final void sequenceOfStatements() throws RecognitionException {
		try {
			// /home/gowtham/CompilerDesign/workspace/GKV/src/edu/asu/msse/gkv/GKV.g:18:21: ( ( simpleStatement )+ )
			// /home/gowtham/CompilerDesign/workspace/GKV/src/edu/asu/msse/gkv/GKV.g:18:23: ( simpleStatement )+
			{
			// /home/gowtham/CompilerDesign/workspace/GKV/src/edu/asu/msse/gkv/GKV.g:18:23: ( simpleStatement )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==DATATYPE||LA1_0==FK_CALL||LA1_0==IDENTIFIER) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// /home/gowtham/CompilerDesign/workspace/GKV/src/edu/asu/msse/gkv/GKV.g:18:23: simpleStatement
					{
					pushFollow(FOLLOW_simpleStatement_in_sequenceOfStatements67);
					simpleStatement();
					state._fsp--;

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
	// $ANTLR end "sequenceOfStatements"



	// $ANTLR start "simpleStatement"
	// /home/gowtham/CompilerDesign/workspace/GKV/src/edu/asu/msse/gkv/GKV.g:20:1: simpleStatement : ( assignmentStatement | declarationStatement | functionCall ) ( '\\n' )? ;
	public final void simpleStatement() throws RecognitionException {
		try {
			// /home/gowtham/CompilerDesign/workspace/GKV/src/edu/asu/msse/gkv/GKV.g:20:16: ( ( assignmentStatement | declarationStatement | functionCall ) ( '\\n' )? )
			// /home/gowtham/CompilerDesign/workspace/GKV/src/edu/asu/msse/gkv/GKV.g:20:18: ( assignmentStatement | declarationStatement | functionCall ) ( '\\n' )?
			{
			// /home/gowtham/CompilerDesign/workspace/GKV/src/edu/asu/msse/gkv/GKV.g:20:18: ( assignmentStatement | declarationStatement | functionCall )
			int alt2=3;
			switch ( input.LA(1) ) {
			case IDENTIFIER:
				{
				alt2=1;
				}
				break;
			case DATATYPE:
				{
				alt2=2;
				}
				break;
			case FK_CALL:
				{
				alt2=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}
			switch (alt2) {
				case 1 :
					// /home/gowtham/CompilerDesign/workspace/GKV/src/edu/asu/msse/gkv/GKV.g:20:19: assignmentStatement
					{
					pushFollow(FOLLOW_assignmentStatement_in_simpleStatement76);
					assignmentStatement();
					state._fsp--;

					}
					break;
				case 2 :
					// /home/gowtham/CompilerDesign/workspace/GKV/src/edu/asu/msse/gkv/GKV.g:20:41: declarationStatement
					{
					pushFollow(FOLLOW_declarationStatement_in_simpleStatement80);
					declarationStatement();
					state._fsp--;

					}
					break;
				case 3 :
					// /home/gowtham/CompilerDesign/workspace/GKV/src/edu/asu/msse/gkv/GKV.g:20:64: functionCall
					{
					pushFollow(FOLLOW_functionCall_in_simpleStatement84);
					functionCall();
					state._fsp--;

					}
					break;

			}

			// /home/gowtham/CompilerDesign/workspace/GKV/src/edu/asu/msse/gkv/GKV.g:20:78: ( '\\n' )?
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==18) ) {
				alt3=1;
			}
			switch (alt3) {
				case 1 :
					// /home/gowtham/CompilerDesign/workspace/GKV/src/edu/asu/msse/gkv/GKV.g:20:79: '\\n'
					{
					match(input,18,FOLLOW_18_in_simpleStatement88); 
					}
					break;

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
	// $ANTLR end "simpleStatement"



	// $ANTLR start "assignmentStatement"
	// /home/gowtham/CompilerDesign/workspace/GKV/src/edu/asu/msse/gkv/GKV.g:22:1: assignmentStatement : IDENTIFIER 'is' expression ;
	public final void assignmentStatement() throws RecognitionException {
		try {
			// /home/gowtham/CompilerDesign/workspace/GKV/src/edu/asu/msse/gkv/GKV.g:22:20: ( IDENTIFIER 'is' expression )
			// /home/gowtham/CompilerDesign/workspace/GKV/src/edu/asu/msse/gkv/GKV.g:22:22: IDENTIFIER 'is' expression
			{
			match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_assignmentStatement97); 
			match(input,20,FOLLOW_20_in_assignmentStatement99); 
			pushFollow(FOLLOW_expression_in_assignmentStatement101);
			expression();
			state._fsp--;

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
	// $ANTLR end "assignmentStatement"



	// $ANTLR start "expression"
	// /home/gowtham/CompilerDesign/workspace/GKV/src/edu/asu/msse/gkv/GKV.g:24:1: expression : relation ( 'and' relation | 'or' relation )* ;
	public final void expression() throws RecognitionException {
		try {
			// /home/gowtham/CompilerDesign/workspace/GKV/src/edu/asu/msse/gkv/GKV.g:24:12: ( relation ( 'and' relation | 'or' relation )* )
			// /home/gowtham/CompilerDesign/workspace/GKV/src/edu/asu/msse/gkv/GKV.g:24:14: relation ( 'and' relation | 'or' relation )*
			{
			pushFollow(FOLLOW_relation_in_expression109);
			relation();
			state._fsp--;

			// /home/gowtham/CompilerDesign/workspace/GKV/src/edu/asu/msse/gkv/GKV.g:24:23: ( 'and' relation | 'or' relation )*
			loop4:
			while (true) {
				int alt4=3;
				int LA4_0 = input.LA(1);
				if ( (LA4_0==19) ) {
					alt4=1;
				}
				else if ( (LA4_0==21) ) {
					alt4=2;
				}

				switch (alt4) {
				case 1 :
					// /home/gowtham/CompilerDesign/workspace/GKV/src/edu/asu/msse/gkv/GKV.g:24:24: 'and' relation
					{
					match(input,19,FOLLOW_19_in_expression112); 
					pushFollow(FOLLOW_relation_in_expression114);
					relation();
					state._fsp--;

					}
					break;
				case 2 :
					// /home/gowtham/CompilerDesign/workspace/GKV/src/edu/asu/msse/gkv/GKV.g:24:41: 'or' relation
					{
					match(input,21,FOLLOW_21_in_expression118); 
					pushFollow(FOLLOW_relation_in_expression120);
					relation();
					state._fsp--;

					}
					break;

				default :
					break loop4;
				}
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
	// $ANTLR end "expression"



	// $ANTLR start "relation"
	// /home/gowtham/CompilerDesign/workspace/GKV/src/edu/asu/msse/gkv/GKV.g:26:1: relation : simpleExpression ( COMPK_KEYWORDS simpleExpression )? ;
	public final void relation() throws RecognitionException {
		try {
			// /home/gowtham/CompilerDesign/workspace/GKV/src/edu/asu/msse/gkv/GKV.g:26:9: ( simpleExpression ( COMPK_KEYWORDS simpleExpression )? )
			// /home/gowtham/CompilerDesign/workspace/GKV/src/edu/asu/msse/gkv/GKV.g:26:11: simpleExpression ( COMPK_KEYWORDS simpleExpression )?
			{
			pushFollow(FOLLOW_simpleExpression_in_relation129);
			simpleExpression();
			state._fsp--;

			// /home/gowtham/CompilerDesign/workspace/GKV/src/edu/asu/msse/gkv/GKV.g:26:28: ( COMPK_KEYWORDS simpleExpression )?
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==COMPK_KEYWORDS) ) {
				alt5=1;
			}
			switch (alt5) {
				case 1 :
					// /home/gowtham/CompilerDesign/workspace/GKV/src/edu/asu/msse/gkv/GKV.g:26:29: COMPK_KEYWORDS simpleExpression
					{
					match(input,COMPK_KEYWORDS,FOLLOW_COMPK_KEYWORDS_in_relation132); 
					pushFollow(FOLLOW_simpleExpression_in_relation134);
					simpleExpression();
					state._fsp--;

					}
					break;

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
	// $ANTLR end "relation"



	// $ANTLR start "simpleExpression"
	// /home/gowtham/CompilerDesign/workspace/GKV/src/edu/asu/msse/gkv/GKV.g:28:1: simpleExpression : term ( ADDING_OPERATOR term )* ;
	public final void simpleExpression() throws RecognitionException {
		try {
			// /home/gowtham/CompilerDesign/workspace/GKV/src/edu/asu/msse/gkv/GKV.g:28:17: ( term ( ADDING_OPERATOR term )* )
			// /home/gowtham/CompilerDesign/workspace/GKV/src/edu/asu/msse/gkv/GKV.g:28:19: term ( ADDING_OPERATOR term )*
			{
			pushFollow(FOLLOW_term_in_simpleExpression143);
			term();
			state._fsp--;

			// /home/gowtham/CompilerDesign/workspace/GKV/src/edu/asu/msse/gkv/GKV.g:28:24: ( ADDING_OPERATOR term )*
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( (LA6_0==ADDING_OPERATOR) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// /home/gowtham/CompilerDesign/workspace/GKV/src/edu/asu/msse/gkv/GKV.g:28:25: ADDING_OPERATOR term
					{
					match(input,ADDING_OPERATOR,FOLLOW_ADDING_OPERATOR_in_simpleExpression146); 
					pushFollow(FOLLOW_term_in_simpleExpression148);
					term();
					state._fsp--;

					}
					break;

				default :
					break loop6;
				}
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
	// $ANTLR end "simpleExpression"



	// $ANTLR start "term"
	// /home/gowtham/CompilerDesign/workspace/GKV/src/edu/asu/msse/gkv/GKV.g:30:1: term : factor ( MULTIPLYING_OPERATOR factor )* ;
	public final void term() throws RecognitionException {
		try {
			// /home/gowtham/CompilerDesign/workspace/GKV/src/edu/asu/msse/gkv/GKV.g:30:5: ( factor ( MULTIPLYING_OPERATOR factor )* )
			// /home/gowtham/CompilerDesign/workspace/GKV/src/edu/asu/msse/gkv/GKV.g:30:7: factor ( MULTIPLYING_OPERATOR factor )*
			{
			pushFollow(FOLLOW_factor_in_term157);
			factor();
			state._fsp--;

			// /home/gowtham/CompilerDesign/workspace/GKV/src/edu/asu/msse/gkv/GKV.g:30:14: ( MULTIPLYING_OPERATOR factor )*
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( (LA7_0==MULTIPLYING_OPERATOR) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// /home/gowtham/CompilerDesign/workspace/GKV/src/edu/asu/msse/gkv/GKV.g:30:15: MULTIPLYING_OPERATOR factor
					{
					match(input,MULTIPLYING_OPERATOR,FOLLOW_MULTIPLYING_OPERATOR_in_term160); 
					pushFollow(FOLLOW_factor_in_term162);
					factor();
					state._fsp--;

					}
					break;

				default :
					break loop7;
				}
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
	// $ANTLR end "term"



	// $ANTLR start "factor"
	// /home/gowtham/CompilerDesign/workspace/GKV/src/edu/asu/msse/gkv/GKV.g:32:1: factor : ( NUMERIC_LITERAL | IDENTIFIER | '(' expression ')' ) ;
	public final void factor() throws RecognitionException {
		try {
			// /home/gowtham/CompilerDesign/workspace/GKV/src/edu/asu/msse/gkv/GKV.g:32:8: ( ( NUMERIC_LITERAL | IDENTIFIER | '(' expression ')' ) )
			// /home/gowtham/CompilerDesign/workspace/GKV/src/edu/asu/msse/gkv/GKV.g:32:10: ( NUMERIC_LITERAL | IDENTIFIER | '(' expression ')' )
			{
			// /home/gowtham/CompilerDesign/workspace/GKV/src/edu/asu/msse/gkv/GKV.g:32:10: ( NUMERIC_LITERAL | IDENTIFIER | '(' expression ')' )
			int alt8=3;
			switch ( input.LA(1) ) {
			case NUMERIC_LITERAL:
				{
				alt8=1;
				}
				break;
			case IDENTIFIER:
				{
				alt8=2;
				}
				break;
			case 16:
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
					// /home/gowtham/CompilerDesign/workspace/GKV/src/edu/asu/msse/gkv/GKV.g:32:11: NUMERIC_LITERAL
					{
					match(input,NUMERIC_LITERAL,FOLLOW_NUMERIC_LITERAL_in_factor174); 
					}
					break;
				case 2 :
					// /home/gowtham/CompilerDesign/workspace/GKV/src/edu/asu/msse/gkv/GKV.g:32:29: IDENTIFIER
					{
					match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_factor178); 
					}
					break;
				case 3 :
					// /home/gowtham/CompilerDesign/workspace/GKV/src/edu/asu/msse/gkv/GKV.g:32:42: '(' expression ')'
					{
					match(input,16,FOLLOW_16_in_factor182); 
					pushFollow(FOLLOW_expression_in_factor184);
					expression();
					state._fsp--;

					match(input,17,FOLLOW_17_in_factor186); 
					}
					break;

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
	// $ANTLR end "factor"



	// $ANTLR start "declarationStatement"
	// /home/gowtham/CompilerDesign/workspace/GKV/src/edu/asu/msse/gkv/GKV.g:34:1: declarationStatement : DATATYPE IDENTIFIER ;
	public final void declarationStatement() throws RecognitionException {
		try {
			// /home/gowtham/CompilerDesign/workspace/GKV/src/edu/asu/msse/gkv/GKV.g:34:21: ( DATATYPE IDENTIFIER )
			// /home/gowtham/CompilerDesign/workspace/GKV/src/edu/asu/msse/gkv/GKV.g:34:23: DATATYPE IDENTIFIER
			{
			match(input,DATATYPE,FOLLOW_DATATYPE_in_declarationStatement194); 
			match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_declarationStatement196); 
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
	// $ANTLR end "declarationStatement"



	// $ANTLR start "functionCall"
	// /home/gowtham/CompilerDesign/workspace/GKV/src/edu/asu/msse/gkv/GKV.g:36:1: functionCall : FK_CALL IDENTIFIER ( FK_WITH parameters )? ;
	public final void functionCall() throws RecognitionException {
		try {
			// /home/gowtham/CompilerDesign/workspace/GKV/src/edu/asu/msse/gkv/GKV.g:36:13: ( FK_CALL IDENTIFIER ( FK_WITH parameters )? )
			// /home/gowtham/CompilerDesign/workspace/GKV/src/edu/asu/msse/gkv/GKV.g:36:15: FK_CALL IDENTIFIER ( FK_WITH parameters )?
			{
			match(input,FK_CALL,FOLLOW_FK_CALL_in_functionCall204); 
			match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_functionCall206); 
			// /home/gowtham/CompilerDesign/workspace/GKV/src/edu/asu/msse/gkv/GKV.g:36:34: ( FK_WITH parameters )?
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0==FK_WITH) ) {
				alt9=1;
			}
			switch (alt9) {
				case 1 :
					// /home/gowtham/CompilerDesign/workspace/GKV/src/edu/asu/msse/gkv/GKV.g:36:35: FK_WITH parameters
					{
					match(input,FK_WITH,FOLLOW_FK_WITH_in_functionCall209); 
					pushFollow(FOLLOW_parameters_in_functionCall211);
					parameters();
					state._fsp--;

					}
					break;

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
	// $ANTLR end "functionCall"



	// $ANTLR start "parameters"
	// /home/gowtham/CompilerDesign/workspace/GKV/src/edu/asu/msse/gkv/GKV.g:38:1: parameters : expression ( COMMA expression )* ;
	public final void parameters() throws RecognitionException {
		try {
			// /home/gowtham/CompilerDesign/workspace/GKV/src/edu/asu/msse/gkv/GKV.g:38:11: ( expression ( COMMA expression )* )
			// /home/gowtham/CompilerDesign/workspace/GKV/src/edu/asu/msse/gkv/GKV.g:38:13: expression ( COMMA expression )*
			{
			pushFollow(FOLLOW_expression_in_parameters220);
			expression();
			state._fsp--;

			// /home/gowtham/CompilerDesign/workspace/GKV/src/edu/asu/msse/gkv/GKV.g:38:24: ( COMMA expression )*
			loop10:
			while (true) {
				int alt10=2;
				int LA10_0 = input.LA(1);
				if ( (LA10_0==COMMA) ) {
					alt10=1;
				}

				switch (alt10) {
				case 1 :
					// /home/gowtham/CompilerDesign/workspace/GKV/src/edu/asu/msse/gkv/GKV.g:38:25: COMMA expression
					{
					match(input,COMMA,FOLLOW_COMMA_in_parameters223); 
					pushFollow(FOLLOW_expression_in_parameters225);
					expression();
					state._fsp--;

					}
					break;

				default :
					break loop10;
				}
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
	// $ANTLR end "parameters"

	// Delegated rules



	public static final BitSet FOLLOW_sequenceOfStatements_in_program50 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_simpleStatement_in_sequenceOfStatements67 = new BitSet(new long[]{0x0000000000001502L});
	public static final BitSet FOLLOW_assignmentStatement_in_simpleStatement76 = new BitSet(new long[]{0x0000000000040002L});
	public static final BitSet FOLLOW_declarationStatement_in_simpleStatement80 = new BitSet(new long[]{0x0000000000040002L});
	public static final BitSet FOLLOW_functionCall_in_simpleStatement84 = new BitSet(new long[]{0x0000000000040002L});
	public static final BitSet FOLLOW_18_in_simpleStatement88 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_assignmentStatement97 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_20_in_assignmentStatement99 = new BitSet(new long[]{0x0000000000019000L});
	public static final BitSet FOLLOW_expression_in_assignmentStatement101 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_relation_in_expression109 = new BitSet(new long[]{0x0000000000280002L});
	public static final BitSet FOLLOW_19_in_expression112 = new BitSet(new long[]{0x0000000000019000L});
	public static final BitSet FOLLOW_relation_in_expression114 = new BitSet(new long[]{0x0000000000280002L});
	public static final BitSet FOLLOW_21_in_expression118 = new BitSet(new long[]{0x0000000000019000L});
	public static final BitSet FOLLOW_relation_in_expression120 = new BitSet(new long[]{0x0000000000280002L});
	public static final BitSet FOLLOW_simpleExpression_in_relation129 = new BitSet(new long[]{0x0000000000000082L});
	public static final BitSet FOLLOW_COMPK_KEYWORDS_in_relation132 = new BitSet(new long[]{0x0000000000019000L});
	public static final BitSet FOLLOW_simpleExpression_in_relation134 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_term_in_simpleExpression143 = new BitSet(new long[]{0x0000000000000012L});
	public static final BitSet FOLLOW_ADDING_OPERATOR_in_simpleExpression146 = new BitSet(new long[]{0x0000000000019000L});
	public static final BitSet FOLLOW_term_in_simpleExpression148 = new BitSet(new long[]{0x0000000000000012L});
	public static final BitSet FOLLOW_factor_in_term157 = new BitSet(new long[]{0x0000000000004002L});
	public static final BitSet FOLLOW_MULTIPLYING_OPERATOR_in_term160 = new BitSet(new long[]{0x0000000000019000L});
	public static final BitSet FOLLOW_factor_in_term162 = new BitSet(new long[]{0x0000000000004002L});
	public static final BitSet FOLLOW_NUMERIC_LITERAL_in_factor174 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_factor178 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_16_in_factor182 = new BitSet(new long[]{0x0000000000019000L});
	public static final BitSet FOLLOW_expression_in_factor184 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_17_in_factor186 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DATATYPE_in_declarationStatement194 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_declarationStatement196 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FK_CALL_in_functionCall204 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_functionCall206 = new BitSet(new long[]{0x0000000000000802L});
	public static final BitSet FOLLOW_FK_WITH_in_functionCall209 = new BitSet(new long[]{0x0000000000019000L});
	public static final BitSet FOLLOW_parameters_in_functionCall211 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_parameters220 = new BitSet(new long[]{0x0000000000000042L});
	public static final BitSet FOLLOW_COMMA_in_parameters223 = new BitSet(new long[]{0x0000000000019000L});
	public static final BitSet FOLLOW_expression_in_parameters225 = new BitSet(new long[]{0x0000000000000042L});
}
