package Classes_Objects.StringClass;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Welcome to calculator: ");

        System.out.println("Enter your first number: ");
        int first= sc.nextInt();

        System.out.println("Enter your second number: ");
        int second= sc.nextInt();

        System.out.println("Choose the  operation :" +
                "\n1: add" +
                "\n2: sub" +
                "\n3: mul" +
                "\n4: div");
        int res= sc.nextInt();
        if(res==1){
            System.out.println("Result is:" +add(first,second));
        } else if (res==2) {
            System.out.println("Result is:" +sub(first, second));

        } else if (res==3) {
            System.out.println("Result is:" +mul(first,second));

        }else if(res ==4){
            System.out.println("Result is:" +div(first, second));
        }else{
            System.out.println("Choose the correct option....");
        }


    }
    public static int add(int num1, int num2){
        return num1+num2;
    }
    public static int sub(int num1, int num2){
        return num1-num2;
    }
    public static int mul(int num1, int num2){
        return num1*num2;
    }
    public static float div(int num1, int num2){
        return num1 % num2;
    }

}
