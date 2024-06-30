package Advanced_Java_April8.Exercise;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your first number: ");
        int first= sc.nextInt();
        System.out.println("Enter your Second number: ");
        int second= sc.nextInt();

        if (first>second){
            System.out.println(first-second);
        }else{
            System.out.println("Do nothing");
        }

    }
}
