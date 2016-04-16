grammar GKV;

options {
  language = Java;
}

@parser:: header {
  package edu.asu.msse.gkv;
}

@lexer::header {
  package edu.asu.msse.gkv;
}

program : 
          (sequenceOfStatements | function)+;
          
sequenceOfStatements: (simpleStatement | compoundStatement)+; 

simpleStatement: (assignmentStatement | declarationStatement | functionCall | display)? ';';

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
 
factor : (INTEGER | DECIMAL | IDENTIFIER | '(' expression ')');

declarationStatement: (datatype IDENTIFIER (COMMA IDENTIFIER)*| datatype IDENTIFIER 'is' expression (COMMA IDENTIFIER 'is' expression)*) ;

functionCall: FK_CALL IDENTIFIER (FK_WITH parameters)?;

parameters: expression (COMMA expression)*;

function :
          FK_FUNCTION IDENTIFIER (FK_USES datatype IDENTIFIER (COMMA datatype IDENTIFIER)*)? FK_RETURNS datatype
          O_BRACE 
          sequenceOfStatements
          FK_RETURN expression ';'
          C_BRACE
          ;
          
display: 'show' (STRING_LITERAL | INTEGER | DECIMAL | IDENTIFIER);

INTEGER: (('+'|'-')? NUMBER+);
DECIMAL:(('+'|'-')? NUMBER'.'NUMBER+);

STRING_LITERAL
    : '"' 
       {StringBuilder sb = new StringBuilder();}
       ( c = ~('"' | '\n' | '\r') {sb.appendCodePodatatypeint(c);})*
      '"'
      {setText(sb.toString();}
    ;
 
fragment NUMBER: ('0'..'9');

BOOLEAN: ('true' | 'false');
datatype: ('integer' | 'decimal' | 'boolean');

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