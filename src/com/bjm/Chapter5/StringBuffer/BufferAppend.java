package com.bjm.Chapter5.StringBuffer;

/**
 * Created by bjming on 17-2-26.
 */
public class BufferAppend {
    public static void main(String[]args){
        StringBuffer str1 = new StringBuffer("my name is ");//创建一个StringBUffer对象
        String str="Mr.Wang";
        str1.append(str);//想StringBuffer对象追加str字符串
        System.out.println(str1);//输出结果为”my name is Mr.Wang"
    }
}
