package com.zenika.aic.demo.sensor;

import android.os.RemoteException;
import android.support.test.uiautomator.By;
import android.support.test.uiautomator.StaleObjectException;
import android.support.test.uiautomator.UiDevice;
import android.support.test.uiautomator.UiObject;
import android.support.test.uiautomator.UiObject2;
import android.support.test.uiautomator.UiObjectNotFoundException;
import android.support.test.uiautomator.UiScrollable;
import android.support.test.uiautomator.UiSelector;
import android.test.InstrumentationTestCase;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.zenika.aic.core.libs.sensor.Device;

public class AccelerometerTestCase extends InstrumentationTestCase {

	private UiDevice device;

	private String appName;
	private String packageName;

	public AccelerometerTestCase() {
		this.appName = "Sensor";
		this.packageName = "aic.zenika.com.sensor";
	}

	public void runApp(String appName, String packageName) throws UiObjectNotFoundException, RemoteException {
		device = UiDevice.getInstance(getInstrumentation());
		device.pressHome();
		device.waitForWindowUpdate("", 2000);

		UiObject2 allAppsButton = device.findObject(By.desc("Apps"));
		allAppsButton.click();
		device.waitForWindowUpdate("", 2000);

		UiScrollable appViews = new UiScrollable(new UiSelector().scrollable(true));
		appViews.setAsHorizontalList();

		UiObject settingsApp = appViews.getChildByText(new UiSelector().className(TextView.class.getName()), appName);
		settingsApp.clickAndWaitForNewWindow();

		assertTrue("Unable to detect Sensor app", settingsApp != null);
	}

	@Override
	public void setUp() throws RemoteException, UiObjectNotFoundException {
		this.runApp(appName, packageName);
		this.selectAccelerometer();
	}

	@Override
	public void tearDown() throws RemoteException, UiObjectNotFoundException {
		Device.getInstance().accelerometer().setValue(0f, 9f, 1f);
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
		Device.getInstance().accelerometer().setValue(0f, 9f, 1f);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

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
