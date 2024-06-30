package Day_7.SocialNetworkAnalyzer;
import java.util.*;

public class SocialNetworkAnalyzer {
    public static void main(String[] args) {
        Map<Integer, List<Integer>> socialNetwork = new HashMap<>();
        socialNetwork.put(1, Arrays.asList(2, 3, 4));
        socialNetwork.put(2, Arrays.asList(1, 3));
        socialNetwork.put(3, Arrays.asList(1, 2, 4));
        socialNetwork.put(4, Arrays.asList(1, 3));
        int mostFriends = Integer.MIN_VALUE;
        int leastFriends = Integer.MAX_VALUE;
        int totalFriends = 0;
        for (List<Integer> friends : socialNetwork.values()) {
            int numFriends = friends.size();
            mostFriends = Math.max(mostFriends, numFriends);
            leastFriends = Math.min(leastFriends, numFriends);
            totalFriends += numFriends;

        }
        int numPeople = socialNetwork.size();
        double averageFriends = (double) totalFriends / numPeople;
        System.out.println("Person(s) with the most friends: ");
        for (Map.Entry<Integer, List<Integer>> entry : socialNetwork.entrySet()) {
            if (entry.getValue().size() == mostFriends) {
                System.out.println("ID: " + entry.getKey() + ", Number of friends: " + mostFriends);
            }
        }
        System.out.println("\nPerson(s) with the least friends :");
        for (Map.Entry<Integer, List<Integer>> entry : socialNetwork.entrySet()) {
            if (entry.getValue().size() == leastFriends) {
                System.out.println("ID :" + entry.getKey() + ", Number of friends: " + leastFriends);
            }
        }
        System.out.println("\nAverage number of friends per person: " + averageFriends);
    }

}
