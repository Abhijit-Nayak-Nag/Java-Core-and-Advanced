package Classes_Objects.StringClass;

import java.util.Scanner;

public class Calculator2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("WELCOME TO DIGITAL CALCULATOR: ");

        System.out.println("Enter your first number:");
        int input= sc.nextInt();

        System.out.println("Enter your second number: ");
        int input1= sc.nextInt();

        System.out.println("Choose the operation: "+
                "\n1: Add:" +
                "\n2: Sub:" +
                "\n3: Mul:" +
                "\n4: Div:" );

        int result= sc.nextInt();

        if (result==1){
            System.out.println(input+input1);
        } else if (result==2) {
            System.out.println(input-input1);

        } else if (result==3) {
            System.out.println(input*input1);

        } else if (result==4) {
            System.out.println(input%input1);

        }else {
            System.out.println("Invalid operation....");
        }
    }
}
