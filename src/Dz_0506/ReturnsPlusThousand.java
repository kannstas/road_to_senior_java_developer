package Dz_0506;

/* написать метод который принимает число и возвращает это число + 1000
после получить результат в маине и вывести*/

import java.util.Scanner;

public class ReturnsPlusThousand {
    public static void main(String[] args) {
        System.out.println("Введите число");
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        System.out.println(returnPlus(number));;
    }
    public static int returnPlus(int s) {
        int result = (s + 1000);
        return result;
    }



}
