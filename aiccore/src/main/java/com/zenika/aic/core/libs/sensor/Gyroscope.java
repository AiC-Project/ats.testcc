package com.zenika.aic.core.libs.sensor;

import com.zenika.aic.core.libs.network.TCPClient;

/**
 * Created by pierre on 10/11/15.
 */
public class Gyroscope {
    private final int SENSOR_PORT = 22471;

    private static Gyroscope instance = null;

    public static Gyroscope getInstance() {
        if(Gyroscope.instance == null)
            Gyroscope.instance = new Gyroscope();
        return Gyroscope.instance;
    }

    public void setValue(float azimuth, float pitch, float roll) {

        SensorsPacket.sensors_packet packet;
        SensorsPacket.sensors_packet.Builder builder = SensorsPacket.sensors_packet.newBuilder();
        SensorsPacket.sensors_packet.SensorGyroscopePayload.Builder gyroscopeBuilder = SensorsPacket.sensors_packet.SensorGyroscopePayload.newBuilder();
        gyroscopeBuilder.setAzimuth(azimuth);
        gyroscopeBuilder.setPitch(pitch);
        gyroscopeBuilder.setRoll(roll);
        builder.setSensorGyroscope(gyroscopeBuilder);
        packet = builder.build();

        new TCPClient(SENSOR_PORT, packet);
    }
}
