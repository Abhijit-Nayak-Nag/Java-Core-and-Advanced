package First_Program.Operators;

import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Area of Triangle:\n ");
        System.out.println("Enter the Base of the Triangle: ");
        double base = input.nextDouble();
        System.out.println("Enter the Height of the Triangle");
        double height= input.nextDouble();
        double area = (((double) 1 /2)*base*height); //(0.5*base * Height) or (base * height)/2
        System.out.println("Area of the Triangle is: " +area +"cm");
    }

}
