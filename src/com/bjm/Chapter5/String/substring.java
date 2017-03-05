package com.bjm.Chapter5.String;

/**
 * Created by bjming on 17-2-25.
 */
public class substring {
    public static void main(String[]args){
        String str="onetwothreefour";
        String str1=null;
        String str2=null;
        str1=str.substring(6);//[6,length-1)
        str2=str.substring(2,8);//[2,8);
        System.out.println(str1);
        System.out.println(str2);
    }
}
