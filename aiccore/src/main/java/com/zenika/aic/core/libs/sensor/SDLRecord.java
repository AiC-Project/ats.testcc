package com.zenika.aic.core.libs.sensor;

import android.util.Log;
import com.zenika.aic.core.libs.network.TCPServer;

import java.security.Timestamp;
import java.util.Calendar;

/**
 * Created by zenika on 02/02/16.
 */
public class SDLRecord {

    static Thread t;

    public static void sendProtoRequestToStartRecording() {
        Recording.recordingPayload record;
        Recording.recordingPayload.Builder recordBuilder = Recording.recordingPayload.newBuilder();

        recordBuilder.setRecFilename(getTimestamp()+".mp4");
        recordBuilder.setStartStop(1);
        record = recordBuilder.build();

        if (t==null) {
            t = TCPServer.getInstance();
            TCPServer.getInstance().setRecord(record);
            t.start();
        }
        else {
            TCPServer.getInstance().setRecord(record);
            t.start();
        }
        Log.v("screenshot", "Take screenshot");
    }

    public static void sendProtoRequestToStopRecording() {
        Recording.recordingPayload record;
        Recording.recordingPayload.Builder recordBuilder = Recording.recordingPayload.newBuilder();

        recordBuilder.setRecFilename(getTimestamp()+".mp4");
        recordBuilder.setStartStop(0);
        record = recordBuilder.build();

        if (t==null) {
            t = TCPServer.getInstance();
            TCPServer.getInstance().setRecord(record);
            t.start();
        }
        else {
            TCPServer.getInstance().setRecord(record);
            t.start();
        }
        Log.v("screenshot", "Take screenshot");
    }

    public static void sendProtoRequestToTakeScreenshot() {
        Recording.recordingPayload record;
        Recording.recordingPayload.Builder recordBuilder = Recording.recordingPayload.newBuilder();

        recordBuilder.setRecFilename(getTimestamp()+".bmp");
        recordBuilder.setStartStop(2);
        record = recordBuilder.build();

        if (t==null) {
            t = TCPServer.getInstance();
            TCPServer.getInstance().setRecord(record);
            t.start();
        }
        else {
            TCPServer.getInstance().setRecord(record);
            t.start();
        }
        Log.v("screenshot", "Take screenshot");
    }

    private static java.sql.Timestamp getTimestamp() {
        Calendar calendar = Calendar.getInstance();
        java.util.Date now = calendar.getTime();
        java.sql.Timestamp currentTimestamp = new java.sql.Timestamp(now.getTime());
        return currentTimestamp;
    }
}
