package com.bjm.Chapter4;

import java.util.Scanner;

/**
 * Created by bjming on 17-3-11.
 */
public class dowhile {
    public static void main(String [] args){
//        do ... while实例 计算1～n的累加值
        int sum = 0;
        int i =1;
        System.out.println("请输入一个累加数:");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        do{
            sum=sum+i;
            i++;
        }while (i <= n);
        System.out.println("1到"+n+"的累加结果为"+sum);
    }
}
