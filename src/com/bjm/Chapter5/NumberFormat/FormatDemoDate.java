package com.bjm.Chapter5.NumberFormat;

import java.text.NumberFormat;
import java.util.Locale;

/**
 * Created by bjming on 17-2-26.
 */
public class FormatDemoDate {
    public static void main(String [] args){
        FormatDemoDate numberFormatDemo = new FormatDemoDate();
        double money = 753652.00;
        double number = 765.0/4.0;
        //打印中国格式的货币和数字
        System.out.println("打印中国格式的货币和数字，中国：");
        numberFormatDemo.showMoney(money, Locale.CHINA);
        numberFormatDemo.showNumber(number, Locale.CHINA);
        //打印美国格式的货币和数字
        System.out.println("打印美国格式的货币和数字，美国：");
        numberFormatDemo.showMoney(money, Locale.US);
        numberFormatDemo.showNumber(number, Locale.US);
    }

    public void showMoney(double money, Locale locale){
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance(locale);
        String str = numberFormat.format(money);
        System.out.println("The Money is: "+str);
    }

    public void showNumber(double num, Locale locale){
        NumberFormat numberFormat = NumberFormat.getInstance(locale);
        numberFormat.setMaximumFractionDigits(5);
        String str = numberFormat.format(num);
        System.out.println("The Number is: "+str);
    }
}
