package Advanced_Java_April8.Exercise;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;
public class TaskMonitoringSystem {
    public static void main(String[] args) {
        List<Callable<String>> tasks = new ArrayList<>();
        tasks.add(new FileProcessingTask("Task1"));
        tasks.add(new FileProcessingTask("Task2"));
        tasks.add(new FileProcessingTask("Task3"));
        ExecutorService executor = Executors.newSingleThreadExecutor();
        List<Future<String>> futures = new ArrayList<>();
        for (Callable<String> task : tasks) {
            Future<String> future = executor.submit(task);
            futures.add(future);
        }
        while (!futures.isEmpty()) {
            for (Future<String> future : new ArrayList<>(futures)) {
                if (future.isDone()) {
                    try {
                        String result = future.get();
                        System.out.println("Task Completed: " + result);
                        futures.remove(future);
                    } catch (InterruptedException | ExecutionException e) {
                        e.printStackTrace();
                    }
                } else {
                    System.out.println("Task in Progress");
                }
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        executor.shutdown();
    }
}
       class FileProcessingTask implements Callable<String>{
       private final String taskname;
        public FileProcessingTask(String taskname){
            this.taskname=taskname;
        }

         @Override
         public String call() throws Exception {
            Thread.sleep(3000);
             return taskname;
         }
}
