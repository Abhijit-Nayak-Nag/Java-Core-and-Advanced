package First_Program.Functions;

import java.util.Scanner;

public class ReturnType_1 {
    public static void main(String[] args) {
        //calling the function/method that we are creating below the main method. A program
        // has one main method and aside from this it can consist more than one any other method.
        //but make sure while calling the method call it on your main method because jvm is only
        //focus the code that has put inside the main method.
        greeting();
        readNumber();
        //System.out.println("Your Name is:" +readString());
        readString();

    }

    public static int readNumber() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your First Number :");
        int firstNumber = input.nextInt();
        System.out.println("Enter the Second Number: ");
        int secondNumber = input.nextInt();
        int sum = firstNumber + secondNumber;
        System.out.println("Result is :" + sum);
        return sum;
    }

    public static void greeting() {
        System.out.println("Welcome to the Calculator\n ");
    }

        public static String readString(){
        Scanner input=new Scanner(System.in);
        System.out.println("Please Enter Your Name: ");
        String str=input.nextLine();
        System.out.println("your name is: " +str);
        //return "Your Number is" +str;
        return str;
    }

}

