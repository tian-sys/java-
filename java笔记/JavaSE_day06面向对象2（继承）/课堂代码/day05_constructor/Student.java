package com.chixing.day05_constructor;

/**
 * 构造函数 Constructor
 * (构造方法，构造器)
 * 作用: 初始化对象
 *
 *
 * class Student{
 *
 *     成员变量
 *     构造函数
 *     get,set
 *     普通方法
 *
 * }
 *
 *
 */
public class Student {

    private int stuNo;//学号
    private String stuName; //姓名
    private int stuAge; //年龄
    private char stuGender;//性别




    //无参构造函数 constructor ：默认隐藏
    public Student(){}

    //有参构造函数
    public Student(int stuNo,String stuName){
        this();
        this.stuNo = stuNo;
        this.stuName =  stuName;

    }


  public Student(int stuNo,String stuName,int stuAge,char stuGender){


        this(stuNo,stuName);
      int a = 10;
        this.stuAge = stuAge;
        this.stuGender = stuGender;
  }


















    public void setStuNo(int stuNo){
        this.stuNo = stuNo;
    }

    public int getStuNo(){
        return  this.stuNo;
    }

    public void setStuName(String stuName){
        this.stuName = stuName;
    }
    public String getStuName(){
        return  this.stuName;
    }

    public int getStuAge() {
        return stuAge;
    }

    public void setStuAge(int stuAge) {
        this.stuAge = stuAge;
    }

    public char getStuGender() {
        return stuGender;
    }

    public void setStuGender(char stuGender) {
        this.stuGender = stuGender;
    }

    //void 没有返回值
    public void fun1(){

    }

    //方法有返回值
    public boolean fun2(){
        int row = 0;
        return row > 1;
    }

}
