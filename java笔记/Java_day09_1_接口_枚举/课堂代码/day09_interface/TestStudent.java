package com.chixing.day09_interface;

import java.util.HashSet;
import java.util.Set;

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



        System.out.println(  s1.hashCode() );  //460141958
        Integer xx = new Integer(460141958);
        System.out.println(   xx.hashCode() ); // 460141958


        System.out.println(   "hello".hashCode() );
        System.out.println(   "good".hashCode() );

        System.out.println(   "s1 hashcode " + s1.hashCode() );  // stuNo , stuName
        System.out.println(  "s2 hashcode " + s2.hashCode()  );
        System.out.println(  "s3 hashcode " + s3.hashCode()  );
        System.out.println(  "==================================== "    );

//
        Set<Student> studentSet = new HashSet<>();  // 容器存放学生，添加要求不重复
        studentSet.add(s1);  //hashcode
        studentSet.add(s2); //hashcode s1.hashcode = s2.hashcode , equals
        studentSet.add(s3);

    }
}
