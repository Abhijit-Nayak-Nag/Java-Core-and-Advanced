package gl.multithreadingAndexecutorservice.threadclass;

import java.util.concurrent.Executors;

public class TestMultiThreading {
    public static void main(String[] args) {
        FirstTask t1= new FirstTask();
        SecondTask t2= new SecondTask();
        ThirdTask t3= new ThirdTask();

        //setting priority to our threads
//        t1.setPriority(1);
//        t2.setPriority(10);
//        t3.setPriority(5);

        //Another approach of set priority.

//        t1.setPriority(Thread.MAX_PRIORITY);
//        t2.setPriority(Thread.MAX_PRIORITY);
//        t3.setPriority(Thread.NORM_PRIORITY);

        long startTime= System.currentTimeMillis();

        // for starting the thread the syntax is t1.start();
        System.out.println("\n starting first Thread");
        t1.start();
        System.out.println("\n starting second Thread");
        t2.start();
        System.out.println("\n starting Third Thread");
        t3.start();

        long endTime= System.currentTimeMillis();
        System.out.println("Total time taken: " +
                Thread.currentThread().getName() + (startTime-endTime));

    }


}
