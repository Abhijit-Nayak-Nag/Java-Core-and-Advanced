package com.OOP.Inheritance;

public class TwoWheeler extends Vehicle {
    public static void main(String[] args) {
        TwoWheeler two= new TwoWheeler();
        two.noOfTires=9;
        two.commute();
//        two.balance();
    }

// here we are not making the object of Vehicle class to used its properties because here we extend
// the TwoWheeler class from vehicle that means all properties and methods of vehicle class now
// available in TwoWheelerClass so by creating object of TwoWheeler Class we can use the properties
// and methods of Vehicle class. because we have extended the class into our TwoWheeler class.

//    public TwoWheeler() {
//        noOfTires=2;
//    }

    // additional method added by TwoWheeler
    public void balance(){
        System.out.println("Balance is important while driving the Two wheeler");
    }

}
