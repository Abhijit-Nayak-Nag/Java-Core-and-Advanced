package First_Program.If_Else;

import java.util.Scanner;

public class PositiveNegativeZero {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Welcome to Number Checker...");
        System.out.println("Please Enter Your Number: ");
        int num= input.nextInt();
        if(num>0){
            System.out.println("Your Number is Positive...");
        }else if(num==0){
            System.out.println("Your Number is Zero..");
        }else{
            System.out.println("Your Number is Negative...");
        }

    }
}
