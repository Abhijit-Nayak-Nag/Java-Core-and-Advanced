package com.OOP.abstraction;

public class TestAbstraction {
    public static void main(String[] args) {
//      Vehicle vehicle= new Vehicle(); -- Vehicle class is abstract so we cant create its object
// but still we are able to use its method by creating the object of its subclass i.e. Car
        Car car= new Car(4);
        System.out.println(car);
        car.commute();
        car.setNoOfTires(9);
        System.out.println(car.getNoOfTires());
        car.makeStartSound();
        
    }
}
