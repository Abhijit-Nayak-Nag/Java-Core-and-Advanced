package Advanced_Java.MultiThreading;

import java.util.Scanner;

public class Cal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the calculator: ");
        System.out.println("Enter your first number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter your second number: ");
        int num2 = sc.nextInt();


        System.out.println("Enter your choice:\n" +
                "1.add\n" +
                "2.sub\n" +
                "3.mul\n" +
                "4.div");
      int command = sc.nextInt();

        if (command==1) {
            System.out.println(add(num1, num2));
        } else if (command==2) {
            System.out.println("result: " + sub(num1, num2));
        } else if (command==3) {
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

