package DSA_MockExercise;

import java.util.*;
import java.util.Scanner;
//class frequency{
public class UniqueValuesFrequencyAverage {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        sc.nextLine();
        int [] array=new int [size];
        for(int i=0;i<size;i++){
            array[i]=sc.nextInt();
        }
        Map<Integer,Integer>frequency=new HashMap<>();
        for (int num:array){
            frequency.put(num,frequency.getOrDefault(num,0)+1);
        }
        List<Integer>sortedFreq= new ArrayList<>(frequency.values());
        Collections.sort(sortedFreq,Collections.reverseOrder());
        int uniqueCount=sortedFreq.size();
        double average=(double) size/uniqueCount;
        System.out.println(uniqueCount);
        for(int freq:sortedFreq){
            System.out.println(freq);
        }
        System.out.println((int)average);
    }

}