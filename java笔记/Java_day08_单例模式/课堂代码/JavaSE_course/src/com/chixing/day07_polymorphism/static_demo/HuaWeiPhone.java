package com.chixing.day07_polymorphism.static_demo;

/**
 * 该类封装了华为手机属性与功能
 *
 *
 * static 修饰变量：类变量（类级别的）
 *          类名.类变量 （ HuaWeiPhone.phoneBrand ）
 *
 * 非static修饰变量： 实例变量（对象级别的）
 *          对象名.实例变量名( p1.phoneType )
 *
 */
public class HuaWeiPhone {
    // static :brand的值 是所有这类手机共享的值

    static{
        System.out.println("static 代码块1 phoneBrand:" + HuaWeiPhone.phoneBrand);
        System.out.println("static 代码块1 a :" + HuaWeiPhone.a);
    }

    public static String phoneBrand ="华为HW"; //品牌名称 ： 类
    public static String phoneAddress = "深圳";
    public static int a = 10;

    //在类加载的时候，就要执行的代码，只执行一次（一般用于重量级对象的初始化）



    static{
        a++;
        System.out.println("static 代码块3 a :"+ HuaWeiPhone.a);
        System.out.println("static 代码块3 phoneBrand :"+ HuaWeiPhone.phoneBrand);


    }

    static{
        System.out.println("static 代码块2");
    }


    public String phoneType ; //型号
    public float phonePrice ;//价格
    public String phoneColor;//颜色

    public HuaWeiPhone(){}
    public HuaWeiPhone(String phoneBrand, String phoneType, float phonePrice, String phoneColor) {
        this.phoneBrand = phoneBrand;
        this.phoneType = phoneType;
        this.phonePrice = phonePrice;
        this.phoneColor = phoneColor;
    }


    public void fun1(){  // 对象.fun1()
        HuaWeiPhone.a = 10;

    }


    public static void fun2(){ // 类方法 ： 类名.方法名
        HuaWeiPhone.a = 10;  // OK
       // this.phoneType = "";   // 实例变量
    }



    //get,set
    //toString()
}
