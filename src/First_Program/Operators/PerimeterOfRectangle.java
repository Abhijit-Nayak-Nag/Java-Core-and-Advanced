package First_Program.Operators;

import java.util.Scanner;

public class PerimeterOfRectangle {
    public static void main(String[] args) {
        Scanner input= new Scanner (System.in);
        System.out.println("Welcome to the Program of Perimeter Of Rectangle :");
        System.out.println("Enter the First side of Rectangle: ");
        double firstSide= input.nextDouble();
        System.out.println("Enter the second side of Rectangle :");
        double secondSide= input.nextDouble();
        System.out.println("Enter the third side of Rectangle: ");
        double thirdSide = input.nextDouble();
        System.out.println("Enter the fourthSide of Rectangle: ");
        double fourthSide = input.nextDouble();
        double periMeter=firstSide+secondSide+thirdSide+fourthSide;
        System.out.println("Perimeter of Rectangle :\t"  +periMeter +"cm");
        // System.out.println("Perimeter of Rectangle" ((firstSide+secondSide+thirdSide+fourthSide));
        //if you don't want to take the fifth variable i.e. Perimeter then write the above code.

    }
}
