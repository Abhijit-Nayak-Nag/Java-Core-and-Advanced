package First_Program.If_Else;

import java.util.Scanner;

public class OddEvenChecker {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Welcome to Odd-Even Number Checker...");
        System.out.println("Enter Your Number: ");
        int num=input.nextInt();
        if(num%2 == 0){
            System.out.println("Your Number is Even...");
        }else{
            System.out.println("Your Number is Odd...");
        }
    }
}
