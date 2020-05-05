package com.chixing.day10_string;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 日期工具类
 * 提供了日期与字符串的相互转换等
 */
public class DateUtil {
    /**
     * 日期格式，精确到年月日时分秒
     */
    public static final String DATE_PATTERN_YMDHMS = "yyyy-MM-dd HH:mm:ss";

    /**
     * 日期格式，精确到年月日
     */
    public static final String DATE_PATTERN_YMD = "yyyy-MM-dd";

    /**
     * 日期格式，精确到时分秒
     */
    public static final String DATE_PATTERN_HMS = "HH:mm:ss";



    /**
     * 日期转换成String
     * @param date 日期对象
     * @param datePattern 日期格式
     * @return  返回字符串表示的日期
     */
    public static String date2String(Date date,String datePattern){
        DateFormat dateFormat = new SimpleDateFormat(datePattern);
        return dateFormat.format(date);

    }


    /**
     * String转换成日期
     * @param strDate   字符串表示的日期
     * @return  返回对应的日期对象
     */
    public static Date string2Date(String strDate,String datePattern) throws ParseException {
       DateFormat dateFormat =  new SimpleDateFormat(datePattern);
       return dateFormat.parse(strDate);

    }

    /**
     * 获得日期中的年份
     * @param date  指定的日期对象
     * @return  返回对应的年份
     */
    public static int getYear(Date date){
        return 0;
    }

    /**
     * 获得日期中的月份
     * @param date  指定的日期对象
     * @return  返回对应的月份
     */
    public static int getMonth(Date date){
        return 0;
    }

    /**
     * 两个日期相差得天数
     * @param date1 第一个日期对象
     * @param date2 第二个日期对象
     * @return  返回两个日期相差得天数
     */
    public  static int differDays(Date date1,Date date2){
        return 0;
    }



}
