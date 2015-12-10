package com.zenika.aic.core.libs.sensor;

/**
 * Created by thomas on 30/04/15.
 */
public final class Camera {
    private static Camera instance = null;

    private Camera() {
        //Empty for the moment
    }

    public static Camera getInstance() {
        if (Camera.instance == null)
            Camera.instance = new Camera();
        return Camera.instance;
    }
}
