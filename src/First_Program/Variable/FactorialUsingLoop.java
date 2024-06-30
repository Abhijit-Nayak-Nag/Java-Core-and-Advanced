package First_Program.Variable;

import java.util.Scanner;

public class FactorialUsingLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Factorial Generator");
        System.out.println("Please enter your number: ");
        int number = input.nextInt();
        long fact = factorialIterator(number);
        System.out.println("Factorial of your number is :" + fact);

    }

     public static long factorialIterator(int number) {
        long result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }
}
