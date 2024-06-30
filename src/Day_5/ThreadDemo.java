package Day_5;
import java.util.concurrent.*;
import java.util.concurrent.locks.*;
import java.util.function.Consumer;

public class ThreadDemo {
    private static ConcurrentLinkedQueue<Integer> queue = new ConcurrentLinkedQueue<>();
    private static ReentrantLock lock = new ReentrantLock();

    public static void main(String[] args) {
        Thread producerThread = new Thread(new Producer());
        Thread consumerThread = new Thread(new Consumer());
        producerThread.start();
        consumerThread.start();
    }

    static class Producer implements Runnable {
        public void run() {
            for (int i = 1; i <= 5; i++) {
                lock.lock();
                try {
                    queue.offer(i);
                    System.out.println("Produced: " + i);
                } finally {
                    lock.unlock();
                }
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

        static class Consumer implements Runnable {
            public void run() {
                for (int i = 1; i <= 5; i++) {
                    lock.lock();
                    try {
                        Integer element = queue.poll();
                        if (element != null) {
                            System.out.println("Consumed: " + element);
                        }

                    } finally {
                        lock.unlock();
                    }
                    try {
                        Thread.sleep(1500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }


