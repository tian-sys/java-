package com.chixing.day06_inherited;

public class Bank {
    private Account[] accountArr = new Account[100];//假设默认存储100个银行账户

    /**
     * 账户开户
     * @param username  开户人的姓名
     * @param telno 开户人的手机
     * @param password  账户密码
     * @param accountType 开户类型（0：储蓄账户，1：信用账户）
     * @return
     */
    public Account regist(String username,long telno,int password,int accountType){
        return null;
    }

    /**
     * 统计出储蓄账户的总金额
     * @return 返回储蓄账户的总金额
     */
    public double getSavingAccountMoney(){
        return 0;
    }

    /**
     * 统计出信用账户的总金额
     * @return 返回信用账户的总金额
     */
    public double getCreditAccountMoney(){
        return 0;
    }
}
