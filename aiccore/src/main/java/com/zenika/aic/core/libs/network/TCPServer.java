package com.zenika.aic.core.libs.network;

import android.util.Log;

import com.zenika.aic.core.libs.sensor.Recording;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.*;
import java.io.*;
import java.nio.ByteBuffer;

/**
 * Created by zenika on 15/03/16.
 */
public class TCPServer extends Thread {

//    public TCPServer(int port, Recording.recordingPayload record) throws Exception{
//        String clientSentence;
//        Log.v("blabla","Before connect");
//        ServerSocket welcomeSocket = new ServerSocket(port);
//        Log.v("blabla","After connect");
//        while(true)
//        {
//            Log.v("blabla","Before Accept");
//            Socket connectionSocket = welcomeSocket.accept();
//            Log.v("blabla","After Accept");
//            //BufferedReader inFromClient = new BufferedReader(new InputStreamReader(connectionSocket.getInputStream()));
//            DataOutputStream outToClient = new DataOutputStream(connectionSocket.getOutputStream());
//            //clientSentence = inFromClient.readLine();
//            //System.out.println("Received: " + clientSentence);
//            Log.v("blabla", record.toString());
//            byte[] byteRecord = record.toByteArray();
//            Log.v("blabla", byteRecord.toString());
//            outToClient.write(byteRecord);
//        }

        private ServerSocket serverSocket;
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
            Log.v("flemme", "4");
            Log.v("blabla","Before connect");
            serverSocket = new ServerSocket(port);
            serverSocket.setSoTimeout(10000);
            Log.v("flemme", "5");
            while(true) {
                try {
                    System.out.println("Waiting for client on port " + serverSocket.getLocalPort() + "...");
                    Log.v("blabla", "Before Accept");
                    Log.v("flemme", "6");
                    server = serverSocket.accept();
                    Log.v("flemme", "7");
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
            Log.v("flemme", "3");
            return INSTANCE;
        }

        public void setRecord(Recording.recordingPayload record) {
            Log.v("flemme", "9");
            this.record = record;
        }

        public void run()
        {
            Log.v("flemme", "11");
            try
            {
//                    System.out.println("Waiting for client on port " + serverSocket.getLocalPort() + "...");
//                    Log.v("blabla", "Before Accept");
//                    Socket server = serverSocket.accept();
//                    Log.v("blabla","After Accept");
//                    System.out.println("Just connected to " + server.getRemoteSocketAddress());
                //DataInputStream in = new DataInputStream(server.getInputStream());
                //System.out.println(in.readUTF());
                Log.v("flemme", "12");
                DataOutputStream out = new DataOutputStream(server.getOutputStream());
                byte[] byteRecord = record.toByteArray();
                Log.v("blabla", byteRecord.toString());
                out.write(byteRecord);
                Log.v("flemme", "13");
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