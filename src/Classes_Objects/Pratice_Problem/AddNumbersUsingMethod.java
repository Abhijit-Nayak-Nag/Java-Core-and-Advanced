package Classes_Objects.Pratice_Problem;

import java.util.Scanner;

public class AddNumbersUsingMethod {
    public static int add(int number1, int number2){
        return number1 +number2;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int input= sc.nextInt();
        System.out.println("Enter the second number: ");
        int input1= sc.nextInt();
        int result= add(input1,input);
        System.out.println("Sum is: " +result);

//        int result=add(5,3);
//        System.out.println(result);
    }
}
