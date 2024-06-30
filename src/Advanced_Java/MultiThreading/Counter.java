package Advanced_Java.MultiThreading;

public class Counter {
    private int count=0;
    public synchronized void increment(){
        count ++;
    }
    public int getCount (){
        return count;
    }
}
class IncrementThread extends Thread{
    private Counter counter;
    private int increments;
    public IncrementThread(Counter counter, int increments){
        this.counter= counter;
        this.increments=increments;
    }
    public void run(){
        for(int i=0; i<increments; i++){
            counter.increment();
        }
    }
}
class Main{
    public static void main(String[] args) throws InterruptedException {
        Counter counter= new Counter();
        IncrementThread thread1 = new IncrementThread(counter, 1000);
        IncrementThread thread2 = new IncrementThread(counter, 1000);
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println("Final count: " + counter.getCount());

    }
}
