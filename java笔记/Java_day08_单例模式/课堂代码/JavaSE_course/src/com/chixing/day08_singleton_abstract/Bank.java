package com.chixing.day08_singleton_abstract;

/*
 * 设计Bank类，使得Bank对象只能创建一次
 *
 * 单例模式 singleton ： 内存中仅有一份实例对象
 *
 * (1) 在Bank类加载的时候，Bank对象就创建好了 【饿汉模式】
 *
 * (2) 外部调用getBankInstance() (外部 什么时候需要使用bank对象的时候)， 才实例化Bank对象
 *  尤其是该对象是重量级对象（ 实例化需要很多资源[网络资源，内存，时间....] ）
 *      =====> 延迟实例化对象 （ 懒加载 lazy ） 【懒汉模式】

 */


//饿汉模式
public class Bank {//student product

        private static Bank bank =  new Bank();

        private Bank(){}

        public static Bank getBankInstance(){
            return bank;
        }

}
