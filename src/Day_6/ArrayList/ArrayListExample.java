package Day_6.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExample {
    public static void main(String[] args) {
        //Create an ArrayList of integer.
        ArrayList<Integer>numbers =new ArrayList<>();
        //Add elements to the ArrayList.
        numbers.add(5);
        numbers.add(10);
        numbers.add(15);
        numbers.add(22);
        numbers.add(33);
        numbers.add(88);
        //Print the ArrayList
        System.out.println("ArrayList :" +numbers);
        //Get the size of the ArrayList.
        System.out.println("Size of the ArrayList: " +numbers.size());
        //Access elements by index
        System.out.println("Elements at index 2: " +numbers.get(2));
        //modify an elements
        numbers.set(1,12);
        System.out.println("Modified element at index1: " +numbers.get(1));
        //Remove an element by value
        numbers.remove(Integer.valueOf(20));
        //Remove an element by index
        numbers.remove(3);
        System.out.println("ArrayList after removing element at index 3: " +numbers);
        //Check if the ArrayList contains an element.
        boolean contains = numbers.contains(12);
        System.out.println("Does the ArrayList contains 12? " +contains);
        //sort the ArrayList in ascending order.
        Collections.sort(numbers);
        System.out.println("Sorted ArrayList: " +numbers);
        //Reverse the ArrayList
        Collections.reverse(numbers);
        System.out.println("Reversed ArrayList : " +numbers);
        //Clear the ArrayList
        numbers.clear();
        System.out.println("ArrayList after clearing :" +numbers);


    }


}
