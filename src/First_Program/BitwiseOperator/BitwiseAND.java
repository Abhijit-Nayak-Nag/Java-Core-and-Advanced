package First_Program.BitwiseOperator;

import java.util.Scanner;

public class BitwiseAND {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Showcasing Bitwise Operator..\n");
        System.out.println("Please Enter the First Number: ");
        int firstNumber= input.nextInt();
        System.out.println("Now, enter the other Number....");
        int secondNumber = input.nextInt();
        //& it basically Compares the every bit of firstNumber and secondNumber and if both
        // bit are "1" then it becomes "1" otherwise "0"
        int result = firstNumber & secondNumber;
        System.out.println("Result is :" +result );

    }
}

// Here we have taken input as firstNumber is :8 and its binary---1000 and secondNumber--
//1001 what "&" --this operator says if both bits are 1 then it will return 1 else 0.
//1000
//1001 so the answer is 1000----and its the binary of 8. and the output we got ---"8"