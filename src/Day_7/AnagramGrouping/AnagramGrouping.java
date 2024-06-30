package Day_7.AnagramGrouping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AnagramGrouping {
    public static List<List<String>>groupAnagrams(String[]words){
        Map<String, List<String>>map=new HashMap<>();
        for(String word: words)
        {
            char[]chars= word.toCharArray();
            Arrays.sort(chars);
            String sortedWord=new String(chars);
            if(!map.containsKey(sortedWord)){
                map.put(sortedWord, new ArrayList<>());
            }
            map.get(sortedWord).add(word);
        }
        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        String[]words={"eat","tea","tan","ate","nat","bat"};
        List<List<String>>anagramGroups=groupAnagrams(words);
        System.out.println("Anagram Groups");
        for (List<String>group: anagramGroups){
            System.out.println(group);
        }
    }



}
