package Advanced_Java_April8.Exercise;

import java.util.Scanner;

public class SC {
    static int a=9;
    public static void main(String[] args) {
        String s= "hello";
        String s1= "Hii";
        String temp= null;


        temp= s;
        s=s1;
        s1=temp;
        System.out.println(s + " " +s1);
        System.out.println(a);
    }
}
