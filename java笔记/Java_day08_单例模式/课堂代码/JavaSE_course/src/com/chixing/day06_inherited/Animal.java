package com.chixing.day06_inherited;

/**
 * public > protected > 缺省 > private
 *
 *
 *
 */

class  Dog extends Animal{
    @Override  // 检查重写的语法是否正确
    public void fun1(int a) {

    }

    public void dog2(){

    }
}


public class Animal {
    public void fun1(int a){

    }

    public void animal2(){

    }

    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.fun1(1);  //子类自己的方法

        Animal an1 =  new Dog();  // 父类  引用 子类对象

        an1.fun1(1);  // 运行的是子类的  【多态】












        Animal an2 =  new Animal();


        if(an1 instanceof  Dog) {
            Dog d2 = (Dog) an1; // an1 真正在内存中 是 Dog类型
        }

        if(an2 instanceof  Dog) {
            Dog d3 = (Dog) an2; // an2 真正在内存中 是 Animal类型 , 出错 ClassCastException 类型转换异常
        }

    }
}



