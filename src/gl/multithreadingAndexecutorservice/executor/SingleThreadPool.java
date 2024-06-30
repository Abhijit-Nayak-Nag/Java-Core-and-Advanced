package gl.multithreadingAndexecutorservice.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingleThreadPool {
    public static void main(String[] args) {
        ExecutorService service= Executors.newSingleThreadExecutor();
        PrintTaskk task1= new PrintTaskk('*');
        PrintTaskk task2= new PrintTaskk('#');
        PrintTaskk task3= new PrintTaskk('$');

        service.submit(task1);
        service.submit(task2);
        service.submit(task3);

        service.shutdown();

    }


}
