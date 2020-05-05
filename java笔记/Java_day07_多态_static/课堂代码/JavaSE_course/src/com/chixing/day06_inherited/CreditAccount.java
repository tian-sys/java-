package com.chixing.day06_inherited;

public class CreditAccount extends  Account{


    public double maxOverdraw;//最高透支额度
    public CreditAccount(){}
    public CreditAccount(long accNo, String accName, int accPassword, long accTelno, double accBalance, int accType, double maxOverdraw) {
        super(accNo, accName, accPassword, accTelno, accBalance, accType);
        this.maxOverdraw = maxOverdraw;
    }





    public double getMaxOverdraw() {
        return maxOverdraw;
    }

    public void setMaxOverdraw(double maxOverdraw) {
        this.maxOverdraw = maxOverdraw;
    }





    //还信用卡
    public double repay(double money){
        return 0;
    }


    public static void main(String[] args) {
        CreditAccount creditAccount =  new CreditAccount();

    }


    /*
     *子类CreditAccount 的取款功能 内部实现与父类并不一样
     * 方法重写：override
     */

    @Override
    public double withdraw(double money) {
        // 重新实现 取款
        return 0;
    }
}
