package Day_8.FirstNonRepeatingCharacter;
import java.util.*;
public class FirstNonRepeatingCharacter {
    private LinkedHashMap<Character, Integer>charCounts;
    private Set<Character>repeatedChars;
    public FirstNonRepeatingCharacter(){
        charCounts=new LinkedHashMap<>();
        repeatedChars=new HashSet<>();
    }
    public void addCharacter(char ch){
        if(repeatedChars.contains(ch)){
            return;
        }
        charCounts.put(ch,charCounts.getOrDefault(ch,0)+1);
        if(charCounts.get(ch)==1){
            repeatedChars.add(ch);
        }else{
            repeatedChars.remove(ch);
        }
    }
    public char getFirstNonRepeatingCharacter(){
        for(Map.Entry<Character,Integer>entry: charCounts.entrySet()){
            if(entry.getValue()==1){
                return entry.getKey();
            }
        }
        return '#';
    }

    public static void main(String[] args) {
        FirstNonRepeatingCharacter f = new FirstNonRepeatingCharacter();
        f.addCharacter('a');
        System.out.println("First non-repeating character: " +f.getFirstNonRepeatingCharacter());
        f.addCharacter('b');
        System.out.println("First non-repeating character: " +f.getFirstNonRepeatingCharacter());
        f.addCharacter('a');
        System.out.println("First non-repeating character: " +f.getFirstNonRepeatingCharacter());

    }
}
