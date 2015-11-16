package org.xtext.example;

import org.eclipse.xtext.generator.IGenerator;
import org.xtext.example.generator.UglyPrinterGenerator;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class UglyPrinterStandaloneSetup extends WhileCppStandaloneSetup {

	public Injector createInjector() {
		return Guice.createInjector(new org.xtext.example.WhileCppRuntimeModule() {

			@Override
			public Class<? extends IGenerator> bindIGenerator() {
				return UglyPrinterGenerator.class;
			}

		});
	}
}
