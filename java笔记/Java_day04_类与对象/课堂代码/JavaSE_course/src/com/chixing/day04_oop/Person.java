package com.chixing.day04_oop;

/**
 * 该类描述了Person共有的属性与行为
 * 属性 : 成员变量 （字段）Field
 * 行为：成员方法 Method
 *
 */
public class Person {
    private  String personName; //姓名 成员变量
    private char personGender;//性别  成员变量
    private int personAge; //年龄   成员变量



    //  set  赋值 : set + 变量名首字母大写
    //  p1.setPersonName("王佳辉");

    public void setPersonName(String name){ //personName =  name = "王佳辉"
        personName = name;
    }


    //get  取值

    public String getPersonName(){
        return personName;
    }

    public void setPersonGender(char gender){
            personGender = gender;
    }

    public  void setPersonAge(int age){
        personAge = age;
    }

    public int getPersonAge(){
        return  personAge;
    }

    public char getPersonGender(){
        return  personGender;
    }



    //打游戏 ： 成员方法
    public  void playGame(){}

    //学习
    public  void study(){}

}
