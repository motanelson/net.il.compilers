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
    : '.method' ('public' | 'private')? tipo ID '(' parametroLista? ')' '{' instrucao* '}'
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
    : chamadaMetodo
    | atribuicao
    | operadorBinario
    | retorno
    | carregarConstante
    | acessoArgumento
    ;
// ==========================
// Chamada de método
// ==========================
chamadaMetodo
    : 'call' tipo nomeMetodo '(' argumentoLista? ')' ';'
    ;

// Suporte básico a nome qualificado (ex: Console::WriteLine)
nomeMetodo
    : ID ('::' ID)?
    ;

// ==========================
// Atribuições (stack/local)
// ==========================
atribuicao
    : 'ldloc' NUMERO ';'
    | 'stloc' NUMERO ';'
    ;

// ==========================
// Constantes
// ==========================
carregarConstante
    : 'ldc' NUMERO ';'
    ;

// ==========================
// Operadores
// ==========================
operadorBinario
    : ('add' | 'sub' | 'mul' | 'div') ';'
    ;

acessoArgumento
    : 'ldarg.' NUMERO
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
// Expressões (simples por agora)
// ==========================
expressao
    : chamadaMetodo
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

WS
    : [ \t\r\n]+ -> skip
    ;