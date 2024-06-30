package com.OOP.upcastingandDownCastingInObject;

public class Test {
    public static void main(String[] args) {
        Car c= new Car();
        Vehicle v= new Vehicle();


// Upcasting : when we assign child object inside the parent reference that is called upcasting.
        Vehicle vcar= new Car();

//  Down Casting : when we assign parent object inside child reference that is called
//  down casting, and it will show you an error.
//        Car cVechile = new Vehicle();

        //explicit down casting conversion...
        Car cVechile = (Car) new Vehicle();

    }

}
