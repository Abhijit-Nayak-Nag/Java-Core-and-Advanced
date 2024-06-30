package com.OOP.abstraction;

public abstract class Vehicle {
   private int noOfTires;

    //abstract method -- if we define a normal method then its child class can directly access it
    // after extends its parent class but here we are not defining the actual definition of the
    // method so what will happen here the child class needs to define the definition of the method
    // for accessing the method. and that is called abstract method.
    public abstract void makeStartSound();

    public Vehicle(int noOfTires) {
        this.noOfTires = noOfTires;
    }



    public int getNoOfTires() {
        return noOfTires;
    }

    public void setNoOfTires(int noOfTires) {
        this.noOfTires = noOfTires;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "noOfTires=" + noOfTires +
                '}';
    }

    public void commute(){
        System.out.println("Going......");
    }
}
