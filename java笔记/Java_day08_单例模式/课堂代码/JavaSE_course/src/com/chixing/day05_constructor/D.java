package com.chixing.day05_constructor;

import com.chixing.day06_inherited.A;

public class D extends A {
    public void fun(){
        this.x = 100; //  public 任何类都能访问
        this.z = 300; //protected  不同包中的子类

    }

}
