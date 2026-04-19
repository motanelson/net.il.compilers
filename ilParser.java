// Generated from il.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ilParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		ID=39, NUMERO=40, STRING=41, WS=42;
	public static final int
		RULE_programa = 0, RULE_cabecalho = 1, RULE_conteudoAssembly = 2, RULE_declaracaoClasse = 3, 
		RULE_campo = 4, RULE_metodo = 5, RULE_blocoMetodo = 6, RULE_diretivaMetodo = 7, 
		RULE_declaracaoLocal = 8, RULE_parametroLista = 9, RULE_parametro = 10, 
		RULE_instrucao = 11, RULE_label = 12, RULE_branch = 13, RULE_instrucaoStack = 14, 
		RULE_operadorBinario = 15, RULE_chamadaMetodo = 16, RULE_chamadaMetodoExpr = 17, 
		RULE_nomeMetodo = 18, RULE_retorno = 19, RULE_argumentoLista = 20, RULE_expressao = 21, 
		RULE_tipo = 22;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "cabecalho", "conteudoAssembly", "declaracaoClasse", "campo", 
			"metodo", "blocoMetodo", "diretivaMetodo", "declaracaoLocal", "parametroLista", 
			"parametro", "instrucao", "label", "branch", "instrucaoStack", "operadorBinario", 
			"chamadaMetodo", "chamadaMetodoExpr", "nomeMetodo", "retorno", "argumentoLista", 
			"expressao", "tipo"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'.assembly'", "'{'", "'}'", "'.class'", "'public'", "'.field'", 
			"';'", "'.method'", "'private'", "'('", "')'", "'.entrypoint'", "'.locals'", 
			"','", "':'", "'br'", "'brtrue'", "'brfalse'", "'ldloc'", "'stloc'", 
			"'ldarg'", "'.'", "'ldc'", "'dup'", "'pop'", "'add'", "'sub'", "'mul'", 
			"'div'", "'call'", "'callvirt'", "'::'", "'ret'", "'int32'", "'float32'", 
			"'bool'", "'string'", "'void'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "ID", "NUMERO", "STRING", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "il.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ilParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramaContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(ilParser.EOF, 0); }
		public List<CabecalhoContext> cabecalho() {
			return getRuleContexts(CabecalhoContext.class);
		}
		public CabecalhoContext cabecalho(int i) {
			return getRuleContext(CabecalhoContext.class,i);
		}
		public List<DeclaracaoClasseContext> declaracaoClasse() {
			return getRuleContexts(DeclaracaoClasseContext.class);
		}
		public DeclaracaoClasseContext declaracaoClasse(int i) {
			return getRuleContext(DeclaracaoClasseContext.class,i);
		}
		public List<MetodoContext> metodo() {
			return getRuleContexts(MetodoContext.class);
		}
		public MetodoContext metodo(int i) {
			return getRuleContext(MetodoContext.class,i);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ilListener ) ((ilListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ilListener ) ((ilListener)listener).exitPrograma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ilVisitor ) return ((ilVisitor<? extends T>)visitor).visitPrograma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__7))) != 0)) {
				{
				setState(49);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__0:
					{
					setState(46);
					cabecalho();
					}
					break;
				case T__3:
					{
					setState(47);
					declaracaoClasse();
					}
					break;
				case T__7:
					{
					setState(48);
					metodo();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(53);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(54);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CabecalhoContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ilParser.ID, 0); }
		public List<ConteudoAssemblyContext> conteudoAssembly() {
			return getRuleContexts(ConteudoAssemblyContext.class);
		}
		public ConteudoAssemblyContext conteudoAssembly(int i) {
			return getRuleContext(ConteudoAssemblyContext.class,i);
		}
		public CabecalhoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cabecalho; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ilListener ) ((ilListener)listener).enterCabecalho(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ilListener ) ((ilListener)listener).exitCabecalho(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ilVisitor ) return ((ilVisitor<? extends T>)visitor).visitCabecalho(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CabecalhoContext cabecalho() throws RecognitionException {
		CabecalhoContext _localctx = new CabecalhoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_cabecalho);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			match(T__0);
			setState(57);
			match(ID);
			setState(58);
			match(T__1);
			setState(62);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << NUMERO) | (1L << STRING))) != 0)) {
				{
				{
				setState(59);
				conteudoAssembly();
				}
				}
				setState(64);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(65);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConteudoAssemblyContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ilParser.ID, 0); }
		public TerminalNode NUMERO() { return getToken(ilParser.NUMERO, 0); }
		public TerminalNode STRING() { return getToken(ilParser.STRING, 0); }
		public ConteudoAssemblyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conteudoAssembly; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ilListener ) ((ilListener)listener).enterConteudoAssembly(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ilListener ) ((ilListener)listener).exitConteudoAssembly(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ilVisitor ) return ((ilVisitor<? extends T>)visitor).visitConteudoAssembly(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConteudoAssemblyContext conteudoAssembly() throws RecognitionException {
		ConteudoAssemblyContext _localctx = new ConteudoAssemblyContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_conteudoAssembly);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << NUMERO) | (1L << STRING))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclaracaoClasseContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ilParser.ID, 0); }
		public List<CampoContext> campo() {
			return getRuleContexts(CampoContext.class);
		}
		public CampoContext campo(int i) {
			return getRuleContext(CampoContext.class,i);
		}
		public List<MetodoContext> metodo() {
			return getRuleContexts(MetodoContext.class);
		}
		public MetodoContext metodo(int i) {
			return getRuleContext(MetodoContext.class,i);
		}
		public DeclaracaoClasseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracaoClasse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ilListener ) ((ilListener)listener).enterDeclaracaoClasse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ilListener ) ((ilListener)listener).exitDeclaracaoClasse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ilVisitor ) return ((ilVisitor<? extends T>)visitor).visitDeclaracaoClasse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracaoClasseContext declaracaoClasse() throws RecognitionException {
		DeclaracaoClasseContext _localctx = new DeclaracaoClasseContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_declaracaoClasse);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			match(T__3);
			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(70);
				match(T__4);
				}
			}

			setState(73);
			match(ID);
			setState(74);
			match(T__1);
			setState(79);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5 || _la==T__7) {
				{
				setState(77);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__5:
					{
					setState(75);
					campo();
					}
					break;
				case T__7:
					{
					setState(76);
					metodo();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(81);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(82);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CampoContext extends ParserRuleContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode ID() { return getToken(ilParser.ID, 0); }
		public CampoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_campo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ilListener ) ((ilListener)listener).enterCampo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ilListener ) ((ilListener)listener).exitCampo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ilVisitor ) return ((ilVisitor<? extends T>)visitor).visitCampo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CampoContext campo() throws RecognitionException {
		CampoContext _localctx = new CampoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_campo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			match(T__5);
			setState(85);
			match(T__4);
			setState(86);
			tipo();
			setState(87);
			match(ID);
			setState(88);
			match(T__6);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MetodoContext extends ParserRuleContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode ID() { return getToken(ilParser.ID, 0); }
		public BlocoMetodoContext blocoMetodo() {
			return getRuleContext(BlocoMetodoContext.class,0);
		}
		public ParametroListaContext parametroLista() {
			return getRuleContext(ParametroListaContext.class,0);
		}
		public MetodoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_metodo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ilListener ) ((ilListener)listener).enterMetodo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ilListener ) ((ilListener)listener).exitMetodo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ilVisitor ) return ((ilVisitor<? extends T>)visitor).visitMetodo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MetodoContext metodo() throws RecognitionException {
		MetodoContext _localctx = new MetodoContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_metodo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			match(T__7);
			setState(92);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4 || _la==T__8) {
				{
				setState(91);
				_la = _input.LA(1);
				if ( !(_la==T__4 || _la==T__8) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(94);
			tipo();
			setState(95);
			match(ID);
			setState(96);
			match(T__9);
			setState(98);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << ID))) != 0)) {
				{
				setState(97);
				parametroLista();
				}
			}

			setState(100);
			match(T__10);
			setState(101);
			blocoMetodo();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlocoMetodoContext extends ParserRuleContext {
		public List<DiretivaMetodoContext> diretivaMetodo() {
			return getRuleContexts(DiretivaMetodoContext.class);
		}
		public DiretivaMetodoContext diretivaMetodo(int i) {
			return getRuleContext(DiretivaMetodoContext.class,i);
		}
		public List<InstrucaoContext> instrucao() {
			return getRuleContexts(InstrucaoContext.class);
		}
		public InstrucaoContext instrucao(int i) {
			return getRuleContext(InstrucaoContext.class,i);
		}
		public BlocoMetodoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blocoMetodo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ilListener ) ((ilListener)listener).enterBlocoMetodo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ilListener ) ((ilListener)listener).exitBlocoMetodo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ilVisitor ) return ((ilVisitor<? extends T>)visitor).visitBlocoMetodo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlocoMetodoContext blocoMetodo() throws RecognitionException {
		BlocoMetodoContext _localctx = new BlocoMetodoContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_blocoMetodo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			match(T__1);
			setState(107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__11 || _la==T__12) {
				{
				{
				setState(104);
				diretivaMetodo();
				}
				}
				setState(109);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__32) | (1L << ID))) != 0)) {
				{
				{
				setState(110);
				instrucao();
				}
				}
				setState(115);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(116);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DiretivaMetodoContext extends ParserRuleContext {
		public List<DeclaracaoLocalContext> declaracaoLocal() {
			return getRuleContexts(DeclaracaoLocalContext.class);
		}
		public DeclaracaoLocalContext declaracaoLocal(int i) {
			return getRuleContext(DeclaracaoLocalContext.class,i);
		}
		public DiretivaMetodoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_diretivaMetodo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ilListener ) ((ilListener)listener).enterDiretivaMetodo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ilListener ) ((ilListener)listener).exitDiretivaMetodo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ilVisitor ) return ((ilVisitor<? extends T>)visitor).visitDiretivaMetodo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DiretivaMetodoContext diretivaMetodo() throws RecognitionException {
		DiretivaMetodoContext _localctx = new DiretivaMetodoContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_diretivaMetodo);
		int _la;
		try {
			setState(131);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
				enterOuterAlt(_localctx, 1);
				{
				setState(118);
				match(T__11);
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 2);
				{
				setState(119);
				match(T__12);
				setState(120);
				match(T__9);
				setState(121);
				declaracaoLocal();
				setState(126);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__13) {
					{
					{
					setState(122);
					match(T__13);
					setState(123);
					declaracaoLocal();
					}
					}
					setState(128);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(129);
				match(T__10);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclaracaoLocalContext extends ParserRuleContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode ID() { return getToken(ilParser.ID, 0); }
		public DeclaracaoLocalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracaoLocal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ilListener ) ((ilListener)listener).enterDeclaracaoLocal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ilListener ) ((ilListener)listener).exitDeclaracaoLocal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ilVisitor ) return ((ilVisitor<? extends T>)visitor).visitDeclaracaoLocal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracaoLocalContext declaracaoLocal() throws RecognitionException {
		DeclaracaoLocalContext _localctx = new DeclaracaoLocalContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_declaracaoLocal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			tipo();
			setState(134);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParametroListaContext extends ParserRuleContext {
		public List<ParametroContext> parametro() {
			return getRuleContexts(ParametroContext.class);
		}
		public ParametroContext parametro(int i) {
			return getRuleContext(ParametroContext.class,i);
		}
		public ParametroListaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametroLista; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ilListener ) ((ilListener)listener).enterParametroLista(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ilListener ) ((ilListener)listener).exitParametroLista(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ilVisitor ) return ((ilVisitor<? extends T>)visitor).visitParametroLista(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametroListaContext parametroLista() throws RecognitionException {
		ParametroListaContext _localctx = new ParametroListaContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_parametroLista);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			parametro();
			setState(141);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__13) {
				{
				{
				setState(137);
				match(T__13);
				setState(138);
				parametro();
				}
				}
				setState(143);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParametroContext extends ParserRuleContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode ID() { return getToken(ilParser.ID, 0); }
		public ParametroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametro; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ilListener ) ((ilListener)listener).enterParametro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ilListener ) ((ilListener)listener).exitParametro(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ilVisitor ) return ((ilVisitor<? extends T>)visitor).visitParametro(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametroContext parametro() throws RecognitionException {
		ParametroContext _localctx = new ParametroContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_parametro);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			tipo();
			setState(145);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InstrucaoContext extends ParserRuleContext {
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public BranchContext branch() {
			return getRuleContext(BranchContext.class,0);
		}
		public ChamadaMetodoContext chamadaMetodo() {
			return getRuleContext(ChamadaMetodoContext.class,0);
		}
		public InstrucaoStackContext instrucaoStack() {
			return getRuleContext(InstrucaoStackContext.class,0);
		}
		public OperadorBinarioContext operadorBinario() {
			return getRuleContext(OperadorBinarioContext.class,0);
		}
		public RetornoContext retorno() {
			return getRuleContext(RetornoContext.class,0);
		}
		public InstrucaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instrucao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ilListener ) ((ilListener)listener).enterInstrucao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ilListener ) ((ilListener)listener).exitInstrucao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ilVisitor ) return ((ilVisitor<? extends T>)visitor).visitInstrucao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstrucaoContext instrucao() throws RecognitionException {
		InstrucaoContext _localctx = new InstrucaoContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_instrucao);
		try {
			setState(153);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(147);
				label();
				}
				break;
			case T__15:
			case T__16:
			case T__17:
				enterOuterAlt(_localctx, 2);
				{
				setState(148);
				branch();
				}
				break;
			case T__29:
			case T__30:
				enterOuterAlt(_localctx, 3);
				{
				setState(149);
				chamadaMetodo();
				}
				break;
			case T__18:
			case T__19:
			case T__20:
			case T__22:
			case T__23:
			case T__24:
				enterOuterAlt(_localctx, 4);
				{
				setState(150);
				instrucaoStack();
				}
				break;
			case T__25:
			case T__26:
			case T__27:
			case T__28:
				enterOuterAlt(_localctx, 5);
				{
				setState(151);
				operadorBinario();
				}
				break;
			case T__32:
				enterOuterAlt(_localctx, 6);
				{
				setState(152);
				retorno();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LabelContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ilParser.ID, 0); }
		public LabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_label; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ilListener ) ((ilListener)listener).enterLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ilListener ) ((ilListener)listener).exitLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ilVisitor ) return ((ilVisitor<? extends T>)visitor).visitLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LabelContext label() throws RecognitionException {
		LabelContext _localctx = new LabelContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_label);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			match(ID);
			setState(156);
			match(T__14);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BranchContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ilParser.ID, 0); }
		public BranchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_branch; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ilListener ) ((ilListener)listener).enterBranch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ilListener ) ((ilListener)listener).exitBranch(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ilVisitor ) return ((ilVisitor<? extends T>)visitor).visitBranch(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BranchContext branch() throws RecognitionException {
		BranchContext _localctx = new BranchContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_branch);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__15) | (1L << T__16) | (1L << T__17))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(159);
			match(ID);
			setState(160);
			match(T__6);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InstrucaoStackContext extends ParserRuleContext {
		public TerminalNode NUMERO() { return getToken(ilParser.NUMERO, 0); }
		public InstrucaoStackContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instrucaoStack; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ilListener ) ((ilListener)listener).enterInstrucaoStack(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ilListener ) ((ilListener)listener).exitInstrucaoStack(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ilVisitor ) return ((ilVisitor<? extends T>)visitor).visitInstrucaoStack(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstrucaoStackContext instrucaoStack() throws RecognitionException {
		InstrucaoStackContext _localctx = new InstrucaoStackContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_instrucaoStack);
		try {
			setState(179);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__18:
				enterOuterAlt(_localctx, 1);
				{
				setState(162);
				match(T__18);
				setState(163);
				match(NUMERO);
				setState(164);
				match(T__6);
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 2);
				{
				setState(165);
				match(T__19);
				setState(166);
				match(NUMERO);
				setState(167);
				match(T__6);
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 3);
				{
				setState(168);
				match(T__20);
				setState(169);
				match(T__21);
				setState(170);
				match(NUMERO);
				setState(171);
				match(T__6);
				}
				break;
			case T__22:
				enterOuterAlt(_localctx, 4);
				{
				setState(172);
				match(T__22);
				setState(173);
				match(NUMERO);
				setState(174);
				match(T__6);
				}
				break;
			case T__23:
				enterOuterAlt(_localctx, 5);
				{
				setState(175);
				match(T__23);
				setState(176);
				match(T__6);
				}
				break;
			case T__24:
				enterOuterAlt(_localctx, 6);
				{
				setState(177);
				match(T__24);
				setState(178);
				match(T__6);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OperadorBinarioContext extends ParserRuleContext {
		public OperadorBinarioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operadorBinario; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ilListener ) ((ilListener)listener).enterOperadorBinario(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ilListener ) ((ilListener)listener).exitOperadorBinario(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ilVisitor ) return ((ilVisitor<? extends T>)visitor).visitOperadorBinario(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperadorBinarioContext operadorBinario() throws RecognitionException {
		OperadorBinarioContext _localctx = new OperadorBinarioContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_operadorBinario);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(182);
			match(T__6);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ChamadaMetodoContext extends ParserRuleContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public NomeMetodoContext nomeMetodo() {
			return getRuleContext(NomeMetodoContext.class,0);
		}
		public ArgumentoListaContext argumentoLista() {
			return getRuleContext(ArgumentoListaContext.class,0);
		}
		public ChamadaMetodoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chamadaMetodo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ilListener ) ((ilListener)listener).enterChamadaMetodo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ilListener ) ((ilListener)listener).exitChamadaMetodo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ilVisitor ) return ((ilVisitor<? extends T>)visitor).visitChamadaMetodo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChamadaMetodoContext chamadaMetodo() throws RecognitionException {
		ChamadaMetodoContext _localctx = new ChamadaMetodoContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_chamadaMetodo);
		int _la;
		try {
			setState(204);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__29:
				enterOuterAlt(_localctx, 1);
				{
				setState(184);
				match(T__29);
				setState(185);
				tipo();
				setState(186);
				nomeMetodo();
				setState(187);
				match(T__9);
				setState(189);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__29) | (1L << T__30) | (1L << ID) | (1L << NUMERO))) != 0)) {
					{
					setState(188);
					argumentoLista();
					}
				}

				setState(191);
				match(T__10);
				setState(192);
				match(T__6);
				}
				break;
			case T__30:
				enterOuterAlt(_localctx, 2);
				{
				setState(194);
				match(T__30);
				setState(195);
				tipo();
				setState(196);
				nomeMetodo();
				setState(197);
				match(T__9);
				setState(199);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__29) | (1L << T__30) | (1L << ID) | (1L << NUMERO))) != 0)) {
					{
					setState(198);
					argumentoLista();
					}
				}

				setState(201);
				match(T__10);
				setState(202);
				match(T__6);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ChamadaMetodoExprContext extends ParserRuleContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public NomeMetodoContext nomeMetodo() {
			return getRuleContext(NomeMetodoContext.class,0);
		}
		public ArgumentoListaContext argumentoLista() {
			return getRuleContext(ArgumentoListaContext.class,0);
		}
		public ChamadaMetodoExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chamadaMetodoExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ilListener ) ((ilListener)listener).enterChamadaMetodoExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ilListener ) ((ilListener)listener).exitChamadaMetodoExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ilVisitor ) return ((ilVisitor<? extends T>)visitor).visitChamadaMetodoExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChamadaMetodoExprContext chamadaMetodoExpr() throws RecognitionException {
		ChamadaMetodoExprContext _localctx = new ChamadaMetodoExprContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_chamadaMetodoExpr);
		int _la;
		try {
			setState(224);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__29:
				enterOuterAlt(_localctx, 1);
				{
				setState(206);
				match(T__29);
				setState(207);
				tipo();
				setState(208);
				nomeMetodo();
				setState(209);
				match(T__9);
				setState(211);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__29) | (1L << T__30) | (1L << ID) | (1L << NUMERO))) != 0)) {
					{
					setState(210);
					argumentoLista();
					}
				}

				setState(213);
				match(T__10);
				}
				break;
			case T__30:
				enterOuterAlt(_localctx, 2);
				{
				setState(215);
				match(T__30);
				setState(216);
				tipo();
				setState(217);
				nomeMetodo();
				setState(218);
				match(T__9);
				setState(220);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__29) | (1L << T__30) | (1L << ID) | (1L << NUMERO))) != 0)) {
					{
					setState(219);
					argumentoLista();
					}
				}

				setState(222);
				match(T__10);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NomeMetodoContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(ilParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ilParser.ID, i);
		}
		public NomeMetodoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nomeMetodo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ilListener ) ((ilListener)listener).enterNomeMetodo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ilListener ) ((ilListener)listener).exitNomeMetodo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ilVisitor ) return ((ilVisitor<? extends T>)visitor).visitNomeMetodo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NomeMetodoContext nomeMetodo() throws RecognitionException {
		NomeMetodoContext _localctx = new NomeMetodoContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_nomeMetodo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			match(ID);
			setState(231);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__31) {
				{
				{
				setState(227);
				match(T__31);
				setState(228);
				match(ID);
				}
				}
				setState(233);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RetornoContext extends ParserRuleContext {
		public RetornoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_retorno; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ilListener ) ((ilListener)listener).enterRetorno(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ilListener ) ((ilListener)listener).exitRetorno(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ilVisitor ) return ((ilVisitor<? extends T>)visitor).visitRetorno(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RetornoContext retorno() throws RecognitionException {
		RetornoContext _localctx = new RetornoContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_retorno);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			match(T__32);
			setState(235);
			match(T__6);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentoListaContext extends ParserRuleContext {
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public ArgumentoListaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentoLista; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ilListener ) ((ilListener)listener).enterArgumentoLista(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ilListener ) ((ilListener)listener).exitArgumentoLista(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ilVisitor ) return ((ilVisitor<? extends T>)visitor).visitArgumentoLista(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentoListaContext argumentoLista() throws RecognitionException {
		ArgumentoListaContext _localctx = new ArgumentoListaContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_argumentoLista);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			expressao();
			setState(242);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__13) {
				{
				{
				setState(238);
				match(T__13);
				setState(239);
				expressao();
				}
				}
				setState(244);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressaoContext extends ParserRuleContext {
		public ChamadaMetodoExprContext chamadaMetodoExpr() {
			return getRuleContext(ChamadaMetodoExprContext.class,0);
		}
		public TerminalNode ID() { return getToken(ilParser.ID, 0); }
		public TerminalNode NUMERO() { return getToken(ilParser.NUMERO, 0); }
		public ExpressaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ilListener ) ((ilListener)listener).enterExpressao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ilListener ) ((ilListener)listener).exitExpressao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ilVisitor ) return ((ilVisitor<? extends T>)visitor).visitExpressao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressaoContext expressao() throws RecognitionException {
		ExpressaoContext _localctx = new ExpressaoContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_expressao);
		try {
			setState(248);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__29:
			case T__30:
				enterOuterAlt(_localctx, 1);
				{
				setState(245);
				chamadaMetodoExpr();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(246);
				match(ID);
				}
				break;
			case NUMERO:
				enterOuterAlt(_localctx, 3);
				{
				setState(247);
				match(NUMERO);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TipoContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ilParser.ID, 0); }
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ilListener ) ((ilListener)listener).enterTipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ilListener ) ((ilListener)listener).exitTipo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ilVisitor ) return ((ilVisitor<? extends T>)visitor).visitTipo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_tipo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << ID))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3,\u00ff\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2\3\2\3"+
		"\2\7\2\64\n\2\f\2\16\2\67\13\2\3\2\3\2\3\3\3\3\3\3\3\3\7\3?\n\3\f\3\16"+
		"\3B\13\3\3\3\3\3\3\4\3\4\3\5\3\5\5\5J\n\5\3\5\3\5\3\5\3\5\7\5P\n\5\f\5"+
		"\16\5S\13\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\5\7_\n\7\3\7\3\7\3"+
		"\7\3\7\5\7e\n\7\3\7\3\7\3\7\3\b\3\b\7\bl\n\b\f\b\16\bo\13\b\3\b\7\br\n"+
		"\b\f\b\16\bu\13\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\7\t\177\n\t\f\t\16\t"+
		"\u0082\13\t\3\t\3\t\5\t\u0086\n\t\3\n\3\n\3\n\3\13\3\13\3\13\7\13\u008e"+
		"\n\13\f\13\16\13\u0091\13\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u009c"+
		"\n\r\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00b6\n\20"+
		"\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\5\22\u00c0\n\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\5\22\u00ca\n\22\3\22\3\22\3\22\5\22\u00cf\n"+
		"\22\3\23\3\23\3\23\3\23\3\23\5\23\u00d6\n\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\5\23\u00df\n\23\3\23\3\23\5\23\u00e3\n\23\3\24\3\24\3\24\7"+
		"\24\u00e8\n\24\f\24\16\24\u00eb\13\24\3\25\3\25\3\25\3\26\3\26\3\26\7"+
		"\26\u00f3\n\26\f\26\16\26\u00f6\13\26\3\27\3\27\3\27\5\27\u00fb\n\27\3"+
		"\30\3\30\3\30\2\2\31\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\2"+
		"\7\3\2)+\4\2\7\7\13\13\3\2\22\24\3\2\34\37\3\2$)\2\u0109\2\65\3\2\2\2"+
		"\4:\3\2\2\2\6E\3\2\2\2\bG\3\2\2\2\nV\3\2\2\2\f\\\3\2\2\2\16i\3\2\2\2\20"+
		"\u0085\3\2\2\2\22\u0087\3\2\2\2\24\u008a\3\2\2\2\26\u0092\3\2\2\2\30\u009b"+
		"\3\2\2\2\32\u009d\3\2\2\2\34\u00a0\3\2\2\2\36\u00b5\3\2\2\2 \u00b7\3\2"+
		"\2\2\"\u00ce\3\2\2\2$\u00e2\3\2\2\2&\u00e4\3\2\2\2(\u00ec\3\2\2\2*\u00ef"+
		"\3\2\2\2,\u00fa\3\2\2\2.\u00fc\3\2\2\2\60\64\5\4\3\2\61\64\5\b\5\2\62"+
		"\64\5\f\7\2\63\60\3\2\2\2\63\61\3\2\2\2\63\62\3\2\2\2\64\67\3\2\2\2\65"+
		"\63\3\2\2\2\65\66\3\2\2\2\668\3\2\2\2\67\65\3\2\2\289\7\2\2\39\3\3\2\2"+
		"\2:;\7\3\2\2;<\7)\2\2<@\7\4\2\2=?\5\6\4\2>=\3\2\2\2?B\3\2\2\2@>\3\2\2"+
		"\2@A\3\2\2\2AC\3\2\2\2B@\3\2\2\2CD\7\5\2\2D\5\3\2\2\2EF\t\2\2\2F\7\3\2"+
		"\2\2GI\7\6\2\2HJ\7\7\2\2IH\3\2\2\2IJ\3\2\2\2JK\3\2\2\2KL\7)\2\2LQ\7\4"+
		"\2\2MP\5\n\6\2NP\5\f\7\2OM\3\2\2\2ON\3\2\2\2PS\3\2\2\2QO\3\2\2\2QR\3\2"+
		"\2\2RT\3\2\2\2SQ\3\2\2\2TU\7\5\2\2U\t\3\2\2\2VW\7\b\2\2WX\7\7\2\2XY\5"+
		".\30\2YZ\7)\2\2Z[\7\t\2\2[\13\3\2\2\2\\^\7\n\2\2]_\t\3\2\2^]\3\2\2\2^"+
		"_\3\2\2\2_`\3\2\2\2`a\5.\30\2ab\7)\2\2bd\7\f\2\2ce\5\24\13\2dc\3\2\2\2"+
		"de\3\2\2\2ef\3\2\2\2fg\7\r\2\2gh\5\16\b\2h\r\3\2\2\2im\7\4\2\2jl\5\20"+
		"\t\2kj\3\2\2\2lo\3\2\2\2mk\3\2\2\2mn\3\2\2\2ns\3\2\2\2om\3\2\2\2pr\5\30"+
		"\r\2qp\3\2\2\2ru\3\2\2\2sq\3\2\2\2st\3\2\2\2tv\3\2\2\2us\3\2\2\2vw\7\5"+
		"\2\2w\17\3\2\2\2x\u0086\7\16\2\2yz\7\17\2\2z{\7\f\2\2{\u0080\5\22\n\2"+
		"|}\7\20\2\2}\177\5\22\n\2~|\3\2\2\2\177\u0082\3\2\2\2\u0080~\3\2\2\2\u0080"+
		"\u0081\3\2\2\2\u0081\u0083\3\2\2\2\u0082\u0080\3\2\2\2\u0083\u0084\7\r"+
		"\2\2\u0084\u0086\3\2\2\2\u0085x\3\2\2\2\u0085y\3\2\2\2\u0086\21\3\2\2"+
		"\2\u0087\u0088\5.\30\2\u0088\u0089\7)\2\2\u0089\23\3\2\2\2\u008a\u008f"+
		"\5\26\f\2\u008b\u008c\7\20\2\2\u008c\u008e\5\26\f\2\u008d\u008b\3\2\2"+
		"\2\u008e\u0091\3\2\2\2\u008f\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090\25"+
		"\3\2\2\2\u0091\u008f\3\2\2\2\u0092\u0093\5.\30\2\u0093\u0094\7)\2\2\u0094"+
		"\27\3\2\2\2\u0095\u009c\5\32\16\2\u0096\u009c\5\34\17\2\u0097\u009c\5"+
		"\"\22\2\u0098\u009c\5\36\20\2\u0099\u009c\5 \21\2\u009a\u009c\5(\25\2"+
		"\u009b\u0095\3\2\2\2\u009b\u0096\3\2\2\2\u009b\u0097\3\2\2\2\u009b\u0098"+
		"\3\2\2\2\u009b\u0099\3\2\2\2\u009b\u009a\3\2\2\2\u009c\31\3\2\2\2\u009d"+
		"\u009e\7)\2\2\u009e\u009f\7\21\2\2\u009f\33\3\2\2\2\u00a0\u00a1\t\4\2"+
		"\2\u00a1\u00a2\7)\2\2\u00a2\u00a3\7\t\2\2\u00a3\35\3\2\2\2\u00a4\u00a5"+
		"\7\25\2\2\u00a5\u00a6\7*\2\2\u00a6\u00b6\7\t\2\2\u00a7\u00a8\7\26\2\2"+
		"\u00a8\u00a9\7*\2\2\u00a9\u00b6\7\t\2\2\u00aa\u00ab\7\27\2\2\u00ab\u00ac"+
		"\7\30\2\2\u00ac\u00ad\7*\2\2\u00ad\u00b6\7\t\2\2\u00ae\u00af\7\31\2\2"+
		"\u00af\u00b0\7*\2\2\u00b0\u00b6\7\t\2\2\u00b1\u00b2\7\32\2\2\u00b2\u00b6"+
		"\7\t\2\2\u00b3\u00b4\7\33\2\2\u00b4\u00b6\7\t\2\2\u00b5\u00a4\3\2\2\2"+
		"\u00b5\u00a7\3\2\2\2\u00b5\u00aa\3\2\2\2\u00b5\u00ae\3\2\2\2\u00b5\u00b1"+
		"\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b6\37\3\2\2\2\u00b7\u00b8\t\5\2\2\u00b8"+
		"\u00b9\7\t\2\2\u00b9!\3\2\2\2\u00ba\u00bb\7 \2\2\u00bb\u00bc\5.\30\2\u00bc"+
		"\u00bd\5&\24\2\u00bd\u00bf\7\f\2\2\u00be\u00c0\5*\26\2\u00bf\u00be\3\2"+
		"\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00c2\7\r\2\2\u00c2"+
		"\u00c3\7\t\2\2\u00c3\u00cf\3\2\2\2\u00c4\u00c5\7!\2\2\u00c5\u00c6\5.\30"+
		"\2\u00c6\u00c7\5&\24\2\u00c7\u00c9\7\f\2\2\u00c8\u00ca\5*\26\2\u00c9\u00c8"+
		"\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00cc\7\r\2\2\u00cc"+
		"\u00cd\7\t\2\2\u00cd\u00cf\3\2\2\2\u00ce\u00ba\3\2\2\2\u00ce\u00c4\3\2"+
		"\2\2\u00cf#\3\2\2\2\u00d0\u00d1\7 \2\2\u00d1\u00d2\5.\30\2\u00d2\u00d3"+
		"\5&\24\2\u00d3\u00d5\7\f\2\2\u00d4\u00d6\5*\26\2\u00d5\u00d4\3\2\2\2\u00d5"+
		"\u00d6\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00d8\7\r\2\2\u00d8\u00e3\3\2"+
		"\2\2\u00d9\u00da\7!\2\2\u00da\u00db\5.\30\2\u00db\u00dc\5&\24\2\u00dc"+
		"\u00de\7\f\2\2\u00dd\u00df\5*\26\2\u00de\u00dd\3\2\2\2\u00de\u00df\3\2"+
		"\2\2\u00df\u00e0\3\2\2\2\u00e0\u00e1\7\r\2\2\u00e1\u00e3\3\2\2\2\u00e2"+
		"\u00d0\3\2\2\2\u00e2\u00d9\3\2\2\2\u00e3%\3\2\2\2\u00e4\u00e9\7)\2\2\u00e5"+
		"\u00e6\7\"\2\2\u00e6\u00e8\7)\2\2\u00e7\u00e5\3\2\2\2\u00e8\u00eb\3\2"+
		"\2\2\u00e9\u00e7\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\'\3\2\2\2\u00eb\u00e9"+
		"\3\2\2\2\u00ec\u00ed\7#\2\2\u00ed\u00ee\7\t\2\2\u00ee)\3\2\2\2\u00ef\u00f4"+
		"\5,\27\2\u00f0\u00f1\7\20\2\2\u00f1\u00f3\5,\27\2\u00f2\u00f0\3\2\2\2"+
		"\u00f3\u00f6\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5+\3"+
		"\2\2\2\u00f6\u00f4\3\2\2\2\u00f7\u00fb\5$\23\2\u00f8\u00fb\7)\2\2\u00f9"+
		"\u00fb\7*\2\2\u00fa\u00f7\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fa\u00f9\3\2"+
		"\2\2\u00fb-\3\2\2\2\u00fc\u00fd\t\6\2\2\u00fd/\3\2\2\2\32\63\65@IOQ^d"+
		"ms\u0080\u0085\u008f\u009b\u00b5\u00bf\u00c9\u00ce\u00d5\u00de\u00e2\u00e9"+
		"\u00f4\u00fa";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}