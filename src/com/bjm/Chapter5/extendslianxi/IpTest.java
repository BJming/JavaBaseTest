package com.bjm.Chapter5.extendslianxi;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by bjming on 17-3-1.
 */
public class IpTest {
    public static void main(String[] args){
        Pattern p = null;//正则表达式
        Matcher m = null;//操作的字符串
        boolean b = false;
        //定义IP地址的正则表达式
        p = Pattern.compile("\\d{1,3}+\\.\\d{1,3}+\\.\\d{1,3}+\\.\\d{1,3}");
        m = p.matcher("192.168.1.1");
        b = m.matches();
        System.out.println("IP正确：　"+b);//输出:true;
        p = Pattern.compile("\\d{1,3}+\\.\\d{1,3}+\\.\\+d{1,3}+\\.\\d{1,3}");
        m = p.matcher("192.168.1.1234");
        b = m.matches();
        System.out.println("IP错误：　"+b);//输出：false;
        p = Pattern.compile("\\d{1,3}+\\.\\d{1,3}+\\.\\d{1,3}+\\.\\d{1,3}");
        m = p.matcher("192.168.1.1");
        b = m.matches();
        System.out.println("192.168.1.1验证结果："+b);
        Pattern p1 = null;
        Matcher m1 = null;
        Boolean b1 = false;
        p1=Pattern.compile("\\d{1,3}+\\.\\d{1,3}+\\.\\d{1,3}+\\.\\d{1,3}");
        m1 = p1.matcher("123.1234.1235.12.34.4");
        b1 = m1.matches();
        System.out.println("IP验证结果为:"+b1);
    }
}
