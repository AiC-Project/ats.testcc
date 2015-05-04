package com.zenika.aic.core.libs;

import android.app.Application;
import android.test.ApplicationTestCase;
import android.util.Log;
import com.zenika.aic.core.libs.parser.Parser;

import java.io.PrintWriter;

/**
 * <a href="http://d.android.com/tools/testing/testing_android.html">Testing Fundamentals</a>
 */
public class ParserTest extends ApplicationTestCase<Application> {
    public ParserTest() {
        super(Application.class);
        String content = "" +
                "INSTRUMENTATION_STATUS: numtests=2\n" +
                "INSTRUMENTATION_STATUS: stream=\n" +
                "com.zenika.aic.demo.sensor.BatteryTestCase:\n" +
                "INSTRUMENTATION_STATUS: id=AndroidJUnitRunner\n" +
                "INSTRUMENTATION_STATUS: test=testUS1\n" +
                "INSTRUMENTATION_STATUS: class=com.zenika.aic.demo.sensor.BatteryTestCase\n" +
                "INSTRUMENTATION_STATUS: current=1\n" +
                "INSTRUMENTATION_STATUS_CODE: 1\n" +
                "INSTRUMENTATION_STATUS: numtests=2\n" +
                "INSTRUMENTATION_STATUS: stream=\n" +
                "Error in testUS1(com.zenika.aic.demo.sensor.BatteryTestCase):\n" +
                "junit.framework.AssertionFailedError: Battery level = 50000000\n" +
                "\tat junit.framework.Assert.fail(Assert.java:50)\n" +
                "\tat junit.framework.Assert.assertTrue(Assert.java:20)\n" +
                "\tat com.zenika.aic.demo.sensor.BatteryTestCase.testUS1(BatteryTestCase.java:39)\n" +
                "\tat java.lang.reflect.Method.invokeNative(Native Method)\n" +
                "\tat java.lang.reflect.Method.invoke(Method.java:515)\n" +
                "\tat android.test.InstrumentationTestCase.runMethod(InstrumentationTestCase.java:214)\n" +
                "\tat android.test.InstrumentationTestCase.runTest(InstrumentationTestCase.java:199)\n" +
                "\tat junit.framework.TestCase.runBare(TestCase.java:134)\n" +
                "\tat junit.framework.TestResult$1.protect(TestResult.java:115)\n" +
                "\tat junit.framework.TestResult.runProtected(TestResult.java:133)\n" +
                "\tat android.support.test.internal.runner.junit3.DelegatingTestResult.runProtected(DelegatingTestResult.java:90)\n" +
                "\tat junit.framework.TestResult.run(TestResult.java:118)\n" +
                "\tat android.support.test.internal.runner.junit3.AndroidTestResult.run(AndroidTestResult.java:49)\n" +
                "\tat junit.framework.TestCase.run(TestCase.java:124)\n" +
                "\tat android.support.test.internal.runner.junit3.NonLeakyTestSuite$NonLeakyTest.run(NonLeakyTestSuite.java:63)\n" +
                "\tat junit.framework.TestSuite.runTest(TestSuite.java:243)\n" +
                "\tat junit.framework.TestSuite.run(TestSuite.java:238)\n" +
                "\tat android.support.test.internal.runner.junit3.DelegatingTestSuite.run(DelegatingTestSuite.java:103)\n" +
                "\tat android.support.test.internal.runner.junit3.AndroidTestSuite.run(AndroidTestSuite.java:63)\n" +
                "\tat android.support.test.internal.runner.junit3.JUnit38ClassRunner.run(JUnit38ClassRunner.java:90)\n" +
                "\tat org.junit.runners.Suite.runChild(Suite.java:128)\n" +
                "\tat org.junit.runners.Suite.runChild(Suite.java:24)\n" +
                "\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:231)\n" +
                "\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:60)\n" +
                "\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:229)\n" +
                "\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:50)\n" +
                "\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:222)\n" +
                "\tat org.junit.runners.ParentRunner.run(ParentRunner.java:300)\n" +
                "\tat org.junit.runner.JUnitCore.run(JUnitCore.java:157)\n" +
                "\tat org.junit.runner.JUnitCore.run(JUnitCore.java:136)\n" +
                "\tat android.support.test.runner.AndroidJUnitRunner.onStart(AndroidJUnitRunner.java:270)\n" +
                "\tat android.app.Instrumentation$InstrumentationThread.run(Instrumentation.java:1701)\n" +
                "\n" +
                "INSTRUMENTATION_STATUS: id=AndroidJUnitRunner\n" +
                "INSTRUMENTATION_STATUS: test=testUS1\n" +
                "INSTRUMENTATION_STATUS: class=com.zenika.aic.demo.sensor.BatteryTestCase\n" +
                "INSTRUMENTATION_STATUS: stack=junit.framework.AssertionFailedError: Battery level = 50000000\n" +
                "\tat junit.framework.Assert.fail(Assert.java:50)\n" +
                "\tat junit.framework.Assert.assertTrue(Assert.java:20)\n" +
                "\tat com.zenika.aic.demo.sensor.BatteryTestCase.testUS1(BatteryTestCase.java:39)\n" +
                "\tat java.lang.reflect.Method.invokeNative(Native Method)\n" +
                "\tat java.lang.reflect.Method.invoke(Method.java:515)\n" +
                "\tat android.test.InstrumentationTestCase.runMethod(InstrumentationTestCase.java:214)\n" +
                "\tat android.test.InstrumentationTestCase.runTest(InstrumentationTestCase.java:199)\n" +
                "\tat junit.framework.TestCase.runBare(TestCase.java:134)\n" +
                "\tat junit.framework.TestResult$1.protect(TestResult.java:115)\n" +
                "\tat junit.framework.TestResult.runProtected(TestResult.java:133)\n" +
                "\tat android.support.test.internal.runner.junit3.DelegatingTestResult.runProtected(DelegatingTestResult.java:90)\n" +
                "\tat junit.framework.TestResult.run(TestResult.java:118)\n" +
                "\tat android.support.test.internal.runner.junit3.AndroidTestResult.run(AndroidTestResult.java:49)\n" +
                "\tat junit.framework.TestCase.run(TestCase.java:124)\n" +
                "\tat android.support.test.internal.runner.junit3.NonLeakyTestSuite$NonLeakyTest.run(NonLeakyTestSuite.java:63)\n" +
                "\tat junit.framework.TestSuite.runTest(TestSuite.java:243)\n" +
                "\tat junit.framework.TestSuite.run(TestSuite.java:238)\n" +
                "\tat android.support.test.internal.runner.junit3.DelegatingTestSuite.run(DelegatingTestSuite.java:103)\n" +
                "\tat android.support.test.internal.runner.junit3.AndroidTestSuite.run(AndroidTestSuite.java:63)\n" +
                "\tat android.support.test.internal.runner.junit3.JUnit38ClassRunner.run(JUnit38ClassRunner.java:90)\n" +
                "\tat org.junit.runners.Suite.runChild(Suite.java:128)\n" +
                "\tat org.junit.runners.Suite.runChild(Suite.java:24)\n" +
                "\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:231)\n" +
                "\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:60)\n" +
                "\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:229)\n" +
                "\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:50)\n" +
                "\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:222)\n" +
                "\tat org.junit.runners.ParentRunner.run(ParentRunner.java:300)\n" +
                "\tat org.junit.runner.JUnitCore.run(JUnitCore.java:157)\n" +
                "\tat org.junit.runner.JUnitCore.run(JUnitCore.java:136)\n" +
                "\tat android.support.test.runner.AndroidJUnitRunner.onStart(AndroidJUnitRunner.java:270)\n" +
                "\tat android.app.Instrumentation$InstrumentationThread.run(Instrumentation.java:1701)\n" +
                "\n" +
                "INSTRUMENTATION_STATUS: current=1\n" +
                "INSTRUMENTATION_STATUS_CODE: -2\n" +
                "INSTRUMENTATION_STATUS: numtests=2\n" +
                "INSTRUMENTATION_STATUS: stream=\n" +
                "INSTRUMENTATION_STATUS: id=AndroidJUnitRunner\n" +
                "INSTRUMENTATION_STATUS: test=testUS2\n" +
                "INSTRUMENTATION_STATUS: class=com.zenika.aic.demo.sensor.BatteryTestCase\n" +
                "INSTRUMENTATION_STATUS: stack=junit.framework.AssertionFailedError: Battery level = 50000000\n" +
                "\tat junit.framework.Assert.fail(Assert.java:50)\n" +
                "\tat junit.framework.Assert.assertTrue(Assert.java:20)\n" +
                "\tat com.zenika.aic.demo.sensor.BatteryTestCase.testUS1(BatteryTestCase.java:39)\n" +
                "\tat java.lang.reflect.Method.invokeNative(Native Method)\n" +
                "\tat java.lang.reflect.Method.invoke(Method.java:515)\n" +
                "\tat android.test.InstrumentationTestCase.runMethod(InstrumentationTestCase.java:214)\n" +
                "\tat android.test.InstrumentationTestCase.runTest(InstrumentationTestCase.java:199)\n" +
                "\tat junit.framework.TestCase.runBare(TestCase.java:134)\n" +
                "\tat junit.framework.TestResult$1.protect(TestResult.java:115)\n" +
                "\tat junit.framework.TestResult.runProtected(TestResult.java:133)\n" +
                "\tat android.support.test.internal.runner.junit3.DelegatingTestResult.runProtected(DelegatingTestResult.java:90)\n" +
                "\tat junit.framework.TestResult.run(TestResult.java:118)\n" +
                "\tat android.support.test.internal.runner.junit3.AndroidTestResult.run(AndroidTestResult.java:49)\n" +
                "\tat junit.framework.TestCase.run(TestCase.java:124)\n" +
                "\tat android.support.test.internal.runner.junit3.NonLeakyTestSuite$NonLeakyTest.run(NonLeakyTestSuite.java:63)\n" +
                "\tat junit.framework.TestSuite.runTest(TestSuite.java:243)\n" +
                "\tat junit.framework.TestSuite.run(TestSuite.java:238)\n" +
                "\tat android.support.test.internal.runner.junit3.DelegatingTestSuite.run(DelegatingTestSuite.java:103)\n" +
                "\tat android.support.test.internal.runner.junit3.AndroidTestSuite.run(AndroidTestSuite.java:63)\n" +
                "\tat android.support.test.internal.runner.junit3.JUnit38ClassRunner.run(JUnit38ClassRunner.java:90)\n" +
                "\tat org.junit.runners.Suite.runChild(Suite.java:128)\n" +
                "\tat org.junit.runners.Suite.runChild(Suite.java:24)\n" +
                "\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:231)\n" +
                "\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:60)\n" +
                "\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:229)\n" +
                "\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:50)\n" +
                "\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:222)\n" +
                "\tat org.junit.runners.ParentRunner.run(ParentRunner.java:300)\n" +
                "\tat org.junit.runner.JUnitCore.run(JUnitCore.java:157)\n" +
                "\tat org.junit.runner.JUnitCore.run(JUnitCore.java:136)\n" +
                "\tat android.support.test.runner.AndroidJUnitRunner.onStart(AndroidJUnitRunner.java:270)\n" +
                "\tat android.app.Instrumentation$InstrumentationThread.run(Instrumentation.java:1701)\n" +
                "\n" +
                "INSTRUMENTATION_STATUS: current=2\n" +
                "INSTRUMENTATION_STATUS_CODE: 1\n" +
                "INSTRUMENTATION_STATUS: numtests=2\n" +
                "INSTRUMENTATION_STATUS: stream=\n" +
                "Error in testUS2(com.zenika.aic.demo.sensor.BatteryTestCase):\n" +
                "junit.framework.AssertionFailedError: Battery level not found\n" +
                "\tat junit.framework.Assert.fail(Assert.java:50)\n" +
                "\tat junit.framework.Assert.assertTrue(Assert.java:20)\n" +
                "\tat com.zenika.aic.demo.sensor.BatteryTestCase.setLevel(BatteryTestCase.java:89)\n" +
                "\tat com.zenika.aic.demo.sensor.BatteryTestCase.testUS2(BatteryTestCase.java:47)\n" +
                "\tat java.lang.reflect.Method.invokeNative(Native Method)\n" +
                "\tat java.lang.reflect.Method.invoke(Method.java:515)\n" +
                "\tat android.test.InstrumentationTestCase.runMethod(InstrumentationTestCase.java:214)\n" +
                "\tat android.test.InstrumentationTestCase.runTest(InstrumentationTestCase.java:199)\n" +
                "\tat junit.framework.TestCase.runBare(TestCase.java:134)\n" +
                "\tat junit.framework.TestResult$1.protect(TestResult.java:115)\n" +
                "\tat junit.framework.TestResult.runProtected(TestResult.java:133)\n" +
                "\tat android.support.test.internal.runner.junit3.DelegatingTestResult.runProtected(DelegatingTestResult.java:90)\n" +
                "\tat junit.framework.TestResult.run(TestResult.java:118)\n" +
                "\tat android.support.test.internal.runner.junit3.AndroidTestResult.run(AndroidTestResult.java:49)\n" +
                "\tat junit.framework.TestCase.run(TestCase.java:124)\n" +
                "\tat android.support.test.internal.runner.junit3.NonLeakyTestSuite$NonLeakyTest.run(NonLeakyTestSuite.java:63)\n" +
                "\tat junit.framework.TestSuite.runTest(TestSuite.java:243)\n" +
                "\tat junit.framework.TestSuite.run(TestSuite.java:238)\n" +
                "\tat android.support.test.internal.runner.junit3.DelegatingTestSuite.run(DelegatingTestSuite.java:103)\n" +
                "\tat android.support.test.internal.runner.junit3.AndroidTestSuite.run(AndroidTestSuite.java:63)\n" +
                "\tat android.support.test.internal.runner.junit3.JUnit38ClassRunner.run(JUnit38ClassRunner.java:90)\n" +
                "\tat org.junit.runners.Suite.runChild(Suite.java:128)\n" +
                "\tat org.junit.runners.Suite.runChild(Suite.java:24)\n" +
                "\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:231)\n" +
                "\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:60)\n" +
                "\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:229)\n" +
                "\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:50)\n" +
                "\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:222)\n" +
                "\tat org.junit.runners.ParentRunner.run(ParentRunner.java:300)\n" +
                "\tat org.junit.runner.JUnitCore.run(JUnitCore.java:157)\n" +
                "\tat org.junit.runner.JUnitCore.run(JUnitCore.java:136)\n" +
                "\tat android.support.test.runner.AndroidJUnitRunner.onStart(AndroidJUnitRunner.java:270)\n" +
                "\tat android.app.Instrumentation$InstrumentationThread.run(Instrumentation.java:1701)\n" +
                "\n" +
                "INSTRUMENTATION_STATUS: id=AndroidJUnitRunner\n" +
                "INSTRUMENTATION_STATUS: test=testUS2\n" +
                "INSTRUMENTATION_STATUS: class=com.zenika.aic.demo.sensor.BatteryTestCase\n" +
                "INSTRUMENTATION_STATUS: stack=junit.framework.AssertionFailedError: Battery level not found\n" +
                "\tat junit.framework.Assert.fail(Assert.java:50)\n" +
                "\tat junit.framework.Assert.assertTrue(Assert.java:20)\n" +
                "\tat com.zenika.aic.demo.sensor.BatteryTestCase.setLevel(BatteryTestCase.java:89)\n" +
                "\tat com.zenika.aic.demo.sensor.BatteryTestCase.testUS2(BatteryTestCase.java:47)\n" +
                "\tat java.lang.reflect.Method.invokeNative(Native Method)\n" +
                "\tat java.lang.reflect.Method.invoke(Method.java:515)\n" +
                "\tat android.test.InstrumentationTestCase.runMethod(InstrumentationTestCase.java:214)\n" +
                "\tat android.test.InstrumentationTestCase.runTest(InstrumentationTestCase.java:199)\n" +
                "\tat junit.framework.TestCase.runBare(TestCase.java:134)\n" +
                "\tat junit.framework.TestResult$1.protect(TestResult.java:115)\n" +
                "\tat junit.framework.TestResult.runProtected(TestResult.java:133)\n" +
                "\tat android.support.test.internal.runner.junit3.DelegatingTestResult.runProtected(DelegatingTestResult.java:90)\n" +
                "\tat junit.framework.TestResult.run(TestResult.java:118)\n" +
                "\tat android.support.test.internal.runner.junit3.AndroidTestResult.run(AndroidTestResult.java:49)\n" +
                "\tat junit.framework.TestCase.run(TestCase.java:124)\n" +
                "\tat android.support.test.internal.runner.junit3.NonLeakyTestSuite$NonLeakyTest.run(NonLeakyTestSuite.java:63)\n" +
                "\tat junit.framework.TestSuite.runTest(TestSuite.java:243)\n" +
                "\tat junit.framework.TestSuite.run(TestSuite.java:238)\n" +
                "\tat android.support.test.internal.runner.junit3.DelegatingTestSuite.run(DelegatingTestSuite.java:103)\n" +
                "\tat android.support.test.internal.runner.junit3.AndroidTestSuite.run(AndroidTestSuite.java:63)\n" +
                "\tat android.support.test.internal.runner.junit3.JUnit38ClassRunner.run(JUnit38ClassRunner.java:90)\n" +
                "\tat org.junit.runners.Suite.runChild(Suite.java:128)\n" +
                "\tat org.junit.runners.Suite.runChild(Suite.java:24)\n" +
                "\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:231)\n" +
                "\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:60)\n" +
                "\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:229)\n" +
                "\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:50)\n" +
                "\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:222)\n" +
                "\tat org.junit.runners.ParentRunner.run(ParentRunner.java:300)\n" +
                "\tat org.junit.runner.JUnitCore.run(JUnitCore.java:157)\n" +
                "\tat org.junit.runner.JUnitCore.run(JUnitCore.java:136)\n" +
                "\tat android.support.test.runner.AndroidJUnitRunner.onStart(AndroidJUnitRunner.java:270)\n" +
                "\tat android.app.Instrumentation$InstrumentationThread.run(Instrumentation.java:1701)\n" +
                "\n" +
                "INSTRUMENTATION_STATUS: current=2\n" +
                "INSTRUMENTATION_STATUS_CODE: -2\n" +
                "INSTRUMENTATION_RESULT: stream=\n" +
                ".E.E\n" +
                "Time: 28.486\n" +
                "There were 2 failures:\n" +
                "1) testUS1(com.zenika.aic.demo.sensor.BatteryTestCase)\n" +
                "junit.framework.AssertionFailedError: Battery level = 50000000\n" +
                "\tat junit.framework.Assert.fail(Assert.java:50)\n" +
                "\tat junit.framework.Assert.assertTrue(Assert.java:20)\n" +
                "\tat com.zenika.aic.demo.sensor.BatteryTestCase.testUS1(BatteryTestCase.java:39)\n" +
                "\tat java.lang.reflect.Method.invokeNative(Native Method)\n" +
                "\tat java.lang.reflect.Method.invoke(Method.java:515)\n" +
                "\tat android.test.InstrumentationTestCase.runMethod(InstrumentationTestCase.java:214)\n" +
                "\tat android.test.InstrumentationTestCase.runTest(InstrumentationTestCase.java:199)\n" +
                "\tat junit.framework.TestCase.runBare(TestCase.java:134)\n" +
                "\tat junit.framework.TestResult$1.protect(TestResult.java:115)\n" +
                "\tat junit.framework.TestResult.runProtected(TestResult.java:133)\n" +
                "\tat android.support.test.internal.runner.junit3.DelegatingTestResult.runProtected(DelegatingTestResult.java:90)\n" +
                "\tat junit.framework.TestResult.run(TestResult.java:118)\n" +
                "\tat android.support.test.internal.runner.junit3.AndroidTestResult.run(AndroidTestResult.java:49)\n" +
                "\tat junit.framework.TestCase.run(TestCase.java:124)\n" +
                "\tat android.support.test.internal.runner.junit3.NonLeakyTestSuite$NonLeakyTest.run(NonLeakyTestSuite.java:63)\n" +
                "\tat junit.framework.TestSuite.runTest(TestSuite.java:243)\n" +
                "\tat junit.framework.TestSuite.run(TestSuite.java:238)\n" +
                "\tat android.support.test.internal.runner.junit3.DelegatingTestSuite.run(DelegatingTestSuite.java:103)\n" +
                "\tat android.support.test.internal.runner.junit3.AndroidTestSuite.run(AndroidTestSuite.java:63)\n" +
                "\tat android.support.test.internal.runner.junit3.JUnit38ClassRunner.run(JUnit38ClassRunner.java:90)\n" +
                "\tat org.junit.runners.Suite.runChild(Suite.java:128)\n" +
                "\tat org.junit.runners.Suite.runChild(Suite.java:24)\n" +
                "\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:231)\n" +
                "\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:60)\n" +
                "\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:229)\n" +
                "\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:50)\n" +
                "\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:222)\n" +
                "\tat org.junit.runners.ParentRunner.run(ParentRunner.java:300)\n" +
                "\tat org.junit.runner.JUnitCore.run(JUnitCore.java:157)\n" +
                "\tat org.junit.runner.JUnitCore.run(JUnitCore.java:136)\n" +
                "\tat android.support.test.runner.AndroidJUnitRunner.onStart(AndroidJUnitRunner.java:270)\n" +
                "\tat android.app.Instrumentation$InstrumentationThread.run(Instrumentation.java:1701)\n" +
                "2) testUS2(com.zenika.aic.demo.sensor.BatteryTestCase)\n" +
                "junit.framework.AssertionFailedError: Battery level not found\n" +
                "\tat junit.framework.Assert.fail(Assert.java:50)\n" +
                "\tat junit.framework.Assert.assertTrue(Assert.java:20)\n" +
                "\tat com.zenika.aic.demo.sensor.BatteryTestCase.setLevel(BatteryTestCase.java:89)\n" +
                "\tat com.zenika.aic.demo.sensor.BatteryTestCase.testUS2(BatteryTestCase.java:47)\n" +
                "\tat java.lang.reflect.Method.invokeNative(Native Method)\n" +
                "\tat java.lang.reflect.Method.invoke(Method.java:515)\n" +
                "\tat android.test.InstrumentationTestCase.runMethod(InstrumentationTestCase.java:214)\n" +
                "\tat android.test.InstrumentationTestCase.runTest(InstrumentationTestCase.java:199)\n" +
                "\tat junit.framework.TestCase.runBare(TestCase.java:134)\n" +
                "\tat junit.framework.TestResult$1.protect(TestResult.java:115)\n" +
                "\tat junit.framework.TestResult.runProtected(TestResult.java:133)\n" +
                "\tat android.support.test.internal.runner.junit3.DelegatingTestResult.runProtected(DelegatingTestResult.java:90)\n" +
                "\tat junit.framework.TestResult.run(TestResult.java:118)\n" +
                "\tat android.support.test.internal.runner.junit3.AndroidTestResult.run(AndroidTestResult.java:49)\n" +
                "\tat junit.framework.TestCase.run(TestCase.java:124)\n" +
                "\tat android.support.test.internal.runner.junit3.NonLeakyTestSuite$NonLeakyTest.run(NonLeakyTestSuite.java:63)\n" +
                "\tat junit.framework.TestSuite.runTest(TestSuite.java:243)\n" +
                "\tat junit.framework.TestSuite.run(TestSuite.java:238)\n" +
                "\tat android.support.test.internal.runner.junit3.DelegatingTestSuite.run(DelegatingTestSuite.java:103)\n" +
                "\tat android.support.test.internal.runner.junit3.AndroidTestSuite.run(AndroidTestSuite.java:63)\n" +
                "\tat android.support.test.internal.runner.junit3.JUnit38ClassRunner.run(JUnit38ClassRunner.java:90)\n" +
                "\tat org.junit.runners.Suite.runChild(Suite.java:128)\n" +
                "\tat org.junit.runners.Suite.runChild(Suite.java:24)\n" +
                "\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:231)\n" +
                "\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:60)\n" +
                "\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:229)\n" +
                "\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:50)\n" +
                "\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:222)\n" +
                "\tat org.junit.runners.ParentRunner.run(ParentRunner.java:300)\n" +
                "\tat org.junit.runner.JUnitCore.run(JUnitCore.java:157)\n" +
                "\tat org.junit.runner.JUnitCore.run(JUnitCore.java:136)\n" +
                "\tat android.support.test.runner.AndroidJUnitRunner.onStart(AndroidJUnitRunner.java:270)\n" +
                "\tat android.app.Instrumentation$InstrumentationThread.run(Instrumentation.java:1701)\n" +
                "\n" +
                "FAILURES!!!\n" +
                "Tests run: 2,  Failures: 2\n" +
                "\n" +
                "\n" +
                "INSTRUMENTATION_CODE: -1" +
                "";
        Parser parser = new Parser("test",content);
        try {
                PrintWriter writer = new PrintWriter("/sdcard/the-file-name.txt", "UTF-8");
                writer.println(parser.toJson());
                writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}