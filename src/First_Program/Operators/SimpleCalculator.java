package First_Program.Operators;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Welcome to the Simple Calculator Program\n");
        System.out.print("Please First Number: ");
        int first = input.nextInt();
        System.out.print("Enter the Second Number: ");
        int second = input.nextInt();

        int add = first + second;
        int sub = first - second;
        int mul = first * second;
        int div = first / second;
        int mod = first % second;

        //System.out.println("Addition of first and second is :" +(first+second));
        // if we write this statement then we dont need secondary variable like;(add, sub, mul, and div, mod)
        System.out.println("Addition of first and second is :" +add);
        System.out.println("subtraction of first and second is :" +sub);
        System.out.println("multiplication of first and second is :" +mul);
        System.out.println("Division of first and second is :" +div);
        System.out.println("modules of first and second is " +mod);

    }


}
