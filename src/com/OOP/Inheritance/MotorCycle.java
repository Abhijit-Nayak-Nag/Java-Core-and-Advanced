package com.OOP.Inheritance;

public class MotorCycle extends TwoWheeler{
    public MotorCycle(){

        noOfTires=6;
    }


//    @Override
//    public String toString() {
//        return "MotorCycle{" +
//                "noOfTires=" + noOfTires +
//                '}';
//    }
    public void start(){
        System.out.println("Starting");
    }
}
