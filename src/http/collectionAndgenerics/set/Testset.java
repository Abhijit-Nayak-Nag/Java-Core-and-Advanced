package http.collectionAndgenerics.set;

import java.util.HashSet;
import java.util.Set;

public class Testset {
    public static void main(String[] args) {
        Set<String> set= new HashSet<>();
        set.add("Apple");
        set.add("Mango");
        set.add("Orange");
        System.out.println(set);
        boolean isAdded= set.add("Orange");
        System.out.println("Orange is Added? "+ isAdded);
        System.out.println(set.size());
//        System.out.println(set.remove("Mango"));
//        System.out.println(set);
    }
}
