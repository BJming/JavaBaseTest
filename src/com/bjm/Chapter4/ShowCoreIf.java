package com.bjm.Chapter4;

/**
 * Created by bjming on 17-3-11.
 */
public class ShowCoreIf {
    public static void main(String [] args){
        //两个if...else  的嵌套
        int math=95;//假设math为<0的整数
        if(math<60){//if进行判断
            System.out.println("数学成绩不及格");//输出结果
        }else {
            if(math>=60 && math <=80){
                System.out.println("数学成绩及格并且为量");//输出结果
            }else {
                System.out.println("数学成绩及格并且为优");//输出结果
            }
        }
    }
}
