package Dz_0210_Callable_Semaphore_CountDownLatch.Task2;

import java.util.Locale;
import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/*
написать класс Task1 который наследуется  от Thread
прнимает имя и семафор
который выводит в цикле фор 20 раз сообщение каждую секунду
Загружен картинка файл с сервера + i пользователем + name

написать класс Task2 который наследуется  от Thread
прнимает имя и семафор
который выводит в цикле фор 20 раз сообщение каждые 5 секунд
Загружен видео файл с сервера + i пользователем + name

в маине создать семафор и 2 объекта Task1 и 3 объекта Task2
передать в них имена пользователей и семафор(который работает только с 2 потоками)

запустить все потоки
 */
public class Main {
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(2);


        new Task1("Катя",semaphore);
        new Task1("Лиза",semaphore);

        new Task2("Яна", semaphore);
        new Task2("Петя", semaphore);
        new Task2("Настя", semaphore);

    }
}

class Task1 extends Thread {
    String name;
    Semaphore semaphore;

    public Task1(String name, Semaphore semaphore ) {
        this.name = name;
        this.semaphore = semaphore;
        this.start();
    }

    @Override
    public void run() {

        for (int i = 0; i < 10; i++) {
            try {
                semaphore.acquire();

                System.out.println("Загружена картинка с сервера " + i + " пользователем " + name);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } finally {
                semaphore.release();

            }


        }
    }
}

class Task2 extends Thread {
    String name;
    Semaphore semaphore;


    public Task2(String name, Semaphore semaphore) {
        this.name = name;
        this.semaphore = semaphore;

        this.start();
    }

    @Override
    public void run() {

        for (int i = 0; i < 10; i++) {
            try {
                semaphore.acquire();
                System.out.println("Загружен видео файл с сервера " + i + " пользователем " + name);
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } finally {
                semaphore.release();
            }

        }
    }
}
