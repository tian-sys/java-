package com.chixing.day11_exception;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class ExceptionDemo {
    public static void main(String[] args) {
        //常见的异常 [运行时异常]

        int[] a = {10,20,30};
        int x = a[3]; // ArrayIndexOutOfBoundsException

        String str = "hello"; // StringIndexOutOfBoundsException
         str.charAt(7);

         int y = 10/9;  // ArithmeticException


        String str2 = null;
        str2.contains("a");  // NullPointerException


        // 编译时异常 ParseException
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
//        dateFormat.parse("2010/10/23");


    }
}
