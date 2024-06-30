package in.exceptionandfilehandling.exception;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Division Calculator....");
        System.out.println("Enter your first number: ");
        int num1= input.nextInt();
        System.out.println("Enter your second number: ");
        int num2 = input.nextInt();

        try{
        int result = num1/num2;
        System.out.printf("result is %d", result);
    }catch (ArithmeticException exception){
            System.out.println("Divide by Zero Enter valid Value....");
            System.out.printf("%s, enter valid values", exception.getMessage());
        }

    }
}

