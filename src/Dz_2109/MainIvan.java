package Dz_2109;

import java.util.List;
import java.util.function.Supplier;

/*

Задание по синхронизации
создать проект в потоке создать 3 потока  через анонимные классы
создать класс Weather
в нем метод который выводит погоду в Москве 10 раз с задержкой в 1 секунду
в нем метод который выводит погоду в Ростове 10 раз с задержкой в 1 секунду
в нем метод который выводит погоду в Краснодаре 10 раз с задержкой в 1 секунду
методы не отсинхронизированны
запустить каждый метод в потоке
например метод погода в москве в потоке 1 а метод погода в ростове в потоке 2 итд

после посмотреть вывод
далее сделать методы синхронизированные и снова запустить и проверить результат

 */
public class MainIvan {

    public static void main(String[] args) {
//        Thread thread = new Thread();
//        Thread thread1 = new Thread();
//        Thread thread2 = new Thread();
//
//        thread.start();
//        thread1.start();
//        thread2.start();

        List<Thread> threadList = List.of(
                createThread(MainIvan::doSmth),
                createThread(MainIvan::doSmth2),
                createThread(MainIvan::doSmth3)
        );

        threadList.forEach(Thread::start);


    }

    private static Void doSmth() {
        System.out.println("azaaza");
        return null;
    }

    private static Void doSmth2() {
        System.out.println("azaaza2");
        return null;
    }

    private static Void doSmth3() {
        System.out.println("azaaza3");
        return null;
    }

    private static Thread createThread(Supplier<Void> func) {
        return new Thread(func::get);
    }

    class MyThread extends Thread {
        @Override
        public void run() {
            try {
                Weather.weatherInMoscow();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    class MyThread1 extends Thread {
        @Override
        public void run() {
            try {
                Weather.weatherInRostov();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }


    class Weather implements Runnable {
        @Override
        public void run() {

        }

        public static void weatherInRostov() throws InterruptedException {
            System.out.println("Погода в Ростове " + Thread.currentThread().getName());
            Thread.sleep(1000);
        }

        public static void weatherInKrasnodar() throws InterruptedException {
            System.out.println("Погода в Краснодаре " + Thread.currentThread().getName());
            Thread.sleep(1000);
        }

        public static void weatherInMoscow() throws InterruptedException {
            System.out.println("Погода в Москве " + Thread.currentThread().getName());
            Thread.sleep(1000);
        }


    }
}

