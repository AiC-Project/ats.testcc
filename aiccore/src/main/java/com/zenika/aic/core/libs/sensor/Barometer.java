package com.zenika.aic.core.libs.sensor;

import com.zenika.aic.core.libs.network.TCPClient;

/**
 * Created by pierre on 10/11/15.
 */
public class Barometer{
    private final int BAROMETER_PORT = 22471;

    private static Barometer instance = null;

    public static Barometer getInstance() {
        if(Barometer.instance == null)
            Barometer.instance = new Barometer();
        return Barometer.instance;
    }

    public void setValue(float pressure) {

        SensorsPacket.sensors_packet packet;
        SensorsPacket.sensors_packet.Builder builder = SensorsPacket.sensors_packet.newBuilder();
        SensorsPacket.sensors_packet.SensorPressurePayload.Builder baroBuilder = SensorsPacket.sensors_packet.SensorPressurePayload.newBuilder();
        baroBuilder.setPressure(pressure);
        builder.setBarometer(baroBuilder);
        packet = builder.build();

        new TCPClient(BAROMETER_PORT, packet);
    }
}
