package Day_6.ArrayExample;

import java.util.Arrays;

public class ArrayExample {
    public static void main(String[] args) {
        //create an array of integer
        int [] numbers = {5,10, 15, 20, 25};
        //Access elements of array
        System.out.println("First element:" +numbers[0]);
        System.out.println("Third element: " +numbers[2]);
        // Change an elements of the array
        numbers[1] =12;
        System.out.println("Modified second element: " +numbers[1]);
        //find the length of the array
        System.out.println("Length of the array" +numbers.length);
        //Iterate over the array and print all elements
        System.out.println("Elements of the array: ");
        for (int i =0; i<numbers.length;i++){
            System.out.println("Element at index " + i + " : " +numbers[i]);
        }
        //Find the sum of all elements in the array
        int sum = 0;
        for (int num: numbers){
            sum +=num;
        }
        System.out.println("Sum of all elements :" +sum);
        // Find the maximum elements in the array
        int max = Integer.MIN_VALUE;
        for (int num: numbers){
            if (num>max){
                max=num;
            }

        }
        System.out.println("Maximum element: " +max);
        //Find the index of a specific element
        int elementToFind =15;
        int index =-1;
        for (int i=0; i<numbers.length;i++){
            if (numbers[i]==elementToFind){
                index =i;
                break;
            }
        }
        System.out.println("Index of element 15: +index");
        //Sort the array in ascending order
        Arrays.sort(numbers);
        System.out.println("Sorted array: ");
        for (int num:numbers){
            System.out.println(num + " ");
        }


        System.out.println();


    }
}
