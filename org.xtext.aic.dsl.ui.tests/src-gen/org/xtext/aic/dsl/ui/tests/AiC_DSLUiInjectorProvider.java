/*
 * generated by Xtext 2.9.0
 */
package org.xtext.aic.dsl.ui.tests;

import com.google.inject.Injector;
import org.eclipse.xtext.junit4.IInjectorProvider;
import org.xtext.aic.dsl.ui.internal.DslActivator;

public class AiC_DSLUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return DslActivator.getInstance().getInjector("org.xtext.aic.dsl.AiC_DSL");
	}

}