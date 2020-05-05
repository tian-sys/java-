package com.chixing.day05_constructor;

public class StudentTest {
    public static void main(String[] args) {

        //1. new : 创建对象，开辟堆内存
        //2. Student() 构造函数： （1）初始化属性 ： stuNo = 0, stuName = null
        //                       （2）执行构造函数方法体

        Student stu1 =  new Student();
        stu1.setStuNo(7788);   // setStuNo(..) {   this.stuNo = stuNo; }
        stu1.setStuName("张南顶"); //setStuName(..){ this.stuName =  stuName; }


        Student stu2 =  new Student(7788,"张南顶");
        System.out.println("stu2 no ;" + stu2.getStuNo());
        System.out.println("stu2 name ;" + stu2.getStuName());



    }
}
