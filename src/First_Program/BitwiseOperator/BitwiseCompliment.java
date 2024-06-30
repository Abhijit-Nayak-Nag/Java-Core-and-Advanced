package First_Program.BitwiseOperator;

import java.util.Scanner;

public class BitwiseCompliment {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Welcome to showcasing Not/Compliment Operator...\n");
        System.out.println("Please enter your number: ");
        int num= input.nextInt();
        int result=~num;
        System.out.println("Your result is: " +result);

    }
}

