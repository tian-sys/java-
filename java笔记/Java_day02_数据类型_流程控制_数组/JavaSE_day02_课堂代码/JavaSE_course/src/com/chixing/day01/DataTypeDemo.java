package com.chixing.day01;

/**
 * 数据的类型
 * (1)基本数据类型 ： byte,short,int,long,float,double,char,boolean
 * (2)引用数据类型
 *
 *整型：
 *  byte    1字节： (8位)  -128 ~ +127
 *  short   2字节  短整型
 *  int     4字节  默认的整型
 *  long    8字节  长整型,后面加上L 或 l
 *
 * 浮点型：
 *  float  4字节 后面加上F或f
 *  double 8字节 默认的浮点型
 */
public class DataTypeDemo {
    public static void main(String[] args){

        byte b1 =20;// 0111 1111 ~ 1111 1111
        short s1 = -129;
        int i1 = 20;
        long telno = 16483945432L;

        long l1 = b1;

        byte b2 = (byte)s1; //强制类型转换
        System.out.println("b2 = " + b2);

        short s2 = (short)38293892;

        float productPrice = 15.5F;
        double balance = 38493.3239;


        final int MAX_WAIT_TIME ;
        MAX_WAIT_TIME = 30;


        char c1 = 'a';
        char c2 = '{';
        char c3 = '\\';
        char c4 = '\t';  //tab
        char c5 = '\r';
        char c6 = '\n';
        char c7 = '\b'; // backspace

        // char int
        char c8 = 65;  //'D'
        System.out.println("c8 = " + c8);
        int i2 = 'a';

        boolean bo1 = true;
        boolean bo2 = false;
        boolean bo3 = 6 >= 9;
        boolean bo4 = b1 + i1 == i2;
        boolean isFileExist = false;
        boolean hasNext = false;
        boolean flag = false;





    }


    public boolean isStudentExist(){
        boolean flag = false;

            ///////

        return flag;
    }


}
