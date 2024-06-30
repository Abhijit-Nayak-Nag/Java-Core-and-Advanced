package gl.multithreadingAndexecutorservice.threadclass;

public class FirstTask extends Thread {
    @Override
    public void run() {
        // First task
        for (int i = 1; i <= 1000; i++) {
            System.out.printf("%d* ", i);
        }

        System.out.println("\n * task is complete " + Thread.currentThread().getName());
    }
}
