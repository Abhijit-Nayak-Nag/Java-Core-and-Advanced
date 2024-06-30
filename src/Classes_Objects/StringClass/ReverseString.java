package Classes_Objects.StringClass;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a string: ");

        String str= sc.nextLine();

        String reve= reverseString(str);
        System.out.println("Your reversed string is: " +reve);

        //close the scanner
        sc.close();


    }

    // method to reverse a string
    public static String reverseString(String reverse){

        //initialize an empty string to store the reversed string.
        String rev="";

        //iterate through the characters of the input string in reverse order
        for (int i= reverse.length()-1; i>=0; i--){
    //Append each character to the reverse string. charAt() method used to access individual characters of the string.
            rev+=reverse.charAt(i);
        }
        // return the reverse string
        return rev;


    }
}
