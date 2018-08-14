package threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class App2 implements Runnable {
    private final int loopLimit;

    public App2(int loopLimit){
        this.loopLimit = loopLimit;
        ExecutorService taskList = Executors.newFixedThreadPool(100);
        taskList.execute(this);
        taskList.execute(this);
        taskList.execute(this);
        taskList.shutdown();
    }

    private void pause (double secconds){
        try{
            Thread.sleep(Math.round(1000.0 * secconds));
        } catch (InterruptedException ie) { }
    }

    @Override
    public void run() {
        for(int i = 0; i<loopLimit; i++){
            String threadName = Thread.currentThread().getName();
            System.out.printf("%s: %s%n", threadName, i);
            pause(Math.random());
        }
    }
}
