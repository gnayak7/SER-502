grammar GKV;

options {
  language = Java;
}

@header {
  package edu.asu.msse.gkv;
}

@lexer::header {
  package edu.asu.msse.gkv;
}

program : 
          sequenceOfStatements;
          
sequenceOfStatements: simpleStatement+;

simpleStatement: (assignmentStatement | declarationStatement | functionCall) ('\n')?;

assignmentStatement: IDENTIFIER 'is' expression;

expression : relation ('and' relation | 'or' relation)*;

relation: simpleExpression (COMPK_KEYWORDS simpleExpression)?;

simpleExpression: term (ADDING_OPERATOR term)*;

term: factor (MULTIPLYING_OPERATOR factor)*; 

factor : (NUMERIC_LITERAL | IDENTIFIER | '(' expression ')');

declarationStatement: DATATYPE IDENTIFIER ;

functionCall: FK_CALL IDENTIFIER (FK_WITH parameters)?;

parameters: expression (COMMA expression)*;

NUMERIC_LITERAL: (DECIMAL | INTEGER); 
fragment DECIMAL:(('+'|'-')?('0'..'9')+'.'('0'..'9')+);
fragment INTEGER: (('+'|'-')?('0'..'9')+);
BOOLEAN: ('true' | 'false');
DATATYPE: ('integer' | 'decimal' | 'boolean');

FK_CALL:'call';
FK_WITH: 'with';

COMMA: ',';
COMPK_KEYWORDS: ('equalTo' | 'lessThan' | 'greaterThan' | 'lessThanOrEqualTo' | 'greateThanOrEqualTo' | 'notEqualTo');
IDENTIFIER : ('a'..'z'| 'A'..'Z')+;
ADDING_OPERATOR : ('+' | '-');
MULTIPLYING_OPERATOR: ('*' | '/');