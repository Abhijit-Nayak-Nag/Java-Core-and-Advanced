package Advanced_Java_April8.Exercise;

import java.util.Scanner;

public class Geeks {
    // Function to take input using Scanner class
    static void IOFunction(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your integer:");
        int t = sc.nextInt();
        System.out.println(t);

        System.out.println("Enter your float");
        float f= sc.nextFloat();
        System.out.println(f);

        System.out.println("Enter your Long");
        long l = sc.nextLong();
        System.out.println(l);

        System.out.println("Enter your Byte");
        byte b= sc.nextByte();
        System.out.println(b);

        // Consume the leftover newline
        sc.nextLine();
        System.out.println("Enter your String");
        String s= sc.nextLine();
        System.out.println(s);
        sc.close();

// 		while(t-- > 0){

// 		    // Your code here


// 		}

    }

    public static void main(String[]args){
        IOFunction();
    }
}
