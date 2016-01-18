	
package com.zenika.aic.demo.sensor;
	
import android.hardware.Sensor;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;
import android.test.InstrumentationTestCase;
import android.util.Log;

import com.zenika.aic.core.libs.sensor.Device;
import com.zenika.aic.core.libs.sensor.SensorsPacket;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.Before;

@RunWith(AndroidJUnit4.class)
public class Testing extends InstrumentationTestCase {

	private Device device;
	private String appName = "Sensor";
	private String packageName = "aic.zenika.com.sensor";


    @Before
    public void init() {
        device = new Device(appName, packageName, InstrumentationRegistry.getInstrumentation());
	}

	@Test
    public void test() {

		device.setValuesForSensor(new float[]{102f},Sensor.TYPE_LIGHT);

		device.setValuesForSensor(new float[]{18f},Sensor.TYPE_PRESSURE);

}

}
