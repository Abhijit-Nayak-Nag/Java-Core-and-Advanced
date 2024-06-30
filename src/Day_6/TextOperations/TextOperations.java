package Day_6.TextOperations;

import java.util.*;

public class TextOperations {
    public static Map<String,Integer>
    wordFrequencyAnalysis(String text, Set<String> stopWords) {
        Map<String, Integer> frequencyMap = new HashMap<>();
        String[] words = text.split("\\s+");
        for (String word : words) {
            word = word.toLowerCase().replaceAll("[^a-zA-Z]", " ");
            if (!stopWords.contains(word)) {
                frequencyMap.put(word, frequencyMap.getOrDefault(word, 0 + 1));

            }
        }
        return frequencyMap;
    }
    public static List<List<String>>anagramGroups(String text) {
        Map<String, List<String>>
                anagramMap = new HashMap<>();
        String[] words = text.split("\\s+");
        for (String word : words) {
            char[] chars = word.toLowerCase().toCharArray();
            Arrays.sort(chars);
            String sortedWord = new String(chars);
            anagramMap.putIfAbsent(sortedWord, new ArrayList<>());
            anagramMap.get(sortedWord).add(word);
        }
        return new ArrayList<>(anagramMap.values());

    }
    public static List<String>sentenceSorting(String text) {
        String[] sentences = text.split("[.!?]\\s*");
        Arrays.sort(sentences, Comparator.comparingInt(s -> s.split("\\s+").length));
        return Arrays.asList(sentences);
    }
    public static String textEncryption(String text,int shift) {
        StringBuilder encryptedText = new StringBuilder();
        for (char ch : text.toCharArray()) {
            if (Character.isLetter(ch)) {
                char base = Character.isLowerCase(ch) ? 'a' : 'A';
                encryptedText.append(ch);
            }
        }
        return encryptedText.toString();
    }

    public static void main(String[] args) {
        String text= "This is a sample text. It contains some words and sentences. " +"We will analyze this text for word frequency, anagrams, and sentence sorting. " +"We will also encrypt the text using a Caesar cipher. ";
        Set<String>stopWords = new HashSet<>(Arrays.asList("the", "and", "is","a","it","for","we", "will","this","some","also","using","and","in","of","to"));
        System.out.println("Word Frequency Analysis: ");
        Map<String, Integer>wordFrequency=wordFrequencyAnalysis(text,stopWords);
        wordFrequency.forEach((word, frequency)-> System.out.println(word +":"+frequency));
        System.out.println("\nAnagram Groups:");
        List<List<String>>anagramGroups=anagramGroups(text);
        anagramGroups.forEach(group->{
            if(group.size()>1){
                System.out.println(group);
            }
        });
        System.out.println("\nSentences Sorting: ");
        List<String>sortedSentences=sentenceSorting(text);
        sortedSentences.forEach(System.out::println);
        System.out.println("\nEncrypted Text: ");
        String encryptedText=textEncryption(text,3);
        System.out.println(encryptedText);
    }
    }
