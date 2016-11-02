package com.zenika.aic.core.libs.sensor;

import android.app.Instrumentation;
import android.hardware.Sensor;
import android.os.RemoteException;
import android.support.test.espresso.InjectEventSecurityException;
import android.support.test.espresso.action.CloseKeyboardAction;
import android.support.test.espresso.action.CoordinatesProvider;
import android.support.test.espresso.action.GeneralClickAction;
import android.support.test.espresso.action.Press;
import android.support.test.espresso.action.Tap;
import android.support.test.espresso.action.Tapper;
import android.support.test.uiautomator.By;
import android.support.test.uiautomator.UiDevice;
import android.support.test.uiautomator.UiObject;
import android.support.test.uiautomator.UiObject2;
import android.support.test.uiautomator.UiObjectNotFoundException;
import android.support.test.uiautomator.UiScrollable;
import android.support.test.uiautomator.UiSelector;
import android.support.test.espresso.UiController;
import android.test.InstrumentationTestCase;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;

import com.zenika.aic.core.R;

import static android.support.test.espresso.Espresso.onData;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.matcher.ViewMatchers.Visibility.VISIBLE;
import static android.support.test.espresso.matcher.ViewMatchers.withEffectiveVisibility;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static org.hamcrest.Matchers.allOf;


/**
 * Created by pierre on 09/12/15.
 */
public class Device extends InstrumentationTestCase {

    private UiDevice device;
    private Instrumentation instrumentation;
    private Gps gps;
    private Battery battery;
    private UiController uicontroller;
    private View v;

    String appName;

    public Device(String appName, Instrumentation instrumentation, View v) {
        this.appName = appName;
        try {
            SDLRecord.startTCPServer(32500);
        } catch(Exception e) {
            Log.v("tcp_server", "Fail to launch tcp server");
        }
        try {
            this.instrumentation = instrumentation;
            this.v = v;
            this.gps = new Gps().getInstance();
            this.battery = new Battery().getInstance();
            this.uicontroller = new UiController() {
                @Override
                public boolean injectMotionEvent(MotionEvent event) throws InjectEventSecurityException {
                    return false;
                }

                @Override
                public boolean injectKeyEvent(KeyEvent event) throws InjectEventSecurityException {
                    return false;
                }

                @Override
                public boolean injectString(String str) throws InjectEventSecurityException {
                    return false;
                }

                @Override
                public void loopMainThreadUntilIdle() {

                }

                @Override
                public void loopMainThreadForAtLeast(long millisDelay) {

                }
            };
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
        device = UiDevice.getInstance(instrumentation);
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

    public void closeKeyboard() {
        CloseKeyboardAction close = new CloseKeyboardAction();
        close.perform(uicontroller, v);
    }

    public void clickOn(int itemId) {
        onView(withId(itemId)).perform(click());
    }

    public void clickOn(final float[] values) {
        GeneralClickAction gca = new GeneralClickAction(
                Tap.SINGLE,
                new CoordinatesProvider() {
                    @Override
                    public float[] calculateCoordinates(View view) {

                        final int[] screenPos = new int[2];
                        view.getLocationOnScreen(screenPos);

                        final float screenX = screenPos[0] + values[0];
                        final float screenY = screenPos[1] + values[1];
                        float[] coordinates = {screenX, screenY};

                        return coordinates;
                    }
                },
                Press.FINGER);
        gca.perform(uicontroller, v);
    }

    public void clickOn(String itemString) {
        UiObject2 button = device.findObject(By.text(itemString));
        assertTrue(itemString+" object not found", button != null);
        button.click();
        device.waitForWindowUpdate("", 1000);
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
