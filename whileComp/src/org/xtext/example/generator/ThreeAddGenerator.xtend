/*
 * generated by Xtext
 */
package org.xtext.example.generator

import SymboleTable.CodeOp
import SymboleTable.Fonction
import SymboleTable.FunDictionary
import SymboleTable.Label
import SymboleTable.Quadruplet
import SymboleTable.Variable
import java.util.ArrayList
import java.util.HashMap
import java.util.List
import java.util.Set
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.util.EcoreUtil
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.resource.XtextResourceSet
import org.xtext.example.WhileCppStandaloneSetup
import org.xtext.example.whileCpp.Command
import org.xtext.example.whileCpp.Commands
import org.xtext.example.whileCpp.Definition
import org.xtext.example.whileCpp.Expr
import org.xtext.example.whileCpp.ExprAnd
import org.xtext.example.whileCpp.ExprEq
import org.xtext.example.whileCpp.ExprNot
import org.xtext.example.whileCpp.ExprOr
import org.xtext.example.whileCpp.ExprSimple
import org.xtext.example.whileCpp.Exprs
import org.xtext.example.whileCpp.Function
import org.xtext.example.whileCpp.Input
import org.xtext.example.whileCpp.Output
import org.xtext.example.whileCpp.Program
import org.xtext.example.whileCpp.Vars

