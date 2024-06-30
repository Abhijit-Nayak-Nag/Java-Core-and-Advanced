package First_Program.User_Input;

import java.sql.SQLOutput;
import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter Your name: ");
        String name = input.nextLine();
        System.out.println("Good Morning " + name);
        System.out.println("Write your age: ");
        int age= input.nextInt();
        System.out.println("Your age is " +age);
        System.out.println("what is your salary: ");
        float salary=input.nextFloat();
        System.out.println("Your salary is " +salary);
    }
}
