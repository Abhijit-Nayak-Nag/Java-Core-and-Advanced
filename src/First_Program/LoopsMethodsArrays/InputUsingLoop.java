package First_Program.LoopsMethodsArrays;

import java.util.Scanner;

public class InputUsingLoop {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        // you can write over here System.out.println("Enter Your Number: ");
        int i=0;
        while(i<5){
            System.out.println("Enter Your Number: ");
            int num=input.nextInt();
            System.out.println("Your Number is : " +num);
            i=i+1;
        }


    }

}

/* Here what is happening we have give a condition i.e. (i<5) it means take the number
from users 5 times, and then we declare the variable i.e. "inp" which is store the number
that we are going to take from user, and then we use print statement which is going to print,
and then it will increment the value of i until we enter our 5 th number.
here we have assign i=0, so for that input is going to take from user 5 times because
in first iteration it would be 0, then it would be increment to 1 then 2 then 3,4,5.

 */