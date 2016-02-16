/*
 * generated by Xtext 2.9.0
 */
package org.xtext.aic.dsl.tests

import com.google.inject.Inject
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import org.xtext.aic.dsl.aiC_DSL.Model

@RunWith(XtextRunner)
@InjectWith(AiC_DSLInjectorProvider)
class AiC_DSLParsingTest{

	@Inject
	ParseHelper<Model> parseHelper;

	@Test 
	def void loadModel() {
		val result = parseHelper.parse('''
			Hello Xtext!
		''')
		Assert.assertNotNull(result)
	}

}