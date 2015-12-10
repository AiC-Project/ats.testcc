package com.zenika.aic.demo.sensor;

import android.app.Instrumentation;
import android.hardware.Sensor;
import android.os.RemoteException;
import android.support.test.uiautomator.UiObjectNotFoundException;
import android.test.InstrumentationTestCase;
import com.zenika.aic.core.libs.sensor.Device;

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

    public void testUS1() throws UiObjectNotFoundException, RemoteException {
        try {
            device.selectSensor("Barometer");
        } catch (UiObjectNotFoundException e) {
            e.printStackTrace();
        } catch (RemoteException e) {
            e.printStackTrace();
        }
		device.setValues(new float[]{666f},Sensor.TYPE_PRESSURE);
        device.waitForUpdate();
    }


/*
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
        device.getDevice().waitForWindowUpdate("aic.zenika.com.sensor",2000);
		InstrumentationTestSuite.warning("message");
		System.out.println("INSTRUMENTATION_STATUS: time=" + (System.currentTimeMillis() - startTime) / 1000.0);
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
                    return device.waitForWindowUpdate("",5000);
				}
				return false;
			}
		};

        device.registerWatcher("Battery dialog watcher", okBatteryDialogWatcher);
        device.runWatchers();

        device.waitForWindowUpdate("aic.zenika.com.sensor",2000);

        UiObject2 batteryLevel = device.findObject(By.res("aic.zenika.com.sensor","battery_level"));
		assertTrue("Battery level not found", batteryLevel != null);
		assertTrue("Wrong level", batteryLevel.getText().contains(oldL+""));

		Device.getInstance().battery().setLevel(newL);

        device.waitForWindowUpdate("aic.zenika.com.sensor", 10000);

        batteryLevel = device.findObject(By.res("aic.zenika.com.sensor","battery_level"));
		assertTrue("Wrong level", batteryLevel.getText().contains(newL+""));
	}*/
}
