package com.chixing.day13_set_map;
/*
        int x;  // 变量声明
        x = 10; // 赋值 初始化
        System.out.println("x =" + x);  // 初始化

 */
public class Son extends Father{

    public String name = "son"; // String name ;   name = "son"

    public Son(){
        System.out.println("son name :" + this.name);  // "son"
        test();
    }


    public void test(){
        System.out.println("son test name :" + this.name);
    }

    public static void main(String[] args) {
        new Son();
    }


}


class Father{
    private String name = "father"; // String name ;   name = "father"

    public Father(){
        System.out.println("father name :" + this.name);  // "father"
        this.test();
    }


    public void test(){
        System.out.println("father test name :" + this.name);
    }
}
