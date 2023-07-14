package Dz_0507.task2;

import java.util.Scanner;

/*
Создайте новый класс имяклассаException, который будет расширять класс Exception.
свойство message - сообщение об ошибке, заданное при создании объекта исключения принимается через конструктор

в маине через сканер принимаем название города
данный ексепеш будет вызываться если ввести город  любой кроме Москва Ростов Воронеж Сочи Краснодар
в самом сообщениее ошибки будет указан город который пытался ввести пользователь

обработать ексепшен
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Введите название города");
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        if (input.contains("Москва") ||
                input.contains("Ростов") ||
                input.contains("Воронеж") ||
                input.contains("Сочи") ||
                input.contains("Краснодар")) {
            System.out.println("Ваш город был записан");
        } else {
            try {
                throw new inputException(input);
            } catch (inputException e) {
                e.printStackTrace();
                System.out.println("Введен неправильный город");
            }
        }
        System.out.println("Завершение работы");
        in.close();
    }
}
