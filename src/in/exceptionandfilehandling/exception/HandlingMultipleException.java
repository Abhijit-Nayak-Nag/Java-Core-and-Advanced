package in.exceptionandfilehandling.exception;

import java.util.Scanner;

public class HandlingMultipleException {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Welcome to Division Calculator....");
            System.out.println("Enter your first number: ");
            int num1= input.nextInt();
            System.out.println("Enter your second number: ");
            int num2 = input.nextInt();

//            int[]a = new int[5];
//            a[6]=num1/num2;
//            System.out.printf("Result is %d", a[6]);



            try{
//                int[]a = new int[5];
//                System.out.printf("Result is %d", a[6]);
//                a[6]=num1/num2;
                int result = num1/num2;
                System.out.printf("result is %d\n", result);
            }catch(ArrayIndexOutOfBoundsException exc){
                System.out.println("Array is out of bound");
            }catch (ArithmeticException exception){
                System.out.println("Divide by Zero Enter valid Value....");
                System.out.printf("%s, enter valid values", exception.getMessage());

        }catch (Throwable th){
                System.out.println("General exception");
//                throw th;
            }finally {
                System.out.println("I am in finally");
            }
    }
}


