package com.chixing.day07_polymorphism.static_demo;

public class TestCar {
    public static void main(String[] args) throws ClassNotFoundException {
        //类加载
        Class.forName("com.chixing.day07_polymorphism.static_demo.Car");

        //实例化对象
        new Car();
    }
}
