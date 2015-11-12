package com.zenika.aic.core.libs.sensor;

import com.zenika.aic.core.libs.network.ByteUtils;
import com.zenika.aic.core.libs.network.TCPClient;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;

public class Gps implements GpsInterface {
	private static Gps instance = null;

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
        if (Gps.instance == null)
            Gps.instance = new Gps();
        return Gps.instance;
    }

    @Override
    public void setPosition(float latitude, float longitude) {

        SensorsPacket.sensors_packet packet;
        SensorsPacket.sensors_packet.Builder builder = SensorsPacket.sensors_packet.newBuilder();

        //TO DO: FIX ME

        packet = builder.build();
        new TCPClient(LOCATION_PORT, packet);

        ByteBuffer buffer = ByteBuffer.allocate(19);
    }

    @Override
    public GpsInterface setLatitude(float latitude) {
        throw new UnsupportedOperationException("Set latitude method is not implemented yet.");
    }

    @Override
    public GpsInterface setLongitude(float longitude) {
        throw new UnsupportedOperationException("Set longitude method is not implemented yet.");
    }
}
