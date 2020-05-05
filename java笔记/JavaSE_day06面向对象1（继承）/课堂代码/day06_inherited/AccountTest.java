package com.chixing.day06_inherited;

public class AccountTest {
    public static void main(String[] args) {
        SavingAccount sa0 = new SavingAccount();
        Account sa1 = new SavingAccount();  // 父类类型 =  子类对象 【父类引用子类对象】

        CreditAccount ca0 = new CreditAccount();
        Account ca1 = new CreditAccount();// 父类类型 =  子类对象【父类引用子类对象】
    }
}
