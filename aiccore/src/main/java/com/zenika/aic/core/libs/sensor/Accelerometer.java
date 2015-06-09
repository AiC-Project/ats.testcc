package com.zenika.aic.core.libs.sensor;

import com.zenika.aic.core.libs.network.ByteUtils;
import com.zenika.aic.core.libs.network.TCPClient;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;

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
        ByteBuffer buffer = ByteBuffer.allocate(15);
        try {
            buffer.put(byteUtils.intToBytes(13,2));
            buffer.put(byteUtils.intToBytes(ACCELEROMETER_ID, 1));
            buffer.put(byteUtils.floatToBytes(x));
            buffer.put(byteUtils.floatToBytes(y));
            buffer.put(byteUtils.floatToBytes(z));

            new TCPClient(SENSOR_HOST,ACCELEROMETER_PORT,buffer.array());
        } catch(UnsupportedEncodingException e) {
            e.printStackTrace();
        }
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
