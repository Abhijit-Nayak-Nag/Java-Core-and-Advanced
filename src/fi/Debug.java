package fi;

import Advanced_Java.MultiThreading.S;
import Advanced_Java_April8.Exercise.Str;

public class Debug {
    int n;

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public static void main(String[] args) {
        int stops;
        int start ;
        String s = null;

        start=0;
        stops=0;

        start =start+1;
        stops=stops+5;

        s=s+"hello";

        System.out.println(start);
        System.out.println(stops);
        System.out.println(s);


    }
}
