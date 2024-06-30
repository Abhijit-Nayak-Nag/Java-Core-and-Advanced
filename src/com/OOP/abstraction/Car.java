package com.OOP.abstraction;
public class Car extends Vehicle {


    // child class fulfill the abstract method responsibility of parent class. by defining the method.
    @Override
    public void makeStartSound() {
        System.out.println("Vroom............");
    }

    public Car(int noOfTires) {
        super(noOfTires);

    }

    @Override
    public void commute(){
        super.commute();
        System.out.println("not going");
    }

}



