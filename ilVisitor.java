// Generated from il.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ilParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ilVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ilParser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(ilParser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by {@link ilParser#cabecalho}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCabecalho(ilParser.CabecalhoContext ctx);
	/**
	 * Visit a parse tree produced by {@link ilParser#conteudoAssembly}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConteudoAssembly(ilParser.ConteudoAssemblyContext ctx);
	/**
	 * Visit a parse tree produced by {@link ilParser#declaracaoClasse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracaoClasse(ilParser.DeclaracaoClasseContext ctx);
	/**
	 * Visit a parse tree produced by {@link ilParser#campo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCampo(ilParser.CampoContext ctx);
	/**
	 * Visit a parse tree produced by {@link ilParser#metodo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMetodo(ilParser.MetodoContext ctx);
	/**
	 * Visit a parse tree produced by {@link ilParser#blocoMetodo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlocoMetodo(ilParser.BlocoMetodoContext ctx);
	/**
	 * Visit a parse tree produced by {@link ilParser#diretivaMetodo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDiretivaMetodo(ilParser.DiretivaMetodoContext ctx);
	/**
	 * Visit a parse tree produced by {@link ilParser#declaracaoLocal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracaoLocal(ilParser.DeclaracaoLocalContext ctx);
	/**
	 * Visit a parse tree produced by {@link ilParser#parametroLista}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametroLista(ilParser.ParametroListaContext ctx);
	/**
	 * Visit a parse tree produced by {@link ilParser#parametro}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametro(ilParser.ParametroContext ctx);
	/**
	 * Visit a parse tree produced by {@link ilParser#instrucao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstrucao(ilParser.InstrucaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link ilParser#label}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabel(ilParser.LabelContext ctx);
	/**
	 * Visit a parse tree produced by {@link ilParser#branch}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBranch(ilParser.BranchContext ctx);
	/**
	 * Visit a parse tree produced by {@link ilParser#instrucaoStack}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstrucaoStack(ilParser.InstrucaoStackContext ctx);
	/**
	 * Visit a parse tree produced by {@link ilParser#operadorBinario}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperadorBinario(ilParser.OperadorBinarioContext ctx);
	/**
	 * Visit a parse tree produced by {@link ilParser#chamadaMetodo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChamadaMetodo(ilParser.ChamadaMetodoContext ctx);
	/**
	 * Visit a parse tree produced by {@link ilParser#chamadaMetodoExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChamadaMetodoExpr(ilParser.ChamadaMetodoExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ilParser#nomeMetodo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNomeMetodo(ilParser.NomeMetodoContext ctx);
	/**
	 * Visit a parse tree produced by {@link ilParser#retorno}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRetorno(ilParser.RetornoContext ctx);
	/**
	 * Visit a parse tree produced by {@link ilParser#argumentoLista}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentoLista(ilParser.ArgumentoListaContext ctx);
	/**
	 * Visit a parse tree produced by {@link ilParser#expressao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressao(ilParser.ExpressaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link ilParser#tipo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo(ilParser.TipoContext ctx);
}