package First_Program.If_Else;

import java.util.Scanner;

public class Grading {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Welcome to Grade Calculator....");
        System.out.println("Please Enter your Percentage:  ");
        //float percentage = input.nextint();
        float percentage = input.nextFloat();
        if(percentage>=90){
            System.out.println("Great, You have got A");
        }else if (percentage>=75){
            System.out.println("Good, You have got B");
        }else if (percentage>=60){
            System.out.println("You have got C, work hard next time");
        }else if(percentage>=30){
            System.out.println("You have got D, You seriously needs to work harder");
        }else{
            System.out.println("Sorry You failed the test, and you gotten F");
        }
    }
}
