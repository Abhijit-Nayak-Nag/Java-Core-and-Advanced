package com.OOP.inheritanceImportantConcept;

public class Vehicle {
    public int noOfTires;

    public Vehicle(){
        noOfTires=5;
    }


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
        System.out.printf("I am going from place  A to place B using %d", noOfTires);
    }
}
