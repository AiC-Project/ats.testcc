package com.zenika.aic.core.libs.sensor;

import com.zenika.aic.core.libs.network.TCPClient;

/**
 * Created by pierre on 10/11/15.
 */
public class ProximitySensor {
    private final int SENSOR_PORT = 22471;

    private static ProximitySensor instance = null;

    public static ProximitySensor getInstance() {
        if(ProximitySensor.instance == null)
            ProximitySensor.instance = new ProximitySensor();
        return ProximitySensor.instance;
    }

    public void setValue(float proximity) {

        SensorsPacket.sensors_packet packet;
        SensorsPacket.sensors_packet.Builder builder = SensorsPacket.sensors_packet.newBuilder();
        SensorsPacket.sensors_packet.SensorProximityPayload.Builder proximitySensorBuilder = SensorsPacket.sensors_packet.SensorProximityPayload.newBuilder();
        proximitySensorBuilder.setDistance(proximity);
        builder.setProximity(proximitySensorBuilder);
        packet = builder.build();

        new TCPClient(SENSOR_PORT, packet);
    }
}
