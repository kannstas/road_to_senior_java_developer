package Lesson.classThread;

import java.util.concurrent.locks.Lock;

public class DeadLockEx {
    public static void main(String[] args) throws InterruptedException {
        MyThread myThread = new MyThread();
        MyThread2 myThread2 = new MyThread2();

        myThread2.start();
        myThread.start();



    }

    static Object lock = new Object();
    static Object lock1 = new Object();




}

class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("Попытка занять монитор lock1 потоком Thread-0");

        synchronized (DeadLockEx.lock) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("монитор lock1 занят thread-0");
            System.out.println("Попытка занять монитор lock2 потоком Thread-0");
            




            synchronized (DeadLockEx.lock1) {
                System.out.println("монитор lock2 занят thread-0");
            }
        }
    }

}

class MyThread2 extends Thread {
    @Override
    public void run() {
        System.out.println("Попытка занять монитор lock2 потоком Thread-1");

        synchronized (DeadLockEx.lock) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("монитор lock2 занят thread-1");
            System.out.println("Попытка занять монитор lock1 потоком Thread-1");

            synchronized (DeadLockEx.lock1) {
                System.out.println("монитор lock1 занят thread-1");
            }
        }
    }

}