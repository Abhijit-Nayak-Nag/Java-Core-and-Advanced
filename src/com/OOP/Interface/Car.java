package com.OOP.Interface;

public class Car extends Vehicle   {
//    public Car(int noOfTires) {
//        super(noOfTires);
//    }


    public Car() {
        setNoOfTires(4);
    }

    @Override
    public void makeStartSound() {
        System.out.println("Vroom........");

    }

}
