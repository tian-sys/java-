package com.chixing.day13_set_map;

import java.util.Iterator;
import java.util.TreeSet;

/*
    TreeSet<E>
        要求有序

 */
public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Integer> intSet = new TreeSet<>();
        intSet.add(10);
        intSet.add(30);
        intSet.add(2);
        intSet.add(87);
        intSet.add(56);
        intSet.add(19);

        System.out.println(intSet);  // TreeSet.add()  --- > Integer.compareTo(..)  ---- > Integer implements Comparable<Integer>



        TreeSet<String> strSet = new TreeSet<>();
        strSet.add("edit");
        strSet.add("fail");
        strSet.add("build");
        strSet.add("main");
        strSet.add("message");
        strSet.add("todo");

        System.out.println(strSet); // TreeSet.add()---->String.compareTo(..) ---> String implements Comparable<String>


        Product p1 =    new Product(9001,"milk",9.9f,200);
        Product p2 =    new Product(9004,"break",40.8f,500);
        Product p3 =    new Product(9003,"rice",29.9f,300);
        Product p4 =    new Product(9003,"phone",29.9f,300);
        Product p5 =    new Product(9000,"phone",29.9f,300);
        Product p6 =    new Product(9000,"phone",29.9f,300);

        TreeSet<Product> proSet = new TreeSet<>();
        proSet.add(p1);
        proSet.add(p2);
        proSet.add(p3);
        proSet.add(p4);
        proSet.add(p5);
        proSet.add(p6);

       Iterator<Product> it =  proSet.iterator();
       while(it.hasNext()){
          Product p =  it.next();
           System.out.println(p);
       }


    }
}
