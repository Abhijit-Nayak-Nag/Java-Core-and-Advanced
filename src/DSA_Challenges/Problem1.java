package DSA_Challenges;
import java.util.*;
import java.io.*;
import java.math.*;

public class Problem1 {
    public static void main(String[] args) throws java.lang.Exception{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine().trim());
        int A[]= new int[N];
        String S[]= br.readLine().trim().split(" ");
        for (int i =0; i<N; i++){
            A[i]=Integer.parseInt(S[i]);
        }
        HashMap<Integer, Integer>hmap=new HashMap<>();
        for(int i=0;i<N;i++){
            hmap.put(A[i], hmap.getOrDefault(A[i], 0)+1);
        }
        System.out.println(frequencyAverage(N,A,hmap));


    }
    public static int frequencyAverage(int N, int[] A, HashMap<Integer,Integer> hmap){
        int totalMedicines = 0;
        int totalFrequency=0;
        for(int frequency : hmap.values()){
            totalFrequency+=frequency;
        }
        totalMedicines=hmap.size();
        int average=(int)Math.ceil((double)totalFrequency/totalMedicines);
        System.out.println(totalMedicines);
        TreeMap<Integer, Integer>sortedMap=new TreeMap<>(hmap);
        for (int frequency:sortedMap.values()){
            System.out.println(frequency);
        }
        return average;
    }
}
