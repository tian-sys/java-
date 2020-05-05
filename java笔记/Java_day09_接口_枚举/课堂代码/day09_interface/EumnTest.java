package com.chixing.day09_interface;

public class EumnTest {
    public static void main(String[] args) {

          Season s1  = Season.SPRING;
          s1.getName();

        Direction d = Direction.NORTH;
       System.out.println("name :" + d.name());  //NORTH
        System.out.println("ordinal :" + d.ordinal()); // 2

        Direction[] directions = Direction.values();
        Direction d2 = Direction.valueOf("NORTH");



    }
}
