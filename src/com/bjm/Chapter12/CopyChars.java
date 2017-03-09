package com.bjm.Chapter12;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by bjming on 17-3-9.
 */
//FileReader&&FileWriter应用实例
//    FileReader 是文件输入流，FileWriter是文件输出流 当操作的文件中的数据是字符数据时，推荐使用这两个类。
//    FileReader继承了InputStreamReader的构造方法
//          public FileReader(String fileName)//用字符串表示的文件构造一个文件输入流对象
//          public FileReader(File file)//用File对象表示的文件构造一个文件输入流对象
//    FileWriter继承了OutputStreamWriter构造方法
//          public FileWriter(String fileName)
//          public FileWriter(File file)
//          public FileWriter(File file, boolean append)  append 就是文件写时是否扩展
public class CopyChars {
    public static void main(String [] args) throws IOException {
//        使用File类找到一个文件，如果没有就创建该文件
        File inputFile = new File("/home/bjming/java/hello2.txt");
        File outputFile = new File("/home/bjming/java/hello2_copy.txt");
//        创建文件输入流和输出流对象
        FileReader in = new FileReader(inputFile);
        FileWriter out = new FileWriter(outputFile, true);
        int c;
//        从 hello2.txt 文件中读取文件到 hello2_copy.txt文件中
        while((c= in.read()) != -1)
            out.write(c);
        in.close();//关闭输入流
        out.close();//关闭输出流
    }
}
