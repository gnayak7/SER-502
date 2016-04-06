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

rule: IDENTIFIER+;
IDENTIFIER : 'a'..'z'+;
WHITESPACE: ' '+ {$channel = HIDDEN;};