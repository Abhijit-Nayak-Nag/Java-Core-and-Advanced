package Advanced_Java_April8.AdditionalExercise;
import java.util.concurrent.ArrayBlockingQueue;
public class ProducerConsumerExample {
    public static void main(String[] args) {
        ArrayBlockingQueue<Integer>queue = new ArrayBlockingQueue<>(10);
        Thread producer1 = new Thread(new Producer(queue, 1));
        Thread producer2 = new Thread(new Producer(queue, 2));
        producer1.start();
        producer2.start();

        Thread consumer1 = new Thread(new Consumer(queue, 1));
        Thread consumer2 = new Thread(new Consumer(queue, 2));
        consumer1.start();
       consumer2.start();

    }
    static class Producer implements Runnable{
        private final ArrayBlockingQueue<Integer> queue;
        private final int producerId;
        public Producer(ArrayBlockingQueue<Integer>queue, int producerId){
            this.queue= queue;
            this.producerId=producerId;
        }
        public void run(){
            try{
                for(int i =0; i<5; i++){
                    int task= producerId * 10 +i;
                    System.out.println("Producer " + producerId + "generated task:" + task);
                    queue.put(task);
                    System.out.println("Producer " + producerId + "enqueued task:" + task);
                    Thread.sleep(1000);
                }
            }catch(InterruptedException e){
                Thread.currentThread().interrupt();
            }
        }
    }
    static class Consumer implements Runnable {
        private final ArrayBlockingQueue<Integer> queue;
        private final int consumerId;

        public Consumer(ArrayBlockingQueue<Integer> queue, int consumerId) {
            this.queue = queue;
            this.consumerId = consumerId;
        }

        public void run() {
            try {
                for (int i = 0; i < 5; i++) {
                    int task = consumerId * 10 + i;
                    System.out.println("Producer " + consumerId + "generated task:" + task);
                    queue.put(task);
                    System.out.println("Producer " + consumerId + "enqueued task:" + task);
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }

}
