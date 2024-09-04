package com.OOP.Encapsulation;

import com.OOP.Encapsulation.Car;

public class CarTestAccessModifier {
    public static void main(String[] args) {
        Car car= new Car();
        car.color = "Red";
        car.model ="Swift";
        car.dateOfPurchase=2011;

        //Three-way to print the car object details:
        System.out.println(car); //if you are writing this use two-string method in your parent class.
        System.out.println(car.color);
//      System.out.println(car.getcolor()); // you can access by using getter method also.
        System.out.println(car.dateOfPurchase);


//      car.costOfPurchase= 5000; -- we cant access this property because it is defined as private
// only the Car class can access the property. and if you want to access it the private properties
// of class Car into another class i.e. CarTestAccessModifier then you need to generate the
// parameterized constructor inside your class Car, and now you can access the private properties of Car class.
    }
}
