package DSA_MockExercise;
import java.util.*;
import java.util.Scanner;

public class MinimumNumberOperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        String T = sc.nextLine();
        int[] countsS = countVowelsConsonats(S);
        int[] countsT = countVowelsConsonats(T);
        int diffVowels = Math.abs(countsS[0] - countsT[0]);
        int diffConsonates = Math.abs(countsS[1] - countsT[1]);
        int minOpeartions = Math.max(diffVowels, diffConsonates);
        System.out.println(minOpeartions);
    }
    private static int[]countVowelsConsonats(String str){
        int vowels=0;
        int consonates=0;
        for(char ch: str.toCharArray()){
            if(isVowel(ch)){
                vowels++;
            }else{
                consonates++;
            }
        }
        return new int []{
                vowels,consonates
        };

    }
    private static boolean isVowel(char ch){
        ch=Character.toLowerCase(ch);
        return ch=='a' || ch=='e' ||ch=='i' || ch=='o' ||ch=='o';
    }
}
