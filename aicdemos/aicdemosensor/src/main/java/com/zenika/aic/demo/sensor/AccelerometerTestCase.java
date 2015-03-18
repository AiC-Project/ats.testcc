package com.zenika.aic.demo.sensor;

import android.os.RemoteException;
import android.support.test.uiautomator.By;
import android.support.test.uiautomator.StaleObjectException;
import android.support.test.uiautomator.UiDevice;
import android.support.test.uiautomator.UiObject2;
import android.support.test.uiautomator.UiObjectNotFoundException;
import android.widget.LinearLayout;

import com.zenika.aic.core.automator.AiCAbstractTestCase;
import com.zenika.aic.core.libs.sensor.SensorDelegate;

public class AccelerometerTestCase extends AiCAbstractTestCase {

	public AccelerometerTestCase() {
		super("Sensor", "aic.zenika.fr.sensor");
	}

	@Override
	public void setUp() throws RemoteException, UiObjectNotFoundException {
		this.runApp(appName, packageName);
		this.selectAccelerometer();
	}

	@Override
	public void tearDown() throws RemoteException, UiObjectNotFoundException {
        SensorDelegate.getInstance().setAccelerometerValue(0f, 9f, 1f);
	}

	public void testUS3() throws UiObjectNotFoundException, RemoteException {
        device.unfreezeRotation();
		checkAccelerometerLayout();
		setOrientation();
		checkAccelerometerLayout();
	}

	private void selectAccelerometer() throws UiObjectNotFoundException, RemoteException {
        UiObject2 navigationDrawerButton = device.findObject(By.text("Sensor"));
        assertTrue("Navigation drawer button not found", navigationDrawerButton != null);
        navigationDrawerButton.click();

        device.waitForWindowUpdate("",1000);

        UiObject2 batteryItem = device.findObject(By.text("Accelerometer"));
        assertTrue("Accelerometer item not found", navigationDrawerButton != null);
        batteryItem.click();
	}

	private void setOrientation() throws UiObjectNotFoundException {
		SensorDelegate.getInstance().setAccelerometerValue(9f, 0f, 1f);
		sleep(2000);

        try {
            UiObject2 xLabel = UiDevice.getInstance(getInstrumentation()).findObject(By.text("9.0"));
            UiObject2 yLabel = UiDevice.getInstance(getInstrumentation()).findObject(By.text("0.0"));
            UiObject2 zLabel = UiDevice.getInstance(getInstrumentation()).findObject(By.text("1.0"));
            assertTrue("X value not found",xLabel != null);
            assertTrue("Y value not found",yLabel != null);
            assertTrue("Z value not found",zLabel != null);
        } catch (StaleObjectException e) {
            e.printStackTrace();
        }
	}

	private void checkAccelerometerLayout() throws UiObjectNotFoundException {
		UiObject2 table = UiDevice.getInstance(getInstrumentation()).findObject(By.clazz(LinearLayout.class.getName()));
		assertTrue("Missing elements inside the table",table != null);
	}
}
