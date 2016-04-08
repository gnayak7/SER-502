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

program: 
        (sequenceOfStatements| function)+
        ;

function :
          FK_FUNCTION IDENTIFIER (FK_USES DATATYPE IDENTIFIER (COMMA DATATYPE IDENTIFIER)*)? FK_RETURNS DATATYPE
          O_BRACE 
        
          C_BRACE
          ;
if : CK_IF (IDENTIFIER | NUMERIC_LITERAL) COMPK_KEYWORDS (IDENTIFIER | NUMERIC_LITERAL) 

; 

sequenceOfStatements: statement+;

statement: (simpleStatement | compoundStatement);
          
simpleStatement: (declarationStatement | assignmentStatement | functionCall);

assignmentStatement: (declarationStatement AK_IS expression | IDENTIFIER AK_IS expression) ;

functionCall: (FK_CALL IDENTIFIER (FK_WITH parameters)?);

parameters: expression (COMMA expression)*;

expression: relation (LK_AND relation | LK_OR relation)*;



relation: simpleExpression (COMPK_KEYWORDS simpleExpression)?;

simpleExpression: () 


compoundStatement: (if | loop);

loop:;
   
declarationStatement: DATATYPE IDENTIFIER;

FK_FUNCTION : 'function';
FK_USES : 'uses';
FK_RETURNS : 'returns';
O_BRACE : '{';
C_BRACE : '}';
FK_RETURN : 'return';

FK_CALL:'call';
FK_WITH: 'with';

CK_IF : 'if';
CK_ELSE : 'else';
CK_THEN : 'then';
 
LK_REPEAT : 'repeat';
LK_FROM : 'from';
LK_TO : 'to';
LK_STEPBY : 'stepBy';

AK_IS: 'is';

COMPK_KEYWORDS: ('equalTo' | 'lessThan' | 'greaterThan' | 'lessThanOrEqualTo' | 'greateThanOrEqualTo' | 'notEqualTo'); 

fragment DECIMAL:('+'|'-')? ('0'..'9')+ '.' ('0'..'9')+;
fragment INTEGER: ('+'|'-')?  ('0'..'9')+;

LK_AND: 'and';
LK_OR: 'or';

DATATYPE : ('integer' | 'decimal' | 'boolean' | 'string');
NUMERIC_LITERAL: (DECIMAL | INTEGER); 
IDENTIFIER : ('a'..'z' | 'A'..'Z')('a'..'z' | 'A'..'Z' | '0'..'9')*;
WHITESPAE : (' ' | '\t' | '\r' | '\n' | '\f')+ {$channel = HIDDEN;};
COMMA : ',';

