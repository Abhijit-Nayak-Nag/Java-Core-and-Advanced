package com.OOP.polymorphism;

public class Child extends Parent{
    String message= "Hello from Child class ";

    void displayMessage(){
        System.out.println(super.message);
        System.out.println(message);
        super.displayMessage();
    }

}
