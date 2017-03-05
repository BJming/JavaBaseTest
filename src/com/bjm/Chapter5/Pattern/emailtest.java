package com.bjm.Chapter5.Pattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by bjming on 17-2-26.
 */
public class emailtest {
    public static void main(String [] args){
        Pattern p = null;//正则表达式
        Matcher m = null;
        boolean b = false;
        //正则表达式表示邮箱号码
        p = Pattern.compile("\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*");
        m = p.matcher("user@test.com");
        b = m.matches();
        System.out.println("email号码正确： "+b);//输出结果
        p = Pattern.compile("\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*");
        m = p.matcher("user.test.com");
        b = m.matches();
        System.out.println("email号码错误： "+b);//输出结果
    }
}
