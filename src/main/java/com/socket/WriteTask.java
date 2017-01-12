package com.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;

/**
 * Created by wufeifei on 2017/1/11.
 * 写入socket线程
 */
public class WriteTask implements Runnable {
    private Socket socket;
    private boolean isOver = false;
    private OutputStream outputStream;

    public WriteTask(Socket socket) {
        this.socket = socket;
        try {
            outputStream = socket.getOutputStream();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        try {
            while (!isOver) {
                try {
                    if (outputStream == null) {
                        isOver = true;
                    }
                    System.out.println("请输入message：");
                    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                    String msg = reader.readLine();
                    outputStream.write(msg.getBytes());
                    outputStream.flush();
                } catch (IOException e) {
                    e.printStackTrace();
                    isOver = true;
                }
            }
        } finally {
            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (socket!=null){
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
