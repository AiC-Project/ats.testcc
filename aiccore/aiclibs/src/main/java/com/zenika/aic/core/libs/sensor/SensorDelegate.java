package com.zenika.aic.core.libs.sensor;

import com.zenika.aic.core.libs.network.ByteUtils;
import com.zenika.aic.core.libs.network.TCPClient;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.Arrays;

public class SensorDelegate {
	private static volatile SensorDelegate instance = null;
    private final int ACCELEROMETER_PORT = 22471;
    private final String SENSOR_HOST = "127.0.0.1";
    private final int ACCELEROMETER_ID = 1;
    
    private ByteUtils byteUtils = ByteUtils.getInstance();

    /**
     * Default private constructor
     */
    private SensorDelegate() {
        super();
    }

    /**
     * Get main controller unique instance
     * @return Main controller instance
     */
    public final static SensorDelegate getInstance() {
        if (SensorDelegate.instance == null) {
            synchronized(SensorDelegate.class) {
                if (SensorDelegate.instance == null)
                	SensorDelegate.instance = new SensorDelegate();
            }
        }
        return SensorDelegate.instance;
    }

    public void setAccelerometerValue(float x,float y, float z) {
    	ByteBuffer buffer = ByteBuffer.allocate(15);
        try {
        	buffer.put(byteUtils.intToBytes(13,2));
			buffer.put(byteUtils.intToBytes(ACCELEROMETER_ID,1));
            buffer.put(byteUtils.floatToBytes(x));
            buffer.put(byteUtils.floatToBytes(y));
            buffer.put(byteUtils.floatToBytes(z));
            
            System.out.println(Arrays.toString(buffer.array()));
            new TCPClient(SENSOR_HOST,ACCELEROMETER_PORT,buffer.array());
        } catch(UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }
}
