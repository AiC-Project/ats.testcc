package com.zenika.aic.core.libs.sensor;

/**
 * Created by thomas on 09/06/15.
 */
public interface BatteryInterface {

    /**
     *
     * @param level
     * @return
     */
    BatteryInterface setLevel(int level);

    /**
     *
     * @return
     */
    long getLevel();

    /**
     *
     * @return
     */
    long getCapacity();
}
