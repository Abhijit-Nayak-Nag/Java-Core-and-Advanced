package First_Program.Arrays;

import java.util.Scanner;

public class ArraySearching {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int[]arr={3,6,8,87,65,4,56,99,7,34};
        System.out.println("Welcome to  Array Searching \n");
        System.out.println("Enter the number you want to search: ");
        int num=input.nextInt();
        boolean isFound=isFound(arr, num); //this isFound is the method name and we store this in a variable named as isFound on left hand side.
        if(isFound){
            System.out.println("Your Number was found in the array..");
        }else{
            System.out.println("Your number was not found in the array..");
        }
    }

    public static boolean isFound(int[]arr, int num){
        int index=0;
        while(index<arr.length){  // length = index+1 it means length will execute till index exits.
            if(arr[index]==num)
                return true;
            index++;
        }
        return false;

    }
}


/*
Here we have created an array and then taking number from user and searching the number
means that number present in the array or not?
 */
/*
Solution : Suppose we have a number, and we want to find where the number is present
in the array for that we need to visit each and every location/ indexes in the array
which we have done in our array traversal and if we compare each value to our variable num
i.e. user input number and if the value user has given and that stored in the num variable
if it is equal then we will return true and yes the number is present else false the number
is not present.
 */