package com.bjm.Chapter12;

import java.io.File;
import java.io.FileWriter;
import java.io.Writer;

/**
 * Created by bjming on 17-3-9.
 */
//抽象类 java.io.Writer 是所有字符输出留的父类，定义了以字符为单位写数据的基本方法
//在I/O错误时抛出IOException
//    注意方法：
//        public void write(int c) 向输出流中写一个字符，实际是将int 型的c 的低16位写入输出流
//        public void flush() 刷新输出流
//        public void write(char [] cbuf 将字符数组cbuf中的字符写入输出流
//        public void write(String str, int off, int len) 把字符串str从off开始的len个字符写入输出流中
//
public class WriteDemo2 {
    public static void main(String [] args) throws Exception{
//        第一步，使用file类找到一个文件
        File f = new File("/home/bjming/java/hello2.txt");//声明File对象
//        第二步，通过子类实例化父类
        Writer out = null;//准备好一个输出对象
        out = new FileWriter(f, true);//通过对象多态性，进行实例化
//        第三步，进行写操作
        String str ="在我心中，最强不过intelliJ.今天就写到这里，明天见";//准备一个字符串  ps：多次运行，发现writer只管写，不覆盖写入前的初始数据
        out.write(str);//将内容输出，保存文件
//        第四步，关闭输出流
        out.close();//关闭输出流
    }
}
