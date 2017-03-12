package com.bjm.Chapter5.DateAndTime;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by bjming on 17-3-12.
 */
public class test {
    public static void main(String [] args){
        SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd");
        String now = date.format(new Date());
        System.out.println("now:"+now);
    }
}
