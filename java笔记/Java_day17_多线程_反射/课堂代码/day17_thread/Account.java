package com.chixing.day17_thread;

import java.io.IOException;
import java.text.ParseException;

public   class Account {
    public String accName;
    public float balance;


    public Account(){}
    public Account(String accName, float balance) {
        this.accName = accName;
        this.balance = balance;
    }

    public String getAccName() {
        return accName;
    }

    public void setAccName(String accName) {
        this.accName = accName;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accName='" + accName + '\'' +
                ", balance=" + balance +
                '}';
    }


    public static final Account fun(int a,String b,Account c) throws ParseException, IOException {
        return null;
    }

    public   int fun(int a,String b)   {


        return 888;
    }





   /* //存款
    public synchronized float depoist(float money){
        //模拟存款业务消耗的时间 随机的 1-10ms

        float temp = this.balance;
        temp +=money;

        try {
            Thread.sleep(   4  );
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        this.balance = temp;
        return this.balance;
    }*/

    //存款
    public  float depoist(float money){
        int a = 10;
        int b = 20;


        synchronized (this) {
            //模拟存款业务消耗的时间 随机的 1-10ms

            float temp = this.balance;
            temp += money;

            try {
                Thread.sleep(4);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            this.balance = temp;

        }

        int c = 30;
        return this.balance;

    }




}
