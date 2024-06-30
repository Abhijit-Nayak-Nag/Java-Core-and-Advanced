package Advanced_Java_April8.Exercise;

import java.util.Scanner;

public class Revv {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter your String here: ");
        String st= sc.nextLine();
        System.out.println("Result" + str(st));
    }
    public static String str(String str){
        return str.toUpperCase();
    }
}
