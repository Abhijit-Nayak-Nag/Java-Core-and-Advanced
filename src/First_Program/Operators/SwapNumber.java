package First_Program.Operators;


import java.util.Scanner;

public class SwapNumber {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Welcome to the swapping of two number:\n ");
        System.out.println("Enter the value of A: ");
        int a =input.nextInt();
        System.out.println("Enter the value of B: ");
        int b = input.nextInt();
        int c = a;
        a=b;
        b=c;
        System.out.println("swapping Done");
        System.out.println("Value of A is: " +a);
        System.out.println("Value of B is :" +b);


    }
}

