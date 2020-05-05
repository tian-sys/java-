package com.chixing.day11_exception;

public class Account {
    private long accNo;  //账户账号
    private String accName; //账户姓名
    private int accPassword;  //账户密码
    private long  accTelno;  //账户手机号
    private double accBalance;  //账户余额
    private int accType; //账户类型 0:储蓄账户， 1：信用账户

    //构造函数
    public Account(){}

    public Account(long accNo, String accName, int accPassword, long accTelno, double accBalance, int accType) {
        this.accNo = accNo;
        this.accName = accName;
        this.accPassword = accPassword;
        this.accTelno = accTelno;
        this.accBalance = accBalance;
        this.accType = accType;
    }
    //get,set

    public long getAccNo() {
        return this.accNo;
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


    //存款
    public double depoist(double money){
        return 0;
    }





    //取款
    public double withdraw(double money) throws BalanceNotEnoughException {
        if(this.accBalance >= money)
            this.accBalance -= money;
        else //抛异常 （账户余额不足）
            throw  new BalanceNotEnoughException("账户余额不足"); // 结束方法执行
        return 0;
    }



    public static int fun(){
        int a = 10;
        int b = 20;

        if(a >b)
            throw new ArithmeticException();
        else
            return 200;
    }


}
