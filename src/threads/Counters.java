package threads;

public class Counters implements Runnable {
    private final int loopLimit;
    private final App1 mainApp;

    public Counters(App1 mainApp, int loopLimit) {
        this.mainApp = mainApp;
        this.loopLimit = loopLimit;
    }

    @Override
    public void run() {
        for (int i = 0; i < loopLimit; i++ ){
            String threadName = Thread.currentThread().getName();
            System.out.printf("%s: %s%n", threadName, i);
            mainApp.pause(Math.random());
        }
    }
}