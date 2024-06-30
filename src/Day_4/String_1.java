package Day_4;
import java.util.*;

public class String_1 {
    public static void main(String[] args) {
        Set<String> stringSet = new HashSet<>();
        stringSet.add("apple");
        stringSet.add("banana");
        stringSet.add("apple");
        stringSet.add("orange");
        stringSet.add("banana");
        stringSet.add("grape");
        System.out.println("Unique strings: ");
        for (String str: stringSet){
            System.out.println(str);
        }
        System.out.println(stringSet.size());


    }

}
