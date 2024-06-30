package First_Program.BitwiseOperator;

import java.util.Scanner;

public class BitwiseOR {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Showcasing Bitwise OR...\n");
        System.out.println("Enter the First Number: ");
        int firstNumber= input.nextInt();
        System.out.println("Enter Your Second Number: ");
        int secondNumber=input.nextInt();
        int result= firstNumber | secondNumber;
        System.out.println("Result is :" +result);
    }
}
// "OR |" says if one bit is one it becomes one else "0"
//ex:- 1+1=1, 1+0=1, 0+1=1, else 0
