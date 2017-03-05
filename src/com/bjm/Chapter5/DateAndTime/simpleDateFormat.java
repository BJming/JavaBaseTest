package com.bjm.Chapter5.DateAndTime;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/**
 * Created by bjming on 17-2-26.
 */
public class simpleDateFormat {
    public static void main(String [] args){
        SimpleDateFormat date= new SimpleDateFormat("yyyy-MM-dd");
        String date0=date.format(new Date());
        System.out.println(date0);
        Date beforeDay=getBeforeDay(new Date());
        Date toDay=getToDay(new Date());
        Date nextDay=getNextDay(new Date());
        String date1=date.format(beforeDay);
        String date2=date.format(toDay);
        String date3=date.format(nextDay);
        System.out.println(date1);
        System.out.println(date2);
        System.out.println(date3);
        DateForm dateForm = new DateForm();
//        dateForm.setBeginDate(getNextDay("2016-02-26"));
    }
    //获取系统前一天时间
    public static Date getBeforeDay(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.DAY_OF_MONTH, -1);
        date = calendar.getTime();
        return date;
    }
    //获取系统当前时间
    public static Date getToDay(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.DAY_OF_MONTH, 0);
        date = calendar.getTime();
        return date;
    }
    //获取系统后一天时间
    public static Date getNextDay(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.DAY_OF_MONTH, 1);
        date = calendar.getTime();
        return date;
    }
    public static String getNextDay(String dateStr){//可以用new Date().toLocalString（）传递参数
        Calendar calendar = Calendar.getInstance();
        Date date=null;
        try{
            date = new SimpleDateFormat("yyyy-MM-dd").parse(dateStr);
        }catch (ParseException e){
            e.printStackTrace();
        }
        calendar.setTime(date);
        int day = calendar.get(calendar.DATE);
        calendar.set(Calendar.DATE, day - 1);
        return new String("hello");
    }
}
