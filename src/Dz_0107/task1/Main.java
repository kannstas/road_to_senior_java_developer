package Dz_0107.task1;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
создать программу калькулятор
где нужно ввести   первое число
ввести знак
ввести 2 число
и получить ответ

в данной программе через через обработку исключений проверить что введенны именно числа
если вводят не число вывести сообщение что вы ввели не число и просит снова ввести число
 */
public class Main {
    public static void main(String[] args) {
        calculate();
    }

    public static void calculate() {
        boolean end;
        block1:
        while (end = true ) {
            try {
                Scanner in = new Scanner(System.in);
                int a = in.nextInt();
                String c = in.next();
                int b = in.nextInt();
                if (c.equals("+")) {
                    System.out.println((a + b));
                } else if (c.equals("-")) {
                    System.out.println((a - b));
                } else if (c.equals("*")) {
                    System.out.println((a * b));
                }
                try {
                    if ((c.equals("/") || (c.equals(":")))) {
                        System.out.println((a / b));
                    }
                } catch (ArithmeticException e) {
                    e.printStackTrace();
                } finally {
                    System.out.println("Программа завершена");
                    break block1;
                }
            } catch (InputMismatchException e) {
                e.printStackTrace();
                System.out.println("Вы вввели не число, повторите ввод");
                end = false;

            }
        }
    }

}





