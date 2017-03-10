package com.bjm.Chapter4;

import java.util.Scanner;

/**
 * Created by bjming on 17-3-11.
 */
public class ToSwitch {
    public static void main(String [] args){
        //Switch实例
        System.out.print("计算当月的天数，请输入1-12的整形数字：\n");
        Scanner input = new Scanner(System.in);//声明输入变量
        int month = input.nextInt();
        switch (month){
            case 1:
                System.out.println(month+"月共31天");
                break;
            case 2:
                System.out.println(month+"月共28天或29天");
                break;
            case 3:
                System.out.println(month+"月共31天");
                break;
            case 4:
                System.out.println(month+"月共30天");
                break;
            case 5:
                System.out.println(month+"月共31天");
                break;
            case 6:
                System.out.println(month+"月共30天");
                break;
            case 7:
                System.out.println(month+"月共31天");
                break;
            case 8:
                System.out.println(month+"月共31天");
                break;
            case 9:
                System.out.println(month+"月共30天");
                break;
            case 10:
                System.out.println(month+"月共31天");
                break;
            case 11:
                System.out.println(month+"月共30天");
                break;
            case 12:
                System.out.println(month+"月共31天");
                break;
            default:
                System.out.println("您输入的不是1-12的整形数字");
                break;
        }
    }
}
