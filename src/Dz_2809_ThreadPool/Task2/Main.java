package Dz_2809_ThreadPool.Task2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/*
Написать 1 класса которые имплементят Runnable
выводит через цикл фор отправка файла потоком + название потока
в маине цикл фор который запускает данную задачу 7 раз тред пулом
где каждая задача запускается через 7 секунд после запуска предыдущей
и работает с передичностью в 1 секунду
остановить через 10 сек пул потоков методом shutdown()
 */
public class Main {
    public static void main(String[] args) {
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(1);

        for (int i = 0; i < 7; i++) {
            scheduledExecutorService.scheduleWithFixedDelay(new MyRunnable(),7, 1, TimeUnit.SECONDS );

        }

        try {
            scheduledExecutorService.awaitTermination(10, TimeUnit.SECONDS);
            scheduledExecutorService.shutdown();
            System.out.println("время истекло");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }
}

class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("отправка файла потоком " + Thread.currentThread().getName());
    }

}
