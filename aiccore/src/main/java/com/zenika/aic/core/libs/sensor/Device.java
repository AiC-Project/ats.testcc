package com.zenika.aic.core.libs.sensor;

import android.app.Instrumentation;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
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

import com.zenika.aic.core.libs.network.ByteUtils;
import com.zenika.aic.core.libs.network.TCPServer;


/**
 * Created by pierre on 09/12/15.
 */
public class Device extends InstrumentationTestCase {

    private UiDevice device;
    private Instrumentation instru;
    private Gps gps;
    private Battery battery;

    String appName;


    public Device(String appName, Instrumentation newInstru) {
        this.appName = appName;
        try {
            //new TCPServer(32500);
        } catch(Exception e) {
            Log.v("tcp_server", "Fail to launch tcp server");
        }
        try {
            instru = newInstru;
            gps = new Gps().getInstance();
            battery = new Battery().getInstance();
            this.runApp(appName);
        } catch (UiObjectNotFoundException e) {
            e.printStackTrace();
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public void waitForUpdate() {
        device.waitForWindowUpdate("", 10000);
    }

    public void runApp(String appName) throws UiObjectNotFoundException, RemoteException {
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

    public UiDevice getUiDevice() {
        return device;
    }

    public Battery getBatteryInstance() {
        return battery.getInstance();
    }

    public Gps getGPSInstance() {
        return gps.getInstance();
    }

    public void setLocation(double latitude, double longitude, double altitude) {
        gps.getInstance().setPosition(latitude, longitude, altitude);
    }

    public void setGPSActivation(boolean isActive) {
        gps.getInstance().setGPSActivation(isActive);
    }

    public void setBatteryLevel(long level, long levelMax, SensorsPacket.sensors_packet.BatteryPayload.BatteryStatusType status) {
        battery.setLevel(level, levelMax, status);
    }

    public void setBatteryLevel(long level, long levelMax) {
        battery.setLevel(level, levelMax);
    }

    public void setBatteryLevel(long level, long levelMax, SensorsPacket.sensors_packet.BatteryPayload.BatteryStatusType status, int ACStatus) {
        battery.setLevel(level, levelMax, status, ACStatus);
    }

    public void takeScreenshot(){
        SDLRecord.sendProtoRequestToTakeScreenshot();
    }

    public void startRecording(){
        SDLRecord.sendProtoRequestToStartRecording();
    }


    public void stopRecording(){
        SDLRecord.sendProtoRequestToStopRecording();
    }


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
