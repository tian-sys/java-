package com.chixing.day05_constructor;

public class AccountTest {
    public static void main(String[] args) {
        getDay(2010,8); // 实际参数（实参）



        Account account1 = new Account();
        account1.setAccNo(622248394393391L);
        account1.getAccNo();


        Account account2 = new Account();
        account2.setAccNo(6222594950495045L);

    }




    // 访问权限 + 修饰符 + 返回值 + 方法名 + 参数列表 + 方法体

    //形式参数(形参)
    // year , month : 临时变量（局部变量）
    public static int getDay(int year,int month){
        return 0;
    }


}
