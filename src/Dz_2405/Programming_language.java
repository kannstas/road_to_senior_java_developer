package Dz_2405;
//задание 1

import java.util.Scanner;

public class Programming_language {
    public static void main(String[] args) {
        System.out.println("Введите язык программирования");
        Scanner in = new Scanner(System.in);
        String name = in.next(); // благодаря этому считывает только первое слово до пробела
        in.nextLine();
        String name1 = name.strip();

        /*if (name.length() > 1) { // вообще не работает (((((
        System.out.println("Введите одно слово"); надо посчитать сколько символов в слове "котлин" и "джава"
        и поставить, что не больше 6 символов ?? if (name.length() > 6) */

        if (name1.equalsIgnoreCase("Java")) {
            System.out.println("Разработка Java началась в 1990 году, первая официальная версия — Java 1.0, — была выпущена только 21 января 1996 года.");
        } else if (name1.equalsIgnoreCase("Kotlin")) {
            System.out.println("Kotlin — это язык программирования, созданный в компании JetBrains. Его разработали в 2011 году на замену Java.");
        } else {
            System.out.println("Введите другой язык программирования");
            System.exit(0);
        }

    }
}

