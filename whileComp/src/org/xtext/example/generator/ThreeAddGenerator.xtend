/*
 * generated by Xtext
 */
package org.xtext.example.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator
import org.xtext.example.whileCpp.Command
import org.xtext.example.whileCpp.CommandForEach
import org.xtext.example.whileCpp.CommandIf
import org.xtext.example.whileCpp.CommandWhile
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
import org.eclipse.emf.common.util.URI
import org.xtext.example.WhileCppStandaloneSetup
import org.eclipse.xtext.resource.XtextResourceSet
import org.eclipse.emf.ecore.util.EcoreUtil
import SymboleTable.Fonction
import SymboleTable.Variable
import SymboleTable.FunDictionary
import java.util.Set
import java.util.List
import SymboleTable.Quadruplet
import SymboleTable.CodeOp
import java.util.HashMap

/**
 * Generates code from your model files on save.
 * 
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class ThreeAddGenerator implements IGenerator {
	
	FunDictionary dico = new FunDictionary();
	private HashMap<String, String> funNameTranslation;
	 
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
		//TODO
		resetDico
		val injector = new WhileCppStandaloneSetup().createInjectorAndDoEMFRegistration();
		val resourceSet = injector.getInstance(XtextResourceSet);
		val uri = URI.createURI(in);
		val xtextResource = resourceSet.getResource(uri, true);
		this.funNameTranslation = new HashMap<String, String>();
		EcoreUtil.resolveAll(xtextResource);
		
		try{
  			/* val fstream = new FileWriter(out)
  			val buff = new BufferedWriter(fstream)
  			for(p: xtextResource.allContents.toIterable.filter(Program))
				buff.write(print3a())
  			buff.close() */
  		}catch (Exception e){
  			//println("Can't write " + out + " - Error: " + e.getMessage())
  		}
		
	}
	
	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
		
        resetDico
		for(p: resource.allContents.toIterable.filter(Program)) {
			fsa.generateFile("PP.3a", p.compile())
			}
		print(dico.toString())
	}

	def compile (Program p)
'''«FOR f: p.fonctions»
«f.compile()»
«ENDFOR»
«print3a()»'''
	
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
«d.commandes.compile(f)»
«d.outputs.compile(f)»'''
	
	def compile (Input i, Fonction f)
	'''«FOR in : i.varIn»«f.add(new Variable(in, "input"))»«IF i.varIn.indexOf(in)!=i.varIn.size-1»«ENDIF»«ENDFOR»'''
	
	def compile (Commands c, Fonction f)
	'''«IF c != null»«FOR cm: c.commande»«IF cm != null»«cm.compile(f)»«ENDIF»«ENDFOR»«ELSE»_«ENDIF»'''
		
	def compile (Output o, Fonction f)
	'''«FOR in : o.varOut»«ENDFOR»'''
	
	def compile(Command c, Fonction f)
'''«switch (c){
	case c.nop!=null : f.addQuad(new Quadruplet(new CodeOp(CodeOp.OP_NOP), "_", "_", "_"))
	case c.cmdIf!=null : {
	}//f.addQuad(new Quadruplet("If",c.cmdIf.cmdsThen.compile(f).toString,c.cmdIf.cmdsElse.compile(f).toString,c.cmdIf.cond.compile(f).toString))
	case c.cmdForEach!=null : c.cmdForEach.compile(f)
	case c.vars!=null && c.exprs!=null : 1+1//f.addQuad(new Quadruplet(":=", c.vars.compile(f).toString(), c.exprs.compile(f).toString(), "_"))
	case c.cmdWhile!=null : {
		c.cmdWhile.compile(f)
	} 
	default : c.class.name
}
»'''

	def compile(CommandWhile c, Fonction f)
'''«c.expr.compile(f)»«c.cmds.compile(f)»
'''
	
	def compile(CommandIf c, Fonction f)
'''«c.cond.compile(f)» 
«c.cmdsThen.compile(f)»
«c.cmdsElse.compile(f)»'''
	
	def compile(CommandForEach c, Fonction f)
'''«c.elem.compile(f)»«c.ensemb.compile(f)»	
«c.cmds.compile(f)»'''
	
	//ajouter la variable dans sa fonction
	def compile(Vars v, Fonction f)
	//TODO Késako Variable intern ????? (Alex)
'''«IF v.eContents.empty»«FOR in : v.varGen»«var vari = new Variable (in.toString, "intern")»«dico.putVariable(vari, f)»«vari.getM_name»«ENDFOR»«ELSE»_«ENDIF»'''
	
	def compile(Exprs e, Fonction f)
'''«FOR in : e.expGen»«in.compile(f)»«ENDFOR»'''
	
	def compile (Expr ex, Fonction f)
'''«switch(ex){
			case ex.exprSimp!=null : ex.exprSimp.compile(f)
			case ex.exprAnd!=null : ex.exprAnd.compile(f)
	    }
	 »'''
	
	def compile (ExprSimple ex, Fonction f)
	 '''«switch(ex){
	 	case ex.nil!=null : "nil"
	 	case ex.vari!=null : ex.vari
	 	case ex.symb!=null : ex.symb
	 	case ex.exprCons!=null : 1+1// dico.getFunctions.get(0).addQuad(new Quadruplet("cons", ex.exprCons.exprConsAtt1.compile(f).toString ,ex.exprCons.exprConsAttList.consList.toString() ," "))
	 	case ex.exprHead!=null : "<hd ,"+ ex.exprHeadAtt.compile(f) + ">"
	 	case ex.exprTail!=null : "<tl ," + ex.exprTailAtt.compile(f) +">"
	 	case ex.nomSymb!=null : ""//"(" + ex.nomSymb + ex.symbAtt.compile(0) + ")"
	 }
	 »'''
		
	def compile (ExprAnd ex, Fonction f)
	'''«ex.exprOr.compile(f)»«IF ex.exprAnd!=null»«ex.exprAndAtt.compile(f)»«ENDIF»'''
	
	def compile (ExprOr ex, Fonction f)
	'''«ex.exprNot.compile(f)»«IF ex.exprOr!=null»«ex.exprOrAtt.compile(f)»«ENDIF»'''
	
	def compile (ExprNot ex, Fonction f)
	'''«IF ex.not!=null»«ENDIF»«ex.exprEq.compile(f)»'''
	
	def compile (ExprEq ex, Fonction f)
	'''«IF ex.expr!=null»(«ex.expr.compile(f)»)«ELSE»«ex.exprSim1.compile(f)»«ex.exprSim2.compile(f)»«ENDIF»'''
}

