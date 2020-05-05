package com.chixing.day03_array;

public class RecursionDemo {
    /*
        求n!的阶层

        5! = 4! * 5
        4! = 3! * 4;
        3! = 2! * 3;
        2! = 1! * 2;
        1! = 0! * 1;
        0! = 1;

        f(n) = f(n-1) * n;  [n >0]
        n = 0; f(n) =1


     */
    public static void main(String[] args) {


        int result1 = factorial(0);
        int result2 = factorial(5);


    }

    //求阶乘 : 递归  ==  循环
    public  static int factorial(int n){
        if(n == 0)
            return 1;
        else
           return factorial(n-1) * n;

    }


}
