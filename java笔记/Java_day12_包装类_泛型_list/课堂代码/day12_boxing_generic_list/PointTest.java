package com.chixing.day12_boxing_generic_list;

import java.util.HashMap;

public class PointTest {
    public static void main(String[] args) {





        Point p1 =  new Point();

        // 泛型的作用：数据类型的安全性

        //泛型的菱形语法
       /* Point<String> p2 = new Point<>();
        p2.setX("北纬34度");
        p2.setY("东经123度");

        Point<Integer> p3 = new Point<>();
        p3.setY(34);
        p3.setX(56);

        Point<Float> p4 = new Point<>();
        p4.setX(36.7f);
        p4.setY(98.5f);*/


      Point<Integer,String> p2 =  new Point<>();
      p2.setX(30);
      p2.setY("56");

        Point<String,String> p3 =  new Point<>();
        p3.setX("30");
        p3.setY("56");



        MyContainer<String> c1 =   new MyContainer<>();
        c1.add("hello");


        MyContainer<Integer> c2 =   new MyContainer<>();
        c2.add(11);
        c2.add(14);
        Integer i =   c2.get(1);


      /*  int a;
        System.out.println(a); // a 没有初始化

        int b = 10;*/


      String s1 = "hello";
        String s2 = "good";


      s1.equals(s2);   // 只调用equals

       // 集合： 元素不重复 , 底层代码
       if( s1.hashCode() != s2.hashCode())
//           return false;
       if(s1.equals(s2));

        HashMap m;


    }
}
