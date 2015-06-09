package com.zenika.aic.core.libs.network;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

/**
 * Created by thomas on 24/02/15.
 */
public final class TCPClient {
	
	private Socket socket;

	/**
	 * 
	 * @param host
	 * @param port
	 * @param data
	 */
	public TCPClient(String host, int port, byte[] data) {
		try {
			socket = new Socket(host,port);
			DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
			dos.write(data);
			dos.flush();
			dos.close();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
}
