package threads;

// Using InnerClasses

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class App3 {
    public App3() {
        int poolSize = 100;
        ExecutorService taskList = Executors.newFixedThreadPool(poolSize);

        taskList.execute(new RunnableClass(5));
        taskList.execute(new RunnableClass(4));
        taskList.execute(new RunnableClass(6));
        taskList.shutdown();
    }

   private  void pause (double secconds){
        try{
            Thread.sleep(Math.round(1000.0 * secconds));
        } catch (InterruptedException ie) { }
   }

   private class RunnableClass implements Runnable {
       private int someSize;

       public RunnableClass(int someSize) {
           this.someSize = someSize;
       }

       @Override
       public void run() {
           for (int i = 0; i< someSize; i++){
               String s = Thread.currentThread().getName();
               System.out.printf("%s: %s%n", s, i);
               pause(Math.random());
           }
       }
   }
}
