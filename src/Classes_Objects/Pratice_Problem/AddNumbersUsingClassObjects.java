package Classes_Objects.Pratice_Problem;

import java.util.Scanner;

public class AddNumbersUsingClassObjects {
     private int num1;
     private int num2;


    public int add() {
         return num1 + num2;
     }

//    public void add() {
//        System.out.println(num1+num2);
//    }

     public AddNumbersUsingClassObjects(int num1, int num2) {
         this.num1 = num1;
         this.num2 = num2;
     }


     // class main { // you can use two different class for creating object or within same class
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            AddNumbersUsingClassObjects numbers = new AddNumbersUsingClassObjects(8,7);
            int result = numbers.add();
//            numbers.add();

            System.out.println(numbers.num1 +numbers.num2);
            System.out.println(numbers.num1);


//        System.out.println("Sum: " +numbers.add());
            System.out.println("result :" + result);
        }
    }





