package com.zenika.aic.demo.sensor;

import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;
import android.support.test.uiautomator.By;
import android.support.test.uiautomator.UiObject2;
import android.support.test.uiautomator.UiObjectNotFoundException;
import android.test.InstrumentationTestCase;
import android.view.View;

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
//		Instrumentation.ActivityMonitor monitor =  getInstrumentation().addMonitor(MainActivity.class.getName(), null, false);
//		Activity currentActivity = getInstrumentation().waitForMonitorWithTimeout(monitor, 5);
//		View v = currentActivity.findViewById(android.R.id.content);
		View v = null;
        device = new Device(appName, InstrumentationRegistry.getInstrumentation(), v);
	}

	@Test
	public void test_one() {
		device.clickOn("Sensor");
        device.swipe();
	}

//	@Test
//	public void test_two() {
//		device.getBatteryInstance().setLevel(25, 100);
//		try {
//			selectSensor("Photometer", "Sensor");
//		} catch (UiObjectNotFoundException e) {
//			e.printStackTrace();
//		} catch (RemoteException e) {
//			e.printStackTrace();
//		}
//		device.waitForUpdate();
//		device.takeScreenshot();
//		device.setValuesForSensor(new float[]{42}, Sensor.TYPE_LIGHT);
//		device.waitForUpdate();
//		device.takeScreenshot();
//		try {
//			selectSensor("Home", "Photometer");
//		} catch (UiObjectNotFoundException e) {
//			e.printStackTrace();
//		} catch (RemoteException e) {
//			e.printStackTrace();
//		}
//		device.waitForUpdate();
//		device.stopRecording();
//	}

}
