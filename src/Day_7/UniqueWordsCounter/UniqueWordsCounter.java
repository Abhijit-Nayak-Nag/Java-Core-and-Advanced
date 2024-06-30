package Day_7.UniqueWordsCounter;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueWordsCounter {
    public static int countUniqueWords(String sentence){
        String[]words=sentence.split(" ");
        Set<String>uniqueWords=new HashSet<>();
        for(String word: words){
            uniqueWords.add(word.trim().toLowerCase());
        }
        return uniqueWords.size();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter a sentence: ");
        String input=scanner.nextLine();
        scanner.close();
        int uniqueWordCount=countUniqueWords(input);
        System.out.println("Number of unique words: " +uniqueWordCount);

    }

}
