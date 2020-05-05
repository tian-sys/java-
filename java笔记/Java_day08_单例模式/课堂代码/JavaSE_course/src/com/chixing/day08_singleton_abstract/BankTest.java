package com.chixing.day08_singleton_abstract;

public class BankTest {
    public static void main(String[] args) {
       /* new Bank();
        new Bank();
        new Bank();
        new Bank();
        new Bank();*/


        Bank bank1 =  Bank.getBankInstance();
        Bank bank2 =  Bank.getBankInstance();
        Bank bank3 =  Bank.getBankInstance();
        Bank bank4 =  Bank.getBankInstance();



        Bank2 bank21 = Bank2.getBankInstance();



    }

}
