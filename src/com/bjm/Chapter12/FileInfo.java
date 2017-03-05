package com.bjm.Chapter12;

import java.io.File;

/**
 * Created by Administrator on 2017/3/5.
 */
public class FileInfo {
    public static void main(String [] args){
        File file =new File("I:\\java\\text1.txt");
        if(file.exists()){
            System.out.println("文件或目录是否存在："+file.exists());
            System.out.println("是文件吗"+file.isFile());
            System.out.println("是目录吗"+file.isDirectory());
            System.out.println("名称"+file.getName());
            System.out.println("路径"+file.getPath());
            System.out.println("绝对路径"+file.getAbsolutePath());
            System.out.println("最后修改时间"+file.lastModified());
            System.out.println("文件大小"+file.length());
        }else {
            System.out.println("文件或目录不存在"+file.getPath()+file.getName()+file.exists());
        }
    }
}
