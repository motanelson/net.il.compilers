grammar il;

// ==========================
// Ponto de entrada
// ==========================
programa
    : (cabecalho | declaracaoClasse | metodo)* EOF
    ;

// ==========================
// Cabeçalho
// ==========================
cabecalho
    : '.assembly' ID '{' conteudoAssembly* '}'
    ;

conteudoAssembly
    : ID
    | NUMERO
    | STRING
    ;

// ==========================
// Classe
// ==========================
declaracaoClasse
    : '.class' 'public'? ID '{' (campo | metodo)* '}'
    ;

// ==========================
// Campo
// ==========================
campo
    : '.field' 'public' tipo ID ';'
    ;

// ==========================
// Método
// ==========================
metodo
    : '.method' ('public' | 'private')? tipo ID '(' parametroLista? ')' blocoMetodo
    ;

blocoMetodo
    : '{' diretivaMetodo* instrucao* '}'
    ;

// Diretivas tipo .entrypoint, .locals
diretivaMetodo
    : '.entrypoint'
    | '.locals' '(' declaracaoLocal (',' declaracaoLocal)* ')'
    ;

declaracaoLocal
    : tipo ID
    ;

// ==========================
// Parâmetros
// ==========================
parametroLista
    : parametro (',' parametro)*
    ;

parametro
    : tipo ID
    ;

// ==========================
// Instruções
// ==========================
instrucao
    : label
    | branch
    | chamadaMetodo
    | instrucaoStack
    | operadorBinario
    | retorno
    ;

// ==========================
// Labels e Branches
// ==========================
label
    : ID ':'
    ;

branch
    : ('br' | 'brtrue' | 'brfalse') ID ';'
    ;

// ==========================
// Stack (IL realista)
// ==========================
instrucaoStack
    : 'ldloc' NUMERO ';'
    | 'stloc' NUMERO ';'
    | 'ldarg' '.' NUMERO ';'
    | 'ldc' NUMERO ';'
    | 'dup' ';'
    | 'pop' ';'
    ;

// ==========================
// Operações
// ==========================
operadorBinario
    : ('add' | 'sub' | 'mul' | 'div') ';'
    ;

// ==========================
// Chamadas de método
// ==========================
chamadaMetodo
    : 'call' tipo nomeMetodo '(' argumentoLista? ')' ';'
    | 'callvirt' tipo nomeMetodo '(' argumentoLista? ')' ';'
    ;

chamadaMetodoExpr
    : 'call' tipo nomeMetodo '(' argumentoLista? ')'
    | 'callvirt' tipo nomeMetodo '(' argumentoLista? ')'
    ;

// Nome qualificado (Console::WriteLine)
nomeMetodo
    : ID ('::' ID)*
    ;

// ==========================
// Retorno
// ==========================
retorno
    : 'ret' ';'
    ;

// ==========================
// Argumentos
// ==========================
argumentoLista
    : expressao (',' expressao)*
    ;

// ==========================
// Expressões
// ==========================
expressao
    : chamadaMetodoExpr
    | ID
    | NUMERO
    ;

// ==========================
// Tipos
// ==========================
tipo
    : 'int32'
    | 'float32'
    | 'bool'
    | 'string'
    | 'void'
    | ID
    ;

// ==========================
// Tokens
// ==========================
ID
    : [a-zA-Z_][a-zA-Z_0-9]*
    ;

NUMERO
    : [0-9]+
    ;

STRING
    : '"' (~["\r\n])* '"'
    ;

WS
    : [ \t\r\n]+ -> skip
    ;
