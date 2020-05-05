package com.chixing.day16_thread;
/*

    java.lang.Thread 线程


 */
public class ThreadDemo1 {



    /*
        单线程: 程序按编译顺序执行
        主线程 （main线程）
     */
    public static void main(String[] args){ // arguments  实参，parameter 形参
       String name =  Thread.currentThread().getName();
       System.out.println(name);
    }

}
