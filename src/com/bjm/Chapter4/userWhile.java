package com.bjm.Chapter4;

/**
 * Created by bjming on 17-3-11.
 */
public class userWhile {
    public static void main(String [] args){
//        while 循环计算10的阶乘
        int i = 1;
        int n = 1;
        while(i<=10){//while(i<10)时是 10-1 的阶乘结果
            n=n*i;
            i++;
        }
        System.out.println("10的阶乘结果是"+n);
    }
}
