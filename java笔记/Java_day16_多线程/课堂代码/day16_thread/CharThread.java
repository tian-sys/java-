package com.chixing.day16_thread;

/**
 *  该线程的业务是 输出26个字母
 */
public class CharThread extends Thread {



    /*
        该线程的任务全部在run方法中进行
     */
    @Override
    public void run() {
       for(char i = 'A';i<='Z';i++){
           System.out.println(i + ", ");

           //休眠10ms

           try {
               Thread.sleep(10);
           } catch (InterruptedException e) {
               e.printStackTrace();
           }

       }
    }
}
