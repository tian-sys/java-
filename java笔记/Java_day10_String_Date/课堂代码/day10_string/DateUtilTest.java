package com.chixing.day10_string;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtilTest {
    public static void main(String[] args) throws ParseException {




     String strDate1 = DateUtil.date2String(new Date(),DateUtil.DATE_PATTERN_HMS);

      Date date1 =   DateUtil.string2Date("2019-07-02 19:20:30",DateUtil.DATE_PATTERN_YMDHMS);
    }
}
