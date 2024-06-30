package http.collectionAndgenerics.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Hello {
    public static void main(String[] args) {
        ArrayList<Object> arr = new ArrayList<>();
//        List<Object> arr = new ArrayList<>();

        arr.add(12);
        arr.add("sdajshdasjdh");
        arr.add(12);
        arr.add(12);

        System.out.println(arr);
    }
}
