package Day_7.DocumentComparator;
import java.util.*;
public class DocumentComparator {
    public static void main(String[] args) {
        List<String>document1=Arrays.asList("the","quick","brown","fox","jumps","over", "the","brown","fox");
        List<String>document2=Arrays.asList("the", "lazy","dog","jumps","over","the","brown","fox");
        Set<String>uniqueWords=new HashSet<>(document1);
        int commonWordsCount=0;
        for(String word: document2){
            if(uniqueWords.contains(word)){
                commonWordsCount++;
            }
        }
        System.out.println(("Number of Common Words between  the two documents: " +commonWordsCount));
    }

}
