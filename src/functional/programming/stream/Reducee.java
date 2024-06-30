package functional.programming.stream;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Reducee {
    public static void main(String[] args) {
        List<Integer> arrList = List.of(1, 3, 5, 7, 9, 11, 13);

        //  using enhance for-loop for finding the sum of number in the array list.

        int sum = 0;
        for (Integer i : arrList) {
            sum += i;
        }
        System.out.println(sum);

        System.out.println("\nusing reduce: ");

        int newSum= arrList.stream()
                        .reduce(0,(a,b)->a+b);
        System.out.println(newSum);

        int max= arrList.stream()
                .reduce(Integer.MIN_VALUE,(a,b)-> a>b ? a:b);
        System.out.println(max);


        Predicate<Integer>isPosetive= x-> x>0;
        System.out.println(isPosetive.test(5));
        System.out.println(isPosetive.test(-5));


        Consumer<String> print= message-> System.out.println(message);
        print.accept("Hello");


    }




}