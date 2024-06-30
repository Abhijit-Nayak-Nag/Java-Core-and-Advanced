package com.OOP.Interface;

public class TestCalculator {
    public static void main(String[] args) {
        SimpleCalculator sim= new SimpleCalculator();
        System.out.println(sim.add(2,4));
        System.out.println(Calculator.multiply(2,4));
    }
}
