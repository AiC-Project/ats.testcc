package com.zenika.aic.core.automator;

import android.os.RemoteException;
import android.support.test.uiautomator.UiAutomatorTestCase;
import android.support.test.uiautomator.UiObject;
import android.support.test.uiautomator.UiObjectNotFoundException;
import android.support.test.uiautomator.UiScrollable;
import android.support.test.uiautomator.UiSelector;
import android.widget.TextView;

public abstract class AiCAbstractTestCase extends UiAutomatorTestCase {
	
	protected String appName;
	protected String packageName;
	
	public AiCAbstractTestCase(String appName, String packageName) {
		this.appName = appName;
		this.packageName = packageName;
	}
		
	public void runApp(String appName, String packageName) throws UiObjectNotFoundException, RemoteException {
		getUiDevice().pressHome();
		getUiDevice().waitForWindowUpdate("", 2000);
		UiObject allAppsButton = new UiObject(new UiSelector().description("Apps"));
		allAppsButton.clickAndWaitForNewWindow();
		UiObject appsTab = new UiObject(new UiSelector().text("Apps"));
		appsTab.click();
		UiScrollable appViews = new UiScrollable(new UiSelector().scrollable(true));
		appViews.setAsHorizontalList();
		UiObject settingsApp = appViews.getChildByText(new UiSelector().className(TextView.class.getName()), appName);
		settingsApp.clickAndWaitForNewWindow();
		UiObject settingsValidation = new UiObject(new UiSelector().packageName(packageName));
		assertTrue("Unable to detect Sensor app", settingsValidation.exists()); 
	}
}
