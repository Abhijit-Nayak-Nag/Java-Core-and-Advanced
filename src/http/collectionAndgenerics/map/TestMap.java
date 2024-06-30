package http.collectionAndgenerics.map;

import java.util.HashMap;
import java.util.Map;

public class TestMap {
    public static void main(String[] args) {
        Map<String, Integer> map= new HashMap<>();
        map.put("Apple", 1);
        map.put("Orange", 2);
        map.put("Banana", 3);

        System.out.println(map);
        System.out.println(map.get("Apple"));
        System.out.println(map.containsKey("Banana"));

        map.remove("Orange");
        System.out.println(map);
        System.out.println(map.size());

        for(String key: map.keySet()){
            System.out.printf("%s : %s\n", key, map.get(key));

        }
    }
}