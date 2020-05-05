package com.chixing.day09_interface;

public class TestStudent {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        System.out.println(  a == b  );//false



        Student s1 = new Student(10110,"陈雷",20,'M');


        System.out.println("s1 class:" + s1.getClass()); // 类全名(包名.类名)

        Student s2 = new Student(10110,"陈雷",20,'M');

        Student s3 = new Student(10111,"徐宇",20,'M');

        System.out.println(  s1 == s2  );  //  堆地址 false
        System.out.println(  s1.equals(s2)  ); //true
        System.out.println(  s1.equals(s3)  );  //false

        //通过比较对象的内容，判断两个对象 是不是同一个对象
        s1.equals(null);
        s1.equals(s1);
        s1.equals(new DellCpu());
        s1.equals(s2);



        System.out.println(  s1.hashCode() );
        Integer xx = new Integer(460141958);
        System.out.println(   xx.hashCode() );


        System.out.println(   "hello".hashCode() );
        System.out.println(   "good".hashCode() );


    }
}
