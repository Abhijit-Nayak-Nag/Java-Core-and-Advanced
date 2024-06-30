package http.collectionAndgenerics.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestingList {
    public static void main(String[] args) {
        List<String> strList= new ArrayList<>();
        strList.add("Abhi");
        strList.add("jit");
        strList.add("Nayak");
        System.out.println(strList);

        for (String s : strList) {
            System.out.println(s);

        }

        strList.add(1,"Hii");
        System.out.println(strList);

        System.out.println(strList.remove(1));
        System.out.println(strList.size());
        System.out.println(strList.contains("jit"));
        System.out.println(strList.get(0));
        System.out.println(strList);

        // another approach:
        Integer integer= Integer.valueOf(3);
        System.out.println(integer);

        Integer integer1= 5;
        System.out.println(integer1);

        List<String> arr= new ArrayList<>();
        arr.add("hello");
        arr.add("Hii");
        arr.add("Bye");
        System.out.println(arr);

        List<String> ar= List.of("Hello","Hii", "Bye");
//      ar.add("oye"); -- it will give you an error. after assigning the value while creating your array you cant add again the new value.
        System.out.println(ar);

        ArrayList<String>arrayList=new ArrayList<>();
        arrayList.add("ok");
        System.out.println(arrayList);

        List<String> list = Arrays.asList("Apple", "Banana", "Cherry");
//        List<String> list = new ArrayList<>(Arrays.asList("Apple", "Banana", "Cherry"));
//        list.add("Strawberry"); you cant add after declaring the array.
        System.out.println(list);

    }
}
