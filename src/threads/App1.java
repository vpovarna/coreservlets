package threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class App1 {
    public App1(){
        ExecutorService taskList = Executors.newFixedThreadPool(100);
        taskList.execute(new Counters(this,6));
        taskList.execute(new Counters(this, 5));
        taskList.execute(new Counters(this, 4));
        taskList.shutdown();
    }

    public void pause(double seconds){
        try{
            Thread.sleep(Math.round(1000.0 * seconds));
        } catch (InterruptedException ie) { }
    }
}
