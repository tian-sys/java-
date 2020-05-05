package com.chixing.day06_inherited;

public class Father {
    public String name = "father";
    public String a ;

    public Father(){
        System.out.println("father name 构造函数====:" + this.name);
        System.out.println("father constructor");
        fatherFun();
    }


    public void fatherFun(){
        System.out.println("father name :" + name);
    }
}
