package com.zenika.aic.core.libs.network;

import android.util.Log;
import com.zenika.aic.core.libs.sensor.Recording;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.*;
import java.io.*;
import java.util.LinkedList;

/**
 * Created by zenika on 15/03/16.
 */
public class TCPServer extends Thread {
    ServerSocket serverSocket;
    private Recording.recordingPayload record;
    private Socket server;
    private static TCPServer INSTANCE;
    private LinkedList ll;

    private TCPServer(int port){
        try{
            ll = new LinkedList();
            createSocket(port);
        }catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void createSocket(int port)  throws IOException {
        Log.v("tcp_logs","Before connect");
        serverSocket = new ServerSocket(port);
        serverSocket.setSoTimeout(100000);
        while(true) {
            try {
                Log.v("tcp_logs", "Waiting for client on port " + serverSocket.getLocalPort() + "...");
                server = serverSocket.accept();
                Log.v("tcp_logs","Just connected to " + server.getRemoteSocketAddress());
                break;
            }
            catch(SocketTimeoutException s) {
                Log.v("tcp_logs","Socket timed out!");
                break;
            }
        }
        Log.v("tcp_logs","After connect");
    }

    public static TCPServer getInstance(int port) {
        if(INSTANCE == null)
            INSTANCE = new TCPServer(port);
        return INSTANCE;

    }

//    public void setRecord(Recording.recordingPayload record) {
//        this.record = record;
//    }

    public void run()
    {
        Log.v("tcp_logs", "Run Thread");

        while(true) {
            if(!ll.isEmpty()) {
                try {
                    DataOutputStream out = new DataOutputStream(server.getOutputStream());
                    Recording.recordingPayload rp = (Recording.recordingPayload)ll.getFirst();
                    byte[] byteRecord = rp.toByteArray();
                    out.write(byteRecord);
                    ll.removeFirst();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }



//        try
//        {
//            DataOutputStream out = new DataOutputStream(server.getOutputStream());
//            byte[] byteRecord = record.toByteArray();
//            out.write(byteRecord);
//            Log.v("tcp_logs", "Sending data");
//        }
//        catch(SocketTimeoutException s)
//        {
//            Log.v("tcp_logs", "Socket timed out!");
//        }
//
//        catch(IOException e)
//        {
//            e.printStackTrace();
//        }
    }

    public void addRecord(Recording.recordingPayload record) {
        ll.add(record);
    }
}