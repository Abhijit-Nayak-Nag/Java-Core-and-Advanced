package Day_6.SentenceOperations;
import java.util.HashMap;
import java.util.Map;


public class SentenceOperations {
    public static String reverseWords(String sentence){
        String[]words = sentence.split("\\S+");
        StringBuilder reversed =new StringBuilder();
        for (int i= words.length-1;i>=0;i--){
            reversed.append(words[i]).append(" ");
        }
        return reversed.toString().trim();
    }
    public static String removeVowels(String sentence){
        return sentence.replaceAll("[aeiouAEIOU]" , " ");
    }
    public static boolean isPalindrome(String sentence){
        String cleanSentence = sentence.replaceAll("[^a-zA-Z]"," ").toLowerCase();
        int left=0;
        int right=cleanSentence.length()-1;
        while(left<right){
            if(cleanSentence.charAt(left)!=cleanSentence.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;

    }
    public static Map<Character, Integer> characterFrequency(String sentence){
        Map<Character,Integer>frequencyMap=new HashMap<>();
        for(char ch: sentence.toCharArray()){
            if (Character.isLetter(ch)){
                frequencyMap.put(ch, frequencyMap.getOrDefault(ch,0)+1);
            }
        }
        return frequencyMap;
    }
    public static String capitalizeFirstLetter(String sentence){
        StringBuilder result = new StringBuilder();
        boolean capitalizeNext= true;
        for(char ch: sentence.toCharArray()){
            if(Character.isLetter(ch)){
                if(capitalizeNext){
                    result.append(Character.toUpperCase(ch));
                    capitalizeNext=false;
                }else{
                    result.append(ch);
                }

            }else if(ch==' '){
                capitalizeNext=true;
                result.append(ch);
            }else{
                result.append(ch);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String sentence="Hello, World! This is a test sentence.";
        System.out.println("World Reversal: " +reverseWords(sentence));
        String modifiedSentence=removeVowels(sentence);
        System.out.println("Is Palindrome: " +isPalindrome(modifiedSentence));
        System.out.println("Character frequency: " +characterFrequency(sentence));
        System.out.println("Capitalized :" +capitalizeFirstLetter(sentence));
    }

}
