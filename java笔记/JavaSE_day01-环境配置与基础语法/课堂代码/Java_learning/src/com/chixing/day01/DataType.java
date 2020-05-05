package com.chixing.day01;

/**
 * 一般用于表示该类做什么
 *
 * 描述Java的数据类型
 *
 * 1. 基本数据类型
 *      整型：
 *                           字节数         范围
 *          byte                1        -128   ~ 127
 *          short(短整型)        2
 *          int                 4           【默认的整型】
 *          long(长整型)         8             【后面加L l】
 *
 *
 *
 *      浮点型：
 *      字符：
 *      布尔：
 *
 *
 * 2. 引用数据类型
 *  类、接口、枚举、注解、数组
 *
 *
 *
 *  1byte  = 8bit (位)
 *  1bit
 *  0
 *  1
 *
 */
public class DataType {

    public static void main(String[] args){
        byte b1 = 10;
        byte b2 = 127;
        byte b3 = -128;

        short s1 = 34;
        short s2 = 4334;

        int i1 = 3862;
        int i2 = 389348450;

        long l1 = 38948399430940L;
        long l2 = 2L;  //将long类型的23（占8字节）  赋值给 long类型的变量 l2
        long l3 = 2;   // 将int 的23（占4字节） 赋值给 long类型的变量 l3


        short s3 = b1;  //将byte的b1 赋值给 short类型的s3
        int i3 = s1;

        byte b4 = (byte)130; // int类型的129
        System.out.println("b4 =" + b4);

        byte b5 =(byte) l1;

        int i4 = (int)l1;

        long l4 = b1;

        // 低字节的 可以 自动 转换成高字节
        // 高字节 不能自动转换成 低字节变量，若要转换，则需要强制类型转换，可能会造成精度缺失


        float height = 1.75F; // 单精度浮点型 ， 4字节
        double balance = 3829389.4374839; //双精度浮点型 8字节

        float f1 = l1;
        System.out.println("f1:" + f1);

        char c1 ='a'; // char 是 单个字符
        char c2 = '@';
        char c3 ='u';
        char c4 = ' ';
        char c5 = '\\';  //  \ 转义字符
        char c6 = '\'';
        char c7 = '\"';
        char c8 = '\"';
        char c9 = '\r';
        char c10 = '\n';
        char c11= '\b';
        char c12= '\t';

        // char <--- > int 可以相互转换
        int ii1 = 'B';
        System.out.println("a :"+ii1);  //'a'  97

        char cc1 = 65;

        System.out.println("cc1 :"+cc1);
        System.out.println("\t :" +(int)c12);


        boolean bo1 = true;
        boolean bo2 = false;

        // 性别
        boolean bo3 = 4>3;

        char ch = '别';

    }

}
