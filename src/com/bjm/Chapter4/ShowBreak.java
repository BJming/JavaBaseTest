package com.bjm.Chapter4;

/**
 * Created by bjming on 17-3-11.
 */
public class ShowBreak {
    public static void main(String [] args){
        int i = 1;
        while(i<10){
            System.out.println("i的值为:"+i);
            i++;//如果i++这个条件不添加，将变成死循环
            if(i == 6) break;
        }
    }
}
