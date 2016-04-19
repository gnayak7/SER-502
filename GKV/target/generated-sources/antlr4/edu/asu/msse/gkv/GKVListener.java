// Generated from GKV.g4 by ANTLR 4.5.3

  package edu.asu.msse.gkv;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GKVParser}.
 */
public interface GKVListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GKVParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(GKVParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link GKVParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(GKVParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link GKVParser#sequenceOfStatements}.
	 * @param ctx the parse tree
	 */
	void enterSequenceOfStatements(GKVParser.SequenceOfStatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GKVParser#sequenceOfStatements}.
	 * @param ctx the parse tree
	 */
	void exitSequenceOfStatements(GKVParser.SequenceOfStatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GKVParser#simpleStatement}.
	 * @param ctx the parse tree
	 */
	void enterSimpleStatement(GKVParser.SimpleStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GKVParser#simpleStatement}.
	 * @param ctx the parse tree
	 */
	void exitSimpleStatement(GKVParser.SimpleStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GKVParser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void enterCompoundStatement(GKVParser.CompoundStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GKVParser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void exitCompoundStatement(GKVParser.CompoundStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GKVParser#assignmentStatement}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentStatement(GKVParser.AssignmentStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GKVParser#assignmentStatement}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentStatement(GKVParser.AssignmentStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GKVParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(GKVParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GKVParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(GKVParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GKVParser#loop}.
	 * @param ctx the parse tree
	 */
	void enterLoop(GKVParser.LoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link GKVParser#loop}.
	 * @param ctx the parse tree
	 */
	void exitLoop(GKVParser.LoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link GKVParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(GKVParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GKVParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(GKVParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GKVParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(GKVParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GKVParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(GKVParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GKVParser#relation}.
	 * @param ctx the parse tree
	 */
	void enterRelation(GKVParser.RelationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GKVParser#relation}.
	 * @param ctx the parse tree
	 */
	void exitRelation(GKVParser.RelationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GKVParser#simpleExpression}.
	 * @param ctx the parse tree
	 */
	void enterSimpleExpression(GKVParser.SimpleExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GKVParser#simpleExpression}.
	 * @param ctx the parse tree
	 */
	void exitSimpleExpression(GKVParser.SimpleExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GKVParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(GKVParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link GKVParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(GKVParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link GKVParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(GKVParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link GKVParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(GKVParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link GKVParser#declarationStatement}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationStatement(GKVParser.DeclarationStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GKVParser#declarationStatement}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationStatement(GKVParser.DeclarationStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GKVParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(GKVParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link GKVParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(GKVParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link GKVParser#parameters}.
	 * @param ctx the parse tree
	 */
	void enterParameters(GKVParser.ParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link GKVParser#parameters}.
	 * @param ctx the parse tree
	 */
	void exitParameters(GKVParser.ParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link GKVParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(GKVParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GKVParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(GKVParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GKVParser#display}.
	 * @param ctx the parse tree
	 */
	void enterDisplay(GKVParser.DisplayContext ctx);
	/**
	 * Exit a parse tree produced by {@link GKVParser#display}.
	 * @param ctx the parse tree
	 */
	void exitDisplay(GKVParser.DisplayContext ctx);
	/**
	 * Enter a parse tree produced by {@link GKVParser#datatype}.
	 * @param ctx the parse tree
	 */
	void enterDatatype(GKVParser.DatatypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GKVParser#datatype}.
	 * @param ctx the parse tree
	 */
	void exitDatatype(GKVParser.DatatypeContext ctx);
}