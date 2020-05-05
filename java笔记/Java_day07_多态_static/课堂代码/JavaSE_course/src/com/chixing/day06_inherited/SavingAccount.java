package com.chixing.day06_inherited;

/**
 *    SavingAccount extends Account
 *    SavingAccount 可以继承 Account的属性与方法
 */
public class SavingAccount extends Account{

    public final int MAX_CACHE_CAPACITY = 800;



    public SavingAccount(){

    }

    public SavingAccount(long accNo, String accName, int accPassword, long accTelno, double accBalance, int accType) {

        super(accNo, accName, accPassword, accTelno, accBalance, accType);

    }


    public  void fun(){

        super.getAccType();// super: 当前SavingAccount 的所有所有父类（Account,Object） super.属性;  super.方法() , super(..)
        this.getAccNo() ;//  this 当前对象， 能访问到自己的属性方法，父类的继承过来的属性与方法  this.属性;  this.方法() , this(..)
    }
}
