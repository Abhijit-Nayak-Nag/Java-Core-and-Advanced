//package DSA_Challenges;
//import java.time.Duration;
//import java.util.LinkedList;
//import java.util.Queue;
//import java.util.Scanner;
//public class Problem4 {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner (System.in);
//        int N= sc.nextInt();
//        sc.nextLine();
//        String T= sc.nextLine();
//        Queue<String>queue= new LinkedList<>();
//        for(int i= 0; i<N; i++){
//            queue.add(sc.nextLine());
//            int result= teamScore(N,T,queue);
//            System.out.println(result);
//        }
//    }
//    private static int teamScore(int N, String T, Queue<String>queue ){
//        int teamScore=0;
//        Duration thresold=convertToDuration(T);
//        for(int i=0, i<N, i++){
//            Duration driverTime=convertToDuration(queue.poll());
//            if(driverTime.compareTo(thresold)<=0){
//                teamScore++;
//            }else{
//                break;
//            }
//
//        }
//
//        return teamScore;
//    }
//
//}
