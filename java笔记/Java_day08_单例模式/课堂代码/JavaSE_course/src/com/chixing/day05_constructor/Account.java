package com.chixing.day05_constructor;

public class Account {
    //成员变量
    private long accNo;  //账户账号
    private String accName; //账户姓名
    private int accPassword;  //账户密码
    private long  accTelno;  //账户手机号
    private double accBalance;  //账户余额
    private int accType; //账户类型 0:储蓄账户， 1：信用账户


    //账户账号 赋值
    //this : 当前对象
    public void setAccNo(long accNo){  // accNo 局部变量（临时变量）
        this.accNo = accNo;
    }

    public long getAccNo(){
        return this.accNo;
    }

    public void setAccName(String accName){
        this.accName = accName;

    }

    public  String getAccName(){
        return  this.accName;
    }



}
