package Advanced_Java.MultiThreading;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SortedList {
    public static void main(String[] args) {
        List<String>arrList= new ArrayList<>();
        arrList.add("hello");
        arrList.add("hii");
        String str= arrList.get(0); // Get the first element in the list.

        for (int i = 0; i < arrList.size(); i++) {
            System.out.println(arrList.get(i));

        }

        System.out.println("accessing the one one element of String str :");

        for (int j = 0; j < str.length(); j++) {  // Start the loop from index 1 of the string
            System.out.println(str.charAt(j)); // Print each character starting from index 1

        }
    }
}
