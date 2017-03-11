package com.bjm.Chapter4;

/**
 * Created by bjming on 17-3-11.
 */
public class TwoArray {
    public static void main(String [] args){
        String [][] books = new String [4][2];
        books[0] = new String []{"三国演义", "罗贯中"};
        books[1] = new String []{"西游记", "吴承恩"};
        books[2] = new String []{"水浒传", "施耐庵"};
        books[3] = new String []{"红楼梦", "曹雪芹"};

        for(int i = 0; i< books.length;i++){
            for(int j = 0; j<books[i].length; j++){
                System.out.print(books[i][j]+"  ");
            }
            System.out.println();
        }
    }
}
