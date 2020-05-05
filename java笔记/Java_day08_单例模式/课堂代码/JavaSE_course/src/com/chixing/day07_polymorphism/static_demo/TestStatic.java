package com.chixing.day07_polymorphism.static_demo;

import com.chixing.day03_array.SortDemo;
import com.chixing.day07_polymorphism.CreditAccount;
import com.chixing.day07_polymorphism.SavingAccount;

import java.util.Arrays;

public class TestStatic {
    public static void main(String[] args) throws ClassNotFoundException {

      /*  // 类变量
        HuaWeiPhone.phoneBrand = "华为";

        HuaWeiPhone p1 =  new HuaWeiPhone();

        // 实例变量 （instance 实例化）
        p1.phoneType ="荣耀10";
        p1.phoneColor = "黑色";
        p1.phonePrice = 2999;

        HuaWeiPhone p2 =  new HuaWeiPhone();
        p2.phoneType ="p30 pro";
        p2.phoneColor = "白色";
        p2.phonePrice = 4999;*/


      // 类加载: HuaWeiPhone.class 加载到JVM中
        Class.forName("com.chixing.day07_polymorphism.static_demo.HuaWeiPhone");
        System.out.println(HuaWeiPhone.phoneBrand);

        HuaWeiPhone.fun2();

//        System.arraycopy();
//       Arrays.copyOf()
//        Arrays.sort();
//        SortDemo.insertSort()

//        什么时候需要有对象的意义
        new SavingAccount() ;// 现实生活中的一个实在的账户个体
        new CreditAccount();// 现实生活中的一个实在的账户个体

        Math.min(10,20);





    }
}
