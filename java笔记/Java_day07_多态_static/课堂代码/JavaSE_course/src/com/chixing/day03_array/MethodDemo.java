package com.chixing.day03_array;

public class MethodDemo {


    public static void main(String[] args) {
        int result = add(10,20);
        double money = aliTransferAccount("4738743@qq.com","82982932@qq.com",1000);
        int day = getDay(2010,4);

        int a = 10;
        int b = 20;
        add(a,b);


    }

    // x+ y = z;
    //10 , 20

    /**
     * 两个数求和
     * @param x 第一个加数
     * @param y 第二个加数
     * @return 返回两个数的和
     */
    public static int add(int x,int y){  // x = a; y = b;

        return  90;  // return 方法结束

    }

    /**
     * 支付宝转账
     * @param myAccount 我的账户
     * @param anotherAccount 对方账户
     * @param money 转账金额
     * @return  返回我的最新的余额
     */
    public static double aliTransferAccount(String myAccount,String anotherAccount,double money){
        return 0;
    }


    /**
     * 根据年份月份，获得对应的天数
     * @param year 年份
     * @param month 月份
     * @return  返回对应的天数
     */
    public static int  getDay(int year,int month){
        return 0;
    }


}
