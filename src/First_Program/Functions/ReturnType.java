package First_Program.Functions;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class ReturnType {
    public static void main(String[] args) {
        //now we dont need this input because we have already created a specific  method
        //for taking input.

        //Scanner input=new Scanner(System.in);
        //System.out.println("Welcome to Calculator\n");
        //System.out.println("Please enter the number: ");
        //int first= input.nextInt();
        //System.out.println("please enter the number: ");
        //int second = input.nextInt();
        //int sum=first+second;
        //System.out.println("Sum of the number is :  " + sum);

        greet();
        int first = readNumber();
        int second = readNumber();

        int sum = first + second;
        System.out.println("Sum of the number is :  " + sum);

    }


//   readNumber();


    //here we are creating a method that take input from user, and methods name is "readNumber"
    //when ever we want any input we can call this method in our main method so we dont need
    //to take scanner class again and  again for taking input to user.


    public static int readNumber(){
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter the number: ");
        int number1= input.nextInt();
        return number1;
    }
    public static void greet() {
        System.out.println("Welcome to Calculator\n");
    }

}
