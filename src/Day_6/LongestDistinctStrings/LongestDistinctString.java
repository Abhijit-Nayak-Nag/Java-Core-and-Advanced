package Day_6.LongestDistinctStrings;
import java.util.*;

public class LongestDistinctString {
    public static List<Integer>longestDistinctString (int[]userIds)

    {
        Map<Integer, Integer> map = new HashMap<>();
        int maxLength = 0;
        int maxStartIndex = 0;
        int start = 0;

        for (int i = 0; i < userIds.length; i++) {
            int userId = userIds[i];
            if (map.containsKey(userIds)) {
                Math.max(start, map.get(userId) + 1);
            }
            map.put(userId, i);
            if (i - start + 1 > maxLength) {
                maxLength = i - start + 1;
                maxStartIndex = start;
            }
        }
        List<Integer> result = new ArrayList<>();
        for (int i = maxStartIndex; i < maxStartIndex + maxLength; i++) {
            result.add(userIds[i]);
        }
        return result;
    }

    public static void main(String[] args) {
        int[]userIds={1,2,3,2,1,4,5,6,2,3,7,8,9,10,2,3,4,5,6,7,8,9,10,11,12};
        List<Integer>longetString=longestDistinctString(userIds);
        System.out.println("Output: "+longetString);
    }

}
