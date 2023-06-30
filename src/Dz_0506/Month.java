package Dz_0506;

/*
написать метод который принимает от пользователя число месяца и выводит название этого месяца
пример ввод
1
вывод январь
массив  String a3[] = {"январь", "февраль", "март", "апрель", "май", "июнь", "июль", "август", "сентябрь", "октябрь", "ноябрь", "декабрь"};
использовать массив
все методы в одном классе
 */

import java.util.Scanner;

public class Month {
    public static void main(String[] args) {
        System.out.println("Введите порядковый номер месяца");
        System.out.println(monthName());
    }
    public static String monthName () {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        String a3[] = {"январь", "февраль", "март", "апрель", "май", "июнь", "июль", "август", "сентябрь", "октябрь", "ноябрь", "декабрь"};
        String month = a3[number - 1];
        return month;
    }
}


