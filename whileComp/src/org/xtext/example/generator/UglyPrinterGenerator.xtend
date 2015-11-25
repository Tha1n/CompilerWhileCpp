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
import org.xtext.example.WhileCppStandaloneSetup
import org.eclipse.xtext.resource.XtextResourceSet
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.util.EcoreUtil
import java.io.FileWriter
import java.io.BufferedWriter

class UglyPrinterGenerator implements IGenerator {

	def public void generate(String in, String outputFile)
	{
		val injector = new WhileCppStandaloneSetup().createInjectorAndDoEMFRegistration();
		val resourceSet = injector.getInstance(XtextResourceSet);
		val uri = URI.createURI(in);
		val xtextResource = resourceSet.getResource(uri, true);
		EcoreUtil.resolveAll(xtextResource);
				
		var out = outputFile
		if(out.equals(""))
			out = "sth.wh"
			
		try{
  			val fstream = new FileWriter(out)
  			val buff = new BufferedWriter(fstream)
  			for(p: xtextResource.allContents.toIterable.filter(Program))
				buff.write(p.compile.toString)
  			buff.close()
  		}catch (Exception e){
  			println("Can't write " + out + " - Error: " + e.getMessage())
  		}
		
		
		
	}

	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
		for(p: resource.allContents.toIterable.filter(Program)) {
			fsa.generateFile("UP.wh", p.compile)
		}
	}
	
	def compile (Program p)'''«FOR f: p.fonctions»«f.compile»«ENDFOR»'''
	
	def compile (Function f)'''function «f.nom»:«f.definition.compile» '''
	
	def compile (Definition d)'''read «d.inputs.compile»%«d.commandes.compile»%write «d.outputs.compile»'''
	
	def compile (Input i)'''«FOR in : i.varIn»«in»«IF i.varIn.indexOf(in)!=i.varIn.size-1», «ENDIF»«ENDFOR»'''
	
	def compile (Commands c)'''«FOR cm: c.commande»«cm.compile»«IF c.commande.indexOf(cm)!=c.commande.size-1»«ENDIF»«ENDFOR»'''
		
	def compile (Output o)'''«FOR in : o.varOut»«in»«IF o.varOut.indexOf(in)!=o.varOut.size-1», «ENDIF»«ENDFOR»'''
	
	def compile(Command c)'''«switch (c){
	case c.nop!=null : "nop ;"
	case c.cmdIf!=null : c.cmdIf.compile
	case c.cmdForEach!=null : c.cmdForEach.compile
	case c.vars!=null && c.exprs!=null : c.vars.compile + " := " + c.exprs.compile + " ;" 
	case c.cmdWhile!=null : c.cmdWhile.compile
	default : c.class.name}»'''
	
	def compile(CommandWhile c)'''«IF c.w!=null»while «ELSE»for «ENDIF»«c.expr.compile» do «c.cmds.compile» od'''
	
	def compile(CommandIf c)'''if «c.cond.compile» then «c.cmdsThen.compile»«IF c.cmdsElse!=null» else «c.cmdsElse.compile»«ENDIF» fi'''
	
	def compile(CommandForEach c)'''foreach «c.elem.compile» in «c.ensemb.compile» do «c.cmds.compile» od'''
	
	def compile(Vars v)'''«FOR in : v.varGen»«in»«IF v.varGen.indexOf(in)!=v.varGen.size-1», «ENDIF»«ENDFOR»'''
	
	def compile(Exprs e)'''«FOR in : e.expGen»«in.compile»«IF e.expGen.indexOf(in)!=e.expGen.size-1», «ELSE»«ENDIF»«ENDFOR»'''
	def compile (Expr ex)'''«switch(ex){
			case ex.exprSimp!=null : ex.exprSimp.compile
			case ex.exprAnd!=null : ex.exprAnd.compile}»'''
	
	def compile (ExprSimple ex)'''«switch(ex){
	 	case ex.nil!=null : "nil"
	 	case ex.vari!=null : ex.vari
	 	case ex.symb!=null : ex.symb
	 	case ex.exprCons!=null : "(cons " + ex.exprConsAtt.compile + ")"
	 	case ex.exprList!=null : "(list "+ ex.exprListAtt.compile + ")"
	 	case ex.exprHead!=null : "(hd "+ ex.exprHeadAtt.compile + ")"
	 	case ex.exprTail!=null : "(tl " + ex.exprTailAtt.compile +")"
	 	case ex.nomSymb!=null : "(" + ex.nomSymb + ex.symbAtt.compile + ")"}»'''
	
	def compile (ExprAnd ex)'''«ex.exprOr.compile»«IF ex.exprAnd!=null»«ex.exprAndAtt.compile»«ENDIF»'''
	
	def compile (ExprOr ex)'''«ex.exprNot.compile»«IF ex.exprOr!=null»«ex.exprOrAtt.compile»«ENDIF»'''
	
	def compile (ExprNot ex)'''«IF ex.not!=null»not «ENDIF»«ex.exprEq.compile»'''
	
	def compile (ExprEq ex)'''«IF ex.expr!=null»(«ex.expr.compile»)«ELSE»«ex.exprSim1.compile» =? «ex.exprSim2.compile»«ENDIF»'''
}
