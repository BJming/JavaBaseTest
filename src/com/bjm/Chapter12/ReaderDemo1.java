package com.bjm.Chapter12;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/**
 * Created by bjming on 17-3-9.
 */
//抽象类，java.io.Reader是所有字符输入流的父类，定义了以字符为单位读取数据的基本方法
//如果输入流的当前位置没有数据，返回-1
//如果出现错误，抛出IOException
//Reader方法：
//    public void mark(int readAheadLimit) 标记输入流的当前位置
//    public boolean markSupported()  测试输入流是否支持mark()语法       这两个方法可能是实现断点读写的关键
//
public class ReaderDemo1 {
    public static void main(String [] args)throws Exception{
        File f = new File("/home/bjming/java/hello.java");
        Reader input =null;
        input = new FileReader(f);
        char c[] =new char[1024];
        int len =input.read(c);
        input.close();
        System.out.println("内容为："+new String (c,0,len));
    }
}
