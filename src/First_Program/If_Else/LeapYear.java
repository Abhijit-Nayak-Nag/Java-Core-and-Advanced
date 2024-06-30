package First_Program.If_Else;

import java.util.Scanner;
// Create a program that determines if a given year is a leap year(considering conditions
//like divisible by 4 but not 100, unless also divisible by 400)
public class LeapYear {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Welcome to Leap Year Calculator");
        System.out.println("Please Enter the year that you want to check? ");
        int year = input.nextInt();
        //we can write this statement in a single line:
        //if(year%400==0 || (year%4==0 && year%100!=0)){
        //sout("Your Year is leap year"){
        //else{("Your Year is not leap year");
        if(year%400==0){
            System.out.println("Your year is the Leap year....");
        }  else if (year%4==0 && year%100!=0){
            System.out.println("Your year is the Leap year....");
        }else{
            System.out.println("Your year is not leap year...");
        }
    }
}

 // your can write this statement as well....
// if(year%400==0){
//            System.out.println("Your year is the Leap year....");
//else if (year%4==0 ){
//            System.out.println("Your year is the Leap year....");
//        }else{
//            System.out.println("Your year is not leap year...");