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

@RunWith(AndroidJUnit4.class)
public class BatteryTestCase extends InstrumentationTestCase {

	private Device device;
	private String appName = "Sensor";
	private String packageName = "aic.zenika.com.sensor";


    @Before
    public void init() {
        device = new Device(appName, packageName, InstrumentationRegistry.getInstrumentation());
    }


    @Test
    public void batteryTest() {
        Log.v("coucou", "batteryTest");
        device.getBatteryInstance().setLevel(6, 100, SensorsPacket.sensors_packet.BatteryPayload.BattStatusType.FULL, 1);
    }

    @Test
    public void gpsTest() {
        device.getGPSInstance().setPosition(11.42, 11.42, 8848);
    }

    @Test
    public void lightTest() {
        device.setValuesForSensor(new float[]{99f},Sensor.TYPE_LIGHT);
    }

    /*
    public void selectSensor(String sensor) throws UiObjectNotFoundException, RemoteException {
        UiObject2 navigationDrawerButton = device.getUiDevice().findObject(By.text("Sensor"));
        assertTrue("Navigation drawer button not found", navigationDrawerButton != null);
        navigationDrawerButton.click();

        device.getUiDevice().waitForWindowUpdate("", 1000);

        UiObject2 item = device.getUiDevice().findObject(By.text(sensor));
        assertTrue(sensor + " item not found", navigationDrawerButton != null);
        item.click();
    }
    */
}
