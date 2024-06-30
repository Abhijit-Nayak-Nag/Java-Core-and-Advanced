package Day_5;
import java.util.*;
public class CollectionUtils {
    public static <T> void addToCollection(T[]array, Collection<T>collection){
        for(T item: array){
            collection.add(item);
        }
    }

    public static void main(String[] args) {
        Integer[] array ={1,2,3,4,5};
        List<Integer> list = new ArrayList<>();
        addToCollection(array, list);
        System.out.println("Collection after adding array elements:  " +list);
    }
}
