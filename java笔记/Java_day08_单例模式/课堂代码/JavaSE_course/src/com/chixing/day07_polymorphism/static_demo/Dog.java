package com.chixing.day07_polymorphism.static_demo;
/*
    1. 加载父类 类变量、 static {} 代码块
    2. 加载子类 类变量、 static {} 代码块
    3. 初始化父类 实例变量、普通代码块、构造函数方法体
    4. 初始化子类 实例变量、普通代码块、构造函数方法体
 */
public class Dog extends  Animal{
    public static String b  = "dog";
    static{
        System.out.println("dog static ");
    }

    {
        System.out.println("Dog 普通代码块");
    }
    public Dog(){
        System.out.println("Dog 构造函数");
    }

    public static void main(String[] args) {
        // 1. 类加载 Dog.class
        // 2. 创建子类对象
        new Dog();
    }

}


class Animal{
    public static String a  = "animal";
    static{
        System.out.println("Animal static ");
    }

    {
        System.out.println("Animal 普通代码块");
    }
    public Animal(){
        System.out.println("Animal 构造函数");
    }


    public void fun(){
        int a = 10;  // 局部变量（临时变量），作用域 就在该方法

    }

    public void fun2(){// 局部变量（临时变量），作用域 就在该方法
        int a = 20;
    }

    public void fun3(int a){// 局部变量（临时变量），作用域 就在该方法

    }

    {
        int a = 20;
    }

    static{
        int a = 30;
    }



}

