package First_Program.If_Else;

import java.util.Scanner;

public class RelationalOperator {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Welcome to Driving Licence Portal");
        System.out.print("Please Enter your age: ");
        int age =input.nextInt();
        if(age>=18){
            System.out.println("You are Eligible to Drive...");
        }else {
            System.out.println("You are not Eligible to Drive.....");
        }
    }

}
