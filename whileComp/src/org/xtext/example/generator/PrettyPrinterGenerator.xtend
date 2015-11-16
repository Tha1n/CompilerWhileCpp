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

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class PrettyPrinterGenerator implements IGenerator {

	int ibd = 1 //ident by default
	
	//ident all structures
	def indent (int level)
	'''«FOR i : 1..level»«IF level>0»«FOR j : 1..ibd»«"\t"»«ENDFOR»«ENDIF»«ENDFOR»'''
	
	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
		for(p: resource.allContents.toIterable.filter(Program)) {
			fsa.generateFile("PP.wh", p.compile(0))
		}
	}
	
	def compile (Program p, int indent)
'''«indent(indent)»«FOR f: p.fonctions»
«f.compile(indent)»
«indent(indent)»«ENDFOR»'''
	
	def compile (Function f, int indent)
'''«indent(indent)»function «f.nom»:
«f.definition.compile(indent+1)»

'''
	
	def compile (Definition d, int indent)
	'''«indent(indent)»read «d.inputs.compile(0)»
«indent(indent)»%
«d.commandes.compile(indent+1)»
«indent(indent)»%
«indent(indent)»write «d.outputs.compile(0)»'''
	
	def compile (Input i, int indent)
	'''«indent(indent)»«FOR in : i.varIn»«in»«IF i.varIn.indexOf(in)!=i.varIn.size-1», «ENDIF»«ENDFOR»'''
	
	def compile (Commands c, int indent)
	'''«FOR cm: c.commande»«cm.compile(indent)»«IF c.commande.indexOf(cm)!=c.commande.size-1»;
«ENDIF»«ENDFOR»'''
		
	def compile (Output o, int indent)
	'''«indent(indent)»«FOR in : o.varOut»«in»«IF o.varOut.indexOf(in)!=o.varOut.size-1», «ENDIF»«ENDFOR»'''
	
	def compile(Command c, int indent)
'''«switch (c){
	case c.nop!=null : indent(indent) + "nop"
	case c.cmdIf!=null : c.cmdIf.compile(indent)
	case c.cmdForEach!=null : c.cmdForEach.compile(indent)
	case c.vars!=null && c.exprs!=null : c.vars.compile(indent) + " := " + c.exprs.compile(0) 
	case c.cmdWhile!=null : c.cmdWhile.compile(indent)
	default : c.class.name
}
»'''


//TODO regler probleme du point virgule apreès les commandes --> la dernière Commande (de Commandes) n'a pas de ';'


	
	def compile(CommandWhile c, int indent)
'''«indent(indent)»«IF c.w!=null»while «ELSE»for «ENDIF»«c.expr.compile(0)» do
«c.cmds.compile(indent+1)»
«indent(indent)»od'''
	
	def compile(CommandIf c, int indent)
'''«indent(indent)»if «c.cond.compile(0)» then 
«c.cmdsThen.compile(indent+1)»«IF c.cmdsElse!=null»
«indent(indent)»else
«c.cmdsElse.compile(indent+1)»«ENDIF»
«indent(indent)»fi'''
	
	def compile(CommandForEach c, int indent)
'''«indent(indent)»foreach «c.elem.compile(0)» in «c.ensemb.compile(0)» do	
«c.cmds.compile(indent+1)»
«indent(indent)»od'''
	
	def compile(Vars v, int indent)
'''«indent(indent)»«FOR in : v.varGen»«in»«IF v.varGen.indexOf(in)!=v.varGen.size-1», «ENDIF»«ENDFOR»'''
	
	def compile(Exprs e, int indent)
'''«FOR in : e.expGen»«in.compile(indent)»«IF e.expGen.indexOf(in)!=e.expGen.size-1», «ELSE»«ENDIF»«ENDFOR»'''
	
	def compile (Expr ex, int indent)
'''«switch(ex){
			case ex.exprSimp!=null : ex.exprSimp.compile(indent)
			case ex.exprAnd!=null : ex.exprAnd.compile(indent)
	    }
	 »'''
	
	def compile (ExprSimple ex, int indent)
	 '''«indent(indent)»«switch(ex){
	 	case ex.nil!=null : "nil"
	 	case ex.vari!=null : ex.vari
	 	case ex.symb!=null : ex.symb
	 	case ex.exprCons!=null : "(cons " + ex.exprConsAtt.compile(0) + ")"
	 	case ex.exprList!=null : "(list "+ ex.exprListAtt.compile(0) + ")"
	 	case ex.exprHead!=null : "(hd "+ ex.exprHeadAtt.compile(0) + ")"
	 	case ex.exprTail!=null : "(tl " + ex.exprTailAtt.compile(0) +")"
	 	case ex.nomSymb!=null : "(" + ex.nomSymb + ex.symbAtt.compile(0) + ")"
	 }
	 »'''
	
	def compile (ExprAnd ex, int indent)
	'''«ex.exprOr.compile(indent)»«IF ex.exprAnd!=null»«ex.exprAndAtt.compile(0)»«ENDIF»'''
	
	def compile (ExprOr ex, int indent)
	'''«ex.exprNot.compile(indent)»«IF ex.exprOr!=null»«ex.exprOrAtt.compile(0)»«ENDIF»'''
	
	def compile (ExprNot ex, int indent)
	'''«indent(indent)»«IF ex.not!=null»not «ENDIF»«ex.exprEq.compile(0)»'''
	
	def compile (ExprEq ex, int indent)
	'''«indent(indent)»«IF ex.expr!=null»(«ex.expr.compile(0)»)«ELSE»«ex.exprSim1.compile(0)» =? «ex.exprSim2.compile(0)»«ENDIF»'''
}
