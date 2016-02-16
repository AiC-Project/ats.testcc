package com.zenika.aic.core.libs.sensor;

import com.zenika.aic.core.libs.network.TCPClient;

/**
 * Created by pierre on 10/11/15.
 */
public class AmbientThermometer {
    private final int SENSOR_PORT = 22471;

    private static AmbientThermometer instance = null;

    public static AmbientThermometer getInstance() {
        if(AmbientThermometer.instance == null)
            AmbientThermometer.instance = new AmbientThermometer();
        return AmbientThermometer.instance;
    }

    public void setValue(float temp) {

        SensorsPacket.sensors_packet packet;
        SensorsPacket.sensors_packet.Builder builder = SensorsPacket.sensors_packet.newBuilder();
        SensorsPacket.sensors_packet.SensorTemperaturePayload.Builder thermometerBuilder = SensorsPacket.sensors_packet.SensorTemperaturePayload.newBuilder();
        thermometerBuilder.setTemperature(temp);
        builder.setSensorTemperature(thermometerBuilder);
        packet = builder.build();

        new TCPClient(SENSOR_PORT, packet);
    }
}
