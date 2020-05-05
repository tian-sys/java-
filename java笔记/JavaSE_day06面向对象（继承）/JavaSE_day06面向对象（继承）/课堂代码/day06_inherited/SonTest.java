package com.chixing.day06_inherited;

public class SonTest {
    public static void main(String[] args) {



     Son s =    new Son();
     s.name = "tom"; // name 属性 继承父类
     s.fatherFun(); // fatherFun 方法 继承父类
//        s.a = "";  子类不能继承父类 private 的属性
        s.b = "";  //子类能继承父类 缺省 修饰的属性
        s.c =""; // 子类能继承 protected  修饰的属性

        /**
         * 1. new 创建堆内存
         * 2. 初始化父类属性，初始化子类属性，父类构造函数，子类构造函数
         */







    }

}
