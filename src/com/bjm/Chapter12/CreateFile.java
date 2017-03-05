package com.bjm.Chapter12;

import java.io.File;
import java.io.IOException;

/**
 * Created by Administrator on 2017/3/5.
 */
public class CreateFile {
    public static void main(String [] args){
//        File f = new File("I:\\test.txt");
//        try{
//            f.createNewFile();
//        }catch (IOException e){
//            e.printStackTrace();
//        }
        File a1, a2, a3, a4;
//        java.io.IOException: 文件名、目录名或卷标语法不正确。 如果 File 对象中（路径， 文件名） 路径必须存在，否则会报这个错误
        a1 = new File("I:\\java");//创建一个表示路径的File对象
        a2 = new File("I:\\java2\\text2.txt");//创建一个表示文件的File对象
        a3 = new File("I:\\java3", "text3.txt");//创建一个指定I:\\java3目录和text3.txt文件的File对象
        a4 = new File(a1, "text1.txt");//创建一个指定a1目录和text1.txt的File对象
        try {
            a1.createNewFile();
            a2.createNewFile();
            a3.createNewFile();
            a4.createNewFile();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
