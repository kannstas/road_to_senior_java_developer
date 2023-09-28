package Lesson.ThreadPool;

import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(3);
       // ExecutorService executorService = Executors.newSingleThreadExecutor();

        for (int i = 0; i < 10; i++) {
            executorService.execute(new MyRunnable("Anna" + i));
        }
        executorService.shutdown();

        try {
            executorService.awaitTermination(1002, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Маин завершил работу");


        ScheduledExecutorService scheduledExecutorService =
                Executors.newScheduledThreadPool(3);

//        scheduledExecutorService.schedule(new MyRunnable("Tom"),5,TimeUnit.SECONDS);
        scheduledExecutorService.scheduleAtFixedRate(new MyRunnable("Tom"),2,5,TimeUnit.SECONDS);

        try {
            Thread.sleep(20000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        scheduledExecutorService.shutdown();


    }
}

class MyRunnable implements Runnable {
    String name;

    public MyRunnable(String name) {
        this.name = name;
    }

    @Override
    public void run() {

           System.out.println(Thread.currentThread().getName()+" " + name + " звонит");
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

    }
}
