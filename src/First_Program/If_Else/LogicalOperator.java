package First_Program.If_Else;

import java.util.Scanner;

public class LogicalOperator {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Welcome to Ticket Discount Calculator...\n");
        System.out.println("Please enter you age:");
        int age= input.nextInt();
        System.out.println("Are you a female? (True/False) ");
        boolean isFemale=input.nextBoolean();

        if(age<5){
            System.out.println("you got 75% discount...");
        }else if(isFemale){
            System.out.println("You got 50% discount...");
            //your age >50 and you are not female(!)
        }else if (age>60 && !isFemale){
            System.out.println("you got 25% discount....");
        }else{
            System.out.println("you got no discount...");
        }


    }
}
