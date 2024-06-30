package First_Program.If_Else;

import java.util.Scanner;

public class AgeFinder {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Welcome to Age Finder...");
        System.out.println("Please Enter Your Age: ");
        int age = input.nextInt();
        if (age>=65){
            System.out.println("You are a Senior Citizen");
        }else if (age>=20){
            System.out.println("Your are an adult...");
        }else if (age>=13){
            System.out.println("you are a teenager");
        }else{
            System.out.println("You are a Child..");
        }
    }
}
