package com.acme;

public class Main extends Thread{

    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            MultiThreadTingy multiThreadTingy = new MultiThreadTingy(i);
            Thread myThread = new Thread(multiThreadTingy);
            myThread.start();
        }
    }
}
