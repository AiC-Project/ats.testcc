package com.zenika.aic.core.libs.sensor;

import android.app.Instrumentation;
import android.hardware.Sensor;
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
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by thomas on 09/06/15.
 */
public class Device extends InstrumentationTestCase implements DeviceInterface  {
    private static final String PREFIX = "aicd.";

    private static final String GET_PROP = "getprop ";

    private static final String BATTERY = PREFIX + "battery.";
    private static final String ACCELEROMETER = PREFIX + "accelerometer.";
    private static final String GPS = PREFIX + "gps.";
    private static final String CAMERA = PREFIX + "camera.";

    public static final String GET_PROP_BATTERY = GET_PROP + BATTERY;
    public static final String GET_PROP_ACCELEROMETER = GET_PROP + BATTERY;
    public static final String GET_PROP_GPS = GET_PROP + BATTERY;
    public static final String GET_PROP_CAMERA = GET_PROP + BATTERY;

    protected long startTime;
    public UiDevice device;
    private Instrumentation instru;

    String appName;
    String packageName;

    private static Device instance = null;

    private Device() {
        //Empty for the moment
    }

    public Device(String appName, String packageName, Instrumentation newInstru) {
        this.appName = appName;
        this.packageName = packageName;

        try {
            startTime = System.currentTimeMillis();
            instru = newInstru;
            this.runApp(appName, packageName);
        } catch (UiObjectNotFoundException e) {
            e.printStackTrace();
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public static Device getInstance() {
        if(Device.instance == null)
            Device.instance = new Device();
        return Device.instance;
    }

    @Override
    public GpsInterface gps() {
        return Gps.getInstance();
    }

    @Override
    public AccelerometerInterface accelerometer() {
        return Accelerometer.getInstance();
    }

    @Override
    public BatteryInterface battery() {
        return Battery.getInstance();
    }

    public void setValues(float[] values, int sensor) {
        switch(sensor) {
            case Sensor.TYPE_ACCELEROMETER:
                new Accelerometer().getInstance().setValue(values[0],values[1],values[2]);
                break;
            case Sensor.TYPE_LINEAR_ACCELERATION:
                new Photometer().getInstance().setValue(values[0]);
                break;
            case Sensor.TYPE_PRESSURE:
                new Barometer().getInstance().setValue(values[0]);
                break;
            case Sensor.TYPE_LIGHT:
                new Photometer().getInstance().setValue(values[0]);
                break;
            case Sensor.TYPE_TEMPERATURE:
                new Thermometer().getInstance().setValue(values[0]);
                break;
            case Sensor.TYPE_AMBIENT_TEMPERATURE:
                new AmbientThermometer().getInstance().setValue(values[0]);
                break;
            case Sensor.TYPE_PROXIMITY:
                new ProximitySensor().getInstance().setValue(values[0]);
                break;
            case Sensor.TYPE_GRAVITY:
                new Gravitometer().getInstance().setValue(values[0], values[1], values[2]);
                break;
            case Sensor.TYPE_MAGNETIC_FIELD:
                new Magnetometer().getInstance().setValue(values[0], values[1], values[2]);
                break;
            case Sensor.TYPE_GYROSCOPE:
                new Gyroscope().getInstance().setValue(values[0], values[1], values[2]);
                break;
            case Sensor.TYPE_ROTATION_VECTOR:
                double[] data = {values[1], values[2], values[3], values[4]};
                new RotVectorSensor().getInstance().setValue((int)values[0], data);
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

        assertTrue("Unable to detect Sensor app", settingsApp != null);
    }
}
