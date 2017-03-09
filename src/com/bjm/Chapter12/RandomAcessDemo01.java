package com.bjm.Chapter12;

import java.io.File;
import java.io.RandomAccessFile;

/**
 * Created by bjming on 17-3-9.
 */
//RandomAccessFile类实例
public class RandomAcessDemo01 {
    public static void main(String [] args) throws Exception{//所有的异常直接抛出，程序中不再进行处理
//        指定要操作的文件
        File f = new File("/home/bjming/java/hell2_copy.txt");
//        声明RandomAccessFile类的对象
        RandomAccessFile rdf = null;
//        读写模式，如果文件不存在，会自动创建
        rdf = new RandomAccessFile(f, "rw");
        String name = null;
//        待完成中，今天先休息了...
        String age = null;
        name = "zhangsan";//字符串长度为8
        age = "31\n";//数字的长度为4
        rdf.writeBytes(name);//将姓名写入文件中国
        rdf.writeBytes(age);//将年龄写入文件之中

        name = "wangwu";//字符串长度为8
        age = "32\n";//数字的长度为4
        rdf.writeBytes(name);//将姓名写入文件之中
        rdf.writeBytes(age);//将年龄写入文件中
        rdf.seek(0);

        System.out.println(rdf.readLine());
        System.out.println(rdf.readLine());
//        System.out.println(rdf.readLine());
        rdf.close();//关闭流
    }
}
