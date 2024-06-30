package http.collectionAndgenerics.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestCollection {
    public static void main(String[] args) {
        List<Integer>numList= new ArrayList<>();
        numList.add(1);
        numList.add(9);
        numList.add(3);
        numList.add(5);
        System.out.println(numList);

        Collections.sort(numList);
        System.out.println(numList);

       int max= Collections.max(numList);
        System.out.println(max);

        int min= Collections.min(numList);
        System.out.println(min);



        Collections.reverse(numList);
        System.out.println(numList);

        //if you want no one can change your list then use unmodifiable.

//        List<Integer> unmodifiable= Collections.unmodifiableList(numList);
//        unmodifiable.add(6);
//        System.out.println(numList);
    }
}
