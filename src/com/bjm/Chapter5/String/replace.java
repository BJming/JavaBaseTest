package com.bjm.Chapter5.String;

/**
 * Created by bjming on 17-2-25.
 */
public class replace {
    public static void main(String [] args){
        String str="my name is mr.wang";
        String str1=str.replace('a', 'A');//使用replace方法替换str的值并赋值给str
        String str2=str.replace("w", "ao");
        System.out.println(str1);
        System.out.println(str2);
    }
}
