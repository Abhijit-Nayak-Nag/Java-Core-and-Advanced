package First_Program.If_Else;

import java.sql.SQLOutput;
import java.util.Scanner;

public class GreatestOfThreeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Greatest Of Three Number....");
        System.out.println("Enter Your First Number: ");
        int num1=input.nextInt();
        System.out.println("Enter Your Second Number: ");
        int num2 = input.nextInt();
        System.out.println("Enter Your Third Number: ");
        int num3= input.nextInt();
        if(num1>=num2 && num1>=num3){
            System.out.println(num1 + " is the Greatest number...");
        }else if(num2>=num1 && num2>=num3){
            System.out.println(num2 + "is the Greatest number..");
        }else{
            System.out.println(num3 + "is the Greatest number..");
        }
    }
}
