package First_Program.Variable;

import java.util.Scanner;

public class Recursion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Factorial Generator");
        System.out.println("Please enter your number: ");
        int number = input.nextInt();
        long fact = factorial(number);
        System.out.println("Factorial of your number is :" + fact);

    }
    public static long factorial(int number){
        System.out.println("Function called for: " +number);
        if(number==1){
            return 1;
        }
        return number * factorial(number-1);
    }

}
