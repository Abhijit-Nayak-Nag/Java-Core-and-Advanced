package First_Program.User_Input;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sum =new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int firstNumber =sum.nextInt();
        System.out.println("Enter the second number: ");
        int secondNumber =sum.nextInt();
        //System.out.println("Result Of both");
        //int thirdNumber= firstNumber + secondNumber;
        //System.out.println(thirdNumber);
        //if we write code in this way it will take less memory, bcz we have'nt define third variable.
        System.out.println("Result of both :" +(firstNumber + secondNumber));
    }
}
