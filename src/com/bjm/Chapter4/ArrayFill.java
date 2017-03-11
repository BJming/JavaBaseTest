package com.bjm.Chapter4;

import java.util.Arrays;

/**
 * Created by bjming on 17-3-11.
 */
public class ArrayFill {
    public static void main(String [] args){
        String[] a={"a", "b", "c", "d", "e"};//数组a
        Arrays.fill(a, "f");//Arrays.fill(array_name, value)替换数组所有元素
        for(int i=0;i<a.length;i++)
            System.out.print(a[i]+"  ");
        System.out.println();
        String [] b={"a", "b", "c", "d","e"};
        Arrays.fill(b,0,3,"s");//Arrays.fill(array_name, int fromIndex, int toIndex, value)替换数组指定范围内的元素
        for(String str:b){
            System.out.print(str+"  ");
        }
    }
}
