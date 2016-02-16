package com.zenika.aic.core.libs.sensor;

import com.zenika.aic.core.libs.network.SystemUtils;
import com.zenika.aic.core.libs.network.TCPClient;

public class Battery {

	private static volatile Battery instance = null;

    protected final int BATTERY_PORT = 22473;

    public static Battery getInstance() {
        if (Battery.instance == null)
            Battery.instance = new Battery();
        return Battery.instance;
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

    public void setLevel(long level, long levelMax, SensorsPacket.sensors_packet.BatteryPayload.BatteryStatusType status) {

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

    public void setLevel(long level, long levelMax, SensorsPacket.sensors_packet.BatteryPayload.BatteryStatusType status, int ACStatus) {

        SensorsPacket.sensors_packet packet;
        SensorsPacket.sensors_packet.Builder builder = SensorsPacket.sensors_packet.newBuilder();
        SensorsPacket.sensors_packet.BatteryPayload.Builder batteryBuilder = SensorsPacket.sensors_packet.BatteryPayload.newBuilder();
        batteryBuilder.setBatteryLevel(level);
        batteryBuilder.setBatteryFull(levelMax);
        batteryBuilder.setBatteryStatus(status);
        batteryBuilder.setAcOnline(ACStatus);
        builder.setBattery(batteryBuilder);
        packet = builder.build();

        new TCPClient(BATTERY_PORT, packet);
    }
}
