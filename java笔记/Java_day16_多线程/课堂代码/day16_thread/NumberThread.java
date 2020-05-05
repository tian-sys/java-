package com.chixing.day16_thread;

public class NumberThread implements Runnable {
    @Override
    public void run() {
            for(int i =1;i<=26;i++){
                System.out.println( i +",");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
    }
}
