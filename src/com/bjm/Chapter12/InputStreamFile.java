package com.bjm.Chapter12;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

/**
 * Created by bjming on 17-3-6.
 */
public class InputStreamFile {
    public static void main(String [] args) throws  Exception{    //输出异常，不做处理
        //第一步，使用File类找到一个文件
        File f =new File("/home/bjming/java/hello.java");//声明File对象
        //第二步，通过子类实例化父类对象
        InputStream input = null;
        input = new FileInputStream(f);
        //第三部，进行读操作
        byte b[] = new byte[2014];
        int len = input.read(b);
        //第四步，关闭流
        input.close();

        System.out.println("读入的数组长度："+len);
        if(len>0){//防止文件内容为空，导致系统报错
            System.out.println("内容为："+ new String (b, 0, len));//把byte数组变为字符串输出
        }else {
            System.out.println("读取的文件内容长度为空！！！");
        }
    }
}
