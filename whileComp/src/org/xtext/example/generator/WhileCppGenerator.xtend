/*
 * generated by Xtext
 */
package org.xtext.example.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.generator.IFileSystemAccess
import javax.inject.Inject

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class WhileCppGenerator implements IGenerator {

	@Inject PrettyPrinterGenerator PrettyGen
  	@Inject ThreeAddGenerator ThreeAddGen

  override void doGenerate(Resource input, IFileSystemAccess fsa) {
    PrettyGen.doGenerate(input, fsa)
    ThreeAddGen.doGenerate(input, fsa)
	}
}