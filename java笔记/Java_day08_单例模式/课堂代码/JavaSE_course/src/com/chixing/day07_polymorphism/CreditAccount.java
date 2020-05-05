package com.chixing.day07_polymorphism;

public class CreditAccount extends  Account {

    private double maxOverdraw;//最高透支额度

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


    @Override
    public String toString() {
        return "CreditAccount{" +
                "maxOverdraw=" + maxOverdraw +
                "} " + super.toString();
    }
}
