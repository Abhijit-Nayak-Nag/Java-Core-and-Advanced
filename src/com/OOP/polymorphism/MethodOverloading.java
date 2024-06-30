package com.OOP.polymorphism;

public class MethodOverloading {



    // Constructor Overloading

// This is a non-parameterized constructor it says if you don't pass any value while
// creating your object I will return Default Constructor.
    MethodOverloading(){
        System.out.println("Default Constructor called.");
    }


// This is the parameterized constructor it says if you passed any string value while
// creating your object I will return that value to you. we used default constructor so
// that's why ide is saying no usage.
    MethodOverloading(String pop){
        System.out.println(pop);
    }


    public int add(int a, int b){
        return a + b;
    }

    public int add(int a, int b, int  c, int d){
        return a + b + c+ d;
    }

    public String add(String a, String b){
        return a + b;
    }
    public String add(String s1, String s2, String s3){
        return s1.concat(s2).concat(s3);
    }

    public static void main(String[] args) {
        MethodOverloading overloading= new MethodOverloading();
        int result= overloading.add(5,8);
//        System.out.println(overloading.add(9,result));
        System.out.println(result);

        int sum= overloading.add(3,4,5,6);
        System.out.println(sum);

 // if method declared as static, then you can call it using class name.methodName don't need to create an object.
//        System.out.println(MethodOverloading.sumFourNumbers(3,5,7,8));

        String concat= overloading.add("Hello" ," World");
        System.out.println(concat);
        System.out.println(overloading.add("Hii ", "Team"));

        System.out.println(overloading.add("Welcome ", "To ", "GL"));



    }
}
