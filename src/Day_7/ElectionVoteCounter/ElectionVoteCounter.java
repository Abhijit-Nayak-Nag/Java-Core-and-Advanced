package Day_7.ElectionVoteCounter;
import java.util.*;
public class ElectionVoteCounter {
    public static void main(String[] args) {
        List<String>votes= Arrays.asList("Candidate A", "Candidate B", "CandidateA", "CandidateC", "Candidate A", "Candidate B");
        Map<String, Integer>voteCount=new HashMap<>();
        for(String candidate: votes){
            voteCount.put(candidate,voteCount.getOrDefault(candidate,0)+1);
        }
        String winner="";
        int maxVotes=0;
        for(Map.Entry<String, Integer>entry: voteCount.entrySet()){
            if(entry.getValue()>maxVotes){
                winner=entry.getKey();
                maxVotes=entry.getValue();
            }
        }
        System.out.println("Vote counts: " );
        for(Map.Entry<String, Integer>entry:voteCount.entrySet()){
            System.out.println(entry.getKey() + " " +entry.getValue());
        }
        System.out.println("\nWinner :" +winner +" with " + maxVotes + " votes. ");

    }
}
