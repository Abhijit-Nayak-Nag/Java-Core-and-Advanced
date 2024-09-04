package com.OOP.inheritanceImportantConcept;

public class Car extends Vehicle {
    public Car(int noOfTires) {
        super(noOfTires);
    }
    public static void main(String[] args) {
        Car car = new Car(9);
        System.out.println(car);
// using getter and setter you can access the private properties of your parent class as well.
        car.setNoOfTires(9);
        System.out.println("No of tyres: " +car.getNoOfTires());
        car.commute();

        System.out.println();

        System.out.println(car.noOfTires=5);
        car.commute();

        System.out.println();

        car.noOfTires= 4;
        System.out.println(car.noOfTires);
        car.commute();

        System.out.println();

        car.name="Suzuki Swift";
        System.out.println(car.name);
        String str= car.name = "Toyota";
        System.out.println(str);
        System.out.println(car.name);
        System.out.println(car.name="Toyota");


    }


}
/*
in Inheritance this approach always remember.
In summary, we can say that if any properties in your parent class declare as private, then
you can access it in your child class by initializing public parameterized constructor
in your parent class else one more approach is by using getter setter you can access it.

if it is normal two classes then you can directly initialize parameterized constructor,and you can
 access the private properties of that class else using getter setter method you can access it.
 */