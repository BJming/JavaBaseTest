package com.bjm.Chapter5.String;

/**
 * Created by bjming on 17-2-25.
 */
public class trim {
    public static void main(String[]args){
        String str="abc";
        String str1="  de   ";
        String str2="fgh";
        String str3=str+str1+str2;
        String str4=str+str1.trim()+str2;
        System.out.println(str3);
        System.out.println(str4);
    }
}
