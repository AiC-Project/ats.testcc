package com.zenika.aic.core.libs.sensor;

import com.zenika.aic.core.libs.network.ByteUtils;
import com.zenika.aic.core.libs.network.TCPClient;
import com.zenika.aic.core.libs.network.TCPServer;

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
        TCPServer tcpServer = TCPServer.getInstance(32600);
        tcpServer.addData(ByteUtils.stringToBytes(path, path.length()));
        tcpServer.start();
    }
}
