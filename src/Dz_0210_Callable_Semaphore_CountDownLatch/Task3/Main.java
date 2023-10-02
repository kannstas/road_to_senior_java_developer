package Dz_0210_Callable_Semaphore_CountDownLatch.Task3;

import java.util.concurrent.CountDownLatch;

/*
CountDownLatch написать с счетчиком 2 статический  в классе

в маине создать 5 персонов и запустить их потоки
так же создать и запустиь след методы

1 метод открытие интернет магазина
вывести сообщение открытие магазина будет через 10 сек
после чего начнется обратный отсчет после чего CountDownLatch счетчик станет на 1 меньше

2 метод старт продаж объявлен
вывести сообщение можно приступить к покупкам через 5 сек
после чего начнется обратный отсчет после чего CountDownLatch счетчик станет на 1 меньше


класс персон у которого есть имя  наследуется от Thread
в методе run вывести начал работу и имя но только если счетчик синхронизатора будет 0
 */
public class Main {
    static CountDownLatch countDownLatch = new CountDownLatch(2);
    public static void main(String[] args) {
        new Person("Gloria", countDownLatch);
        new Person("Kristina", countDownLatch);
        new Person("Ivan", countDownLatch);
        new Person("Karl", countDownLatch);
        new Person("Fiona", countDownLatch);

        openInternetStore();
        startOfSales();
    }


    public static void openInternetStore () {
        System.out.println("Открытие магазина будет через 10 секунд");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        countDownLatch.countDown();
    }

    public static void startOfSales () {
        System.out.println("Можно приступить к покупкам через 5 секунд");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        countDownLatch.countDown();
    }
}

class Person extends Thread {
    String name;
    CountDownLatch countDownLatch;

    public Person(String name, CountDownLatch countDownLatch) {
        this.name = name;
        this.countDownLatch = countDownLatch;
        this.start();
    }

    @Override
    public void run() {
        try {
            countDownLatch.await();
            System.out.println(name + " начал работу");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
