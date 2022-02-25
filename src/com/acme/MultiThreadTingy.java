package com.acme;

public class MultiThreadTingy implements Runnable{

    private final int threadNumber;

    public MultiThreadTingy(int threadNumber) {
        this.threadNumber = threadNumber;
    }

    @Override
    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println(i + " from thread number: " + threadNumber);

            if (threadNumber == 2){
                throw new RuntimeException();
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
