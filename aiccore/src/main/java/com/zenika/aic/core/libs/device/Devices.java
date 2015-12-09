package com.zenika.aic.core.libs.device;

import android.os.RemoteException;
import android.support.test.uiautomator.*;
import android.test.InstrumentationTestCase;
import android.widget.Button;
import android.widget.TextView;
import android.app.Instrumentation;

import com.zenika.aic.core.libs.sensor.Accelerometer;
import com.zenika.aic.core.libs.sensor.AmbientThermometer;
import com.zenika.aic.core.libs.sensor.Barometer;
import com.zenika.aic.core.libs.sensor.Gravitometer;
import com.zenika.aic.core.libs.sensor.Gyroscope;
import com.zenika.aic.core.libs.sensor.LinearAccelerometer;
import com.zenika.aic.core.libs.sensor.Magnetometer;
import com.zenika.aic.core.libs.sensor.Photometer;
import com.zenika.aic.core.libs.sensor.ProximitySensor;
import com.zenika.aic.core.libs.sensor.RotVectorSensor;
import com.zenika.aic.core.libs.sensor.Thermometer;
import android.hardware.Sensor;
import java.util.ArrayList;


/**
 * Created by pierre on 08/12/15.
 */

public class Devices extends InstrumentationTestCase{

    protected long startTime;
    private UiDevice device;
    private Instrumentation instru;

    String appName;
    String packageName;

    public Photometer deviceSensor;

    public Devices(String appName, String packageName, Instrumentation newInstru) {
        this.appName = appName;
        this.packageName = packageName;

        try {
            startTime = System.currentTimeMillis();
            instru = newInstru;
            this.runApp(appName, packageName);
            deviceSensor = new Photometer().getInstance();
        } catch (UiObjectNotFoundException e) {
            e.printStackTrace();
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
/*
    public void addSensorOfType(int sensor) {
        switch(sensor) {
            case Sensor.TYPE_ACCELEROMETER:
                sensors.add(new Accelerometer().getInstance());
                break;
            case Sensor.TYPE_LINEAR_ACCELERATION:
                sensors.add(new LinearAccelerometer().getInstance());
                break;
            case Sensor.TYPE_PRESSURE:
                sensors.add(new Barometer().getInstance());
                break;
            case Sensor.TYPE_LIGHT:
                sensors.add(new Photometer().getInstance());
                break;
            case Sensor.TYPE_TEMPERATURE:
                sensors.add(new Thermometer().getInstance());
                break;
            case Sensor.TYPE_AMBIENT_TEMPERATURE:
                sensors.add(new AmbientThermometer().getInstance());
                break;
            case Sensor.TYPE_PROXIMITY:
                sensors.add(new ProximitySensor().getInstance());
                break;
            case Sensor.TYPE_GRAVITY:
                sensors.add(new Gravitometer().getInstance());
                break;
            case Sensor.TYPE_MAGNETIC_FIELD:
                sensors.add(new Magnetometer().getInstance());
                break;
            case Sensor.TYPE_GYROSCOPE:
                sensors.add(new Gyroscope().getInstance());
                break;
            case Sensor.TYPE_ROTATION_VECTOR:
                sensors.add(new RotVectorSensor().getInstance());
                break;
        }
        sensors.add(sensor);
    }
*/
    public void setValue(float[] values, int sensor) {
        switch(sensor) {
            case Sensor.TYPE_ACCELEROMETER:
                new Accelerometer().getInstance().setValue(values[0],values[1],values[2]);
                break;
            case Sensor.TYPE_LINEAR_ACCELERATION:
                //sensors.add(new LinearAccelerometer().getInstance());
                break;
            case Sensor.TYPE_PRESSURE:
                //sensors.add(new Barometer().getInstance());
                break;
            case Sensor.TYPE_LIGHT:
                deviceSensor.setValue(20f);
                break;
            case Sensor.TYPE_TEMPERATURE:
                //sensors.add(new Thermometer().getInstance());
                break;
            case Sensor.TYPE_AMBIENT_TEMPERATURE:
                //sensors.add(new AmbientThermometer().getInstance());
                break;
            case Sensor.TYPE_PROXIMITY:
                //sensors.add(new ProximitySensor().getInstance());
                break;
            case Sensor.TYPE_GRAVITY:
                //sensors.add(new Gravitometer().getInstance());
                break;
            case Sensor.TYPE_MAGNETIC_FIELD:
                //sensors.add(new Magnetometer().getInstance());
                break;
            case Sensor.TYPE_GYROSCOPE:
                //sensors.add(new Gyroscope().getInstance());
                break;
            case Sensor.TYPE_ROTATION_VECTOR:
                //sensors.add(new RotVectorSensor().getInstance());
                break;
        }
    }

    public UiDevice getDevice() {
        return device;
    }

    public boolean setLevel(int oldL, int newL) throws UiObjectNotFoundException {
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

        device.waitForWindowUpdate("aic.zenika.com.sensor", 2000);

        com.zenika.aic.core.libs.sensor.Device.getInstance().battery().setLevel(newL);

        device.waitForWindowUpdate("aic.zenika.com.sensor", 10000);

        UiObject2 batteryLevel = device.findObject(By.res("aic.zenika.com.sensor", "battery_level"));

        return batteryLevel.getText().contains(newL+"");
    }

    public void waitForUpdate() {
        device.waitForWindowUpdate("", 10000);
    }







    public void selectSensor(String sensor) throws UiObjectNotFoundException, RemoteException {
        UiObject2 navigationDrawerButton = device.findObject(By.text("Sensor"));
        assertTrue("Navigation drawer button not found", navigationDrawerButton != null);
        navigationDrawerButton.click();

        device.waitForWindowUpdate("", 1000);

        UiObject2 item = device.findObject(By.text(sensor));
        assertTrue(sensor + " item not found", navigationDrawerButton != null);
        item.click();
    }

    public void runApp(String appName, String packageName) throws UiObjectNotFoundException, RemoteException {
        device = UiDevice.getInstance(instru);
        device.pressHome();
        device.waitForWindowUpdate("", 2000);

        UiObject2 allAppsButton = device.findObject(By.desc("Apps"));
        allAppsButton.click();
        device.waitForWindowUpdate("", 2000);

        UiScrollable appViews = new UiScrollable(new UiSelector().scrollable(true));
        appViews.setAsHorizontalList();

        UiObject settingsApp = appViews.getChildByText(new UiSelector().className(TextView.class.getName()), appName);
        settingsApp.clickAndWaitForNewWindow();

    }
}
