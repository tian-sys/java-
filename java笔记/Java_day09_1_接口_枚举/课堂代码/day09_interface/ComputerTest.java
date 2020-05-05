package com.chixing.day09_interface;

public class ComputerTest {
    public static void main(String[] args) {

        //接口，面向对象

        Cpu cpu = new DellCpu();  // 父类引用子类对象
        cpu.cpuRunning();  // 子类重写父类的方法




        VideoCard card = new HpVideoCard();

        MainBoard mainBoard = new MainBoard(cpu,card);

        Computer computer = new Computer(mainBoard);
        computer.run();
    }
}
