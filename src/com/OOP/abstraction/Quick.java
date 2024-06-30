package com.OOP.abstraction;

public class Quick {
    public static void main(String[] args) {
        String name ="abhi";
        String namee= "ddd";
        print(name);
        print("hello");

        System.out.println(printt(namee));
    }
    public static void print(String name){
        System.out.println(name);

    }
    public static String printt(String namee) {
        return namee;
    }

}
