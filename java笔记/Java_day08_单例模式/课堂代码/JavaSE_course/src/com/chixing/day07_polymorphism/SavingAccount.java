package com.chixing.day07_polymorphism;

public class SavingAccount extends  Account {

    public SavingAccount(){}
    public SavingAccount(long accNo, String accName, int accPassword, long accTelno, double accBalance, int accType) {
        super(accNo, accName, accPassword, accTelno, accBalance, accType);
    }


    //重写Object.toString()


    @Override
    public String toString() {
        return "SavingAccount{} " + super.toString();
    }
}
