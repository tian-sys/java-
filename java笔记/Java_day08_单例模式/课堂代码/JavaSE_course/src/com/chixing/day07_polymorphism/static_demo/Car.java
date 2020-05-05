package com.chixing.day07_polymorphism.static_demo;

/*
 * 类加载：
 *      初始化类变量，static 代码块，static 方法 初始化
 *
 * 实例化对象：
 *     {} 普通代码块，实例变量初始化，实例方法
 */
public class Car {
    static{
        System.out.println("static 代码块2");
        System.out.println("static类变量salePlat：" + Car.salePlat);
    }

    public static String salePlat = "滴滴";





    {
        System.out.println("普通代码块1");
    }

    {
        System.out.println("普通代码块2 实例变量 carName :" + this.carName);
    }

    public String carName ="宝马";


    public  Car(){
        System.out.println("car 无参构造函数...");
    }

    public Car(String carName) {
        this.carName = carName;
        System.out.println("car 有参构造函数》》》》"+carName);
    }

    static{
        System.out.println("static 代码块1");
    }

}
