package com.chixing.day02;

public class IfElseDemo {


    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        boolean f = false;

        if( f ){  // f == true
            System.out.println("f 为true");
        }else{
            System.out.println("f 为false");
        }

        if( !f ){ // f == false
            a++;
            b++;
        }else{
            a--;
            b--;
        }

        int c ;

        if( a > b)
            c = a;
        else
            c = b;





        // 三目运算
        c = (a > b ) ? a: b;

        int year = 2010;
        int month = 4;
        int day ;
        //if - else 获得这个月份对应的天数

        if(month ==1 || month ==3 || month == 5 || month == 7 || month ==8 || month == 10 || month ==12)
            day = 31;
        else if(month == 2){
            if(year % 4 == 0 && year % 100  !=0  || year % 400 ==0 )
                day = 28;
            else
                day = 29;
        }else
            day = 30;


        System.out.println("当前月份"+month + "对应的天数是:"+day);






    }




}