/**
 * Generates code from your model files on save.
 * 
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class ThreeAddGenerator implements IGenerator {
	
	FunDictionary dico = new FunDictionary();
	
	private ArrayList<Variable> m_globalVarList;
	private HashMap<String, String> funNameTranslation;
	private ArrayList<Label> m_labelList;
	private HashMap<String, Quadruplet> varNameTranslation;
	private int numVar;
	 
	def public List<String> getFunctionsNames()
	{
		return dico.listFuncName.toList
	}
	
	def public List<Fonction> getFunctions()
	{
		return dico.functions
	}
	
	def public void resetDico()
	{
		dico = new FunDictionary();
	}
	
	
	def public Set<String> getVariables(int fn)
	{
		return dico.functions.get(fn).listVarName.toSet
	} 

	
	def public String print3a(){
		var res = ""
		for(Fonction f : dico.functions){
			for(Quadruplet q : f.m_quadList){
				res +=(q.toString()+"\n");
			}
		}
		return res
	}	
	
	def public void generate(String in, FunDictionary tab3A)
	{
		resetDico
		
        val injector = new WhileCppStandaloneSetup().createInjectorAndDoEMFRegistration();
		val resourceSet = injector.getInstance(XtextResourceSet);
        val uri = URI.createURI(in);
		val xtextResource = resourceSet.getResource(uri, true);
		EcoreUtil.resolveAll(xtextResource);
        
		this.funNameTranslation = new HashMap<String, String>();
		this.varNameTranslation = new HashMap<String, Quadruplet>();
		this.numVar = -1
		this.m_globalVarList = new ArrayList<Variable>();
		this.m_labelList = new ArrayList<Label>();
		
		try {
			for(p: xtextResource.allContents.toIterable.filter(Program)) {
				p.compile
			}			
		}
		catch (Exception e) {
			System.out.println("Unknown exception " + e.toString);
		}
	}
	
	def public FunDictionary dico() {
		return this.dico;
	}
	
	def public HashMap<String,String> funNameTranslation() {
		return this.funNameTranslation;
	}
	
	def public ArrayList<Label> labelList() {
		return this.m_labelList;
	}
	
	def public Label generateLabel() {
		val result = new Label("l_" + this.m_labelList.size());
		this.m_labelList.add(result);
		return result;
	}
	
	def public String generateVar() {
		this.numVar += 1
		"v_" + this.numVar
	}
	
	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
		
        resetDico
        
		this.funNameTranslation = new HashMap<String, String>();
		this.varNameTranslation = new HashMap<String, Quadruplet>();
		this.numVar = -1
		this.m_globalVarList = new ArrayList<Variable>();
		this.m_labelList = new ArrayList<Label>();
		for(p: resource.allContents.toIterable.filter(Program)) {
			fsa.generateFile("PP.3a", p.compile())
		}
		
		//TODO move to whc
		//TODO test of whc before remove those 2 lines
		val cppGenerator = new CppGenerator();
		cppGenerator.generateCPP(dico, funNameTranslation, m_labelList)
	}

	def compile (Program p)
'''«FOR f: p.fonctions»
«f.compile()»
«ENDFOR»'''
//«print3a()»'''
	
	def compile (Function f)
	//Ajout de la fonction dans la liste puis ajout de son code 3A
'''«var newF = new Fonction(f.nom,f.definition.inputs.varIn.size,f.definition.outputs.varOut.size,"nomFonctionCible")»
«IF dico.putFunction(newF)»
«this.funNameTranslation.put(f.nom, "f"+this.funNameTranslation.size)»
«f.definition.compile(newF)»
«ELSE » ERREUR: FONCTION «f.nom » DÉJÀ DÉCLARÉE
«ENDIF»
'''

	def compile (Definition d, Fonction f)
	'''«d.inputs.compile(f)»
«d.commandes.compile(f, null)»
«d.outputs.compile(f)»'''
	
	def compile (Input i, Fonction f)
	//Gestion des variables While contenus dans le Read translate en var CPP
	'''«FOR in : i.varIn»«f.addReadVar(in.toString, generateVar)»«f.add(new Variable(in, "input"))»«IF i.varIn.indexOf(in)!=i.varIn.size-1»«ENDIF»«ENDFOR»'''
			
	def compile (Output o, Fonction f)
	'''«FOR out : o.varOut»«f.addWriteVar(out)»«ENDFOR»'''
	
	def compile (Commands c, Fonction f, Label l)
	'''«IF c != null»«FOR cm: c.commande»«IF cm != null»«cm.compile(f, l)»«ENDIF»«ENDFOR»«ELSE»_«ENDIF»'''
	
	
	def compile(Command c, Fonction f, Label l)
'''«switch (c){
	case c.nop!=null : {
		val nop = new Quadruplet(new CodeOp(CodeOp.OP_NOP), "_", "_", "_")
		if(l==null)
		{
			f.addQuad(nop)
			print("[DBG]f += <NOP>\n")
		}
		else
		{
			l.add(nop)
			print("[DBG]" + l.name + " += <NOP>\n")
		}		 
	}
	case c.cmdIf!=null : 
	{
		val cond = c.cmdIf.cond.compile(f, l).toString
		//1. Generate if Label
		val ifLabel = generateLabel
		//2. Generate else Label
		val elseLabel = generateLabel
		
		val ifQuad = new Quadruplet(new CodeOp(CodeOp.OP_IF, ifLabel.name, elseLabel.name), "_", cond, "_");
		
		if(l==null)
		{
			f.addQuad(ifQuad)
			print("[DBG]f += <IF " + ifLabel.name + " " + elseLabel.name + ", _, " + cond + ", _>\n")
		}
		else
		{
			l.add(ifQuad)
			print("[DBG]" + l.name + " += <IF " + ifLabel.name + " " + elseLabel.name + ", _, " + cond + ", _>\n")
		}
		
		c.cmdIf.cmdsThen.compile(f, ifLabel)
		c.cmdIf.cmdsElse.compile(f, elseLabel)
	}
	case c.vars!=null && c.exprs!=null : 
	{
		val pile = new ArrayList();
		val res = c.exprs.compile(f, l).toString
		val variable = c.vars.compile(f, l).toString()
		if(l==null)
		{
			for(exp : c.exprs.expGen)
			{
				pile.add(exp.exprSimp.vari);
				val second = this.varNameTranslation.get(exp.exprSimp.vari).second;
				f.addQuad(new Quadruplet(new CodeOp(CodeOp.OP_AFF),second,exp.exprSimp.vari,"_")); 
				print("[DBG]f += <:=, " + second + "," + exp.exprSimp.vari + ", _>\n")
				
			}
			var cpt = 0;
			for(varToAffect : c.vars.varGen)
			{
				val temp = pile.head;
				pile.remove(0);
				var sec = "nil";
				try{
					sec = this.varNameTranslation.entrySet.get(cpt).value.second;
					f.addQuad(new Quadruplet(new CodeOp(CodeOp.OP_AFF),varToAffect,temp,"_")); 
				}
				catch(Exception e){
					System.out.println("Error");
				}
				print("[DBG]f += <:=, " + varToAffect + "," + sec + ", _>\n");
				cpt++;
			}
		}
		else
		{

			//l.add(affect)
			//print("[DBG]" + l.name + " += <:=, " + variable.trim + "," + res + ", _>\n")
		}
	}
	case c.cmdWhile!=null : 
	{
		val whileLabel = generateLabel
		
		val expString = c.cmdWhile.expr.compile(f, l).toString
		
		val whileQuad = new Quadruplet(new CodeOp(CodeOp.OP_WHILE, whileLabel.name), "_", expString, "_");
		
		if(l==null)
		{
			f.addQuad(whileQuad)
			print("[DBG]f += <WHILE " + whileLabel.name + ", _, " + expString + ",_>\n")
		}
		else
		{
			l.add(whileQuad)
			print("[DBG]" + l.name + " += <WHILE " + whileLabel.name + ", _, " + expString + ",_>\n")
		}
		c.cmdWhile.cmds.compile(f, whileLabel)
	} 
	case c.cmdForEach!=null : 
	{
		val foreachLabel = generateLabel
		val elem = c.cmdForEach.elem.compile(f, l).toString
		val ensemble = c.cmdForEach.ensemb.compile(f, l).toString
		val whileQuad = new Quadruplet(new CodeOp(CodeOp.OP_FOREACH, foreachLabel.name), "_", elem, ensemble);
		
		if(l==null)
		{
			f.addQuad(whileQuad)
			print("[DBG]f += <FOREACH " + foreachLabel.name + ", _," + elem + ", " + ensemble + ">\n")
		}
		else
		{
			l.add(whileQuad)
			print("[DBG]" + l.name + " += <FOREACH " + foreachLabel.name + ", _," + elem + ", " + ensemble + ">\n")
		}
		c.cmdForEach.cmds.compile(f, foreachLabel)
	} 
	default : c.class.name
}
»'''

	def compile (Expr ex, Fonction f, Label l)
	'''«switch(ex){
			case ex.exprSimp!=null : ex.exprSimp.compile(f, l)
			case ex.exprAnd!=null : ex.exprAnd.compile(f, l)
	    }
	 »'''
	
	def compile (ExprSimple ex, Fonction f, Label l)
	 '''«switch(ex){
	 	case ex.nil!=null : {
	 		val variable = generateVar
	 		val quadruplet = new Quadruplet(new CodeOp(CodeOp.OP_AFF), variable, "nil", "_")
	 		this.varNameTranslation.put(variable, quadruplet)
	 		if(l == null)
	 		{
	 			f.addQuad(quadruplet)
	 			print("[DBG]f += " + variable + " := nil\n")
	 		}
	 		else
	 		{
	 			l.add(quadruplet)
	 			print("[DBG]" + l.name + " += " + variable + " := nil\n")
	 		}
	 		variable
	 	}
	 	case ex.vari!=null : {
	 		val variable = generateVar
	 		val quadruplet = new Quadruplet(new CodeOp(CodeOp.OP_AFF), variable, ex.vari, "_")
	 		this.varNameTranslation.put(ex.vari, quadruplet)
	 		if(l == null)
	 		{
	 			f.addQuad(quadruplet)
	 			print("[DBG]f += " + variable + " := " + ex.vari + "\n")
	 		}
	 		else
	 		{
	 			l.add(quadruplet)
	 			print("[DBG]" + l.name + " += " + variable + " := " + ex.vari + "\n")
	 		}
	 		variable
	 	}
	 	case ex.symb!=null : {
	 		val variable = generateVar
	 		val quadruplet = new Quadruplet(new CodeOp(CodeOp.OP_AFF), variable, ex.symb, "_")
	 		this.varNameTranslation.put(variable, quadruplet)
	 		if(l == null)
	 		{
	 			f.addQuad(quadruplet)
	 			print("[DBG]f += " + variable + " := " + ex.symb + "\n")
	 		}
	 		else
	 		{
	 			l.add(quadruplet)
	 			print("[DBG]" + l.name + " += " + variable + " := " + ex.symb + "\n")
	 		}
	 		variable
	 	}
	 	case ex.exprCons!=null : {
	 		print("cons")
	 		val variable = generateVar
	 		//TODO: Don't work (pas de compile(f) pour la liste)
	 		val quadruplet = new Quadruplet(new CodeOp(CodeOp.OP_CONS), variable, ex.exprCons.exprConsAtt1.compile(f, l).toString, ex.exprCons.exprConsAttList.consList.toString())
	 		this.varNameTranslation.put(variable, quadruplet)
	 		if(l == null)
	 		{
	 			f.addQuad(quadruplet)
	 			print("[DBG] CONS... but don't work yet\n")
	 		}
	 		else
	 		{
	 			l.add(quadruplet)
	 			print("[DBG] CONS... but don't work yet\n")
	 		}
	 		print("[DBG] CONS... but don't work yet\n")
	 		variable
	 	}
	 	case ex.exprHead!=null : {
	 		val variable = generateVar
	 		val res = ex.exprHeadAtt.compile(f, l).toString
	 		val quadruplet = new Quadruplet(new CodeOp(CodeOp.OP_HD), variable, res, "_")
	 		this.varNameTranslation.put(variable, quadruplet)
	 		if(l == null)
	 		{
	 			f.addQuad(quadruplet)
	 			print("[DBG]f += " + variable + " := (hd " + res + ")\n")
	 		}
	 		else
	 		{
	 			l.add(quadruplet)
	 			print("[DBG]" + l.name + " += " + variable + " := (hd " + res + ")\n")
	 		}
	 		variable
	 	}
	 	case ex.exprTail!=null : {
	 		val variable = generateVar
	 		val res = ex.exprTailAtt.compile(f, l).toString
	 		val quadruplet = new Quadruplet(new CodeOp(CodeOp.OP_TL), variable, res, "_")
	 		this.varNameTranslation.put(variable, quadruplet)
	 		if(l == null)
	 		{
	 			f.addQuad(quadruplet)
	 			print("[DBG]f += " + variable + " := (tl " + res + ")\n")
	 		}
	 		else
	 		{
	 			l.add(quadruplet)
	 			print("[DBG]" + l.name + " += " + variable + " := (tl " + res + ")\n")
	 		}
	 		variable
	 	}
	 }
	 »'''
	
	//ajouter la variable dans sa fonction
	def compile(Vars v, Fonction f, Label l)
	//TODO
'''«IF v.eContents.empty»
		«FOR in : v.varGen»
			«var vari = new Variable (in.toString, "intern")»
			«dico.putVariable(vari, f)»
			«vari.getM_name»
		«ENDFOR»
	«ELSE»_
	«ENDIF»
'''

	def compile(Exprs e, Fonction f, Label l)
'''«FOR in : e.expGen»«in.compile(f, l)»«ENDFOR»'''
		
	def compile (ExprAnd ex, Fonction f, Label l)
	'''«ex.exprOr.compile(f, l)»«IF ex.exprAnd!=null»«ex.exprAndAtt.compile(f, l)»«ENDIF»'''
	
	def compile (ExprOr ex, Fonction f, Label l)
	'''«ex.exprNot.compile(f, l)»«IF ex.exprOr!=null»«ex.exprOrAtt.compile(f, l)»«ENDIF»'''
	
	def compile (ExprNot ex, Fonction f, Label l)
	'''«IF ex.not!=null»«ENDIF»«ex.exprEq.compile(f, l)»'''
	
	def compile (ExprEq ex, Fonction f, Label l)
	'''«IF ex.expr!=null»(«ex.expr.compile(f, l)»)«ELSE»«ex.exprSim1.compile(f, l)»«ex.exprSim2.compile(f, l)»«ENDIF»'''
}