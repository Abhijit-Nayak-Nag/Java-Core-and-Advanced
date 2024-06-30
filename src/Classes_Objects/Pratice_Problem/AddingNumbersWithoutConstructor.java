package Classes_Objects.Pratice_Problem;

import java.util.Scanner;


class Calculator {

     public int add(int num1, int num2) {
         return num1 + num2;
//if we used static method here (Public static int add)then we don't need to create the object for
// the class Calculator, and we don't require other class as well we can declare one class,
// and we can simply direct use it in the main method using normal approach. but here we are using OOP approach.

     }
 }


     public class AddingNumbersWithoutConstructor {
         public static void main(String[] args) {
             Scanner input = new Scanner(System.in);
             System.out.println("Welcome to Calculator: ");
             System.out.println("Enter the first number: ");
             int num1 = input.nextInt();
             System.out.println("Enter the second number: ");
             int num2 = input.nextInt();
             Calculator calculator = new Calculator();
             int result = calculator.add(num1, num2);


             System.out.println("Result is :" + result);

//        System.out.println("result is: " +calculator.add(num1,num2));



         }
     }
