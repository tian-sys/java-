package com.chixing.day09_interface;

public class MainBoard {

    private Cpu cpu;
    private VideoCard card;
    public  MainBoard(Cpu cpu,VideoCard card){
     this.card = card;
     this.cpu = cpu;
    }

    public void run(){
        cpu.cpuRunning();
        card.cardRun();;
    }

    public void stop(){
        cpu.cpuStop();
        card.cardStop();;
    }

}
