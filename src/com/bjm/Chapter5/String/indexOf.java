package com.bjm.Chapter5.String;

/**
 * Created by bjming on 17-2-25.
 */
public class indexOf {
    public static void main(String[]args){
        String str="onetwothreefour";
        int a=str.indexOf("e");
        int b=str.indexOf("e", 4);
        int c=str.indexOf("e", 12);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
