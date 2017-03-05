package com.bjm.Chapter5.StringBuffer;

/**
 * Created by bjming on 17-2-26.
 */
public class BufferDel {
    public static void main(String[]args){
        String temp = ",World";
        StringBuffer buffer = new StringBuffer("Hello!");
        System.out.println(buffer);
        buffer.insert(5, temp);//把字符串temp插入到感叹号前面
        System.out.println(buffer);
        buffer.delete(0,3);//删除前3个字符串
        System.out.println(buffer);
        StringBuffer resultBuffer = buffer.reverse();
        System.out.println(resultBuffer);
    }
}
