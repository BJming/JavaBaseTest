package com.bjm.Chapter5.String;

/**
 * Created by bjming on 17-2-25.
 */
public class compareTo {
    public static void main(String[] args){
        String str="abcdefg";
        String str1="abck19o";
        String str2="abcdefg";
        System.out.println(str.compareTo(str1));
        System.out.println(str.compareTo(str2));
        System.out.println(str1.compareTo(str));
    }
}
