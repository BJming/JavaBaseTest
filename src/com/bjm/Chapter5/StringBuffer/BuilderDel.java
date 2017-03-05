package com.bjm.Chapter5.StringBuffer;

/**
 * Created by bjming on 17-2-26.
 */
public class BuilderDel {
    public static void main(String [] args){
        String str="";
        StringBuffer s = new StringBuffer();
        long startTime, endTime;
        System.out.println("请等待......");
        //开始字符串操作
        startTime=System.currentTimeMillis();
        for (int i=0;i< 10000; i++)
            str=str+i;
        endTime=System.currentTimeMillis();
        System.out.println("String消耗时间： "+(endTime - startTime));
        //开始StringBuilder操作
        startTime=System.currentTimeMillis();
        for (int i =0;i<10000;i++)
            s.toString();
        endTime=System.currentTimeMillis();
        System.out.println("StringBuilder消耗时间： "+(endTime-startTime));
    }
}
