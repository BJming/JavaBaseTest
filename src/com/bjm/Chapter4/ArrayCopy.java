package com.bjm.Chapter4;

/**
 * Created by bjming on 17-3-11.
 */
public class ArrayCopy {
    public static void main(String [] args){
        int a[]={1,2,3,4};
        int b[]={8,9,10,11,12};
        System.arraycopy(a, 0, b, 0,4);
        for(int c : a) System.out.print(c+" ");
        System.out.println();
        for(int c : b) System.out.print(c+" ");
    }
}
