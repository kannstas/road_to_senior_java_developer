package Lesson;

import java.util.Scanner;

public class LessonScanner {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите ваше фио");
        String name = in.nextLine();

        if (name.length() < 3){
            System.out.println("слишком короткое имя");
            System.exit(0);
        }
        System.out.println(name + " Hello");

        System.out.println("Введите ваш возраст");
        if (in.hasNextInt()) {
            int age = in.nextInt();
            in.nextLine();
            if (age >= 18) {
                System.out.println("Вы прошли проверку");
            } else {
                System.out.println("Вы не прошли проверку");
                System.exit(0);
            }
        } else {
            System.out.println("вы ввели не возраст");
            System.exit(0);
        }


        System.out.println("Введите ваш город");
        String city = in.nextLine();


        System.out.println("Введите ключевое слово");
        String word = in.next();

        System.out.print("введите ответ 2 + 2 * 2 = ");
        if (in.hasNextInt()) {
            int answer = in.nextInt();
            if (answer == 6) {
                System.out.println("Вы прошли проверку");
                System.out.println("ваш логин " + name);
                System.out.println("пароль " + city +word);
            }else{
                System.out.println("Вы ввели неправильный ответ");
            }
        }

    }


}

