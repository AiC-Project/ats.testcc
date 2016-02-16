package com.zenika.aic.core.libs.sensor;

import com.zenika.aic.core.libs.network.TCPClient;

/**
 * Created by pierre on 10/11/15.
 */
public class Magnetometer {
    private final int SENSOR_PORT = 22471;

    private static Magnetometer instance = null;

    public static Magnetometer getInstance() {
        if(Magnetometer.instance == null)
            Magnetometer.instance = new Magnetometer();
        return Magnetometer.instance;
    }

    public void setValue(float x, float y, float z) {

        SensorsPacket.sensors_packet packet;
        SensorsPacket.sensors_packet.Builder builder = SensorsPacket.sensors_packet.newBuilder();
        SensorsPacket.sensors_packet.SensorMagnetometerPayload.Builder magnetometerBuilder = SensorsPacket.sensors_packet.SensorMagnetometerPayload.newBuilder();
        magnetometerBuilder.setX(x);
        magnetometerBuilder.setY(y);
        magnetometerBuilder.setZ(z);
        builder.setSensorMagnetometer(magnetometerBuilder);
        packet = builder.build();

        new TCPClient(SENSOR_PORT, packet);
    }
}
