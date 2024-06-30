package com.OOP.Interface;

public class TestInterface {
    public static void main(String[] args) {
//        Car car= new Car(4);
        Car car= new Car();
        System.out.println(car);
        car.commute();
//        car.setNoOfTires(9);
        System.out.println(car.getNoOfTires());
        car.makeStartSound();
        car.getSetGo();


    }

}

