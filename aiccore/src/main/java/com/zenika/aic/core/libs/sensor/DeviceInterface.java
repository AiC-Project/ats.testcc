package com.zenika.aic.core.libs.sensor;

/**
 * Created by thomas on 09/06/15.
 */
public interface DeviceInterface {
    /**
     *
     * @return
     */
    GpsInterface gps();

    /**
     *
     * @return
     */
    AccelerometerInterface accelerometer();

    /**
     *
     * @return
     */
    BatteryInterface battery();
}
