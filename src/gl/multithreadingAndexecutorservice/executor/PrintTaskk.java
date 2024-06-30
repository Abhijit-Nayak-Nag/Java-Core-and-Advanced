package gl.multithreadingAndexecutorservice.executor;

public class PrintTaskk implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d%c ", i, targetChar);
        }
        System.out.printf("\n %s %c task is complete ", Thread.currentThread().getName(), targetChar);
    }
    private final char targetChar;

    public PrintTaskk(char targetChar) {
        this.targetChar = targetChar;
    }
}
