package com.zenika.aic.core.libs.sensor;

import android.util.Log;
import com.zenika.aic.core.libs.network.TCPServer;

/**
 * Created by zenika on 02/02/16.
 */
public class SDLRecord {

    static Thread t;

    public static void sendProtoRequestToStartRecording() {
        Recording.recordingPayload record;
        Recording.recordingPayload.Builder recordBuilder = Recording.recordingPayload.newBuilder();

        recordBuilder.setRecFilename("video_coucou.mp4");
        recordBuilder.setStartStop(1);
        record = recordBuilder.build();
        Log.v("flemme", "1");

        if (t==null) {
            Log.v("flemme", "2");
            t = TCPServer.getInstance();
            Log.v("flemme", "8");
            TCPServer.getInstance().setRecord(record);
            Log.v("flemme", "10");
            t.start();
            Log.v("flemme", "14");
        }
        else {
            Log.v("flemme", "2");
            TCPServer.getInstance().setRecord(record);
            t.start();
        }
        Log.v("screenshot", "Take screenshot");
    }

    public static void sendProtoRequestToStopRecording() {
        Recording.recordingPayload record;
        Recording.recordingPayload.Builder recordBuilder = Recording.recordingPayload.newBuilder();

        recordBuilder.setRecFilename("video_coucou.mp4");
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

        recordBuilder.setRecFilename("snap_coucou.bmp");
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
}
