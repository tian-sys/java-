package com.chixing.day09_interface;

public class Computer {
    private MainBoard mainBoard;

    public Computer(MainBoard mainBoard){
       this.mainBoard = mainBoard;
    }


    public void run(){
        mainBoard.run();
    }


    public void stop(){
        mainBoard.stop();
    }


}
