package com.chixing.day02;

public class SwitchCaseDemo {
    public static void main(String[] args) {
        //break 结束switch-case语句
        // switch-case 数据类型： (能够转换成int类型的值)byte,short,int,char, Byte,Short,Integer,Character, + String + 枚举

        int day =2;
        switch( day ){
            case 1: System.out.println("星期1");break;
            case 2:  System.out.println("星期2");
            default: System.out.println("无效的星期");break;
            case 3:  System.out.println("星期3");break;

        }
    }
}
