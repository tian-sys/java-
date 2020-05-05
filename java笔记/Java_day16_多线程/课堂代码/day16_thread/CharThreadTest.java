package com.chixing.day16_thread;

public class CharThreadTest {

    /*
        1. 初始化状态 : new Thread..
        2. 就绪状态
        3. 运行状态

     */

    public static void main(String[] args) {

        //1. 创建子线程
        CharThread thread1 =  new CharThread();  /*1. 初始化状态*/

        Thread thread2 =  new Thread(new NumberThread());


        thread1.start();   //2. 就绪状态 -- 3. 运行状态run
        thread2.start();   //2. 就绪状态 -- 3. 运行状态run



    }
}
