/*
 * generated by Xtext 2.30.0
 */
package org.xtext.example.mydocker.ui.tests;

import com.google.inject.Injector;
import org.eclipse.xtext.testing.IInjectorProvider;
import org.xtext.example.mydocker.ui.internal.MydockerActivator;

public class MyDockerUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return MydockerActivator.getInstance().getInjector("org.xtext.example.mydocker.MyDocker");
	}

}
