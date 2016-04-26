	
package com.zenika.aic.demo.sensor;

import android.hardware.Sensor;
import android.os.RemoteException;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;
import android.support.test.uiautomator.By;
import android.support.test.uiautomator.UiObject2;
import android.support.test.uiautomator.UiObjectNotFoundException;
import android.test.InstrumentationTestCase;

import com.zenika.aic.core.libs.sensor.Device;
import com.zenika.aic.core.libs.sensor.SDLRecord;

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
		device.takeScreenshot();
		device.startRecording();
		device.waitForUpdate();
	}

	@Test
	public void test_two() {
		device.getBatteryInstance().setLevel(25, 100);
		try {
			selectSensor("Photometer", "Sensor");
		} catch (UiObjectNotFoundException e) {
			e.printStackTrace();
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		device.waitForUpdate();
		device.takeScreenshot();
		device.setValuesForSensor(new float[]{42}, Sensor.TYPE_LIGHT);
		device.waitForUpdate();
		device.takeScreenshot();
		try {
			selectSensor("Home", "Photometer");
		} catch (UiObjectNotFoundException e) {
			e.printStackTrace();
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		device.waitForUpdate();
		device.stopRecording();
	}

	public void selectSensor(String sensor, String from) throws UiObjectNotFoundException, RemoteException {
		UiObject2 navigationDrawerButton = device.getUiDevice().findObject(By.text(from));
		assertTrue("Navigation drawer button not found", navigationDrawerButton != null);
		navigationDrawerButton.click();

		device.getUiDevice().waitForWindowUpdate("", 1000);

		UiObject2 item = device.getUiDevice().findObject(By.text(sensor));
		assertTrue(sensor + " item not found", navigationDrawerButton != null);
		item.click();
	}
}
