package Advanced_Java_April8.Exercise;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TaskExecutor {
    public static void main(String[] args) {
        List<Runnable> tasks = new ArrayList<>();
        tasks.add(() ->
        System.out.println("Task 1 executing"));
        tasks.add(() ->
        System.out.println("Task 2 executing"));
        tasks.add(() -> {
            int result = performCalculation(5,10);
            System.out.println("Calculation result: " + result);
        });
        ExecutorService executor = Executors.newFixedThreadPool(tasks.size());
        for(Runnable task : tasks){
            executor.execute(task);
        }
        executor.shutdown();

    }
    private static int performCalculation(int a, int b) {
        return a+b;
    }

}
