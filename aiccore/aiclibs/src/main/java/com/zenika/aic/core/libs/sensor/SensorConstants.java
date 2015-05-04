package com.zenika.aic.core.libs.sensor;

/**
 * Created by thomas on 30/04/15.
 */
public class SensorConstants {
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
}
