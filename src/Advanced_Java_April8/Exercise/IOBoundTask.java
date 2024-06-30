package Advanced_Java_April8.Exercise;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;
public class IOBoundTask implements Callable<String> {
    private final String taskName;
    public IOBoundTask(String taskName){
        this.taskName=taskName;
    }
    public String call() throws Exception{
        Thread.sleep(1000);
        return taskName + " completed ";
    }

    public static void main(String[] args) {
        List<Callable<String>> ioTasks= new ArrayList<>();
        ioTasks.add(new IOBoundTask("IOBound Task1"));
        ioTasks.add(new IOBoundTask("IOBound Task1 = 2"));
        ioTasks.add(new IOBoundTask("IOBound Task1 = 3"));
        ExecutorService executor= Executors.newFixedThreadPool(ioTasks.size());
        List<Future<String>> futures;
        try{
            futures = executor.invokeAll(ioTasks);
        }catch(InterruptedException e){
            e.printStackTrace();
            return;
        }
        for(Future<String> future : futures){
            try{
                String result= future.get();
                System.out.println(result);
            }catch(InterruptedException | ExecutionException e){
                e.printStackTrace();
            }
        }
    }

}
