package com.chixing.day10_string;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateDemo {
    public static void main(String[] args) throws ParseException {
        /* ============ java.util.Date =================== */
        //创建当前日期
        Date date1 =   new Date();
        System.out.println(date1.toString());


        long ms =   date1.getTime();  // second, million second
        System.out.println(ms);

        Date date2 =  new Date(ms);
        System.out.println(date2.toString());


        /* ============== java.util.Calendar ================= */
        //由Calendar.get(Calendar.YEAR) - 1900 。
        Calendar calendar  =  Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH) + 1;
        int dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH);
        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        int minute = calendar.get(Calendar.MINUTE);
        int second = calendar.get(Calendar.SECOND);
        int millSecond = calendar.get(Calendar.MILLISECOND);

        System.out.println("year :" + year);
        System.out.println("month :" + month);
        System.out.println("dayOfMonth :" + dayOfMonth);
        System.out.println("hour :" + hour);
        System.out.println("minute :" + minute);
        System.out.println("second :" + second);
        System.out.println("millSecond :" + millSecond);

        //Calendar -- Date
        Date date3 = calendar.getTime();
        calendar.add(Calendar.DAY_OF_MONTH,29);
        System.out.println("year :" +calendar.get(Calendar.YEAR) );
        System.out.println("month :" +calendar.get(Calendar.MONTH) +1);

        calendar.setTime(date1);


        /* ============== Date - String ================= */
        String strDate1 = "2020-06-30";

        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date11 = dateFormat.parse(strDate1); // String ---> Date 解析（parse）
        System.out.println("date11 :" + date11);


        String strDate2 = dateFormat.format(date11);  //Date --->String 格式化(format)
        System.out.println("strDate2 :" + strDate2);

        dateFormat = new SimpleDateFormat("yyyy/MM/dd"); //    "yyyy/MM/dd"
        String strDate3 =dateFormat.format( new Date() );
        System.out.println("strDate3 :" + strDate3);
    }
}
