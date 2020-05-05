package com.chixing.day09_interface.innerclass;

import com.chixing.day09_interface.*;

import java.util.LinkedList;

public class CustomerTest {
    public static void main(String[] args) {


        Customer customer =  new Customer();
        String name = customer.custName;  // 成员变量：      对象名.变量名
        customer.speek();                 // 成员方法：      对象名.方法名
                                          // 成员内部类：    对象名.内部类对象

        //创建内部类对象
       Customer.ReceiveAddress address =  customer.new ReceiveAddress();




       //静态static : 类变量，类方法
        Customer.a = 30;
        Customer.funA();

        //创建静态内部类对象
        Customer.StaticInner staticInner = new Customer.StaticInner();



        Customer customer1 =  new Customer(); // 有对象名
        new Customer();  // 匿名类


        // 创建CPU对象
       MyCpu cpu1 =  new HpCpu();

       //匿名的 类对象，实现了MyCpu中所有的方法

        //匿名内部类
        MyCpu cpu2 = new MyCpu(){

             @Override
             public void cpuRunning() {

             }

             @Override
             public void cpuStop() {

             }
         };



//     new MainBoard(Cpu cpu ,VideoCard card);

        new MainBoard(new DellCpu(),new HpVideoCard());



        new MainBoard(new Cpu() {
            @Override
            public void cpuRunning() {

            }

            @Override
            public void cpuStop() {

            }
        }, new VideoCard() {
            @Override
            public void cardRun() {

            }

            @Override
            public void cardStop() {

            }
        });
    }
}
