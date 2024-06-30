package First_Program.Operators;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Welcome to Compound Interest Calculator: \n ");
        System.out.println("Please enter your principle amount in Rupees : ");
        int principle= input.nextInt();
        System.out.println("Tell me your rate of interest :");
        float rate=input.nextFloat();
        System.out.println("Now, Tell me for how many years are you borrowing this money: ");
        float years = input.nextFloat();

        double comInt = principle * Math.pow((1 + rate/100),years);
        System.out.println("Your compound interest is Rs:" + " " +comInt);


    }


}
