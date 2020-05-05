package com.chixing.day07_polymorphism;

/**
 * 存储银行账户，对账户的一些管理（开户，转账，统计）
 */
public class Bank {

    //数据安全性
    private Account[] accounts = new Account[100];
    private int size = 0;

    /**
     * 账户开户
     * @param username  用户名
     * @param telno 手机号
     * @param password  密码
     * @param accType   开户类型
     * @return  返回新账户
     */
    public Account regist(String username,long telno,int password,int accType){
         Account account = null;

         if(accType == 0)
             account = new SavingAccount(generateNextAccountNo(),username,password,telno,0,accType);
         else
             account = new CreditAccount(generateNextAccountNo(),username,password,telno,0,accType,0);

        accounts[size++] = account;
        return account;
    }


    /**
     * 获得下一个银行账号号码
      * @return 返回下一个银行账号号码
     */
    private long generateNextAccountNo(){
        return 0;
    }

    /**
     * 统计储蓄账户的总金额
     * @return  返回储蓄账户的总金额
     */
    public double getSavingAccountSumMoney(){

        double sum = 0;
        for(int i =0;i<size;i++){
            if( accounts[i] instanceof SavingAccount )
                sum += accounts[i].getAccBalance();
        }

        return sum;
    }


}
