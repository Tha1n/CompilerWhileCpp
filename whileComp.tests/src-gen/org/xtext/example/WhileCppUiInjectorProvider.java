/*
 * generated by Xtext
 */
package org.xtext.example;

import org.eclipse.xtext.junit4.IInjectorProvider;

import com.google.inject.Injector;

public class WhileCppUiInjectorProvider implements IInjectorProvider {
	
	@Override
	public Injector getInjector() {
		return org.xtext.example.ui.internal.WhileCppActivator.getInstance().getInjector("org.xtext.example.WhileCpp");
	}
	
}
