package com.chixing.day17_thread;

public class ProduceConsumeTest {
    public static void main(String[] args) {
        PublicResource resource = new PublicResource();
         new Producer(resource).start();
       new Consumer(resource).start();



    }
}
