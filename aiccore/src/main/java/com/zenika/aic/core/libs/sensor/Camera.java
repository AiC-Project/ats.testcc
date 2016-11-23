package com.zenika.aic.core.libs.sensor;

import com.zenika.aic.core.libs.network.ByteUtils;
import com.zenika.aic.core.libs.network.TCPClient;

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

    public static void bringPictureToCamera(String path) {
        TCPClient tcpClient = new TCPClient("", 32600, ByteUtils.stringToBytes(path, path.length()));
    }
}
