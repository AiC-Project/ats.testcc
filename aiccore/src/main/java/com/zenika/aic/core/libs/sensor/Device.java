package com.zenika.aic.core.libs.sensor;

/**
 * Created by thomas on 09/06/15.
 */
public class Device implements DeviceInterface {
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

    private static Device instance = null;

    private Device() {
        //Empty for the moment
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
}
