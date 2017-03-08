package com.bjm.Chapter12;

import java.io.InputStream;

/**
 * Created by bjming on 17-3-8.
 */
//计算机系统有标准输入设备和标准输出设备.对一般的系统而言，标准输入设备通常是键盘，而标准输出设备是屏幕。
//因此，java语言事先定义好了两个对象，分别为系统的标准输入和标准输出相联系，System.in，System.out,另外还定义了标准的System.err错误输出流
//    System.in 是标准输入流，是InputStream的实例，可以使用read()方法从键盘上读取字节，也可以将它包装成数据流读取这种类型的数据和字符串。
//在使用System.in的read()方法时，由于read()方法定义时抛出IOException异常，必须使用try...catch结构捕获异常或声明抛出异常。
public class SystemIN {
    public static void main(String [] args) throws Exception{//异常抛出，不处理
        //所有异常输出
        InputStream input =System.in;//从键盘接收数据
        byte b[] = new byte[10];//开辟空间，接受数据
        System.out.println("请输入内容：");//提示信息
        int len = input.read(b);//接收信息
        System.out.println("输入的内容为：　"+ new String (b, 0, len));//输出接收的信息
        input.close();//关闭流
    }
}
