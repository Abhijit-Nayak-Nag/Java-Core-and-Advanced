package Day_10.SearchingQns;
import java.util.ArrayList;
import java.util.List;
public class DNAPatternSearch {
    private static int[]computePrefixFunction(String pattern){
        int[] prefix=new int[pattern.length()];
        int j=0;
        int i=0;
        for(i=1; i<pattern.length();i++){
            while(j>0 && pattern.charAt(i)!=pattern.charAt(j)){
                j=prefix[j-1];
            }
            if(pattern.charAt(i)==pattern.charAt(j)){
                j++;
            }
            prefix[i]=j;
        }
        return prefix;
    }
    public static List<Integer> searchPattern(String dnaSequence, String pattern){
        List<Integer>positions=new ArrayList<>();
        int[] prefix=computePrefixFunction(pattern);
        int j=0;
        for(int i=0;i<dnaSequence.length();i++){
            while(j>0 && dnaSequence.charAt(i)!=pattern.charAt(j)){
                j=prefix[j-1];
            }
            if(dnaSequence.charAt(i)==pattern.charAt(j)){
                j++;
            }if (j==pattern.length()){
                positions.add(i-j+1);
                j=prefix[j-1];
            }
        }
        return positions;

    }

    public static void main(String[] args) {
        String dnaSequence="ATCGATCGATCGATCGATCG";
        String pattern="ATCG";
        List<Integer>positions=searchPattern(dnaSequence,pattern);
        if(pattern.isEmpty()){
            System.out.println("Pattern not found in DNA sequence");
        }else{
            System.out.println("Patetrn found at position: " +positions);
        }
    }

}
