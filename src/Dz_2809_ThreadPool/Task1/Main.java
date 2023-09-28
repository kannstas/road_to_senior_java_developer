package Dz_2809_ThreadPool.Task1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/*
Написать 3 класса которые имплементят Runnable
1 выводит отправка файла 1
2 выводит отправка файла 2
3 выводит отправка файла 3
все выводы через фор с задержкой в 0.5 сек

запустисть все задачи в пуле где есть 3 потока
после завершения всех выводов вывести сообщение программа завершенна

 */
public class Main {
    public static void main(String[] args) {
        Lock lock = new ReentrantLock();
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        executorService.execute(new Send1(lock));
        executorService.execute(new Send2(lock));
        executorService.execute(new Send3(lock));

        executorService.shutdown();

        try {
            executorService.awaitTermination(20, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Маин завершил работу");
    }
}

class Send1 implements Runnable {
    Lock lock;

    public Send1(Lock lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        lock.lock();
        for (int i = 0; i < 10; i++) {
            System.out.println("отправка файла 1");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        lock.unlock();
    }
}

class Send2 implements Runnable {
    Lock lock;

    public Send2(Lock lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        lock.lock();
        for (int i = 0; i < 10; i++) {
            System.out.println("отправка файла 2");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        lock.unlock();

    }
}

class Send3 implements Runnable {
    Lock lock;

    public Send3(Lock lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        lock.lock();
        for (int i = 0; i < 10; i++) {
            System.out.println("отправка файла 3");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        lock.unlock();

    }
}

