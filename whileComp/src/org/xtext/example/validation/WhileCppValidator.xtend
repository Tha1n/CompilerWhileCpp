/*
 * generated by Xtext
 */
package org.xtext.example.validation

import java.util.List
import java.util.ArrayList
import org.xtext.example.whileCpp.Program
import org.eclipse.xtext.validation.Check
import org.eclipse.emf.ecore.util.EcoreUtil
import org.xtext.example.WhileCppStandaloneSetup
import org.eclipse.xtext.resource.XtextResourceSet
import org.eclipse.emf.common.util.URI
import SymboleTable.Dictionary

//import org.eclipse.xtext.validation.Check

/**
 * This class contains custom validation rules. 
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
class WhileCppValidator extends AbstractWhileCppValidator {

	def public List<Issue> validate(String in, Dictionary ts)
	{
		var result = new ArrayList<Issue>();
		
		val injector = new WhileCppStandaloneSetup().createInjectorAndDoEMFRegistration();
		val resourceSet = injector.getInstance(XtextResourceSet);
		val uri = URI.createURI(in);
		val xtextResource = resourceSet.getResource(uri, true);
		EcoreUtil.resolveAll(xtextResource);
		
  		for(p: xtextResource.allContents.toIterable.filter(Program))
			result.addAll(checkProgram(p, ts))
  		
  		return result;
	}

	@Check
	def private List<Issue> checkProgram(Program p, Dictionary ts) {
			
	}

//  public static val INVALID_NAME = 'invalidName'
//
//	@Check
//	def checkGreetingStartsWithCapital(Greeting greeting) {
//		if (!Character.isUpperCase(greeting.name.charAt(0))) {
//			warning('Name should start with a capital', 
//					MyDslPackage.Literals.GREETING__NAME,
//					INVALID_NAME)
//		}
//	}
}
