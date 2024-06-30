package gl.multithreadingAndexecutorservice.threadclass;

public class ThirdTask extends Thread{
    @Override
    public void run() {
        for (int i = 1; i <= 1000; i++) {
            System.out.printf("%d# ", i);
        }
        System.out.println("\n # task is complete " + Thread.currentThread().getName());
    }
}
