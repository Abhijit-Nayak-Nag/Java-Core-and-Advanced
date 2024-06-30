package functional.programming.stream;


import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {
        List<String> arrList= List.of("Abhijit", "Satyajit", "Biswajit");

        System.out.println("Traversing the array using Traditional for loop :\n");

        for (int i = 0; i < arrList.size(); i++) {
            System.out.println(arrList.get(i));

        }

        System.out.println("\nTraversing the array using enhance for loop :\n");

        for (String s : arrList) {
            System.out.println(s);

        }

        System.out.println("\nTraversing the array using for-each loop:\n ");

        arrList.forEach(s -> System.out.println(s));


        System.out.println("\nTraversing the array using method reference:\n ");

        arrList.forEach(System.out::println);



        // creating Stream using List/ converting list into stream

        System.out.println("creating Stream using List");

        Stream<String> stream1= arrList.stream();
        stream1.forEach(System.out::println);

//alternative way you can even directly convert into stream like this and iterate using enhance for loop like:
        arrList.stream().forEach(p-> System.out.println(p));


        System.out.println("Creating stream using set");

// now what are the elements present in the list1 that would be stored in the set1 now. and if the list
// contains some duplicate that would be removed here. because set does not allow duplicate elements.

        Set<String> set1= new HashSet<>(arrList);

        // converting the set into stream

        Stream<String> stream2= set1.stream();

        stream2.forEach(System.out::println);

        // creating Stream using Arrays.

        System.out.println("\ncreating stream using Array: ");

        String[] strArray= {"Abhi", "Sonu", "Rahul"};

        // converting array into stream:

        Stream<String> stream3= Arrays.stream(strArray);

        stream3.forEach(System.out::println);




    }

}
