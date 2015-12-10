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
import android.test.InstrumentationTestCase;
import android.widget.TextView;

/**
 * Created by pierre on 09/12/15.
 */
public class Device extends InstrumentationTestCase {

    private static final String PREFIX = "aicd.";
    private static final String GET_PROP = "getprop ";
    private static final String BATTERY = PREFIX + "battery.";
    public static final String GET_PROP_BATTERY = GET_PROP + BATTERY;

    protected long startTime;
    public UiDevice device;
    private Instrumentation instru;

    String appName;
    String packageName;

    private static Device instance = null;

    /**
     * INITCORE
     */
    private Device() {

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

    public void waitForUpdate() {
        device.waitForWindowUpdate("", 10000);
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

        assertTrue("Unable to detect your app", settingsApp != null);
    }

    /**
     * SET LOCATION
     * @param latitude
     * @param longitude
     * @param altitude
     */
    public void setLocation(double latitude, double longitude, double altitude) {
        new Gps().getInstance().setPosition(latitude, longitude, altitude);
    }

    public void setGPSActivation(boolean isActive) {
        new Gps().getInstance().setGPSActivation(isActive);
    }

    /**
     * SET BATTERY
     * @param level
     * @param levelMax
     * @param status
     */
    public void setBatteryLevel(long level, long levelMax, SensorsPacket.sensors_packet.BatteryPayload.BattStatusType status) {
        new Battery().getInstance().setLevel(level,levelMax, status);
    }

    public void setBatteryLevel(long level, long levelMax) {
        new Battery().getInstance().setLevel(level, levelMax);
    }

    public void setBatteryLevel(long level, long levelMax, SensorsPacket.sensors_packet.BatteryPayload.BattStatusType status, int ACStatus) {
        new Battery().getInstance().setLevel(level, levelMax, status, ACStatus);
    }

    /**
     * SET SENSORS VALUES
     * @param values
     * @param sensor
     */
    public void setValuesForSensor(float[] values, int sensor) {
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
}
