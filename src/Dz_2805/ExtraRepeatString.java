package Dz_2805;

import java.util.Scanner;

public class ExtraRepeatString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = 1;
        while (true) {
            System.out.println("Введите столицу РФ");
            String capital = in.nextLine();
            if (capital.equalsIgnoreCase("Москва")) {
                System.out.println("Правильно!");
                break;
            }else {
                System.out.println("Повторите попытку. Попытка номер: " + ++t);
            }
        }
    }
}
