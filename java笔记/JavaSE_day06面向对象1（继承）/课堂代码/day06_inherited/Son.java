package com.chixing.day06_inherited;

public class Son extends Father {

    public double price = 50;

    public Son(){
        //super();  // 默认调用父类的无参构造函数，并放在第一行
        System.out.println("father name 构造函数:" + this.name);
        System.out.println("son price 构造函数:" + this.price);
        System.out.println("Son constructor");
        sonFun();

    }

    public void sonFun(){
        System.out.println("son price :" + price);
    }




}
