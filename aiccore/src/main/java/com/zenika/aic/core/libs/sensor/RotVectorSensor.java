package com.zenika.aic.core.libs.sensor;

import com.zenika.aic.core.libs.network.TCPClient;

/**
 * Created by pierre on 12/11/15.
 */
public class RotVectorSensor {
    private final int SENSOR_PORT = 22471;

    private static RotVectorSensor instance = null;

    public static RotVectorSensor getInstance() {
        if(RotVectorSensor.instance == null)
            RotVectorSensor.instance = new RotVectorSensor();
        return RotVectorSensor.instance;
    }

    public void setValue(int index, double[] data) {

        SensorsPacket.sensors_packet packet;
        SensorsPacket.sensors_packet.Builder builder = SensorsPacket.sensors_packet.newBuilder();
        SensorsPacket.sensors_packet.SensorRotVectorPayload.Builder rotVectorSensorBuilder = SensorsPacket.sensors_packet.SensorRotVectorPayload.newBuilder();
        rotVectorSensorBuilder.setData(0,data[0]);
        rotVectorSensorBuilder.setData(1,data[1]);
        rotVectorSensorBuilder.setData(2,data[2]);
        rotVectorSensorBuilder.setData(3,data[3]);
        builder.setRotvector(rotVectorSensorBuilder);
        packet = builder.build();

        new TCPClient(SENSOR_PORT, packet);
    }
}
