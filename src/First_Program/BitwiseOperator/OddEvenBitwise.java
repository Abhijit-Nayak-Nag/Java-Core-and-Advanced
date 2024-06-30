package First_Program.BitwiseOperator;

import java.util.Scanner;

public class OddEvenBitwise {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Welcome to Odd/Even Calculator...\n");
        System.out.println("Please Enter Your Number: ");
        int num= input.nextInt();
        if((num & 1)==1){
            System.out.println("Your number is odd");
        }else{
            System.out.println("Your number is even");
        }
    }
}

//here we are putting the condition (num &1)==1 = odd else even...
//take any even number and convert it into binary then you will get right most number is 0.
// while take ant odd number and convert it into binary and you will get right most number is 1.
//ex:- 0-0000, 2-0010, 4-0100 (even number right digits is always 0)
//ex:- 1-0001, 3-0011, 5-0101 (odd number right digits is always 1)
// after this logic what can we do how to find 1 bit in a number? see its not possible to
// find one bit in a number so what can we do we can make that one particular bit as relevant.
// and rest all the bit make it as irrelevant.
// ex: 7-(0111) here we want only right most digit i.e."1" and we want rest all the digits
// becomes 0 or null. so for that what can we do if we use "&" this operator then
// 7-0111 and "&" this operator says that 1+1 is 1 and else 0. so take & of 7 again (0111)
// so here we can put the condition if(num & 1)==1 ("Number is Odd")
// else ("even")
//or you can write if(num & 1)==0 ("Number is even")