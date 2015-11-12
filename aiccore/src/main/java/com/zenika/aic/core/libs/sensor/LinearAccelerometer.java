package com.zenika.aic.core.libs.sensor;

import com.zenika.aic.core.libs.network.TCPClient;

/**
 * Created by pierre on 10/11/15.
 */
public class LinearAccelerometer {
    private final int SENSOR_PORT = 22471;

    private static LinearAccelerometer instance = null;

    public static LinearAccelerometer getInstance() {
        if(LinearAccelerometer.instance == null)
            LinearAccelerometer.instance = new LinearAccelerometer();
        return LinearAccelerometer.instance;
    }

    public void setValue(float x, float y, float z) {

        SensorsPacket.sensors_packet packet;
        SensorsPacket.sensors_packet.Builder builder = SensorsPacket.sensors_packet.newBuilder();
        SensorsPacket.sensors_packet.SensorLinearAccPayload.Builder linearAccBuilder = SensorsPacket.sensors_packet.SensorLinearAccPayload.newBuilder();
        linearAccBuilder.setX(x);
        linearAccBuilder.setY(y);
        linearAccBuilder.setZ(z);
        builder.setLinearAcc(linearAccBuilder);
        packet = builder.build();

        new TCPClient(SENSOR_PORT, packet);
    }
}