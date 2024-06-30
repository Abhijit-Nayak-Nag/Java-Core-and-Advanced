package com.OOP.nested;

public class StaticNestedCar {
    static class StaticNested{
        void display(){
            System.out.println("static nested class method");
        }
    }

    public static void main(String[] args) {
        StaticNestedCar.StaticNested nested= new StaticNestedCar.StaticNested();
        nested.display();

        //Alternative way of accessing
//        StaticNested nested= new StaticNested();
//        nested.display();

// if your display method was static then you can directly call them using classname with (.)
// methodname no need to create an object for it.
//       -- StaticNested.display();
 //Output: static nested class method

    }

}
