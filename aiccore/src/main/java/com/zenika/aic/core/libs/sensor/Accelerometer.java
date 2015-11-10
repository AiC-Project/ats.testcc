package com.zenika.aic.core.libs.sensor;

import com.zenika.aic.core.libs.network.ByteUtils;
import com.zenika.aic.core.libs.network.TCPClient;
import com.zenika.aic.core.libs.sensor.SensorsPacket;

/**
 * Created by thomas on 09/06/15.
 */
public class Accelerometer implements AccelerometerInterface {
    private final int ACCELEROMETER_PORT = 22471;
    private final String SENSOR_HOST = "127.0.0.1";
    private final int ACCELEROMETER_ID = 1;

    private ByteUtils byteUtils = ByteUtils.getInstance();

    private static Accelerometer instance = null;

    private Accelerometer() {
        //Empty for the moment
    }

    public static Accelerometer getInstance() {
        if(Accelerometer.instance == null)
            Accelerometer.instance = new Accelerometer();
        return Accelerometer.instance;
    }

    @Override
    public void setValue(float x, float y, float z) {

        SensorsPacket.sensors_packet packet;
        SensorsPacket.sensors_packet.Builder builder = SensorsPacket.sensors_packet.newBuilder();
        SensorsPacket.sensors_packet.SensorAcceleroPayload.Builder acceleroBuilder = SensorsPacket.sensors_packet.SensorAcceleroPayload.newBuilder();
        acceleroBuilder.setX(x);
        acceleroBuilder.setY(y);
        acceleroBuilder.setZ(z);
        builder.setAccelero(acceleroBuilder);
        packet = builder.build();

        new TCPClient(SENSOR_HOST,ACCELEROMETER_PORT,packet);
    }

    @Override
    public AccelerometerInterface setX(float x) {
        throw new UnsupportedOperationException("Set x method is not implemented yet.");
    }

    @Override
    public AccelerometerInterface setY(float y) {
        throw new UnsupportedOperationException("Set y method is not implemented yet.");
    }

    @Override
    public AccelerometerInterface setZ(float z) {
        throw new UnsupportedOperationException("Set z method is not implemented yet.");
    }
}
