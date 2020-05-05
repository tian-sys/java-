package com.chixing.day06_inherited;

public class C {
    public static void main(String[] args) {
       A a =  new A();
       a.x = 11;   //  public 任何类都能访问
       a.y = 22;  // 缺省  在同一个包中
       a.z = 33;  //protected  在同一个包中
    }
}
