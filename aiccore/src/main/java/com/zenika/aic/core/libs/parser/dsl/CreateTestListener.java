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

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CreateTestParser}.
 */
public interface CreateTestListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CreateTestParser#list}.
	 * @param ctx the parse tree
	 */
	void enterList(CreateTestParser.ListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CreateTestParser#list}.
	 * @param ctx the parse tree
	 */
	void exitList(CreateTestParser.ListContext ctx);
}