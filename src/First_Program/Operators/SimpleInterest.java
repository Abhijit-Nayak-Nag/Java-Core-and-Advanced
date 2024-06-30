package First_Program.Operators;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Welcome to the Simple Interest Calculator :\n");
        System.out.println("Please enter your principle amount in Rupees : ");
        int principle= input.nextInt();
        System.out.println("Tell me your rate of interest :");
        float rate=input.nextFloat();
        System.out.println("Now, Tell me for how many years are you borrowing this money: ");
        float years = input.nextFloat();
        float interest = (principle * rate * years)/100;
        System.out.println(" Your Simple interest in Rs. "  +interest);

    }

}
