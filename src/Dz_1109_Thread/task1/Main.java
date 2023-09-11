package Dz_1109_Thread.task1;
/*
дз 1
создать 2 потока которые выводят сообщение привет я поток 1 (2) - 10 раз с задержкой 1 сек с помощью интерфейса runabl
создать 2 потока которые выводят сообщение привет я поток 3 (4) - 10 раз с задержкой 1 сек с помощью наследования от класса Thread

так же в маине запустить цикл который выводит сообщение работает главный поток 10 раз с задержкой 2 секунды

запустить все потоки

 */
public class Main {
    public static void main(String[] args) {

        MyRunnable myRunnable = new MyRunnable();


        Thread thread = new Thread(myRunnable);
        Thread thread1 = new Thread(myRunnable);

        thread.start();
        thread1.start();

        MyThread myThread = new MyThread();

        Thread thread3 = new Thread(myThread);
        Thread thread4 = new Thread(myThread);

        thread3.start();
        thread4.start();

        for (int i = 0; i < 10 ; i++) {
            System.out.println("Работает главный поток");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }


    }


    static class MyRunnable implements Runnable {
        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                System.out.println("Привет, я поток " + Thread.currentThread().getName() + " " + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

        }
    }


    static class MyThread extends Thread {
        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                System.out.println("Привет, я поток " + Thread.currentThread().getName() + " " + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

        }
    }
}
