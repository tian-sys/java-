package com.chixing.day04_oop;

public class PersonTest {
    public static void main(String[] args) {

        // 数据类型  变量名 = 值;


        //定义变量
        int x = 10;


        //创建数组
       int[] a =  new int[5];

        //创建一个Person对象

         Person p1 = new Person();
         //赋值 set
         p1.setPersonName("tom");
         p1.setPersonAge(20);
         p1.setPersonGender('M');

         //取值 get
         String name1 = p1.getPersonName();
         int age1 = p1.getPersonAge();
         char gender1 = p1.getPersonGender();



        //创建一个Person对象
        Person p2 =  new Person();
        //赋值 set
        p2.setPersonName("Jason");
        p2.setPersonAge(30);
        p2.setPersonGender('M');

       // 取值 get
       int age2 =  p2.getPersonAge();
       char gender2 = p2.getPersonGender();
       String name2 = p2.getPersonName();

















      /*  System.out.println("p1 name :" + p1.perosonName);
        System.out.println("p1 age :" + p1.personAge);
        System.out.println("p1 gender :" + p1.personGender);


        p1.perosonName = "王佳辉";
        p1.personAge = 20 ;
        p1.personGender = 'M';


        //创建另一个Person对象
        Person p2 =  new Person();
        p2.perosonName = "陈志峰";
        p2.personAge = 21;
        p2.personGender = 'M';*/




        Person p3 =  new Person();
        p3 = null;  // p3在堆中没有任何指向（即 p3 值没有了)





    }

    public int fun1(){
        return 0;
    }


    public int[] fun2(){
        return null;
    }
}
