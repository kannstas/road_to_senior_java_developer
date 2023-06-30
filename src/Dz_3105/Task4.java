package Dz_3105;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        int[] number = {123, 456, 789, 234, 567, 890, 345, 678, 901, 432, 765, 998, 764, 290, 419, 552, 871, 888, 999, 555};
        System.out.println("Введите трехзначный код");
        Scanner in = new Scanner(System.in);
        int answer = in.nextInt();
        boolean b = false;
        for (int i = 0; i < number.length; i++) {
            if (answer == number[i]) {
                b = true;
            }
        } if (b) {
            System.out.println("Вы авторизовались");
        } else {
            System.out.println("Код введен неверно. Введите еще раз");
          //почему результат должен быть выведен за цикл for? Если пишу if в цикле for, то он некорректно отвечает//
        }

    }
}

