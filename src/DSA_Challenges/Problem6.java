package DSA_Challenges;
import java.util.*;
public class Problem6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N= sc.nextInt();
        int[][]toolBox=new int[N][];
        for(int i=0;i<N;i++){
            int M=sc.nextInt();
            toolBox[i]=new int[M];
            for(int j=0; j<M; j++){
                toolBox[i][j]=sc.nextInt();
            }
        }
        int X= sc.nextInt();
        int Y= sc.nextInt();
        int number=toolBox[X-1][Y-1];
        System.out.println(number);
    }

}
