package com.bjm.Chapter5.StringBuffer;

/**
 * Created by bjming on 17-2-26.
 */
public class capacity {
    public static void main(String[]args){
        StringBuffer buffer = new StringBuffer("my name is");
        int size = buffer.capacity();//stringbuffer能容纳字符的数量
        int length = buffer.length();//stringbuffer已容纳字符的数量
        System.out.println(size);
        System.out.println(length);
    }
}
