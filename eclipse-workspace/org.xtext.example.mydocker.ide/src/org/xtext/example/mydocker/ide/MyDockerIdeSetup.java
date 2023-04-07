/*
 * generated by Xtext 2.30.0
 */
package org.xtext.example.mydocker.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.xtext.util.Modules2;
import org.xtext.example.mydocker.MyDockerRuntimeModule;
import org.xtext.example.mydocker.MyDockerStandaloneSetup;

/**
 * Initialization support for running Xtext languages as language servers.
 */
public class MyDockerIdeSetup extends MyDockerStandaloneSetup {

	@Override
	public Injector createInjector() {
		return Guice.createInjector(Modules2.mixin(new MyDockerRuntimeModule(), new MyDockerIdeModule()));
	}
	
}