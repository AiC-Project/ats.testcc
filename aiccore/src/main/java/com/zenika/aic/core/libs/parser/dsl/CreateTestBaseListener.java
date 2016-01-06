// Generated from CreateTest.g4 by ANTLR 4.5

	package com.zenika.aic.demo.sensor;
	import android.hardware.Sensor;
	import android.support.test.InstrumentationRegistry;
	import android.support.test.runner.AndroidJUnit4;
	import android.test.InstrumentationTestCase;
	import android.util.Log;

	import com.zenika.aic.core.libs.sensor.Device;
	import com.zenika.aic.core.libs.sensor.SensorsPacket;

	import org.junit.Before;
	import org.junit.Test;
	import org.junit.runner.RunWith;


import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

/**
 * This class provides an empty implementation of {@link CreateTestListener},
 * which can be extended to create a listener which only needs to handle a subset
 * of the available methods.
 */
public class CreateTestBaseListener implements CreateTestListener {
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterList(CreateTestParser.ListContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitList(CreateTestParser.ListContext ctx) { }

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterEveryRule(ParserRuleContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitEveryRule(ParserRuleContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void visitTerminal(TerminalNode node) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void visitErrorNode(ErrorNode node) { }
}