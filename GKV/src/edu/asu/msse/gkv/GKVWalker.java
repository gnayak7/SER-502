package edu.asu.msse.gkv;

/**
 * Copyright 2016 Gowtham Ganesh Nayak,
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Purpose: 
 *
 * SER502 Principle of Programming Paradigms
 * see http://gowthamnayak.in/compilers
 *
 * @author Gowtham Ganesh Nayak mailto:gnayak2@asu.edu
 * @version April 2016
 */

import java.io.PrintWriter;
import java.util.Iterator;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

public class GKVWalker extends GKVBaseListener {
	
	/*
	 * Using StringBuilder instead of StringBuffer because its fast but
	 * not thread safe. Thread Safety is not a concern in our program
	 * because we are not making use of threads in the program. This
	 * StringBuilder holds the intermediate language representation of 
	 * the High Level Language defined in the program.
	 */
	public StringBuilder stringBuilder;
	public final String WHITESPACE = " ";
	
	/**
	 * Constructor for the walker.
	 */
	public GKVWalker() {
		this.stringBuilder = new StringBuilder();
	}
	
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterProgram(GKVParser.ProgramContext ctx) { }
	
	/**
	 *	Keep building the StringBuilder. Before exiting write the contents
	 *  of the StringBuffer to a file.
	 */
	@Override public void exitProgram(GKVParser.ProgramContext ctx) { 
		String intermediateProgram = stringBuilder.toString();
		System.out.print(" Inside Exit Program \n ");
		try {
			PrintWriter writer = new PrintWriter(Constants.INTERMEDIATE_LANGUAGE_FILE_NAME, Constants.ENCODING);
			writer.write(intermediateProgram);
			writer.close();
		} catch (Exception e){
			System.out.println(this.getClass().getSimpleName() + " Exception writing to file : " + Constants.INTERMEDIATE_LANGUAGE_FILE_NAME);
		}
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterSequenceOfStatements(GKVParser.SequenceOfStatementsContext ctx) { 
		
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitSequenceOfStatements(GKVParser.SequenceOfStatementsContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterSimpleStatement(GKVParser.SimpleStatementContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitSimpleStatement(GKVParser.SimpleStatementContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterCompoundStatement(GKVParser.CompoundStatementContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitCompoundStatement(GKVParser.CompoundStatementContext ctx) { }
	
	
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterAssignmentStatement(GKVParser.AssignmentStatementContext ctx) { 
		System.out.println(" Inside Assignment Entry \n");
		
		// Evaluate the expression and get the result 
		// The do the below with result
		 System.out.println("I am in expression block");
		stringBuilder.append("SET ");
		stringBuilder.append(ctx.IDENTIFIER().getText().toUpperCase() + " ");
		stringBuilder.append(ctx.expression().getText() + "\n");
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitAssignmentStatement(GKVParser.AssignmentStatementContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterIfStatement(GKVParser.IfStatementContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitIfStatement(GKVParser.IfStatementContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterLoop(GKVParser.LoopContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitLoop(GKVParser.LoopContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterCondition(GKVParser.ConditionContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitCondition(GKVParser.ConditionContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterExpression(GKVParser.ExpressionContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitExpression(GKVParser.ExpressionContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterRelation(GKVParser.RelationContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitRelation(GKVParser.RelationContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterSimpleExpression(GKVParser.SimpleExpressionContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitSimpleExpression(GKVParser.SimpleExpressionContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterTerm(GKVParser.TermContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitTerm(GKVParser.TermContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterFactor(GKVParser.FactorContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitFactor(GKVParser.FactorContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterDeclarationStatement(GKVParser.DeclarationStatementContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitDeclarationStatement(GKVParser.DeclarationStatementContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterFunctionCall(GKVParser.FunctionCallContext ctx) {
		
		
		
		
	}
	
	@Override public void exitFunctionCall(GKVParser.FunctionCallContext ctx) { 
		
	}
	
	@Override public void enterIdList(GKVParser.IdListContext ctx) { 
		int parameterCount = ctx.IDENTIFIER().size();
		
		if (parameterCount == 1) {
			stringBuilder.append(ctx.DATATYPE(0).getText().toUpperCase() + WHITESPACE);
			stringBuilder.append(ctx.IDENTIFIER(0).getText().toUpperCase() + WHITESPACE);
		} else if (parameterCount > 1) {
			Iterator<TerminalNode> idIterator = ctx.IDENTIFIER().iterator();
			Iterator<TerminalNode> datatypeIterator = ctx.DATATYPE().iterator();
			boolean hasNext = false;
			do {
				stringBuilder.append(datatypeIterator.next().getText().toUpperCase() + WHITESPACE);
				stringBuilder.append(idIterator.next().getText().toUpperCase() + WHITESPACE);
				hasNext = idIterator.hasNext();
				// can add the has next checking for datatype.
				if (hasNext) {
					stringBuilder.append(",");
				}
			} while (hasNext);
		}
		stringBuilder.append("{");
	}

	@Override public void exitIdList(GKVParser.IdListContext ctx) { }
	
	@Override public void enterParameters(GKVParser.ParametersContext ctx) { 
		
	}

	@Override public void exitParameters(GKVParser.ParametersContext ctx) { }
	
	@Override public void enterFunction(GKVParser.FunctionContext ctx) { 
		stringBuilder.append("PROCEDURE ");
		stringBuilder.append(ctx.DATATYPE().getText().toUpperCase() + WHITESPACE);
		stringBuilder.append(ctx.IDENTIFIER().getText().toUpperCase() + " ");
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitFunction(GKVParser.FunctionContext ctx) { 
		stringBuilder.append("\n}\r\n");
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterDisplay(GKVParser.DisplayContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitDisplay(GKVParser.DisplayContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterEveryRule(ParserRuleContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitEveryRule(ParserRuleContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void visitTerminal(TerminalNode node) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void visitErrorNode(ErrorNode node) { }
}
