package com.chixing.day12_boxing_generic_list;
/*

    String ------Float--------> float
    "45.9"                     45.9f
    float  -------Float-------> String

    包装类：
        byte        Byte
        short       Short
        int         Integer
        long        Long
        float       Float
        double      Double
        char        Character
        boolean     Boolean



      自动装箱(boxing)： 基本数据类型  转换成  包装类
      自动拆箱(unboxing): 包装类  转换成 基本数据类型

    使用场合：
        （1）String 与 基本数据类型的转换
        （2）泛型




 */
public class BoxingDemo {
    public static void main(String[] args) {


        Float f1 =  new Float("45.9f");
        float f2 = f1.floatValue();   // String ------Float--------> float

       String s1 =  Float.toString(34.6f);  // float  -------Float-------> String


        //Float --- float
      float f3 =   f1.floatValue();


      //float --- Float
       Float f4 =  Float.valueOf(34.8f);


       //自动装箱
       Float f11 = 32.4f;  // 基本数据类型  转换成  包装类

        //自动拆箱
       float f12 = f1;  // 包装类 转换成 基本数据类型




    }
}
