package Day_6.ReverseCharacterArray;
import java.util.ArrayList;
import java.util.List;

public class ReverseCharacterArray {
    public static List<Integer>findMatchingIndices(char[]arr){
        List<Integer>matchingIndices=new ArrayList<>();
        char[]reversedArray= new char[arr.length];
        for(int i=0;i<arr.length;i++){
            reversedArray[i]=arr[arr.length-1-i];
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]==reversedArray[i]) {
                matchingIndices.add(i);
            }

        }
        return matchingIndices;
    }

    public static void main(String[] args) {
        char[]arr1={'h','e','l','l','o'};
        System.out.println(findMatchingIndices(arr1));
        char []arr2={'a','i','p','h','a','b','e','t'};
        System.out.println(findMatchingIndices(arr2));
    }

}
