package com.zenika.aic.core.libs.sensor;

import com.zenika.aic.core.libs.network.ByteUtils;
import com.zenika.aic.core.libs.network.SystemUtils;
import com.zenika.aic.core.libs.network.TCPClient;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.Arrays;

public class Battery implements BatteryInterface {
	private static volatile Battery instance = null;

    private final int BATTERY_PORT = 22473;
    private final String BATTERY_HOST = "127.0.0.1";
    private final long BATTERY_FULL;

    private static final String GET_LEVEL = Device.GET_PROP_BATTERY + "level";
    private static final String GET_CAPACITY = Device.GET_PROP_BATTERY + "capacity";

    private ByteUtils byteUtils = ByteUtils.getInstance();

    /**
     * Default private constructor
     */
    private Battery() {
        super();
        long capacity;
        try {
            capacity = this.getCapacity();
        } catch (Exception e) {
            capacity = 50000000;
        }
        BATTERY_FULL = capacity;
    }

    /**
     * Get main controller unique instance
     * @return Main controller instance
     */
    public final static Battery getInstance() {
        if (Battery.instance == null)
            Battery.instance = new Battery();
        return Battery.instance;
    }

    @Override
    public BatteryInterface setLevel(int level) {

        SensorsPacket.sensors_packet packet;
        SensorsPacket.sensors_packet.Builder builder = SensorsPacket.sensors_packet.newBuilder();

        //TO DO: FIX ME

        packet = builder.build();
        new TCPClient(BATTERY_PORT, packet);
        return this;
    }

    @Override
    public long getLevel() {
        return SystemUtils.getInstance().execToLong(GET_LEVEL);
    }

    @Override
    public long getCapacity() {
        return SystemUtils.getInstance().execToLong(GET_CAPACITY);
    }
}
