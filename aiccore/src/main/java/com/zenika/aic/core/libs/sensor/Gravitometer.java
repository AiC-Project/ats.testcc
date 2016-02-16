package com.zenika.aic.core.libs.sensor;

import com.zenika.aic.core.libs.network.TCPClient;

/**
 * Created by pierre on 10/11/15.
 */
public class Gravitometer {
    private final int SENSOR_PORT = 22471;

    private static Gravitometer instance = null;

    public static Gravitometer getInstance() {
        if(Gravitometer.instance == null)
            Gravitometer.instance = new Gravitometer();
        return Gravitometer.instance;
    }

    public void setValue(float x, float y, float z) {

        SensorsPacket.sensors_packet packet;
        SensorsPacket.sensors_packet.Builder builder = SensorsPacket.sensors_packet.newBuilder();
        SensorsPacket.sensors_packet.SensorGravityPayload.Builder gravitometerBuilder = SensorsPacket.sensors_packet.SensorGravityPayload.newBuilder();
        gravitometerBuilder.setX(x);
        gravitometerBuilder.setY(y);
        gravitometerBuilder.setZ(z);
        builder.setSensorGravity(gravitometerBuilder);
        packet = builder.build();

        new TCPClient(SENSOR_PORT, packet);
    }
}
