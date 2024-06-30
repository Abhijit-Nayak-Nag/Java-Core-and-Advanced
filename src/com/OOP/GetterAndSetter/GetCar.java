package com.OOP.GetterAndSetter;

import com.OOP.GetterAndSetter.Car;

public class GetCar {
    public static void main(String[] args) {
        // using constructor, getter and setter method is not required. but you need if you want
        // you can keep it if you won't then use twoString method for printing the value of the object.
       Car car= new Car("Red", "Maruti", 3, 4000);
        System.out.println(car);
        System.out.printf("%s %s" , car.getColor(), car.getModel());
        System.out.println("\n" + car.getColor());


//        String s= "'Rahul'";
//        String t="Tom";
//        System.out.println(s + ": " + t);

       // using getter setter method constructor is not required.
//        Car car= new Car();
//        car.setModel("Swift");
//        car.setColor("Blue");
//        System.out.printf("%s %s" , car.getColor(), car.getModel());

//        System.out.println(car.getColor() + " " + car.getModel());
    }
}
