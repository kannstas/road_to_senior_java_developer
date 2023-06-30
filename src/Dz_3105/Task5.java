package Dz_3105;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        System.out.println("Введите порядковый номер месяца");
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        String[] month = {"январь", "февраль", "март", "апрель", "май", "июнь", "июль", "август", "сентябрь", "октябрь", "ноябрь", "декабрь"};
        System.out.println(month[number - 1]);

    }
}

