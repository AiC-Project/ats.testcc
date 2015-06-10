package com.zenika.aic.demo.sensor;

import android.os.RemoteException;
import android.support.test.uiautomator.By;
import android.support.test.uiautomator.UiDevice;
import android.support.test.uiautomator.UiObject;
import android.support.test.uiautomator.UiObject2;
import android.support.test.uiautomator.UiObjectNotFoundException;
import android.support.test.uiautomator.UiScrollable;
import android.support.test.uiautomator.UiSelector;
import android.support.test.uiautomator.UiWatcher;
import android.test.InstrumentationTestCase;
import android.test.InstrumentationTestSuite;
import android.widget.Button;
import android.widget.TextView;

import com.zenika.aic.core.libs.sensor.Device;

public class BatteryTestCase extends InstrumentationTestCase {

	protected long startTime;

	private UiDevice device;

	private String appName;
	private String packageName;

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

	public BatteryTestCase() throws RemoteException, UiObjectNotFoundException {
		this.appName = "Sensor";
		this.packageName = "aic.zenika.com.sensor";
	}

	@Override
	public void setUp() throws RemoteException, UiObjectNotFoundException {
        startTime = System.currentTimeMillis();
        this.runApp(appName, packageName);
        this.selectBattery();
	}
	
	@Override
	public void tearDown() throws RemoteException, UiObjectNotFoundException {
		Device.getInstance().battery().setLevel(100);
		InstrumentationTestSuite.warning("message");
		System.out.println("INSTRUMENTATION_STATUS: time=" + (System.currentTimeMillis() - startTime) / 1000.0);
	}
	
	public void testUS1() throws UiObjectNotFoundException {
        this.setLevel(100, 50);
	}
	
	public void testUS2() throws UiObjectNotFoundException {
		this.setLevel(100,5);
	}
	
	private void selectBattery() throws UiObjectNotFoundException, RemoteException {
        UiObject2 navigationDrawerButton = device.findObject(By.text("Sensor"));
        assertTrue("Navigation drawer button not found", navigationDrawerButton != null);
        navigationDrawerButton.click();

        device.waitForWindowUpdate("",1000);

        UiObject2 batteryItem = device.findObject(By.text("Battery"));
        assertTrue("Battery item not found", navigationDrawerButton != null);
        batteryItem.click();
	}
	
	private void setLevel(int oldL, int newL) throws UiObjectNotFoundException {
		UiWatcher okBatteryDialogWatcher = new UiWatcher() {
			@Override
			public boolean checkForCondition() {
                UiObject2 okCancelDialog = device.findObject(By.textContains("Connect charger"));
				if(okCancelDialog != null){
                    UiObject2 okButton = device.findObject(By.clazz(Button.class.getName()).text("OK"));
					okButton.click();
                    return device.waitForWindowUpdate("",25000);
				}
				return false;
			}
		};

        device.registerWatcher("Battery dialog watcher", okBatteryDialogWatcher);
        device.runWatchers();

        UiObject2 batteryLevel = device.findObject(By.clazz(TextView.class.getName()).text(oldL+""));
		assertTrue("Battery level not found", batteryLevel != null);

		//batteryLevel.registerState();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Device.getInstance().battery().setLevel(newL);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		//Log.w("Battery",batteryLevel.waitUntilChange(10000)+"");

		batteryLevel = device.findObject(By.text(newL + " %"));
		assertTrue("Battery level not found", batteryLevel != null);
	}
}
