package gl.multithreadingAndexecutorservice.threadclass;

public class NeedOfMultiThreading {
    public static void main(String[] args) {

        long startTime= System.currentTimeMillis();
        // First task
        for (int i = 1; i <= 1000; i++) {
            System.out.printf("%d* ", i);
        }

        System.out.println("\n * task is complete");

       // second task
        for (int i = 1; i <= 1000; i++) {
            System.out.printf("%d$ ", i);
        }

        System.out.println("\n $ task is complete");

        // Third task
        for (int i = 1; i <= 1000; i++) {
            System.out.printf("%d# ", i);

        }
        System.out.println("\n # task is complete");
       long endTime= System.currentTimeMillis();

        System.out.printf("Total time taken: %d", endTime-startTime);

    }

}
