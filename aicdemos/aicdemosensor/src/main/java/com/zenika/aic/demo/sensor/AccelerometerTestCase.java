package com.zenika.aic.demo.sensor;

import android.os.RemoteException;
import android.support.test.uiautomator.UiObject;
import android.support.test.uiautomator.UiObjectNotFoundException;
import android.support.test.uiautomator.UiSelector;
import android.widget.LinearLayout;

import com.zenika.aic.core.automator.AiCAbstractTestCase;
import com.zenika.aic.core.automator.AiCAsyncSelector;
import com.zenika.aic.core.automator.AiCAsyncSelectorGroup;
import com.zenika.aic.core.libs.sensor.SensorDelegate;

import java.util.ArrayList;
import java.util.Arrays;

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
		getUiDevice().unfreezeRotation();
		checkAccelerometerLayout();
		setOrientation();
		checkAccelerometerLayout();
	}

	private void selectAccelerometer() throws UiObjectNotFoundException, RemoteException {
		UiObject navigationDrawerButton = new UiObject(new UiSelector().text("Sensor"));
		assertTrue("Navigation drawer button not found", navigationDrawerButton.exists());
		navigationDrawerButton.click();

		UiObject batteryItem = new UiObject(new UiSelector().text("Accelerometer"));
		assertTrue("Battery item not found", navigationDrawerButton.exists());
		batteryItem.click();
	}

	private void setOrientation() throws UiObjectNotFoundException {
		SensorDelegate.getInstance().setAccelerometerValue(9f, 0f, 1f);
		sleep(2000);

		/*
		 * This code use several threads. Execution time : 42.507s 
		 */
		//*
		
		AiCAsyncSelectorGroup g = new AiCAsyncSelectorGroup(this,new ArrayList<AiCAsyncSelector>(
			Arrays.asList(
				new AiCAsyncSelector("X value not found","9.0"),
				new AiCAsyncSelector("Y value not found","0.0"),
				new AiCAsyncSelector("Z value not found","1.0"))));
		
		assertTrue(g.getResult());
		
		//*/
		
		/*
		 * This code use one thread. Execution time : 60.951s
		 */
		/*
		UiObject xValue = new UiObject(new UiSelector().text("9.0"));
		UiObject yValue = new UiObject(new UiSelector().text("0.0"));
		UiObject zValue = new UiObject(new UiSelector().text("1.0"));
		
		assertTrue("X value not found", xValue.getText().equals("9"));
		assertTrue("Y value not found", yValue.getText().equals("0.0"));
		assertTrue("Z value not found", zValue.getText().equals("1.0"));
		*/
	}

	private void checkAccelerometerLayout() throws UiObjectNotFoundException {
		UiObject table = new UiObject(new UiSelector().className(LinearLayout.class.getName()).instance(1));
		assertTrue("Missing elements inside the table",table.exists());
	}
}
