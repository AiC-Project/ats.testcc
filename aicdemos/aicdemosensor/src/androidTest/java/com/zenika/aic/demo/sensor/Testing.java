	
package com.zenika.aic.demo.sensor;

import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;
import android.test.InstrumentationTestCase;

import com.zenika.aic.core.libs.sensor.Device;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.Before;

@RunWith(AndroidJUnit4.class)
public class Testing extends InstrumentationTestCase {

	private Device device;
	private String appName = "Sensor";


    @Before
    public void init() {
        device = new Device(appName, InstrumentationRegistry.getInstrumentation());
	}

	@Test
	public void test_one() {
		device.getBatteryInstance().setLevel(100, 100);
	}

	@Test
	public void test_two() {
		device.getBatteryInstance().setLevel(5, 100);
	}
}
