package com.bjm.Chapter5.String;

/**
 * Created by bjming on 17-2-25.
 */
public class split {
    public static void main(String[] args){
        String str="1,2,3,4,5,6,7,8,9";
        String [] a=str.split(",");//不限制字符串
        String [] b=str.split(",", 4);//限制字符串个数为4个
        for(String temp:a) System.out.print(temp+"  ");//输出数组a中的元素
        System.out.println();//换行
        for (String temp:b){
            System.out.print(temp+"  ");
        }
    }
}
