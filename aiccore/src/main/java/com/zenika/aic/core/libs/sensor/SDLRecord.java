package com.zenika.aic.core.libs.sensor;

import android.util.Log;

import com.zenika.aic.core.libs.network.TCPClient;

/**
 * Created by zenika on 02/02/16.
 */
public class SDLRecord {

    public static void sendProtoRequestToStartRecording() {
        Recording.recordingPayload record;
        Recording.recordingPayload.Builder recordBuilder = Recording.recordingPayload.newBuilder();

        recordBuilder.setRecFilename("video_coucou.mp4");
        recordBuilder.setStartStop(1);
        record = recordBuilder.build();

        new TCPClient(32500, record);
        Log.v("screenshot", "Take screenshot");
    }

    public static void sendProtoRequestToStopRecording() {
        Recording.recordingPayload record;
        Recording.recordingPayload.Builder recordBuilder = Recording.recordingPayload.newBuilder();

        recordBuilder.setRecFilename("video_coucou.mp4");
        recordBuilder.setStartStop(0);
        record = recordBuilder.build();

        new TCPClient(32500, record);
        Log.v("screenshot", "Take screenshot");
    }

    public static void sendProtoRequestToTakeScreenshot() {
        Recording.recordingPayload record;
        Recording.recordingPayload.Builder recordBuilder = Recording.recordingPayload.newBuilder();

        recordBuilder.setRecFilename("snap_coucou.bmp");
        recordBuilder.setStartStop(2);
        record = recordBuilder.build();

        new TCPClient(32500, record);
        Log.v("screenshot", "Take screenshot");
    }
}
