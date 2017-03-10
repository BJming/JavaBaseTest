package com.bjm.Chapter4;

/**
 * Created by bjming on 17-3-11.
 */
public class ShowReturn {
    public static void main(String [] args){
//        ShowReturn 类中创建了一个Hello()方法（该方法返回一个字符串）,
//        在main()方法中创建了此类的wang对象，通过wang来调用Hello（）方法，输出方法的结果
        ShowReturn wang = new ShowReturn();
        System.out.println(wang.Hello());
    }

    public String Hello(){
        return "hello";
    }
}
