package Dz_1307.task2;
/*
дз 2
интерфейс автомобиля с методами старт стоп инфо
в классе меню создать объект автомобиля с помощью анонимного класса
данный авто при вызове метода старт должен выввести сообщение что авто  X1 заведен
при вызове метода стоп что авто  X1 заглушен
при вызове мметода инфо вывести сообщение это авто X1


в классе меню создать еще один  объект автомобиля с помощью анонимного класса
данный авто при вызове метода старт должен выввести сообщение что авто X2 заведен
при вызове метода стоп что авто X2 заглушен
при вызове мметода инфо вывести сообщение это авто X2

вызвать все методы у данных обектов
 */
public class Main {
    public static void main(String[] args) {
        Auto x1 = new Auto() {
            @Override
            public void info() {
                System.out.println("Это  авто х1");
            }

            @Override
            public void start() {
                System.out.println("авто х1 заведен");
            }

            @Override
            public void stop() {
                System.out.println("авто х1 заглушен");
            }
        };

        Auto x2 = new Auto() {
            @Override
            public void info() {
                System.out.println("Это  авто х2");
            }

            @Override
            public void start() {
                System.out.println("авто х2 заведен");
            }

            @Override
            public void stop() {
                System.out.println("авто х2 заглушен");
            }
        };

        x1.info();
        x1.start();
        x1.stop();
        System.out.println();
        x2.info();
        x2.start();
        x2.stop();
    }
}
