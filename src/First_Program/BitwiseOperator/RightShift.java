package First_Program.BitwiseOperator;

import java.util.Scanner;

public class RightShift {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to showcasing Right Shift Operator...\n");
        System.out.println("Please enter your number: ");
        int num = input.nextInt();
        int result = num >> 1;
        System.out.println("Your result is: " + result);

    }
}

// it basically divides the number by 2.
//example if you take the number 10 then it will divide by 2, and you will get 5.
//if you take 7 then you will get 3 because 7/2= 3.5 but float point gets omits and 3 remains.