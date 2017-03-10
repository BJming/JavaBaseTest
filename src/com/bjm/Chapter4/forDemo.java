package com.bjm.Chapter4;

/**
 * Created by bjming on 17-3-11.
 */
public class forDemo {
    public static void main(String [] args){
        System.out.println("1-100之间被13整除的整数有:");
        for(int i=1;i<100;i++){
            if(i % 13 == 0){//判断i能否被13整除
                System.out.print(i+"\t");
            }
        }
    }
}
