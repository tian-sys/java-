package com.chixing.day09_interface.innerclass;
/*


    成员：
        变量（实例变量）
        方法（实例方法）
        成员内部类： 服务于外部类

 */
public class Customer {


    /*================== 实例成员（实例变量，实例方法，实例内部类[成员内部类]）===================*/
    public  String custName;

    public void speek(){
        System.out.println("speek...");

        ReceiveAddress address =  new ReceiveAddress();
        address.province = "江苏省";
        address.fun1();
    }

    //收件地址
    public class ReceiveAddress {
        public String province;
        public String city;
        public String area;
        public String detailAddress;

        public void fun1(){
            custName = "hello"; // 内部类 ---> 外部类变量
            new Customer().custName = "good";
        }



    }


    /*================== static 类成员（类变量，类方法，静态内部类）===================*/

    public static int a = 10;
    public static void funA(){

    }


    public static class StaticInner{
        int x = 10;


        public void fun5(){
            a = 20;
        }

        public static  void fun6(){
            a = 20;

        }
    }

    /*==================局部内部类 ： 方法内部的类： 服务于该方法===================*/


    public void fun6(){
        int a = 20;  // 局部变量（临时变量）
        class Inner6{

        }
    }


    /*==================匿名内部类：===================*/

}



interface  ApiA{
    interface  ApiB{}
}


interface MyCpu{
    public void cpuRunning();
    public void cpuStop();
}


class HpCpu implements MyCpu{

    @Override
    public void cpuRunning() {

    }

    @Override
    public void cpuStop() {

    }
}

