package com.bjm.Chapter4;

/**
 * Created by bjming on 17-3-11.
 */
public class ShowContinue {
    public static void main(String [] args){
        //continue是跳过本次循环尚未执行的语句，重新开始新一轮的循环
        for(int i=0; i<10; i++){
            if(i % 2 == 0) continue;//当i能被2整除时执行continue语句
            System.out.println(i);//当i不能被2整除时执行输出语句
        }
    }
}
