package First_Program.If_Else;

import java.util.Scanner;

public class EnhanceSwitch {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Please enter your day: ");
        int day= input.nextInt();
        String dayName = switch(day){
            case 1-> "Monday";
            case 2-> "Tuesday";
            case 3-> "Wednesday";
            case 4-> "Thursday";
            case 5-> "Friday";
            case 6-> "Saturday";
            case 7-> "Sunday";
            //case 6,7 -> "Holiday";
            default -> "Invalid";

        };
        System.out.println("The day is : " +dayName);
    }
}
