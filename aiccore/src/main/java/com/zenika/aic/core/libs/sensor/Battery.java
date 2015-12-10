package com.zenika.aic.core.libs.sensor;

import com.zenika.aic.core.libs.network.SystemUtils;
import com.zenika.aic.core.libs.network.TCPClient;

public class Battery {

	private static volatile Battery instance = null;

    private final int BATTERY_PORT = 22473;
    private final String BATTERY_HOST = "127.0.0.1";

    private static final String GET_LEVEL = Device.GET_PROP_BATTERY + "level";
    private static final String GET_CAPACITY = Device.GET_PROP_BATTERY + "capacity";

    /**
     * Get main controller unique instance
     * @return Main controller instance
     */
    public static Battery getInstance() {
        if (Battery.instance == null)
            Battery.instance = new Battery();
        return Battery.instance;
    }

    public long getLevel() {
        return SystemUtils.getInstance().execToLong(GET_LEVEL);
    }

    public long getCapacity() {
        return SystemUtils.getInstance().execToLong(GET_CAPACITY);
    }

    public void setLevel(long level, long levelMax) {

        SensorsPacket.sensors_packet packet;
        SensorsPacket.sensors_packet.Builder builder = SensorsPacket.sensors_packet.newBuilder();
        SensorsPacket.sensors_packet.BatteryPayload.Builder batteryBuilder = SensorsPacket.sensors_packet.BatteryPayload.newBuilder();
        batteryBuilder.setBatteryLevel(level);
        batteryBuilder.setBatteryFull(levelMax);
        builder.setBattery(batteryBuilder);
        packet = builder.build();

        new TCPClient(BATTERY_PORT, packet);
    }

    public void setLevel(long level, long levelMax, SensorsPacket.sensors_packet.BatteryPayload.BattStatusType status) {

        SensorsPacket.sensors_packet packet;
        SensorsPacket.sensors_packet.Builder builder = SensorsPacket.sensors_packet.newBuilder();
        SensorsPacket.sensors_packet.BatteryPayload.Builder batteryBuilder = SensorsPacket.sensors_packet.BatteryPayload.newBuilder();
        batteryBuilder.setBatteryLevel(level);
        batteryBuilder.setBatteryFull(levelMax);
        batteryBuilder.setBatteryStatus(status);
        builder.setBattery(batteryBuilder);
        packet = builder.build();

        new TCPClient(BATTERY_PORT, packet);
    }

    public void setLevel(long level, long levelMax, SensorsPacket.sensors_packet.BatteryPayload.BattStatusType status, int ACStatus) {

        SensorsPacket.sensors_packet packet;
        SensorsPacket.sensors_packet.Builder builder = SensorsPacket.sensors_packet.newBuilder();
        SensorsPacket.sensors_packet.BatteryPayload.Builder batteryBuilder = SensorsPacket.sensors_packet.BatteryPayload.newBuilder();
        batteryBuilder.setBatteryLevel(level);
        batteryBuilder.setBatteryFull(levelMax);
        batteryBuilder.setBatteryStatus(status);
        batteryBuilder.setACOnline(ACStatus);
        builder.setBattery(batteryBuilder);
        packet = builder.build();

        new TCPClient(BATTERY_PORT, packet);
    }
}
