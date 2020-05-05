package com.chixing.day06_inherited;

public class Account {
    public long accNo;  //账户账号
    public String accName; //账户姓名
    public int accPassword;  //账户密码
    public long  accTelno;  //账户手机号
    public double accBalance;  //账户余额
    public int accType; //账户类型 0:储蓄账户， 1：信用账户

    //构造函数

    //get,set

    public long getAccNo() {
        return accNo;
    }

    public void setAccNo(long accNo) {
        this.accNo = accNo;
    }

    public String getAccName() {
        return accName;
    }

    public void setAccName(String accName) {
        this.accName = accName;
    }

    public int getAccPassword() {
        return accPassword;
    }

    public void setAccPassword(int accPassword) {
        this.accPassword = accPassword;
    }

    public long getAccTelno() {
        return accTelno;
    }

    public void setAccTelno(long accTelno) {
        this.accTelno = accTelno;
    }

    public double getAccBalance() {
        return accBalance;
    }

    public void setAccBalance(double accBalance) {
        this.accBalance = accBalance;
    }

    public int getAccType() {
        return accType;
    }

    public void setAccType(int accType) {
        this.accType = accType;
    }


    //存款，取款
    public double depoist(double money){
        return 0;
    }

    public double withdraw(double money){
        return 0;
    }

}
