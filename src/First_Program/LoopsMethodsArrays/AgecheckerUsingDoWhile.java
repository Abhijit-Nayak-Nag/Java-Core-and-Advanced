package First_Program.LoopsMethodsArrays;

import java.util.Scanner;

public class AgecheckerUsingDoWhile {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int age ;
        do{
            System.out.println("please enter your age: ");
             age= input.nextInt();
        }while(age<0 || age>100);
        System.out.println("Your age is: " +age);

    }
}
// here it will first print --- Enter your age : (|| it means both condition false - then execute the block)
// Then it will take input from user and check While(age< 0 || age> 100);
// it means suppose user give an input 999 then check 999<0 -false 999>100 - true so
// it will ask again enter your age if both condition gets false then it will execute
// the statement your age : value