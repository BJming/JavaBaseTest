package com.bjm.Chapter5.String;

/**
 * Created by bjming on 17-2-25.
 */
public class lastIndexOf {
    public static void main(String[]args){
        String str="onetwothreefour";
        int a=str.lastIndexOf("o");
        int b=str.lastIndexOf("o", 4);
        int c=str.lastIndexOf("o", 12);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
