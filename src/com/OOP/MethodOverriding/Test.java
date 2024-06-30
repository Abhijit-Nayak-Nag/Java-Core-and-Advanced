package com.OOP.MethodOverriding;

public class Test {
//    int numOfTires;
//    public Test(int numOfTires){
//        System.out.println(" no of Tires: " +numOfTires);
//    }

//    public Test(){
//        numOfTires=4;
//    }

    public static void main(String[] args) {
        Car car = new Car();
        Plane plane= new Plane();
        car.start();
        plane.start();
        System.out.println(car.getClass());

        //Getting Fully qualified class name alternative way.
//        Class<?> clazz= Car.class;
//        System.out.println(clazz.getName());
//
        Object object = new Object();
        System.out.println(object.getClass());




//        Test test= new Test();
//        System.out.println(test.numOfTires=8);

        }

    }














