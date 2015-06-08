package com.zenika.aic.core.libs.network;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

/**
 * Created by thomas on 30/04/15.
 */
public final class SystemUtils {
    private static volatile SystemUtils instance = null;

    private Process process = null;
    private InputStream input = null;

    private SystemUtils() {}

    public static SystemUtils getInstance() {
        if (SystemUtils.instance == null) {
            synchronized(SystemUtils.class) {
                if (SystemUtils.instance == null)
                    SystemUtils.instance = new SystemUtils();
            }
        }
        return SystemUtils.instance;
    }

    public String exec(String command) {
        String result = "";
        try {
            Process proc = Runtime.getRuntime().exec(command);
            InputStream is = proc.getInputStream();
            Scanner s = new Scanner(is).useDelimiter("\\n");
            if (s.hasNext())
                result = s.next();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            releaseProcess();
        }
        return result;
    }

    public long execToLong(String command) throws NumberFormatException {
        return Long.valueOf(this.exec(command));
    }

    private void releaseProcess() {
        if(process != null) {
            process.destroy();
            process = null;
        }

        if(input != null) {
            try {
                input.close();
                input = null;
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void finalize() throws Throwable {
        super.finalize();
        releaseProcess();
    }
}
