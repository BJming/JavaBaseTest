package com.bjm.Chapter5.StringBuffer;

/**
 * Created by bjming on 17-2-26.
public class replace {
    public static void main(String [] args){
        String str="my name is mr.wang";
        String str1=str.replace('a', 'A');//使用replace方法替换str的值并赋值给str

    }
}

 */
public class Buffer {
    public static void main(String [] args){
        StringBuffer str=new StringBuffer(10);
        str.append("abcdefg");
        System.out.println("字符串长度为"+str.length());
        str= new StringBuffer("abcdefghijklmnopqrstuvwxyz");
        System.out.println(str.capacity());
        System.out.println("字符串长度为"+str.length());
    }
}
