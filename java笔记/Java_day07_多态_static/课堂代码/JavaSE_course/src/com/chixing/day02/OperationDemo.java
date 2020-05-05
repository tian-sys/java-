package com.chixing.day02;

import java.util.ArrayList;

/**
 * Java中的运算符与操作符
 *
 * >, >= <, <=
 *
 */
public class OperationDemo {
    public static void main(String[] args) {
        int a = 30;
        int b = 20;
        int c = a + b;
        c = a - b;
        c = a * b;

        float d = 45f;
        float e =  a + d ;  // 低字节 与 高字节 进行算术运算，值 一定是高字节

        c = a / b;
        c = a % b;

        a = 10;
        a++;  // a = a+1;

        a = 10;
        ++a;  // a = a+1

        //就近原则

        a = 10;
        b = a++;  // b = a ,(b = 10) , a= a+1 ,(a = 11)

        a = 10;
        b = ++a; // a = a+1 (a = 11), b = a (b = 11)


        a = 10;
        b = 20;
        c =  a++ - --b;


        a = 10;
        boolean b1 = (a == 10); // == 比较
        boolean b2 = (a != 10); // != 比较


        //  算术运算： &  |
        a = 6 & 2;  // 2
        System.out.println(" a = " + a);

        int bo1 = 0 & 0; // 0
        int bo2 = 0 & 1; // 0
        int bo3 = 1 & 0; // 0
        int bo4 = 1 & 1; // 1

        a = 10 | 2;
        System.out.println(" a = " + a);

        int bo11 = 0 | 0; // 0
        int bo12 = 0 | 1; // 1
        int bo13 = 1 | 0; // 1
        int bo14 = 1 | 1; // 1



        //  逻辑运算： &  |
        //false 0 , true 1
        //  _  & _  : 并且 ，两个条件都要满足
        //  _  | _  : 或者 ， 只要一个条件满足即可

        boolean c11 = false & false; //  false
        boolean c12 = true & false; // false
        boolean c13 = false & true; // false
        boolean c14 = true & true; // true

        boolean c1 = false | false; //  false
        boolean c2 = true | false; // true
        boolean c3 = false | true; // true
        boolean c4 = true | true; // true


        // && ||  短路

        // exp1  && exp2  : exp1 返回false, exp2不执行，直接返回结果false
        // exp1 || exp2 : exp1 返回 true, exp2 不执行，直接返回结果true

        boolean a11 = false && false; //  false
        boolean a12 = true &&  false; // false
        boolean a13 = false &&  true; // false
        boolean a14 = true &&  true; // true

        boolean a1 = false || false; //  false
        boolean a2 = true || false; // true
        boolean a3 = false || true; // true
        boolean a4 = true || true; // true


        a = 10;
        b = 20 ;
        boolean f1 = a++ >11 && --b <=19; // a ? b ? f1?  a = 11, b = 20, false
        System.out.println("a = " + a + ", b = " + b + ", f1 = " + f1);

        a = 10;
        b = 20 ;
        boolean f2 = a++ >11 && --a <=10; // a ?  f2? a = 11, false
        System.out.println("a = " + a + ", f2 = " + f2);

        a = 10;
        b = 20 ;
        boolean f3 = a++ + --b  >=29 && a++ >10;// a ? , b ?, f3?
                                            // a = 11, b = 19, a = 12,true
        System.out.println("a = " + a + ", b = " + b + ", f3 = " + f3);


        int x = 11 >> 2 ; // 左位移
        int y = 11 << 2 ; // 右位移
        System.out.println("x = " + x + ", y = "+y);


        ArrayList xx;
    }
}
