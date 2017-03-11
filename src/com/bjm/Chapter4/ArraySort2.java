package com.bjm.Chapter4;

import java.util.Arrays;

/**
 * Created by bjming on 17-3-11.
 */
public class ArraySort2 {
    public static void main(String [] args){
        int[] a={-2, 5,3,-9,45,23,8};
        Arrays.sort(a);
        for( int b : a) System.out.print(b+ " ");
        System.out.println();
        int index1=Arrays.binarySearch(a, 5);
        System.out.println("5在数组中的位置是 "+index1);
    }
}
