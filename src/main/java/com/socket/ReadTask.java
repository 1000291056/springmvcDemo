package com.socket;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.Socket;

/**
 * Created by wufeifei on 2017/1/11.
 */
public class ReadTask implements Runnable {
    private static final String TAG = ReadTask.class.getSimpleName();
    private Socket socket;
    private static final int SIZE = 1024;
    private char[] buffer = new char[SIZE];
    private int count;

    public ReadTask(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        while (true) {
            try {
                if (socket == null) {
                    System.out.println(TAG + "    socket==null");
                    return;
                }
                Reader reader = new InputStreamReader(socket.getInputStream());
                StringBuilder builder = new StringBuilder();
                while ((count = reader.read(buffer)) > 0) {
                    builder.append(new String(buffer, 0, count));
                }
                System.out.println("readmessage：/n" + builder);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
