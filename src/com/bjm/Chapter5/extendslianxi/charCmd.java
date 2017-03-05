package com.bjm.Chapter5.extendslianxi;

/**
 * Created by bjming on 17-2-28.
 */
public class charCmd {
    public static void main(String[]args){
        //初始化两个字符数组C1和C2
        char [] c1={'I', 'a', 'm', 'a', 'b', 'o', 'y'};
        char [] c2={'h', 'e', 'i', 's', 'a', 'b', 'b', 'y'};
        //利用这两个字符数组构造两个字符串对象x 和 y,并将其输出
        String x =new String(c1);
        String y =new String(c2);
        System.out.println(c1);
        System.out.println(c2);
        //将字符串x构建成一个缓冲字符串对象temp
        StringBuffer temp = new StringBuffer();
        temp.append(x);
        temp.append(y);//使用append()方法将y与x连在一起，并将其输出
        System.out.println(temp);
        //提取某个charAt()方法位置上的元素
        temp.setCharAt(0, 'y');
        temp.insert(1,'o');
        temp.insert(2, 'u');
        System.out.println(temp.substring(0,7));
        //使用reverse()方法将字符串倒置，并且将之输出
        temp.reverse();
        System.out.println(temp);
    }
}
