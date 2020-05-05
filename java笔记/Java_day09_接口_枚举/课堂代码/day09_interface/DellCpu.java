package com.chixing.day09_interface;

public class DellCpu implements Cpu {
    @Override
    public void cpuRunning() {
        System.out.println("dell cpu is running");
    }

    @Override
    public void cpuStop() {
        System.out.println("dell cpu is stopping");
    }
}
