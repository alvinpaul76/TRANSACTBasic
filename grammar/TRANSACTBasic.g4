grammar TRANSACTBasic;

// routine rules
routine
    : program
    | subroutine
    | function
    ;

statements
    : comments
    ;

headers
    : comments
    | componentPackage
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
    | FUNCTION functionName LPAREN ioVariables RPAREN NEWLINE
    ;

functionEnd
    : RETURN variable NEWLINE END (NEWLINE) ? EOF
    | RETURN LPAREN variable RPAREN NEWLINE END (NEWLINE) ? EOF
    ;

// common routine rules
componentPackage
    : PACKAGE packageName NEWLINE
    ;

packageName
    : IDENT
    ;

comments
    : (comment) *
    ;

comment
    : COMMENT
    ;

ioVariables
    : variable (COMMA variable) *
    ;

variables
    : variable (COMMA variable) *
    |
    ;

variable
    : IDENT
    | MAT variable
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

// common keywords
COMMENT
    : '*' ~[;\r\n] *
    ;

MAT
    : 'MAT'
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
