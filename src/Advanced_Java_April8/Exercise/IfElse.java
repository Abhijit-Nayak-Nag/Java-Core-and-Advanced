package Advanced_Java_April8.Exercise;

import java.util.Scanner;

public class IfElse {
            public static String compareNM(int n, int m) {
            if (n>m){
                return "greater";
            }else if (n<m){
                return "smaller";
            }else {
                return "Invalid Input";
            }
        }

             public static String comp(int first, int second){
                if (first>second){
                    return "First is greater than Second";
                }else{
                    return "Second is Greater than First";
                }

             }




//    public static void compareNM(int n, int m) {
//        if (n > m) {
//            System.out.println("greater");
//        } else {
//            System.out.println("smaller");
//        }
//    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first number: ");
        int first1 = sc.nextInt();
        System.out.println("Enter your second number: ");
        int second2= sc.nextInt();

        System.out.println(comp(first1,second2));
        System.out.println(compareNM(6, 3));


        System.out.println("Enter your number: ");
        int num= sc.nextInt();
        int num1= sc.nextInt();

        if (num>num1){
            System.out.println("num is bigger num1.");
        }else if (num==num1){
            System.out.println("both are equal.");
        }else{
            System.out.println("num1 is bigger than num");
        }

    }
}

//     public static void main(String[] args){
//     compareNM(4,8);
//     }
// }
