package First_Program.Operators;

import java.util.Scanner;

public class FloatMultiplication {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("We are doing Float Multiplication:\n ");
        System.out.print("Enter your First Number: ");
        float firstNumber= input.nextFloat();
        System.out.println("Enter your Second Number");
        float secondNumber = input.nextFloat();
        float result = firstNumber * secondNumber;
        System.out.println("Result of both: " +result);
        // without taking the third variable we can directly print it.
       //System.out.println("Result of both: " +(firstNumber * secondNumber));
        //Instead of float we can take double data type as well.

    }
}
