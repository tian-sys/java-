package com.chixing.day06_inherited;

public class CreditAccount extends  Account{


    public double maxOverdraw;//最高透支额度


    public double getMaxOverdraw() {
        return maxOverdraw;
    }

    public void setMaxOverdraw(double maxOverdraw) {
        this.maxOverdraw = maxOverdraw;
    }

    //存款，取款
    public double depoist(double money){
        return 0;
    }

    public double withdraw(double money){
        return 0;
    }



    //还信用卡
    public double repay(double money){
        return 0;
    }


    public static void main(String[] args) {
        CreditAccount creditAccount =  new CreditAccount();

    }

}
