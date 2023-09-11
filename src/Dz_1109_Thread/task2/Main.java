package Dz_1109_Thread.task2;

import java.util.Arrays;
import java.util.Scanner;

/*
дз 2
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
проверить результат после чего методы on и off сделать статическими и снова запустить и сравнить результаты


 */
public class Main {
    public static void main(String[] args) {
        ShoppingMall shoppingMall = new ShoppingMall();
        MyRunnable1 myRunnable1 = new MyRunnable1();
        MyRunnable2 myRunnable2 = new MyRunnable2();

        Thread thread = new Thread(myRunnable1);
        Thread thread1 = new Thread(myRunnable2);

        thread.start();
        thread1.start();



    }


    static class ShoppingMall {
        String[] lamps = new String[15];


        public void on() {
            for (int i = 0; i < lamps.length; i++) {
                lamps[i] = "включен";
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }


        public void off() {

            for (int i = lamps.length; i >= 0; i--) {
                System.out.println("выключен" + Thread.currentThread().getName());
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }


    static class MyRunnable1 implements Runnable {
        ShoppingMall shoppingMall;

        @Override
        public void run() {
            shoppingMall.on();
        }
    }


    static class MyRunnable2 implements Runnable {

        ShoppingMall shoppingMall;

        @Override
        public void run() {
            shoppingMall.off();
        }


    }
}
