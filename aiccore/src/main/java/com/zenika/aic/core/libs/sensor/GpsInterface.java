package com.zenika.aic.core.libs.sensor;

/**
 * Created by thomas on 09/06/15.
 */
public interface GpsInterface {
    /**
     *
     * @param latitude
     * @param longitude
     */
    void setPosition(float latitude, float longitude);

    /**
     *
     * @param latitude
     * @return
     */
    GpsInterface setLatitude(float latitude);

    /**
     *
     * @param longitude
     * @return
     */
    GpsInterface setLongitude(float longitude);
}
