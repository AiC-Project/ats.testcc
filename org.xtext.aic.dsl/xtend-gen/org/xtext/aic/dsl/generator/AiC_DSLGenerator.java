/**
 * generated by Xtext 2.9.0
 */
package org.xtext.aic.dsl.generator;

import com.google.common.collect.Iterators;
import java.util.Iterator;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.xtext.aic.dsl.aiC_DSL.Sensor;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class AiC_DSLGenerator extends AbstractGenerator {
  private String head = "package com.zenika.aic.demo.sensor;\n\t\n\timport android.hardware.Sensor;\n\timport android.support.test.InstrumentationRegistry;\n\timport android.support.test.runner.AndroidJUnit4;\n\timport android.test.InstrumentationTestCase;\n\timport android.util.Log;\n\t\n\timport com.zenika.aic.core.libs.sensor.Device;\n\timport com.zenika.aic.core.libs.sensor.SensorsPacket;\n\timport org.junit.Test;\n\timport org.junit.runner.RunWith;\n\timport org.junit.Before;\n\t\n\t@RunWith(AndroidJUnit4.class)\n\tpublic class Testing extends InstrumentationTestCase {\n\t\n\t\tprivate Device device;\n\t\tprivate String appName = \"Sensor\";\n\t\tprivate String packageName = \"aic.zenika.com.sensor\";\n\t\n\t\n\t    @Before\n\t    public void init() {\n\t        device = new Device(appName, packageName, InstrumentationRegistry.getInstrumentation());\n\t}\n\t@Test\n    public void test() {device.setValuesForSensor(new float[]{\n\t";
  
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    TreeIterator<EObject> _allContents = resource.getAllContents();
    Iterator<Sensor> _filter = Iterators.<Sensor>filter(_allContents, Sensor.class);
    final Function1<Sensor, Integer> _function = new Function1<Sensor, Integer>() {
      @Override
      public Integer apply(final Sensor it) {
        return Integer.valueOf(it.getValue());
      }
    };
    Iterator<Integer> _map = IteratorExtensions.<Sensor, Integer>map(_filter, _function);
    String _plus = (this.head + _map);
    String _plus_1 = (_plus + "f},Sensor.");
    TreeIterator<EObject> _allContents_1 = resource.getAllContents();
    Iterator<Sensor> _filter_1 = Iterators.<Sensor>filter(_allContents_1, Sensor.class);
    final Function1<Sensor, String> _function_1 = new Function1<Sensor, String>() {
      @Override
      public String apply(final Sensor it) {
        return it.getName();
      }
    };
    Iterator<String> _map_1 = IteratorExtensions.<Sensor, String>map(_filter_1, _function_1);
    String _plus_2 = (_plus_1 + _map_1);
    String _plus_3 = (_plus_2 + ");}\n\t\t\t}");
    fsa.generateFile("Testing.java", _plus_3);
  }
}
