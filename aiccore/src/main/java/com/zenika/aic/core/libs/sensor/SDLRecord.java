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

    public static void startTCPServer(int port) {
        t = TCPServer.getInstance(port);
    }

    public static void sendProtoRequestToStartRecording() {
        Recording.recordingPayload record;
        Recording.recordingPayload.Builder recordBuilder = Recording.recordingPayload.newBuilder();

        recordBuilder.setRecFilename("video_"+getTimestamp()+".mp4");
        recordBuilder.setStartStop(1);
        record = recordBuilder.build();

        //if (t==null) {
            Log.v("tcp_logs","Start new TCP Server...");
            t = TCPServer.getInstance(32500);
            Log.v("tcp_logs","Set Record");
            TCPServer.getInstance(32500).setRecord(record);
            Log.v("tcp_logs","Start thread");
            t.start();
//        }
//        else {
//            TCPServer.getInstance(32500).setRecord(record);
//            t.start();
//        }
        Log.v("tcp_logs", "Start Recording");
    }

    public static void sendProtoRequestToStopRecording() {
        Recording.recordingPayload record;
        Recording.recordingPayload.Builder recordBuilder = Recording.recordingPayload.newBuilder();

        recordBuilder.setRecFilename("video_"+getTimestamp()+".mp4");
        recordBuilder.setStartStop(0);
        record = recordBuilder.build();

      //  if (t==null) {
        Log.v("tcp_logs","Start new TCP Server...");
        t = TCPServer.getInstance(32500);
        Log.v("tcp_logs","Set Record");
        TCPServer.getInstance(32500).setRecord(record);
        Log.v("tcp_logs","Start thread");
        t.start();
//        }
//        else {
//            TCPServer.getInstance(32500).setRecord(record);
//            t.start();
//        }
        Log.v("tcp_logs", "Stop Recording");
    }

    public static void sendProtoRequestToTakeScreenshot() {
        Recording.recordingPayload record;
        Recording.recordingPayload.Builder recordBuilder = Recording.recordingPayload.newBuilder();

        recordBuilder.setRecFilename("snap_"+getTimestamp()+".bmp");
        recordBuilder.setStartStop(2);
        record = recordBuilder.build();

        //f (t==null) {
        Log.v("tcp_logs","Start new TCP Server...");
        t = TCPServer.getInstance(32500);
        Log.v("tcp_logs","Set Record");
        TCPServer.getInstance(32500).setRecord(record);
        Log.v("tcp_logs","Start thread");
        t.start();
//        }
//        else {
//            TCPServer.getInstance(32500).setRecord(record);
//            t.start();
//        }
        Log.v("tcp_logs", "Take screenshot");
    }

    private static String getTimestamp() {
        Calendar calendar = Calendar.getInstance();
        java.util.Date now = calendar.getTime();
        java.sql.Timestamp currentTimestamp = new java.sql.Timestamp(now.getTime());
        return currentTimestamp.toString().replaceAll("\\W", "_");
    }
}
