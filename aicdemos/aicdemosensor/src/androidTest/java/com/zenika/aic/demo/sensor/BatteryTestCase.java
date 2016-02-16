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

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class BatteryTestCase extends InstrumentationTestCase {

	private Device device;
	String appName = "Sensor";


    @Before
    public void init() {
        device = new Device(appName, InstrumentationRegistry.getInstrumentation());
    }

    @Test
    public void gpsTest() {
        device.getBatteryInstance().setLevel(5, 100);
        device.getGPSInstance().setPosition(42, 42, 500);
    }

    public void selectSensor(String sensor) throws UiObjectNotFoundException, RemoteException {
        UiObject2 navigationDrawerButton = device.getUiDevice().findObject(By.text("Sensor"));
        assertTrue("Navigation drawer button not found", navigationDrawerButton != null);
        navigationDrawerButton.click();

        device.getUiDevice().waitForWindowUpdate("", 1000);

        UiObject2 item = device.getUiDevice().findObject(By.text(sensor));
        assertTrue(sensor + " item not found", navigationDrawerButton != null);
        item.click();
    }
}