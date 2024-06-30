package Advanced_Java.MultiThreading;

import java.util.Scanner;

import static Classes_Objects.StringClass.Calculator.*;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the calculator: ");
        System.out.println("Enter your first number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter your second number: ");
        int num2 = sc.nextInt();

        sc.nextLine();

        System.out.println("Enter your choice:\n" +
                    "add\n" +
                    "sub\n" +
                    "mul\n" +
                    "div");
        String command = sc.nextLine().trim().toLowerCase();

            if (command.equals("add")) {
                System.out.println(add(num1, num2));
            } else if (command.equals("sub")) {
                System.out.println("result: " + sub(num1, num2));
            } else if (command.equals("mul")) {
                System.out.println(mul(num1, num2));
            } else {
                System.out.println(num1 / num2);

            }
    }

        public static int add ( int n1, int n2){
            return n1 + n2;
        }

        public static int sub ( int n1, int n2){
            return n1 + n2;
        }
        public static int mul ( int n1, int n2){
            return n1 * n2;
        }


}
