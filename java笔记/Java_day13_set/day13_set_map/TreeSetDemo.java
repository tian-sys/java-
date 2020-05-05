package com.chixing.day13_set_map;

import com.chixing.day09_interface.Cpu;
import com.chixing.day09_interface.MainBoard;
import com.chixing.day09_interface.VideoCard;

import java.util.Comparator;
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

        // Product 实现了自然顺序
        // public TreeSet()
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

    //根据Set容器本身
        // public TreeSet(Comparator<E> c)

        //匿名内部类
        TreeSet set01 =   new TreeSet<>(new Comparator<Product>(){

            @Override
            public int compare(Product o1, Product o2) {
                if(o1.getProPrice() == o2.getProPrice())
                    return o1.getProNo() - o2.getProNo();
                return o1.getProPrice() > o2.getProPrice() ?1:-1;
            }
        });


        set01.add(new Product());




         new MainBoard(new Cpu() {
             @Override
             public void cpuRunning() {

             }

             @Override
             public void cpuStop() {

             }
         }, new VideoCard() {
             @Override
             public void cardRun() {

             }

             @Override
             public void cardStop() {

             }
         });


         new TreeSet<>(new Comparator<Product>() {
             @Override
             public int compare(Product o1, Product o2) {
                 return 0;
             }
         });










    }
}
