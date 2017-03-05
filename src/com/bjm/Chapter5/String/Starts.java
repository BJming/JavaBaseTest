package com.bjm.Chapter5.String;

/**
 * Created by bjming on 17-2-25.
 */
public class Starts {
    public static void main(String[]args){
        String str="wangfdsklafjdsf.doc";//定义字符串并赋值
        boolean s=str.startsWith("wang");//判断str是否以字符串”wang“开头
        boolean s1=str.startsWith("xiao");
        boolean x=str.endsWith(".doc");//判断str是否是以字符串“.doc”结尾
        boolean x1=str.endsWith(".txt");
        System.out.println(s);
        System.out.println(s1);
        System.out.println(x);
        System.out.println(x1);
    }
}
