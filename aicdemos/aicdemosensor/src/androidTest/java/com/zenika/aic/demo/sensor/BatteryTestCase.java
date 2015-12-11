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
import com.zenika.aic.core.libs.sensor.SensorsPacket;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
//@ContextConfiguration
public class BatteryTestCase extends InstrumentationTestCase {

	private Device device;
	private String appName = "Sensor";
	private String packageName = "aic.zenika.com.sensor";

    @Before
    public void init() {
        injectInstrumentation(InstrumentationRegistry.getInstrumentation());
        device = new Device(appName, packageName, InstrumentationRegistry.getInstrumentation());
    }

    @Test
    public void batteryTest() {
        device.battery.setLevel(99, 100, SensorsPacket.sensors_packet.BatteryPayload.BattStatusType.FULL, 1);
    }

    @Test
    public void gpsTest() {
        device.gps.setPosition(42.42, 42.42, 42);
    }

    @Test
    public void lightTest() {
        device.setValuesForSensor(new float[]{42f},Sensor.TYPE_LIGHT);
    }

    public void selectSensor(String sensor) throws UiObjectNotFoundException, RemoteException {
        UiObject2 navigationDrawerButton = device.device.findObject(By.text("Sensor"));
        assertTrue("Navigation drawer button not found", navigationDrawerButton != null);
        navigationDrawerButton.click();

        device.device.waitForWindowUpdate("", 1000);

        UiObject2 item = device.device.findObject(By.text(sensor));
        assertTrue(sensor + " item not found", navigationDrawerButton != null);
        item.click();
    }
}
