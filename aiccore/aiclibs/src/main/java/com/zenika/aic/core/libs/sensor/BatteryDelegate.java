package com.zenika.aic.core.libs.sensor;

import com.zenika.aic.core.libs.network.ByteUtils;
import com.zenika.aic.core.libs.network.TCPClient;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.Arrays;

public class BatteryDelegate {
	private static volatile BatteryDelegate instance = null;

    private final int BATTERY_PORT = 22473;
    private final String BATTERY_HOST = "127.0.0.1";
    private final long BATTERY_FULL = 50000000;
    
    private ByteUtils byteUtils = ByteUtils.getInstance();

    /**
     * Default private constructor
     */
    private BatteryDelegate() {
        super();
    }

    /**
     * Get main controller unique instance
     * @return Main controller instance
     */
    public final static BatteryDelegate getInstance() {
        if (BatteryDelegate.instance == null) {
            synchronized(BatteryDelegate.class) {
                if (BatteryDelegate.instance == null)
                    BatteryDelegate.instance = new BatteryDelegate();
            }
        }
        return BatteryDelegate.instance;
    }

    public void setBatteryLevel(int level) {
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
    }
    
    public void setStatus() {
        ByteBuffer buffer = ByteBuffer.allocate(20);
        try {
        	buffer.put(byteUtils.intToBytes(18,2));
			buffer.put(byteUtils.longToBytes(50*BATTERY_FULL/100));
            buffer.put(byteUtils.longToBytes(BATTERY_FULL));
            buffer.put(byteUtils.intToBytes(3,1));
            buffer.put(byteUtils.intToBytes(0,1));
            
            System.out.println(Arrays.toString(buffer.array()));
            new TCPClient(BATTERY_HOST,BATTERY_PORT,buffer.array());
        } catch(UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }
}
