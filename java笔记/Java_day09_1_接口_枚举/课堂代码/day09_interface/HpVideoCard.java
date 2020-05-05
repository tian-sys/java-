package com.chixing.day09_interface;

public class HpVideoCard implements VideoCard {
    @Override
    public void cardRun() {
        System.out.println("hp videocard is running");
    }

    @Override
    public void cardStop() {
        System.out.println("hp videocard is stopping");
    }
}
