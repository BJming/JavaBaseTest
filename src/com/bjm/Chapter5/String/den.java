package com.bjm.Chapter5.String;

/**
 * Created by bjming on 17-2-26.
 */
public class den {
    public static void main(String[] args){
        String str=new String("wang");
        String str1="wang";
        String str2=new String("wang");
        String str3="wa"+"ng";
        String s="ng";
        String str4="wa"+s;
        System.out.println(str.equals(str1));
        System.out.println(str.equals(str2));
        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));
        System.out.println(str1.equals(str4));
    }
}
