package Lesson.classThread;

public class SynchronizedEx {
    public static void main(String[] args) throws InterruptedException {

        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        Thread thread1 = new Thread(myRunnable);
        Thread thread2 = new Thread(myRunnable);

        thread.start();
        thread1.start();
        thread2.start();


        thread1.join();
        thread.join();
        thread2.join();
        System.out.println(Counter.count);
    }
}


class Counter {
    public synchronized static void incrementCount()  {
        count++;
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    static volatile int count = 0;
}

class MyRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            Counter.incrementCount();
            System.out.println(Counter.count + " " + Thread.currentThread().getName());

        }
    }



}