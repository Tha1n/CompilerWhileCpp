/*
 * generated by Xtext
 */
package org.xtext.example;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class WhileCppStandaloneSetup extends WhileCppStandaloneSetupGenerated{

	public static void doSetup() {
		new WhileCppStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}