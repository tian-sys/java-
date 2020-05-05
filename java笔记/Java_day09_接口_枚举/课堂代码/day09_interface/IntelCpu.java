package com.chixing.day09_interface;

public class IntelCpu implements Cpu {
    @Override
    public void cpuRunning() {
        System.out.println("intel cpu is running");
    }

    @Override
    public void cpuStop() {
        System.out.println("intel cpu is stopping");
    }
}
