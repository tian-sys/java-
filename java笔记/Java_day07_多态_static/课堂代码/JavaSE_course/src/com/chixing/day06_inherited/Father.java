package com.chixing.day06_inherited;

/**
 * 访问权限
 *
 * public ： 所有其他类都能访问
 * private  : 只有本类能访问该属性
 * 缺省 : 只有本包能访问
 */
public class Father {
    public String name = "father";
    private String a ;
    String b;
    protected String c;

    public Father(){
        System.out.println("father name 构造函数====:" + this.name);
        System.out.println("father constructor");
        fatherFun();
    }


    public void fatherFun(){
        System.out.println("father name :" + name);
        a = "hello";
    }
}
