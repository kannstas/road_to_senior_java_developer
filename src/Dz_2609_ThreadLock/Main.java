package Dz_2609_ThreadLock;

import java.util.Arrays;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
/*
написать класс ShoppingMall с массивом lamps типа String статичкским с длинной 15 пустой
в данном классе написать метод on() который заполняет массив словом "вклюен" с задержкой 1 сек
в данном классе написать метод off() который заполняет массив словом "выклюен" c с конца массива и с задержкой 1 сек

в маин классе в методе маин создать объект ShoppingMall
создать 2 класса MyRuunable1   и  MyRuunable2 в качестве параметра в конструкторе принимают ShoppingMall
тоесть у них будет такой свойство

в методе run MyRuunable1 вызвать метод on
в методе run MyRuunable2 вызвать метод off

в маине создать 2 thread передат туда объекты  MyRuunable и запустить оба потока
после вывести содержимое масива lamps
проверить результат после чего методы on и off сделать статическими и снова запустить и сравнить результаты RentrainLock
 */

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Lock lock = new ReentrantLock();


        ShoppingMall shoppingMall = new ShoppingMall(lock);
        ShoppingMall shoppingMall1 = new ShoppingMall(lock);


        MyRunnable1 myRunnable1 = new MyRunnable1(shoppingMall);
        MyRunnable2 myRunnable2 = new MyRunnable2(shoppingMall1);

        Thread thread = new Thread(myRunnable1);
        Thread thread1 = new Thread(myRunnable2);

        thread.start();
        thread1.start();

        thread1.join();
        thread.join();

        System.out.println("работа завершена");
        System.out.println(Arrays.toString(shoppingMall.lamps));


    }
}


class ShoppingMall {

    Lock lock;
    static String[] lamps = new String[15];

    public ShoppingMall(Lock lock) {
        this.lock = lock;
    }

    public void on() {

        for (int i = 0; i < lamps.length; i++) {
            lock.lock();
            lamps[i] = "включен";
            System.out.println("включен " + Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } finally {
                lock.unlock();
            }
        }

    }


    public void off() {

        for (int i = lamps.length - 1; i >= 0; i--) {
            lock.lock();
            lamps[i] = "выключен";
            System.out.println("выключен " + Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } finally {
                lock.unlock();
            }

        }
    }
}


class MyRunnable1 implements Runnable {

    ShoppingMall shoppingMall;

    public MyRunnable1(ShoppingMall shoppingMall) {
        this.shoppingMall = shoppingMall;
    }

    @Override
    public void run() {
        shoppingMall.on();
    }
}


class MyRunnable2 implements Runnable {

    ShoppingMall shoppingMall;

    public MyRunnable2(ShoppingMall shoppingMall) {
        this.shoppingMall = shoppingMall;
    }

    @Override
    public void run() {
        shoppingMall.off();
    }


}


