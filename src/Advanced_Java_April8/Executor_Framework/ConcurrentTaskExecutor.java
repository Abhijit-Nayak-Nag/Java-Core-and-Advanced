package Advanced_Java_April8.Executor_Framework;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
public class ConcurrentTaskExecutor {
    public static void main(String[] args) {
        List<Runnable> tasks = new ArrayList<>();
        tasks.add(new MessagePrinter("Task 1"));
        tasks.add(new MessagePrinter("Task 2"));
        tasks.add(new MessagePrinter("Task 3"));
        tasks.add(new MessagePrinter("Task 4"));
        int poolSize = 3;
        ExecutorService executor = Executors.newFixedThreadPool(poolSize);
        for (Runnable task : tasks) {
            executor.execute(task);
        }
        executor.shutdown();
    }
}
class MessagePrinter implements Runnable{
    private String message;
    public MessagePrinter (String message){
        this.message= message;
    }
    public void run(){
        System.out.println("Executing task : " + message);
        try{
            Thread.sleep(1000);

        }catch(InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println("Task completed: " + message);
    }
}
