package First_Program.Functions;

import java.util.Scanner;

public class mul1alt {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the First Number: ");
        int number1=input.nextInt();
        System.out.println("Enter the Second Number: ");
        int number2=input.nextInt();
        int result=multi(number1, number2);
        System.out.println("Result is :" +result);

    }
    public static int multi(int number1, int number2){
       return number1*number2;


    }
}


