package com.chixing.day09_interface;

public class AmdVideoCard implements VideoCard {
    @Override
    public void cardRun() {
        System.out.println("Amd videocard is running");
    }

    @Override
    public void cardStop() {
        System.out.println("Amd videocard is stopping");
    }
}
