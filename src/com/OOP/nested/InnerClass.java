package com.OOP.nested;

class Outer {
    private int outerVar= 10;
    public class Inner{
        void display(){
            System.out.println("Inner Class method: " +outerVar);
        }
    }

    public static void main(String[] args) {
        Outer outer= new Outer();
        Outer.Inner inner= outer.new Inner();
        inner.display();
        // set the new value.
        outer.outerVar=12;
        inner.display();
    }


}