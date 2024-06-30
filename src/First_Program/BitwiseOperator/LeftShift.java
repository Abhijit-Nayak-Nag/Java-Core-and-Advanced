package First_Program.BitwiseOperator;

import java.util.Scanner;

public class LeftShift {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to showcasing Left Shift Operator...\n");
        System.out.println("Please enter your number: ");
        int num = input.nextInt();
        int result = num << 4;
        System.out.println("Your result is: " + result);

    }
}


// it generally calculates the power of given number.
// example you have taken a number i.e. 4 then it will become 64 if you used "<<"

