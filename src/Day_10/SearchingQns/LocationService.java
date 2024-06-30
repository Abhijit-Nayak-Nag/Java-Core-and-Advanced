package Day_10.SearchingQns;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class LocationService {
    public static List<Integer> findUserInRange(int[] userLocations, int targetLocations, int distanceRange){
        Arrays.sort(userLocations);
        List<Integer>usersWithRange= new ArrayList<>();
        int targetIndex= Arrays.binarySearch(userLocations,targetLocations);
        if(targetIndex <0){
            targetIndex=-(targetIndex + 1);
        }
        int startIndex= Math.max(0, targetIndex -1);
        int endIndex=Math.min(userLocations.length - 1, targetIndex +1);
        for(int i= startIndex; i<=endIndex; i++){
            if(Math.abs(userLocations[i] - targetLocations)<=distanceRange){
                usersWithRange.add(userLocations[i]);
            }
        }
        return usersWithRange;

    }

    public static void main(String[] args) {
        int[]userLocation={1,5,10,15,20};
        int targetLocation=12;
        int distanceRange=3;
        List<Integer>userInRange= findUserInRange(userLocation, targetLocation,distanceRange);
        System.out.println(userInRange);
    }

}
