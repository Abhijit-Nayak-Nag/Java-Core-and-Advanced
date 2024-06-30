package First_Program.BitwiseOperator;

import java.util.Scanner;

public class BitwiseXOR {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Showcasing Bitwise XOR....\n");
        System.out.println("Enter your First Number: ");
        int firstNumber= input.nextInt();
        System.out.println("Enter Your Second Number: ");
        int secondNumber=input.nextInt();
        int result= firstNumber ^ secondNumber;
        System.out.println("Result " +result);
    }
}

// "^" - it says 0+0=0, and 1+1=0, else 1.