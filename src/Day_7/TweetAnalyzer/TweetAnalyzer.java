package Day_7.TweetAnalyzer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class TweetAnalyzer {
    public String findMostCommonWord(ArrayList<String>tweets){
        Set<String>stopWords=new HashSet<>();
        stopWords.add("the");
        stopWords.add("a");
        stopWords.add("an");
        stopWords.add("in");
        Map<String,Integer>wordFreq=new HashMap<>();
        for(String tweet: tweets){
            String[]words=tweet.split("\\s+");
            for(String word: words){
                if(!stopWords.contains((word.toLowerCase()))){
                    wordFreq.put(word.toLowerCase(),wordFreq.getOrDefault(word.toLowerCase(),0)+1);

                }
            }
        }
        String mostCommonWord="";
        int maxFreq=0;
        for(Map.Entry<String,Integer>entry: wordFreq.entrySet()){
            if (entry.getValue()>maxFreq){
                mostCommonWord=entry.getKey();
                maxFreq=entry.getValue();
            }
        }
        return mostCommonWord;
    }

    public static void main(String[] args) {
        ArrayList<String>tweets= new ArrayList<>();
        tweets.add("This is a tweet about java programming ");
        tweets.add("Java is awesome");
        tweets.add("I love coding in java");
        TweetAnalyzer analyzer=new TweetAnalyzer();
        String mostCommanWord=analyzer.findMostCommonWord(tweets);
        System.out.println("Most common word: " +mostCommanWord);
    }
}
