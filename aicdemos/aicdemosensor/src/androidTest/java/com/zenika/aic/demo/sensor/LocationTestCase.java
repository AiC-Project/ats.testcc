package com.zenika.aic.demo.sensor;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.os.RemoteException;
import android.support.test.uiautomator.By;
import android.support.test.uiautomator.UiDevice;
import android.support.test.uiautomator.UiObject;
import android.support.test.uiautomator.UiObject2;
import android.support.test.uiautomator.UiObjectNotFoundException;
import android.support.test.uiautomator.UiScrollable;
import android.support.test.uiautomator.UiSelector;
import android.test.InstrumentationTestCase;
import android.util.Log;
import android.widget.TextView;

import com.zenika.aic.core.libs.sensor.Device;
import com.zenika.aic.core.libs.sensor.Gps;

public class LocationTestCase extends InstrumentationTestCase {

	private final float ZENIKA_LAT = 48.878f;
	private final float ZENIKA_LONG = 2.328f;

	private UiDevice device;

	private String appName;
	private String packageName;

	public LocationTestCase() {
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
		this.selectMap();
		/*
		UiWatcher serviceWatcher = new UiWatcher() {
			@Override
			public boolean checkForCondition() {
				UiObject okCancelDialog = new UiObject(new UiSelector().textContains("Google Play services"));
				if(okCancelDialog.exists()){
					UiObject okButton = new UiObject(new UiSelector().className(Button.class.getName()).text("OK"));
					try {
						okButton.click();
					} catch (UiObjectNotFoundException e) {
						e.printStackTrace();
					}
					return (okCancelDialog.waitUntilGone(10000));
				}
				return false;
			}
		};
		
		UiDevice.getInstance().registerWatcher("Google Play service dialog watcher", serviceWatcher);
		UiDevice.getInstance().runWatchers();
		*/
		
		Gps.getInstance().setPosition(ZENIKA_LAT, ZENIKA_LONG);
		//sleep(10000);
	}

	@Override
	public void tearDown() throws RemoteException, UiObjectNotFoundException {
		Gps.getInstance().setPosition(ZENIKA_LAT, ZENIKA_LONG);
	}

	public void testUS4() throws UiObjectNotFoundException, RemoteException {

		Device.getInstance().gps().setPosition(48.878725f, 2.327036f);
		//Gps.getInstance().setPosition(48.878725f, 2.327036f);

        LocationManager locManager = (LocationManager)getInstrumentation().getTargetContext().getSystemService(Context.LOCATION_SERVICE);

        Location location = locManager.getLastKnownLocation(LocationManager.GPS_PROVIDER);

        double latitude=0;
        double longitude=0;
        latitude = location.getLatitude();
        longitude = location.getLongitude();

        Log.w("sensor:: 1", latitude + "");
        Log.w("sensor:: 1", longitude + "");

		Gps.getInstance().setPosition(48.877917f, 2.326929f);
		Gps.getInstance().setPosition(48.878133f, 2.330110f);
		Gps.getInstance().setPosition(48.878997f, 2.329611f);
	}
	
	private void selectMap() throws UiObjectNotFoundException, RemoteException {
        UiObject2 navigationDrawerButton = device.findObject(By.text("Sensor"));
        assertTrue("Navigation drawer button not found", navigationDrawerButton != null);
        navigationDrawerButton.click();

        device.waitForWindowUpdate("",1000);

        UiObject2 batteryItem = device.findObject(By.text("Map"));
        assertTrue("Map item not found", navigationDrawerButton != null);
        batteryItem.click();
	}
}
