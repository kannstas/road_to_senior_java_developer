package Dz_0506;

import java.util.Scanner;

/*
написать метод который принимает 1 строку и 1 число  и возвращает длинну строки + число
после получить результат в маине и вывести
 */
public class Task3 {
    public static void main(String[] args) {
        System.out.println("Введите строку и число");
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();
        int numbers = in.nextInt();
        System.out.println(lengthLine(line) + numbers);

    } public static int lengthLine (String s) {
        int result = s.length();
        return result;
    }
}
