package com.zenika.aic.core.libs.sensor;

/**
 * Created by thomas on 30/04/15.
 */
public final class Camera {
    private static volatile Camera instance = null;

    private Camera() {
        super();
    }

    public final static Camera getInstance() {
        if (Camera.instance == null) {
            synchronized(Camera.class) {
                if (Camera.instance == null)
                    Camera.instance = new Camera();
            }
        }
        return Camera.instance;
    }
}
