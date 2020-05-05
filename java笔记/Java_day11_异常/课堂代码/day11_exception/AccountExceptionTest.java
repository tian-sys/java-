package com.chixing.day11_exception;

public class AccountExceptionTest {

    public static void main(String[] args) throws BalanceNotEnoughException {
        Account account =  new Account();
        account.setAccBalance(1000);


        account.withdraw(2000);
    }
}
