package com.zenika.aic.demo.sensor;

import android.app.Instrumentation;
import android.hardware.Sensor;
import android.os.RemoteException;
import android.support.test.uiautomator.By;
import android.support.test.uiautomator.UiObject2;
import android.support.test.uiautomator.UiObjectNotFoundException;
import android.test.InstrumentationTestCase;

import com.zenika.aic.core.libs.sensor.Device;
import com.zenika.aic.core.libs.sensor.SensorsPacket;

public class BatteryTestCase extends InstrumentationTestCase {

	private Device device;
	private String appName;
	private String packageName;

    public BatteryTestCase() throws RemoteException, UiObjectNotFoundException {
        this.appName = "Sensor";
        this.packageName = "aic.zenika.com.sensor";
    }

    @Override
    protected void setUp() {
        Instrumentation instru = getInstrumentation();
        device = new Device(appName, packageName, instru);
    }

    public void testUS1() {
		device.setValuesForSensor(new float[]{666f},Sensor.TYPE_LIGHT);
        device.setBatteryLevel(4, 100, SensorsPacket.sensors_packet.BatteryPayload.BattStatusType.FULL, 0);
		device.setLocation(48.879119, 2.328443, 8848);
		device.waitForUpdate();
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
