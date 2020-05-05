package com.chixing.day17_thread;

public class Consumer extends Thread{
    private PublicResource resource;

    public Consumer(PublicResource resource){
        this.resource = resource;
    }
    /**
     * 消费面包
     */
    public void run() {
        while(true){

                resource.consume();
                try {
                    Thread.sleep(60);//5-15随机数
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

        }
    }
}
