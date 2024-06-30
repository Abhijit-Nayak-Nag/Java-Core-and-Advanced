package com.OOP.Inheritance;

public class InheritanceTest {
    public static void main(String[] args) {
        Vehicle vehicle= new Vehicle();
        vehicle.commute();
        // vehicle class has no parent so for that reason object classes treated as its parent class.
        // and by default vehicle class will get some method that already available in the object class
        // predefined method i.e. twoString(), hashcode() etc.
        System.out.println(vehicle.hashCode());
        System.out.println(vehicle.toString());
        System.out.println(vehicle.getClass());

        TwoWheeler two= new TwoWheeler();
        two.commute();
        MotorCycle moto=new MotorCycle();
        //grand Parent Properties --(Vehicle)
        moto.commute();
        // Parent properties  (Two Wheeler)
        moto.balance();
        // MotorCycle own Properties
        moto.start();


//
//        moto.noOfTires=9;
////        --you can set the value and print that value using twoString() Method.
//        System.out.println(moto);

    }
}
