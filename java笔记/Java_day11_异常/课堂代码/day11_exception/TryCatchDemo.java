package com.chixing.day11_exception;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.util.ArrayList;

/**
 * 处理异常示例
 *
     try{

         可能会出现的异常的语句，进行捕捉

       }catch{

            处理异常的代码块

      }


    try{

     }catch(){

     }catch(){


     }catch(){

     }




 */
public class TryCatchDemo {
    public static void main(String[] args) {

        Account account =  new Account();
        account.setAccBalance(3000);

        int a = 10;
        int b = 20;
        try {

            System.out.println("---------try--------------");
            account.withdraw(4000);  // 可能会出现的异常的语句，进行捕捉
            a = 100;
            b = 200;
        }catch ( BalanceNotEnoughException e){  // 处理异常的代码块  BalanceNotEnoughException e =  new BalanceNotEnoughException("账户余额不足");
            System.out.println("--------catch--------------");
            System.out.println("余额不足了");
        }

        System.out.println("---------end--------------");
        System.out.println("a: "+ a + ", b = " + b );



        a  = 10;
        b = 4;

        try{
            int x = a/b;  //ArithmeticException

            int[] arr = {10,20};
            int c = arr[0];  //ArrayIndexOutOfBoundsException


            String str = null;
            str.charAt(3);   // NullPointerException

        }catch (ArithmeticException e){

        }catch (ArrayIndexOutOfBoundsException e){

        }catch (NullPointerException e){

        }catch (Exception e){

        }



/*
        try{
            try{

            }catch (){

            }
        }catch (){
            try {

            }catch (){

            }
        }
        */




    }
}
