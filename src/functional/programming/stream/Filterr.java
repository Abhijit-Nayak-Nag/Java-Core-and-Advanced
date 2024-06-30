package functional.programming.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Filterr {
    public static void main(String[] args) {
       List<String>fruits= List.of("Mango", "Orange", "Banana", "Date", "Cherry");

  // you can convert stream like this or you can directly convert using fruits.stream() and use loop.
//        Stream<String>stream= fruits.stream();
//        stream.forEach(System.out::println);

//       fruits.forEach(f -> System.out.println(f));

        fruits.stream().forEach(f-> System.out.println(f));

        System.out.println("\nfiltering the element using stream and lambda expression: ");

        fruits.stream()
                .filter(f->f.endsWith("e"))
                .forEach(f-> System.out.println(f));

    }
}
