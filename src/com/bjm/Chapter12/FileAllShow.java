package com.bjm.Chapter12;

import java.io.File;
import java.util.ArrayList;

/**
 * Created by Administrator on 2017/3/5.
 */
public class FileAllShow {
    public static void print(File file){
        if(file !=null){
            if(file.isDirectory()){
                File f [] = file.listFiles();
                if(f != null){
                    for(int i = 0; i< f.length; i++){
                        //因为给的路径可能是目录，所以继续判断
                        print(f[i]);
                    }
                }
            }else {
                System.out.println(file);//输出路径
            }
        }
    }
    public static void main(String [] args){
//        String sep = System.getProperty("file.separator");  windows系统上 sep 为 \ (反斜杠)unix系统上 为 /（正斜杠）
//        System.out.println(sep);
        File my = new File("L:\\ITbook");
        print(my);
    }
}