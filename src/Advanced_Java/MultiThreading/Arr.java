package Advanced_Java.MultiThreading;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Arr {

    static List<Integer>arr = new ArrayList<>();


    // method to add element into the array:
    public void add(int s) {
        arr.add(s);
    }

    @Override
    public String toString() {
        return "A{" +
                "arr=" + arr +
                '}';
    }

    public static void main(String[] args) {
        System.out.println("Enter your Number that you want to add in your array: ");
        Scanner sc= new Scanner(System.in);
        int s= sc.nextInt();
        Arr a= new Arr();
        a.add(s);
        System.out.println(a);
        System.out.println(Arr.arr);
    }

}


