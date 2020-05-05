package com.chixing.day07_polymorphism;

public class TestAccount {
    public static void main(String[] args) {

        SavingAccount savingAccount =  new SavingAccount(622223278293223L,"张南顶",123456,134449329320L,0,0);
        CreditAccount creditAccount = new CreditAccount(622224546565656L,"韦文洁",123456,1344738430L,0,1,50000);

        System.out.println(savingAccount);//Object.toString() ==== > SavingAccount.toString()
        System.out.println(creditAccount);//Object.toString() ==== > CreditAccount.toString()

        //等价于
        System.out.println(savingAccount.toString());
        System.out.println(creditAccount.toString());


    }
}
