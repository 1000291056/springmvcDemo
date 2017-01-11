package com.socket;

import java.net.Socket;

/**
 * Created by wufeifei on 2017/1/11.
 */
public class WriteTask implements Runnable {
    private Socket socket;
    public WriteTask(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {

    }
}
