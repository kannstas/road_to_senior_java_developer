package Initiative;

import java.util.Scanner;

/*
Напишите метод, который принимает в качестве параметра два целых
числа и возвращает значение true, если в числах одинаковое количество цифр; в ином случае метод возвращает значение false.
 */
public class task1 {
    public static void main(String[] args) {
addNumbers(2000000, 3999999);

    }




    public static void addNumbers (int number1, int number2) {

        String numberString1 = Integer.toString(number1);
        String numberString2 = Integer.toString(number2);

        if (numberString1.length() == numberString2.length()) {
            System.out.println(true);

        } else {
            System.out.println(false);
        }

    }

}
