package com.OOP.Inheritance;

public class Vehicle {
    public int noOfTires;

    public Vehicle() {
        noOfTires=5;
    }


    public void commute(){
        System.out.printf("I am going from Place A to Place B using %d tires\n", noOfTires);

    }
}
