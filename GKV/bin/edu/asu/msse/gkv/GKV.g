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

function :
        'function' IDENTIFIER ('uses' DATATYPE IDENTIFIER (COMMA DATATYPE IDENTIFIER)*)? 'returns' DATATYPE
        '{'
             .*
        '}'
        ;

DATATYPE : ('integer' | 'decimal' | 'boolean' | 'string');
IDENTIFIER : ('a'..'z' | 'A'..'Z')('a'..'z' | 'A'..'Z' | '0'..'9')*;
WHITESPAE : (' ' | '\t' | '\r' | '\n' | '\f')+ {$channel = HIDDEN;};
COMMA : ',';
 

