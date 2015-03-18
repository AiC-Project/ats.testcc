package com.zenika.aic.demo.sensor;

import android.os.RemoteException;
import android.support.test.uiautomator.UiDevice;
import android.support.test.uiautomator.UiObject;
import android.support.test.uiautomator.UiObjectNotFoundException;
import android.support.test.uiautomator.UiSelector;
import android.support.test.uiautomator.UiWatcher;
import android.test.InstrumentationTestSuite;
import android.widget.Button;

import com.zenika.aic.core.automator.AiCAbstractTestCase;
import com.zenika.aic.core.libs.sensor.BatteryDelegate;

public class BatteryTestCase extends AiCAbstractTestCase {

	protected long startTime;
	
	public BatteryTestCase() {
		super("Sensor", "aic.zenika.fr.sensor");
	}
	
	@Override
	public void setUp() throws RemoteException, UiObjectNotFoundException {
		startTime = System.currentTimeMillis();
		this.runApp(appName, packageName);
		this.selectBattery();
	}
	
	@Override
	public void tearDown() throws RemoteException, UiObjectNotFoundException {
		BatteryDelegate.getInstance().setBatteryLevel(100);
		InstrumentationTestSuite.warning("message");
		System.out.println("INSTRUMENTATION_STATUS: time="+(System.currentTimeMillis()-startTime)/1000.0);
	}
	
	public void testUS1() throws UiObjectNotFoundException {
		this.setLevel(100,50);
	}
	
	public void testUS2() throws UiObjectNotFoundException {
		this.setLevel(100,5);
	}
	
	private void selectBattery() throws UiObjectNotFoundException, RemoteException {
		UiObject navigationDrawerButton = new UiObject(new UiSelector().text("Sensor"));
		assertTrue("Navigation drawer button not found", navigationDrawerButton.exists());
		navigationDrawerButton.click();
		
		UiObject batteryItem = new UiObject(new UiSelector().text("Battery"));
		assertTrue("Battery item not found", navigationDrawerButton.exists());
		batteryItem.click();
	}
	
	private void setLevel(int oldL, int newL) throws UiObjectNotFoundException {
		UiWatcher okBatteryDialogWatcher = new UiWatcher() {
			@Override
			public boolean checkForCondition() {
				UiObject okCancelDialog = new UiObject(new UiSelector().textContains("Connect charger"));
				if(okCancelDialog.exists()){
					UiObject okButton = new UiObject(new UiSelector().className(Button.class.getName()).text("OK"));
					try {
						okButton.click();
					} catch (UiObjectNotFoundException e) {
						e.printStackTrace();
					}
					return (okCancelDialog.waitUntilGone(25000));
				}
				return false;
			}
		};
		
		UiDevice.getInstance().registerWatcher("Battery dialog watcher", okBatteryDialogWatcher);
		UiDevice.getInstance().runWatchers();
		
		UiObject batteryLevel = new UiObject(new UiSelector().text(oldL + " %"));
		assertTrue("Battery level not found", batteryLevel.exists());
		
		//batteryLevel.registerState();
		
		BatteryDelegate.getInstance().setBatteryLevel(newL);
		
		//Log.w("Battery",batteryLevel.waitUntilChange(10000)+"");
		
		batteryLevel = new UiObject(new UiSelector().text(newL + " %"));
		assertTrue("Battery level not found", batteryLevel.exists());
	}
}
