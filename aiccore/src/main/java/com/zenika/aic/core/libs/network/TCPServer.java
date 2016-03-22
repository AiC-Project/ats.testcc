package com.zenika.aic.core.libs.network;

import android.util.Log;
import com.zenika.aic.core.libs.sensor.Recording;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.*;
import java.io.*;

/**
 * Created by zenika on 15/03/16.
 */
public class TCPServer extends Thread {
ServerSocket serverSocket;
        private Recording.recordingPayload record;
        private Socket server;

        private TCPServer(int port){
            try{
                createSocket(port);
            }catch (IOException e) {
                e.printStackTrace();
            }
        }

        private void createSocket(int port)  throws IOException {
            Log.v("tcp_logs","Before connect");
            serverSocket = new ServerSocket(port);
            serverSocket.setSoTimeout(10000);
            while(true) {
                try {
                    System.out.println("Waiting for client on port " + serverSocket.getLocalPort() + "...");
                    Log.v("tcp_logs", "Before Accept");
                    server = serverSocket.accept();
                    System.out.println("Just connected to " + server.getRemoteSocketAddress());
                }
                catch(SocketTimeoutException s) {
                    System.out.println("Socket timed out!");
                    break;
                }
            }
        }

        private static TCPServer INSTANCE = new TCPServer(32500);

        public static TCPServer getInstance() {
            return INSTANCE;
        }

        public void setRecord(Recording.recordingPayload record) {
            this.record = record;
        }

        public void run()
        {
            try
            {
                DataOutputStream out = new DataOutputStream(server.getOutputStream());
                byte[] byteRecord = record.toByteArray();
                out.write(byteRecord);
            }

            catch(SocketTimeoutException s)
            {
                System.out.println("Socket timed out!");
            }

            catch(IOException e)
            {
                e.printStackTrace();
            }
        }
}