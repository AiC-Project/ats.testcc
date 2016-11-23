package com.zenika.aic.core.libs.sensor;

import android.app.Instrumentation;
import android.hardware.Sensor;
import android.os.RemoteException;
import android.support.test.espresso.action.CloseKeyboardAction;
import android.support.test.espresso.action.CoordinatesProvider;
import android.support.test.espresso.action.GeneralClickAction;
import android.support.test.espresso.action.Press;
import android.support.test.espresso.action.Tap;
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
import android.view.View;
import android.widget.TextView;

import com.zenika.aic.core.R;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.clearText;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.matcher.ViewMatchers.withId;


/**
 * Created by pierre on 09/12/15.
 */
public class Device extends InstrumentationTestCase {

    private UiDevice device;
    private Instrumentation instrumentation;
    private Gps gps;
    private Battery battery;

    public Device(String appName, Instrumentation instrumentation) {
        try {
            //SDLRecord.startTCPServer(32500);
        } catch(Exception e) {
            Log.v("tcp_server", "Fail to launch tcp server");
        }
        try {
            this.instrumentation = instrumentation;
            this.gps = new Gps().getInstance();
            this.battery = new Battery().getInstance();
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

    private void runApp(String appName) throws UiObjectNotFoundException, RemoteException {
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

    public void bringPictureToCamera(String path) {
        Camera.bringPictureToCamera(path);
    }

    public static UiObject getUiObject(String description) {
        UiObject uiObject;
        UiSelector uiSelector = new UiSelector();
        uiObject = new UiObject(uiSelector.text(description));
        if (!uiObject.exists()) {
            uiObject = new UiObject(uiSelector.description(description));
        }
        if (!uiObject.exists()) {
            uiObject = new UiObject(uiSelector.resourceId(description));
        }
        if (!uiObject.exists()) {
            uiObject = null;
        }
        return uiObject;
    }


    public void swipe(String direction, int steps) {
        UiObject appViews =new UiObject(new UiSelector().resourceId("left_drawer"));
        //SLOW.sendSwipe(uicontroller, new float[]{10,50}, new float[]{500,50}, new float[]{5,5});
        try {
            if(direction.equals("UP"))
                appViews.swipeUp(steps);
            else if(direction.equals("DOWN"))
                appViews.swipeDown(steps);
            else if(direction.equals("LEFT"))
                appViews.swipeLeft(steps);
            else if(direction.equals("RIGHT"))
                appViews.swipeRight(steps);
        } catch (UiObjectNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void scrollOnFrom(String on, String from) {
//        UiScrollable listView = new UiScrollable(new UiSelector().textStartsWith("Picture"));
//        listView.setMaxSearchSwipes(500);
//        try {
//            listView.scrollForward(400);
//        } catch (UiObjectNotFoundException e) {
//            e.printStackTrace();
//        }
//        listView.waitForExists(5000);
        UiScrollable listView = new UiScrollable(new UiSelector().textStartsWith(from));
        UiObject navigationDrawerApp = new UiObject(new UiSelector().text(on));

        while (!navigationDrawerApp.exists()){
            try {
                //listView.scrollIntoView(navigationDrawerApp);
                listView.setAsVerticalList();
                listView.scrollForward(5);
            } catch (UiObjectNotFoundException e) {
                e.printStackTrace();
            }
        }

        listView.waitForExists(10000);
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
        //gca.perform(uicontroller, v);
    }

    private void clickOn(final float[] values, float[] precision) {
        GeneralClickAction gca = new GeneralClickAction(
                Tap.LONG,
                new CoordinatesProvider() {
                    @Override
                    public float[] calculateCoordinates(View view) {
                        return new float[0];
                    }
                },
                Press.FINGER);
        //gca.perform(uicontroller, v);
    }

    public void clickOn(String itemString) {
        UiObject2 button = device.findObject(By.text(itemString));
        assertTrue(itemString+" object not found", button != null);
        button.click();
        device.waitForWindowUpdate("", 2000);
    }

    // Assert

    public void isTextExists(String text) {
        UiObject2 uio = device.findObject(By.text(text));
        assertTrue(text+" object not found", uio != null);
    }

    // Type Text

    public void setText(String text, String item) {
        try {
            new UiObject(new UiSelector().description(item)).setText(text);
        } catch (UiObjectNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void replaceText(String text, int id) {
        onView(withId(id)).perform(clearText());
        onView(withId(id)).perform(typeText(text));
    }

    public void setText(String text, int id) {
//        try {
//            new UiObject(new UiSelector().resourceId(id)).setText(text);
//        } catch (UiObjectNotFoundException e) {
//            e.printStackTrace();
//        }
        onView(withId(id)).perform(typeText(text));
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
