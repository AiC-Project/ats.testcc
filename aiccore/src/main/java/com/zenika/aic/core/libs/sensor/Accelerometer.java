package com.zenika.aic.core.libs.sensor;

import com.zenika.aic.core.libs.network.ByteUtils;
import com.zenika.aic.core.libs.network.TCPClient;

/**
 * Created by thomas on 09/06/15.
 */
public class Accelerometer{
    private final int ACCELEROMETER_PORT = 22471;

    private static Accelerometer instance = null;

    public static Accelerometer getInstance() {
        if(Accelerometer.instance == null)
            Accelerometer.instance = new Accelerometer();
        return Accelerometer.instance;
    }

    public void setValue(float x, float y, float z) {

        SensorsPacket.sensors_packet packet;
        SensorsPacket.sensors_packet.Builder builder = SensorsPacket.sensors_packet.newBuilder();
        SensorsPacket.sensors_packet.SensorAcceleroPayload.Builder acceleroBuilder = SensorsPacket.sensors_packet.SensorAcceleroPayload.newBuilder();
        acceleroBuilder.setX(x);
        acceleroBuilder.setY(y);
        acceleroBuilder.setZ(z);
        builder.setAccelero(acceleroBuilder);
        packet = builder.build();

        new TCPClient(ACCELEROMETER_PORT, packet);
    }
}
