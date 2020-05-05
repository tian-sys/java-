package com.chixing.day07_polymorphism.static_demo;

public class Product {
    public  static String brand ="华为";
    public  static String xx ="华为";


    public   String type ;
    static{
        System.out.println("static 1");
    }

    {
        System.out.println("普通代码块1");
    }

    public Product(){
        System.out.println("Product 构造函数");
    }


    public static void main(String[] args) {
        new Product();
        new Product();
    }

}
