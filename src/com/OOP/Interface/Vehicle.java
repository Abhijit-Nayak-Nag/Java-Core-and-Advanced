package com.OOP.Interface;
public  abstract class Vehicle implements Transport {
    private int noOfTires;
    public abstract void makeStartSound();

//    public Vehicle(int noOfTires) {
//        this.noOfTires = noOfTires;
//
//    }
    public Vehicle() {
        noOfTires=9;

    }

    public int getNoOfTires() {
        return noOfTires;
    }

    public void setNoOfTires(int noOfTires) {
        this.noOfTires = noOfTires;
    }

    public void commute(){
        System.out.println("Going......");
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "noOfTires=" + noOfTires +
                '}';
    }

    @Override
    public void getSetGo() {
        System.out.println("Start.....................");

    }
}

