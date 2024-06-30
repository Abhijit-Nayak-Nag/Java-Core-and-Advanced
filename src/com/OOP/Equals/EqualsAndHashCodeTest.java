package com.OOP.Equals;

public class EqualsAndHashCodeTest {
    public static void main(String[] args) {
        Person person1= new Person("Abhijit", 22, "1901227353");
        Person person2= new Person("Abhijit", 22, "1901227353");
        Person person3= new Person("Abhijit", 30, "1901227353");

//        if(person1==person2){
//            System.out.println("Equals");
//        }else{
//            System.out.println("Not equals");
//        }
        System.out.println(person1.equals(person2));
        System.out.println(person1.equals(person3));
        System.out.println(person1==person2);


    }
}
