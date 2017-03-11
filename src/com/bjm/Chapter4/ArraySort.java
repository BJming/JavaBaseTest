package com.bjm.Chapter4;

import java.util.Arrays;

/**
 * Created by bjming on 17-3-11.
 */
public class ArraySort {
    public static void main(String [] args){
        int [] a ={-2, 5, 3, -9, 45, 23, 8};
        System.out.println("排序前数组顺序：");
        for(int b : a) System.out.print(b+ "   ");
        System.out.println();
        Arrays.sort(a);
        System.out.println("排序后数组顺序：");
        for(int b : a) System.out.print(b+"   ");
    }
}
