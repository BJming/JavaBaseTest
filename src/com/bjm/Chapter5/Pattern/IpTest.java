package com.bjm.Chapter5.Pattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by bjming on 17-2-26.
 */
public class IpTest {
    public static void main(String [] args){
        Pattern p = null;//正则表达式
        Matcher m = null;//操作的字符串
        boolean b =false;
        //定义IP地址的正则表达式
        p = Pattern.compile("\\d{1,3}+\\.\\d{1,3}+\\.\\d{1,3}+\\.\\d{1,3}");
        m = p.matcher("192.168.1.1");
        b = m.matches();
        System.out.println("IP正确： "+b);//输出： 结果
        p = Pattern.compile("\\d{1,3}+\\.\\d{1,3}+\\.\\d{1,3}");
        m = p.matcher("192.168.1.1234");//错误 应该是3位不应该是4位
        b = m.matches();
        System.out.println("IP错误："+b);//输出：false
    }
}
