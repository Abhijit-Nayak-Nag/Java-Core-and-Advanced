package Advanced_Java_April8.AdditionalExercise;
import java.util.concurrent.LinkedBlockingQueue;

public class TaskScheduler {
    public static void main(String[] args) {
        LinkedBlockingQueue<Runnable> taskQueue = new LinkedBlockingQueue<>();
        Thread producer1 = new Thread(new TaskProducer(taskQueue, 1));
        Thread producer2 = new Thread(new TaskProducer(taskQueue, 2));
        producer1.start();
        producer2.start();
        Thread worker = new Thread(new TaskWorker(taskQueue));
        worker.start();

    }
    static class TaskProducer implements Runnable{
        private final LinkedBlockingQueue<Runnable> taskQueue;
        private final int producerId;

        public TaskProducer(LinkedBlockingQueue<Runnable> taskQueue, int producerId){
            this.taskQueue=taskQueue;
            this.producerId= producerId;
        }
        public void run(){
            try{
                for(int i =0; i<5; i++){
                    Runnable task = () ->{
                        System.out.println("Task produced by Producer " + producerId +"is being executed.");

                    };
                    taskQueue.put(task);
                    System.out.println("Task submitted by Producer" + producerId);
                    Thread.sleep(1000);

                }
            }catch (InterruptedException e){
                Thread.currentThread().interrupt();
            }
        }
    }

    static class TaskWorker implements Runnable{
        private final LinkedBlockingQueue<Runnable> taskQueue;

        public  TaskWorker(LinkedBlockingQueue<Runnable> taskQueue){
            this.taskQueue=taskQueue;
        }
        public void run(){
            try{
                while(true){
                    Runnable task=taskQueue.take();
                    System.out.println("Task dequeued from the queue");
                    task.run();
                    System.out.println("Task executed.");

                }
            }catch (InterruptedException e){
                Thread.currentThread().interrupt();
            }
        }
    }


}
