package com.OOP.MethodOverriding;

public class Car extends Vehicle{

    @Override
    public void start(){

// if your parent class(Vehicle) defined itself as abstract class then you cant create
// object of your Vehicle class then how could you access its start method if such would
// be the case then and car class already define its parent class start method according
// its behaviour and don't want to take parent class default behaviour then used
// super key with method name, and it will execute your parent method.
        super.start();
        System.out.println("Car is starting");

    }

}
