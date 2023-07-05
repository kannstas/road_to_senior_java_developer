package Dz_0507.task1;

import Dz_0507.task1.IncorrectlyEnteredAmountException;

import java.util.Scanner;

/*
Создайте новый класс имяклассаException, который будет расширять класс Exception.
свойство message - сообщение об ошибке, заданное при создании объекта исключения.

в маине через сканер принимаем число от 1000 до 10000
после выводим ваш заказ принят
данный ексепеш будет вызываться если ввести число которое не входит в диапазон
от 1000 до 10000
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Введите сумму товара");
        Scanner in = new Scanner(System.in);
        int sum = in.nextInt();

        if (sum >= 1000 && sum <= 10000) {
            System.out.println("Ваш заказ принят");
        }else {
            try {
                throw new IncorrectlyEnteredAmountException();
            } catch (IncorrectlyEnteredAmountException e) {
            e.printStackTrace();
                System.out.println("Вы ввели неверную сумму");

            }
        }
        in.nextLine();
        System.out.println("Завершение работы");
    }

}

