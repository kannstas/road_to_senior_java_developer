package Dz_2405;
//задание 2

import java.util.Scanner;

public class PassportAge {
    public static void main(String[] args) {
        System.out.println("Введите год вашего рождения");
        Scanner in = new Scanner(System.in);
        int year = in.nextInt();
        int yearNow = 2023;
        if (yearNow - year == 14) {
            System.out.println("Вы можете получить паспорт");
        } else if (yearNow - year < 14) {
            System.out.println("В настоящее время вы не можете получить паспорт. Возвращайтесь через " + (14 - (yearNow - year)) + " лет/год");
        } else if ((yearNow - year > 14) && (yearNow - year < 20)) {
            System.out.println("Вы сможете поменять паспорт в 20 лет, приходите через: " + (20 - (yearNow - year)) + "года/лет");
        } else if ((yearNow - year >= 20) && (yearNow - year < 45)) {
            System.out.println("Вы можете поменять паспорт в 45 лет, приходите через " + (45 - (yearNow - year)) + " года/лет");
        } else if ((yearNow - year >= 45) && (yearNow - year < 120)) {
            System.out.println("Ваш паспорт действует бессрочно");

        }

        привет, Я настя

    }
}



