package com.chixing.day11_exception;

/**
 *
 *
 *   try{
 *      可能会出现异常的代码
 *   }catch(XXXXException e){
 *       处理异常的代码
 *
 *   }finally{
 *       释放资源，节省内存 （IO 关闭流，关闭数据库链接 ）
 *   }
 *
 *
 * 从语法上：
 *  无论try中是否捕捉到异常，finally一定会执行
 *
 *
 *
 */
public class FinallyDemo {
    public static void main(String[] args) {

    }



    public static void fun1(){
      /*  int x = 22;

        try{
            System.out.println("================try=====================");
            int a = 10/0;
            x = 33;
        }catch (ArithmeticException e){
            System.out.println("================catch=====================");
        }finally {
            System.out.println("===============finally=====================");
        }

        System.out.println("x = " + x);*/
    }


    public static int fun2(){
        int x = 22;

        try{
            System.out.println("================try=====================");
            int a = 10/0;
            x = 33;
            return x;
        }catch (ArithmeticException e){
            System.out.println("================catch=====================");
            return 0;
        }finally {
            System.out.println("===============finally=====================");
        }



    }




}
