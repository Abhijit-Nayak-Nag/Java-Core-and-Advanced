package First_Program.If_Else;

import Advanced_Java.MultiThreading.S;

import java.util.Scanner;

public class OddEvenChecker {
    public static void main(String[] args) {
//        Scanner input=new Scanner(System.in);
//        System.out.println("Welcome to Odd-Even Number Checker...");
//        System.out.println("Enter Your Number: ");
//        int num=input.nextInt();
//        if(num%2 == 0){
//            System.out.println("Your Number is Even...");
//        }else{
//            System.out.println("Your Number is Odd...");
//        }
        System.out.println(evenOdd(4));
        String s = evenOdd(6);
        System.out.println(s);
        evenOdd(7);

        greaterAndSmaller(3,4);
        System.out.println(greaterAndSmaller(3,4));

    }
    public static String evenOdd (int number){
        if (number%2==0){
            return "even";
        }
        else if(number%2!=0){
            return "odd";
        }
        else {
            return "please enter the valid number.";

        }

    }
    public static String greaterAndSmaller(int number1, int number2) {
        if (number1>number2){
            System.out.println("num1 is greater.....");
        }else {
            System.out.println("number 2 is greater....");

        }
        return "invalid operation";

    }

 }

