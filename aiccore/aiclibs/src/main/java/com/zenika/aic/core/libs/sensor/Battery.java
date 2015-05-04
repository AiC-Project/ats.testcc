package com.zenika.aic.core.libs.sensor;

import com.zenika.aic.core.libs.network.ByteUtils;
import com.zenika.aic.core.libs.network.SystemUtils;
import com.zenika.aic.core.libs.network.TCPClient;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.Arrays;

public class Battery {
	private static volatile Battery instance = null;

    private final int BATTERY_PORT = 22473;
    private final String BATTERY_HOST = "127.0.0.1";
    private final long BATTERY_FULL;

    private static final String GET_LEVEL = SensorConstants.GET_PROP_BATTERY + "level";
    private static final String GET_CAPACITY = SensorConstants.GET_PROP_BATTERY + "capacity";

    private ByteUtils byteUtils = ByteUtils.getInstance();

    /**
     * Default private constructor
     */
    private Battery() {
        super();
        long capacity;
        try {
            capacity = this.getBatteryCapacity();
        } catch (Exception e) {
            capacity = 50000000;
        }
        BATTERY_FULL = capacity;
    }

    /**
     * Get main controller unique instance
     * @return Main controller instance
     */
    public final static Battery get() {
        if (Battery.instance == null) {
            synchronized(Battery.class) {
                if (Battery.instance == null)
                    Battery.instance = new Battery();
            }
        }
        return Battery.instance;
    }

    public final Battery setBatteryLevel(int level) {
        ByteBuffer buffer = ByteBuffer.allocate(20);
        try {
        	buffer.put(byteUtils.intToBytes(18,2));
			buffer.put(byteUtils.longToBytes(level*BATTERY_FULL/100));
            buffer.put(byteUtils.longToBytes(BATTERY_FULL));
            buffer.put(byteUtils.intToBytes(3,1));
            buffer.put(byteUtils.intToBytes(0,1));
            
            System.out.println(Arrays.toString(buffer.array()));
            new TCPClient(BATTERY_HOST,BATTERY_PORT,buffer.array());
        } catch(UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return this;
    }

    public final long getBatteryLevel() throws IOException {
        return SystemUtils.getInstance().execToLong(GET_LEVEL);
    }

    private final long getBatteryCapacity() throws IOException {
        return SystemUtils.getInstance().execToLong(GET_CAPACITY);
    }
}
