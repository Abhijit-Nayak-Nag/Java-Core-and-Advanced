package Day_7.LongestSongSequences;

import java.util.ArrayList;

public class LongestSongSequences {
    public static ArrayList<Integer>findLongestSongSequences(ArrayList<Integer>songDuration, int time){
        ArrayList<Integer>longestSongSequences=new ArrayList<>();
        int MaxDuration = 0;
        int currentDuration =0;
        int startIndex =0;
        int endIndex = 0;
        for (int i=0;i<songDuration.size();i++){
            int duration =songDuration.get(i);
            currentDuration+=duration;
            while(currentDuration>time){
                currentDuration-=songDuration.get(startIndex);
                startIndex++;
            }
            if(currentDuration>MaxDuration){
                MaxDuration=currentDuration;
                endIndex=i;
            }
        }
        for(int i=startIndex; i<=endIndex; i++){
            longestSongSequences.add(songDuration.get(i));
        }
        return longestSongSequences;
    }

    public static void main(String[] args) {
        ArrayList<Integer> songDurations = new ArrayList<>();
        songDurations.add(3);
        songDurations.add(5);
        songDurations.add(7);
        songDurations.add(2);
        songDurations.add(8);
        songDurations.add(10);
        int time = 15;
        ArrayList<Integer> longestSequence = findLongestSongSequences(songDurations, time);
        System.out.println("Longest sequences :" + longestSequence);

    }
}
