package Day_8.StockSpan;
import java.util.*;

public class StockSpan {
    public static int[]calculateSpan(int[] prices){
        int n= prices.length;
        int[]spans =new int [n];
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        spans[0]=1;
        for(int i=1; i<n; i++){
            while(!stack.isEmpty() && prices[i] >=prices[stack.peek()]){
                stack.pop();
            }
            if (stack.isEmpty()) {
                spans[i]=i+1;
            }else {
                spans[i]=i-stack.peek();
            }
            stack.push(i);
        }
        return spans;

    }

    public static void main(String[] args) {
        int[] prices1= {100,80,60,75,85};
        int[]spans1=calculateSpan(prices1);
        System.out.println("Output for prices1 :" +Arrays.toString(spans1));
        int[]prices2={10,4,5,90,120,80};
        int[]spans2=calculateSpan(prices2);
        System.out.println("Output for prices2 :" +Arrays.toString(spans2));
    }
}
