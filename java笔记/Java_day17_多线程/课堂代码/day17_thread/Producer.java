package com.chixing.day17_thread;

public class Producer extends  Thread{
    private PublicResource resource;
    public Producer(PublicResource resource){
        this.resource = resource;
    }
    /**
     * 生产面包
     */
    public void run() {
        while(true){
                resource.produce();
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
    }
}
