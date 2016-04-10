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
          (sequenceOfStatements | function)+;
          
sequenceOfStatements: (simpleStatement | compoundStatement)+; 

simpleStatement: (assignmentStatement | declarationStatement | functionCall)? ';';

compoundStatement: ifStatement | loop;

assignmentStatement: IDENTIFIER 'is' expression;

ifStatement : CK_IF condition CK_THEN O_BRACE 
              sequenceOfStatements 
              C_BRACE (CK_ELSE O_BRACE sequenceOfStatements C_BRACE)?
              ; 
              
loop: 'while' condition O_BRACE  sequenceOfStatements C_BRACE;
      
condition: expression;

expression : relation ('and' relation | 'or' relation)*;

relation: simpleExpression (COMPK_KEYWORDS simpleExpression)?;

simpleExpression: term (ADDING_OPERATOR term)*;

term: factor (MULTIPLYING_OPERATOR factor)*; 

factor : (NUMERIC_LITERAL | IDENTIFIER | '(' expression ')');

declarationStatement: (DATATYPE IDENTIFIER (COMMA IDENTIFIER)*| DATATYPE IDENTIFIER 'is' expression (COMMA IDENTIFIER 'is' expression)*) ;

functionCall: FK_CALL IDENTIFIER (FK_WITH parameters)?;

parameters: expression (COMMA expression)*;

function :
          FK_FUNCTION IDENTIFIER (FK_USES DATATYPE IDENTIFIER (COMMA DATATYPE IDENTIFIER)*)? FK_RETURNS DATATYPE
          O_BRACE 
          sequenceOfStatements
          (FK_RETURN expression ';')?
          C_BRACE
          ;

NUMERIC_LITERAL: (DECIMAL | INTEGER); 
fragment DECIMAL:(('+'|'-')?('0'..'9')+'.'('0'..'9')+);
fragment INTEGER: (('+'|'-')?('0'..'9')+);
fragment NUMBER: ('0'..'9')+;
BOOLEAN: ('true' | 'false');
DATATYPE: ('integer' | 'decimal' | 'boolean');

FK_FUNCTION : 'function';
FK_USES : 'uses';
FK_RETURNS : 'returns';
FK_RETURN : 'return';

O_BRACE : '{';
C_BRACE : '}';

CK_IF : 'if';
CK_ELSE : 'else';
CK_THEN : 'then';
CK_ELSIF : 'elsif';

FK_CALL:'call';
FK_WITH: 'with';

COMMA: ',';
COMPK_KEYWORDS: ('equalTo' | 'lessThan' | 'greaterThan' | 'lessThanOrEqualTo' | 'greateThanOrEqualTo' | 'notEqualTo');
IDENTIFIER : ('a'..'z'| 'A'..'Z')+;
ADDING_OPERATOR : ('+' | '-');
MULTIPLYING_OPERATOR: ('*' | '/');
WHITESPACE : (' ' | '\t' | '\r' | '\n' |'\f')+ {$channel = HIDDEN;};