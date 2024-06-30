package Day_8.SlidingWindowMaximum;
import java.util.*;
public class SlidingWindowMaximum {
    public static int[]maxSlidingWindow(int[] nums, int k){
        if(nums==null || nums.length==0 || k<=0){
            return new int[0];
        }
        int n=nums.length;
        int[]result=new int [n-k+1];
        Deque<Integer> deque=new LinkedList<>();
        for(int i=0; i<n; i++){
            while(!deque.isEmpty() && deque.peekFirst()<=i-k){
                deque.pollFirst();
            }
            while(!deque.isEmpty() && nums[deque.peekFirst()]<nums[i]){
                deque.pollFirst();
            }
            deque.offerLast(i);
            if(i>=k-1){
                result[i-k +1]=nums[deque.peekFirst()];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr={1,3,-1,-3,5,3,6,7};
        int k=3;
        int[] result=maxSlidingWindow(arr,k);
        System.out.println("Output: " + Arrays.toString(result));
    }

}
