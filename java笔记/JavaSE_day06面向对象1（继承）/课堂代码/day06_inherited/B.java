package com.chixing.day06_inherited;

public class B extends A {
    public void fun(){
        B b =  new B();
        b.x = 100;  //  public 任何类都能访问
        b.y = 200;  // 缺省  在同一个包中
        b.z = 300; // protected  在同一个包中
    }

}
