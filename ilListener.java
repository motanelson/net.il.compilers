// Generated from il.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ilParser}.
 */
public interface ilListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ilParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(ilParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link ilParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(ilParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link ilParser#cabecalho}.
	 * @param ctx the parse tree
	 */
	void enterCabecalho(ilParser.CabecalhoContext ctx);
	/**
	 * Exit a parse tree produced by {@link ilParser#cabecalho}.
	 * @param ctx the parse tree
	 */
	void exitCabecalho(ilParser.CabecalhoContext ctx);
	/**
	 * Enter a parse tree produced by {@link ilParser#conteudoAssembly}.
	 * @param ctx the parse tree
	 */
	void enterConteudoAssembly(ilParser.ConteudoAssemblyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ilParser#conteudoAssembly}.
	 * @param ctx the parse tree
	 */
	void exitConteudoAssembly(ilParser.ConteudoAssemblyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ilParser#declaracaoClasse}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracaoClasse(ilParser.DeclaracaoClasseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ilParser#declaracaoClasse}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracaoClasse(ilParser.DeclaracaoClasseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ilParser#campo}.
	 * @param ctx the parse tree
	 */
	void enterCampo(ilParser.CampoContext ctx);
	/**
	 * Exit a parse tree produced by {@link ilParser#campo}.
	 * @param ctx the parse tree
	 */
	void exitCampo(ilParser.CampoContext ctx);
	/**
	 * Enter a parse tree produced by {@link ilParser#metodo}.
	 * @param ctx the parse tree
	 */
	void enterMetodo(ilParser.MetodoContext ctx);
	/**
	 * Exit a parse tree produced by {@link ilParser#metodo}.
	 * @param ctx the parse tree
	 */
	void exitMetodo(ilParser.MetodoContext ctx);
	/**
	 * Enter a parse tree produced by {@link ilParser#parametroLista}.
	 * @param ctx the parse tree
	 */
	void enterParametroLista(ilParser.ParametroListaContext ctx);
	/**
	 * Exit a parse tree produced by {@link ilParser#parametroLista}.
	 * @param ctx the parse tree
	 */
	void exitParametroLista(ilParser.ParametroListaContext ctx);
	/**
	 * Enter a parse tree produced by {@link ilParser#parametro}.
	 * @param ctx the parse tree
	 */
	void enterParametro(ilParser.ParametroContext ctx);
	/**
	 * Exit a parse tree produced by {@link ilParser#parametro}.
	 * @param ctx the parse tree
	 */
	void exitParametro(ilParser.ParametroContext ctx);
	/**
	 * Enter a parse tree produced by {@link ilParser#instrucao}.
	 * @param ctx the parse tree
	 */
	void enterInstrucao(ilParser.InstrucaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link ilParser#instrucao}.
	 * @param ctx the parse tree
	 */
	void exitInstrucao(ilParser.InstrucaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link ilParser#chamadaMetodo}.
	 * @param ctx the parse tree
	 */
	void enterChamadaMetodo(ilParser.ChamadaMetodoContext ctx);
	/**
	 * Exit a parse tree produced by {@link ilParser#chamadaMetodo}.
	 * @param ctx the parse tree
	 */
	void exitChamadaMetodo(ilParser.ChamadaMetodoContext ctx);
	/**
	 * Enter a parse tree produced by {@link ilParser#nomeMetodo}.
	 * @param ctx the parse tree
	 */
	void enterNomeMetodo(ilParser.NomeMetodoContext ctx);
	/**
	 * Exit a parse tree produced by {@link ilParser#nomeMetodo}.
	 * @param ctx the parse tree
	 */
	void exitNomeMetodo(ilParser.NomeMetodoContext ctx);
	/**
	 * Enter a parse tree produced by {@link ilParser#atribuicao}.
	 * @param ctx the parse tree
	 */
	void enterAtribuicao(ilParser.AtribuicaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link ilParser#atribuicao}.
	 * @param ctx the parse tree
	 */
	void exitAtribuicao(ilParser.AtribuicaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link ilParser#carregarConstante}.
	 * @param ctx the parse tree
	 */
	void enterCarregarConstante(ilParser.CarregarConstanteContext ctx);
	/**
	 * Exit a parse tree produced by {@link ilParser#carregarConstante}.
	 * @param ctx the parse tree
	 */
	void exitCarregarConstante(ilParser.CarregarConstanteContext ctx);
	/**
	 * Enter a parse tree produced by {@link ilParser#operadorBinario}.
	 * @param ctx the parse tree
	 */
	void enterOperadorBinario(ilParser.OperadorBinarioContext ctx);
	/**
	 * Exit a parse tree produced by {@link ilParser#operadorBinario}.
	 * @param ctx the parse tree
	 */
	void exitOperadorBinario(ilParser.OperadorBinarioContext ctx);
	/**
	 * Enter a parse tree produced by {@link ilParser#acessoArgumento}.
	 * @param ctx the parse tree
	 */
	void enterAcessoArgumento(ilParser.AcessoArgumentoContext ctx);
	/**
	 * Exit a parse tree produced by {@link ilParser#acessoArgumento}.
	 * @param ctx the parse tree
	 */
	void exitAcessoArgumento(ilParser.AcessoArgumentoContext ctx);
	/**
	 * Enter a parse tree produced by {@link ilParser#retorno}.
	 * @param ctx the parse tree
	 */
	void enterRetorno(ilParser.RetornoContext ctx);
	/**
	 * Exit a parse tree produced by {@link ilParser#retorno}.
	 * @param ctx the parse tree
	 */
	void exitRetorno(ilParser.RetornoContext ctx);
	/**
	 * Enter a parse tree produced by {@link ilParser#argumentoLista}.
	 * @param ctx the parse tree
	 */
	void enterArgumentoLista(ilParser.ArgumentoListaContext ctx);
	/**
	 * Exit a parse tree produced by {@link ilParser#argumentoLista}.
	 * @param ctx the parse tree
	 */
	void exitArgumentoLista(ilParser.ArgumentoListaContext ctx);
	/**
	 * Enter a parse tree produced by {@link ilParser#expressao}.
	 * @param ctx the parse tree
	 */
	void enterExpressao(ilParser.ExpressaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link ilParser#expressao}.
	 * @param ctx the parse tree
	 */
	void exitExpressao(ilParser.ExpressaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link ilParser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(ilParser.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link ilParser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(ilParser.TipoContext ctx);
}