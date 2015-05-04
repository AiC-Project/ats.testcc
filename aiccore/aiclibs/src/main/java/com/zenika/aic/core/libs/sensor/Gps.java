package com.zenika.aic.core.libs.sensor;

import com.zenika.aic.core.libs.network.ByteUtils;
import com.zenika.aic.core.libs.network.TCPClient;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;

public class Gps {
	private static volatile Gps instance = null;

    private final int LOCATION_PORT = 22475;
    private final String LOCATION_HOST = "127.0.0.1";
    
    private ByteUtils byteUtils = ByteUtils.getInstance();

    /**
     * Default private constructor
     */
    private Gps() {
        super();
    }

    /**
     * Get main controller unique instance
     * @return Main controller instance
     */
    public final static Gps getInstance() {
        if (Gps.instance == null) {
            synchronized(Gps.class) {
                if (Gps.instance == null)
                	Gps.instance = new Gps();
            }
        }
        return Gps.instance;
    }
    
    public final void setPosition(float latitude, float longitude) {
        ByteBuffer buffer = ByteBuffer.allocate(19);
        try {
        	buffer.put(byteUtils.intToBytes(17,2));
        	buffer.put(byteUtils.intToBytes(1, 1));
        	buffer.put(byteUtils.floatToBytes(latitude));
        	buffer.put(byteUtils.floatToBytes(longitude));
        	buffer.put(byteUtils.floatToBytes(10f));
        	buffer.put(byteUtils.floatToBytes(3f));
            
            //System.out.println(Arrays.toString(buffer.array()));
            new TCPClient(LOCATION_HOST,LOCATION_PORT,buffer.array());
        } catch(UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }
}
