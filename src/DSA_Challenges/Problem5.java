package DSA_Challenges;
import java.util.*;
public class Problem5 {
    public static int maximumSkips(int n,int[]ratings){
        int maxSkips=0;
        for(int i=0;i<n;i++){
            int skips=0;
            for(int j=i+1;j<n;j++){
                if(ratings[j]>ratings[i]){
                    skips++;
                }
            }
            maxSkips=Math.max(maxSkips,skips);
        }
        return maxSkips;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in );
        int n= sc.nextInt();
        int []ratings=new int[n];
        for(int i=0;i<n;i++){
            ratings[i]=sc.nextInt();
        }
        System.out.println(maximumSkips(n,ratings));
    }

}
