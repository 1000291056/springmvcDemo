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
    private boolean isOver = false;
    private Reader reader;

    public ReadTask(Socket socket) {
        this.socket = socket;
        try {
            reader = new InputStreamReader(socket.getInputStream());
        } catch (IOException e) {
            e.printStackTrace();
            isOver = true;
        }
    }

    @Override
    public void run() {
        try {
            while (!isOver) {
                try {

                    while ((count = reader.read(buffer)) > 0) {
                        System.out.println("读取到"+socket.getInetAddress()+"消息：" + new String(buffer, 0, count));
                    }

                } catch (IOException e) {
                    e.printStackTrace();
                    isOver = true;
                }
            }
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (socket != null) {
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
