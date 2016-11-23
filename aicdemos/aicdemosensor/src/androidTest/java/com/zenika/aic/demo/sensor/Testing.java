package com.zenika.aic.demo.sensor;

import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;
import android.test.InstrumentationTestCase;

import com.zenika.aic.core.libs.sensor.Device;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.Before;

import aic.zenika.com.sensor.R;


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
		device.clickOn("Sensor");
        device.scrollOnFrom("Proximity Sensor", "Picture");
        device.clickOn("Proximity Sensor");
		device.setText("It's working", R.id.input_exemple);
        device.replaceText("It's working again !", R.id.input_exemple);
        device.isTextExists("It's workkjning again !");
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
