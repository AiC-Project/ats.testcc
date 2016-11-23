package com.zenika.aic.core.libs.network;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;

// /data/project/camera/filename

public final class ByteUtils {

	private static volatile ByteUtils instance = null;
	private final short FLOAT_SIZE = 4;
	private final short LONG_SIZE = 8;
	
	private ByteUtils() {}

	public static ByteUtils getInstance() {
		if (ByteUtils.instance == null) {
			synchronized(ByteUtils.class) {
				if (ByteUtils.instance == null)
					ByteUtils.instance = new ByteUtils();
			}
		}
		return ByteUtils.instance;
	}

	public byte[] integerToBytes(Integer src, int size) throws UnsupportedEncodingException {
		return intToBytes(src.intValue(), size);
	}

	public byte[] longToBytes(long src) throws UnsupportedEncodingException {
		return ByteBuffer.allocate(LONG_SIZE).put(toBytes(src)).array();
	}
	
	public byte[] floatToBytes(float src) throws UnsupportedEncodingException {
		return ByteBuffer.allocate(FLOAT_SIZE).putFloat(src).array();
	}

	public byte[] toBytes(long value) {
		return ByteBuffer.allocate(8).putLong(value).array();
	}
	
	public static byte[] intToBytes(int i,int size) throws UnsupportedEncodingException {
		byte[] result = new byte[size];

		switch(size) {
		case 1:
			result[0] = (byte) (i);
			break;
		case 2:
			result[0] = (byte) (i >> 8) ;
			result[1] = (byte) (i);
			break;
		case 3:
			result[0] = (byte) (i >> 16);
			result[1] = (byte) (i >> 8);
			result[2] = (byte) (i);
			break;
		case 4:
			result[0] = (byte) (i >> 24);
			result[1] = (byte) (i >> 16);
			result[2] = (byte) (i >> 8);
			result[3] = (byte) (i);
			break;
		default:

			break;
		}
		return result;
	}

	public static byte[] stringToBytes(String value, int size) {
		byte[] stringToByte;
		byte[] sizeToByte = new byte[2];
		try {
			sizeToByte = intToBytes(value.length(), 2);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		stringToByte = value.getBytes();

		byte[] result = new byte[size*2];
		System.arraycopy(sizeToByte, 0, result, 0, sizeToByte.length);
		System.arraycopy(stringToByte, 0, result, sizeToByte.length, stringToByte.length);
		return result;
	}
}
