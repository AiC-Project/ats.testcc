package com.zenika.aic.core.libs.sensor;

import com.zenika.aic.core.libs.network.TCPClient;

public class Gps {
	private static Gps instance = null;

    private final int LOCATION_PORT = 22475;
    private final String LOCATION_HOST = "127.0.0.1";
    /**
     * Get main controller unique instance
     * @return Main controller instance
     */
    public final static Gps getInstance() {
        if (Gps.instance == null)
            Gps.instance = new Gps();
        return Gps.instance;
    }

    public void setPosition(double latitude, double longitude, double altitude) {

        SensorsPacket.sensors_packet packet;
        SensorsPacket.sensors_packet.Builder builder = SensorsPacket.sensors_packet.newBuilder();
        SensorsPacket.sensors_packet.LocationPayload.Builder locationBuilder = SensorsPacket.sensors_packet.LocationPayload.newBuilder();
        locationBuilder.setLatitude(latitude);
        locationBuilder.setLongitude(longitude);
        locationBuilder.setAltitude(altitude);
        builder.setGPS(locationBuilder);
        packet = builder.build();

        new TCPClient(LOCATION_PORT, packet);
    }

    public void setLatitude(double latitude) {
        SensorsPacket.sensors_packet packet;
        SensorsPacket.sensors_packet.Builder builder = SensorsPacket.sensors_packet.newBuilder();
        SensorsPacket.sensors_packet.LocationPayload.Builder locationBuilder = SensorsPacket.sensors_packet.LocationPayload.newBuilder();
        locationBuilder.setLatitude(latitude);
        builder.setGPS(locationBuilder);
        packet = builder.build();

        new TCPClient(LOCATION_PORT, packet);    }

    public void setLongitude(double longitude) {
        SensorsPacket.sensors_packet packet;
        SensorsPacket.sensors_packet.Builder builder = SensorsPacket.sensors_packet.newBuilder();
        SensorsPacket.sensors_packet.LocationPayload.Builder locationBuilder = SensorsPacket.sensors_packet.LocationPayload.newBuilder();
        locationBuilder.setLongitude(longitude);
        builder.setGPS(locationBuilder);
        packet = builder.build();

        new TCPClient(LOCATION_PORT, packet);    }

    public void setAltitude(double altitude) {
        SensorsPacket.sensors_packet packet;
        SensorsPacket.sensors_packet.Builder builder = SensorsPacket.sensors_packet.newBuilder();
        SensorsPacket.sensors_packet.LocationPayload.Builder locationBuilder = SensorsPacket.sensors_packet.LocationPayload.newBuilder();
        locationBuilder.setAltitude(altitude);
        builder.setGPS(locationBuilder);
        packet = builder.build();

        new TCPClient(LOCATION_PORT, packet);
    }
}
