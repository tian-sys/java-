package com.chixing.day17_thread;

public class ObjectDemo {
    public static void main(String[] args) {

        Object o =   new Object();
        int a = 10;
        int b  =20;

        try {
            o.wait();  // 该进程进入等待队列状态
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        int c = 30;

        o.notify();  // 唤醒 等待队列上某一个线程
        o.notifyAll();  // 唤醒 等待队列上所有线程





    }
}
