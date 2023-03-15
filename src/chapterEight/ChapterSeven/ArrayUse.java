package chapterEight.ChapterSeven;

import java.lang.reflect.Array;

public class ArrayUse {
    public static void main(String[] args) {
        int [] num;
        int total =0;
        num= new int[5];
        num[0]= 5;
        num[1]= 7;
        num[2]= 5;
        num[3]= 9;
        num[4]= 4;
        for(int i =0; i< num.length; i++){
             total += num[i] ;
            System.out.println(total);
            System.out.println(num[i]);
        }
//        System.out.println(num[2]+ num [3]);
//        System.out.println(num[1] -num [3]);




        ;



    }
}
