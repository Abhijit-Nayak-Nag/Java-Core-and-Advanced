package Day_6.MostFrequentWord;
import java.util.HashMap;
import java.util.Map;

public class MostFrequentWord {
    public static String findMostFrequentWord(String text) {
        String[] words = text.toLowerCase().split("\\W+");
        Map<String, Integer> wordCounts = new HashMap<>();

        for (String word : words) {
            wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);
        }

        String mostFrequentWord = "";
        int maxCount = 0;
        for (Map.Entry<String, Integer> entry : wordCounts.entrySet()) {
            if (entry.getValue() > maxCount) {
                mostFrequentWord = entry.getKey();
                maxCount = entry.getValue();
            }
        }

        return mostFrequentWord;
    }
    public static void main(String[] args) {
        // Sample text
        String text = "Java is a programming language. Java is widely used in software development.";

        // Find the most frequent word
        String mostFrequentWord = MostFrequentWord.findMostFrequentWord(text);

        // Display the result
        if (!mostFrequentWord.isEmpty()) {
            System.out.println("Most frequent word: " + mostFrequentWord);
        } else {
            System.out.println("No words found in the given text.");
        }
    }
}


