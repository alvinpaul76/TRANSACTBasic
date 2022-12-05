grammar TRANSACTBasic;

// routine rules
routine
    : program
    | subroutine
    | function
    ;

statements
    : (statement) *
    ;

statement
    : comment
    | insertStatement
    | matStatement
    | dimStatement
    ;

headers
    : comments
    | packageStatement
    ;

// program rules
program
    : (headers) ? programHeading (statements) ? programEnd
    ;

programName
    : IDENT
    ;

programHeading
    : PROGRAM programName NEWLINE
    ;

programEnd
    : STOP NEWLINE END (NEWLINE) ? EOF
    | END (NEWLINE) ? EOF
    ;

// subroutine rules
subroutine
    : subroutineHeading subroutineEnd
    ;

subroutineName
    : IDENT
    ;

subroutineHeading
    : SUBROUTINE subroutineName NEWLINE
    | SUBROUTINE subroutineName LPAREN variables RPAREN NEWLINE
    ;

subroutineEnd
    : RETURN NEWLINE END (NEWLINE) ? EOF
    | END (NEWLINE) ? EOF
    ;

// function rules
function
    : functionHeading functionEnd
    ;

functionName
    : IDENT
    ;

functionHeading
    : FUNCTION functionName NEWLINE
    | FUNCTION functionName LPAREN variables RPAREN NEWLINE
    ;

functionEnd
    : RETURN variable NEWLINE END (NEWLINE) ? EOF
    | RETURN LPAREN variable RPAREN NEWLINE END (NEWLINE) ? EOF
    ;

// common routine rules
insertStatement
    : INSERT insertFile NEWLINE
    ;

insertFile
    : IDENT
    ;

packageStatement
    : PACKAGE packageName NEWLINE
    ;

packageName
    : IDENT
    ;

comments
    : (comment) *
    ;

comment
    : COMMENT NEWLINE
    ;

variables
    : variable (COMMA variable) *
    |
    ;

variable
    : IDENT
    ;

dimStatement
    : DIM variable LPAREN dimArray RPAREN NEWLINE
    ;

dimArray 
    : integerValue (COMMA integerValue) *
    ;

matStatement
    : MAT variable NEWLINE
    ;

// numeric rules
numeric
    : (sign) ? integerValue
    | (sign) ? realValue
    ;

sign
    : POSITIVE
    | NEGATIVE
    ;

integerValue
    : INTEGER
    ;

realValue
    : REAL
    ;

// common routine keywords
PROGRAM
    : 'PROGRAM'
    ;

SUBROUTINE
    : 'SUB'
    | 'SUBROUTINE'
    ;

FUNCTION
    : 'FUNCTION'
    ;

RETURN
    : 'RETURN'
    ;

STOP
    : 'STOP'
    ;

END
    : 'END'
    ;

PACKAGE    
    : '$PACKAGE'
    ;

INSERT
    : 'INSERT'
    | '$INSERT'
    | 'INCLUDE'
    | '$INCLUDE'
    ;    

// numeric keywords
INTEGER
    : ('0'..'9') +
    ;

REAL
    : ('0'..'9') + (('.') ('0'..'9') + )
    ;

EQUALS
    : '='
    ;

POSITIVE
    : '+'
    ;

NEGATIVE
    : '-'
    ;

// common keywords
COMMENT
    : '*' ~[;\r\n] *
    ;

COMMA
    : ','
    ;

LPAREN
    : '('
    ;

DOT
    : '.'
    ;

RPAREN
    : ')'
    ;

NEWLINE
    : [;\r\n] +
    ;

IDENT
    : [a-zA-Z] [a-zA-Z0-9._$] *
    ;

WHITESPACE 
    : [ \t] -> skip
    ;

// TRANSACT keywords
DIM
    : 'DIM'
    | 'DIMENSION'
    ;

MAT
    : 'MAT'
    ;
