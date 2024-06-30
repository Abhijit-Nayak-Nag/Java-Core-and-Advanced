package First_Program.Functions;

import java.util.Scanner;

public class Mul1 {
    public static void main(String[] args) {
        System.out.println("Result is: " +Multiplication());
       // Multiplication();

    }
    public static int Multiplication(){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the First Number: ");
        int firstNumber=input.nextInt();
        System.out.println("Enter the Second Number: ");
        int secondNumber=input.nextInt();
        int mul=firstNumber * secondNumber;
//      System.out.println(mul); -- if you write this statement then omit the sout in main method. just write the function name.
        return mul;

    }

}
