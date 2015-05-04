package com.zenika.aic.core.automator;

import android.os.RemoteException;
import android.support.test.uiautomator.By;
import android.support.test.uiautomator.UiAutomatorTestCase;
import android.support.test.uiautomator.UiDevice;
import android.support.test.uiautomator.UiObject;
import android.support.test.uiautomator.UiObject2;
import android.support.test.uiautomator.UiObjectNotFoundException;
import android.support.test.uiautomator.UiScrollable;
import android.support.test.uiautomator.UiSelector;
import android.test.InstrumentationTestCase;
import android.widget.TextView;

public abstract class AiCAbstractTestCase extends InstrumentationTestCase {
	protected UiDevice device = null;
	protected String appName;
	protected String packageName;
	
	public AiCAbstractTestCase(String appName, String packageName) {
		this.appName = appName;
		this.packageName = packageName;
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
}
