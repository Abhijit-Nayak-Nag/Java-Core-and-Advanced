package Advanced_Java_April8.Exercise;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class TaskCompletionHandling {
    public static void main(String[] args) {
        List<Callable<Void>> tasks = new ArrayList<>();
        tasks.add(new DatabaseUpdateTask("Task1"));
        tasks.add(new ResourceCleanupTask("task2"));
        tasks.add(new DatabaseUpdateTask("Task3"));
        ExecutorService executor = Executors.newFixedThreadPool(tasks.size());
        List<Future<Void>> futures = new ArrayList<>();
        for(Callable<Void>task : tasks){
            Future<Void> future = executor.submit(task);
            futures.add(future);
        }
        for(Future<Void> future : futures){
            try{
                future.get();
            }catch(InterruptedException | ExecutionException e){
                e.printStackTrace();
            }
        }
        executor.shutdown();

    }
}
class DatabaseUpdateTask implements Callable<Void>{
    private final String taskName;
    public DatabaseUpdateTask(String taskName){
        this.taskName = taskName;
    }
    public Void call() throws Exception{
        System.out.println(taskName + ": Performing database update...");
        Thread.sleep(2000);
        System.out.println(taskName + ": Database update completed... ");
        return null;
    }
}
class ResourceCleanupTask implements Callable<Void>{
    private final String taskName;
    public ResourceCleanupTask(String taskName){
        this.taskName= taskName;
    }
    public Void call()throws Exception{
        System.out.println(taskName + ": Performing resource cleanup.." );
        Thread.sleep(3000);
        System.out.println(taskName + ": Resource cleanup completed." );
        return null;
    }
}
