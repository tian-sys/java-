package com.chixing.day17_thread;

public class PublicResource {
    private int number = 0;

    //资源生产
    public synchronized void produce(){
        if(number ==10){
            try {//不生产，生产者线程进入等待队列，等待消费者消费
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }else{
            //执行生产，叫消费者来消费
            number++;
            System.out.println("生产者生产了一个面包，number = " + number);
            this.notify();//唤醒在等待队列的消费者线程来消费
        }
    }

    //资源消费
    public synchronized void consume(){
        if(number ==0){
            try {//不能消费，消费者线程进入等待队列，等待生产者生产
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }else{
            //执行消费，叫生产者来生产
            number--;
            System.out.println("【消费者】消费了一个面包，number = " + number);
            this.notify();//唤醒在等待状态的生产者来生产
        }
    }
}
