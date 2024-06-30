package Day_6.FibonacciWithMemoization;
import java.util.HashMap;

public class FibonacciWithMemoization {
    private static final HashMap<Integer, Integer>memo= new HashMap<>();
    public static int fibonnaci(int n) {
        if (n <= 1) {
            return n;
        }
        if (memo.containsKey(n)) {
            return memo.get(n);

        }
        int fib = fibonnaci(n - 1);
        return fib;
    }
    public static void main(String[] args){
        int n=10;
        System.out.println("The " +n + "th fibonnaci number is :" +fibonnaci(n));

    }
}
