package Day_4;
import java.util.*;

public class Mapped {
    public static void main(String[] args) {
        Map<String, Integer> ageMap = new HashMap<>();
        ageMap.put("Abhijit", 23);
        ageMap.put("Rahul", 35);
        ageMap.put("OMM", 40);
        ageMap.put("Hari", 27);
        int totalAge = 0;
        int totalCount = ageMap.size();
        for (int age : ageMap.values()) {
            totalAge += age;
     }
    double averageAge = (double) totalAge / totalCount;
    System.out.println("Average age of all people :" + averageAge);


    }
}
