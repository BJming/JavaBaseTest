package com.bjm.Chapter5.DateAndTime;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Created by bjming on 17-2-26.
 */
public class dateFormat {
    public static void main(String [] args){
        //定义日期的4种格式
        DateFormat date= DateFormat.getDateInstance(DateFormat.SHORT, Locale.CHINA);
        DateFormat date1=DateFormat.getDateInstance(DateFormat.FULL, Locale.CHINA);
        DateFormat date2=DateFormat.getDateInstance(DateFormat.MEDIUM, Locale.CHINA);
        DateFormat date3=DateFormat.getDateInstance(DateFormat.LONG, Locale.CHINA);
        //日期转换成字符串
        String dt=date.format(new Date());
        String dt1=date1.format(new Date());
        String dt2=date2.format(new Date());
        String dt3=date3.format(new Date());
        //输出日期字符串
        System.out.println(dt);
        System.out.println(dt1);
        System.out.println(dt2);
        System.out.println(dt3);
        //定义时间的4种格式
        DateFormat date4= DateFormat.getTimeInstance(DateFormat.SHORT, Locale.CHINA);
        DateFormat date5= DateFormat.getTimeInstance(DateFormat.FULL, Locale.CHINA);
        DateFormat date6= DateFormat.getTimeInstance(DateFormat.MEDIUM, Locale.CHINA);
        DateFormat date7= DateFormat.getTimeInstance(DateFormat.LONG, Locale.CHINA);
        //把日期转换成字符串
        String dt4=date4.format(new Date());
        String dt5=date5.format(new Date());
        String dt6=date6.format(new Date());
        String dt7=date7.format(new Date());
        //输出日时间字符串
        System.out.println(dt4);
        System.out.println(dt5);
        System.out.println(dt6);
        System.out.println(dt7);
    }
}