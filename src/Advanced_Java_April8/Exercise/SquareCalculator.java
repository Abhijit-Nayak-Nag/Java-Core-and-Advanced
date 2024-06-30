package Advanced_Java_April8.Exercise;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.*;
public class SquareCalculator implements  Callable<Integer>{
    private final int number;
    private SquareCalculator(int number){
        this.number = number;
    }

    @Override
    public Integer call() throws Exception {
        return number * number ;
    }

    public static void main(String[] args) {
        List<Integer>numbers= new ArrayList<>();
        numbers.add(3);
        numbers.add(5);
        numbers.add(7);

        ExecutorService executor= Executors.newFixedThreadPool(numbers.size());
        List<Future<Integer>> futures= new ArrayList<>();
        for(int num :numbers){
            Callable<Integer> squareCalculator= new SquareCalculator(num);
            Future<Integer>future= executor.submit(squareCalculator);
            futures.add(future);
        }
        for (Future<Integer> future : futures) {
            try {
                int square = future.get();
                System.out.println("Square of " + Math.sqrt(square) + ": " + square);
            } catch(InterruptedException | ExecutionException e){
                e.printStackTrace();
            }
            executor.shutdown();
        }
    }
}
