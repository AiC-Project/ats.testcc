package com.zenika.aic.core.libs.sensor;

import com.zenika.aic.core.libs.network.TCPClient;

/**
 * Created by pierre on 10/11/15.
 */
public class Photometer {
    private final int SENSOR_PORT = 22471;

    private static Photometer instance = null;

    public static Photometer getInstance() {
        if(Photometer.instance == null)
            Photometer.instance = new Photometer();
        return Photometer.instance;
    }

    public void setValue(float light) {

        SensorsPacket.sensors_packet packet;
        SensorsPacket.sensors_packet.Builder builder = SensorsPacket.sensors_packet.newBuilder();
        SensorsPacket.sensors_packet.SensorLightPayload.Builder photometerBuilder = SensorsPacket.sensors_packet.SensorLightPayload.newBuilder();
        photometerBuilder.setLight(light);
        builder.setSensorLight(photometerBuilder);
        packet = builder.build();

        new TCPClient(SENSOR_PORT, packet);
    }
}