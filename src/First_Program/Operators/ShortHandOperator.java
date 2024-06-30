package First_Program.Operators;

import java.util.Scanner;

public class ShortHandOperator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Write the number you want to add: ");
        int a = 4;
        int x1 = input.nextInt();
        //we can modify this expression: a+=x1;
        a = a + x1;
        System.out.println("Result\t" +a);
        System.out.println("Enter the Second Number you want to add: ");
        int x2 = input.nextInt();
        //a+=x2;
        a = a + x2;
        System.out.println("Result\t" +a);
        System.out.println("Enter the third number you want to add: ");
        int x3 = input.nextInt();
        //a+=x3
        a = a + x3;
        System.out.println("Result\t" +a);
    }

}
