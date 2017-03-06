package com.bjm.Chapter12;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

/**
 * Created by bjming on 17-3-6.
 */
public class OutputSteamFile {
    public static void main(String [] args) throws  Exception{
//        第一步，使用File类找到一个文件
        File f =new File("/home/bjming/java/hello.java");
//        第二步，通过子类实例化父类对象
        OutputStream out =null;
        out = new FileOutputStream(f);
//        第三步，进行写操作
        String str ="昨天刚做了一个简单的java程序";
        byte b[] = str.getBytes();//只能输出byte数组，所以将字符串变为byte数组
        out.write(b);//将内容输出，保存文件
//        第四步，关闭输出流
        out.close();//

    }
}
