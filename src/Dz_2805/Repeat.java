package Dz_2805;

import java.util.Scanner;

public class Repeat {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите число от 1 до 50");
        int n = in.nextInt();

        while (n <= 50) {
            String word = "Perfect, ".repeat(n);
            System.out.println(word);
            break;
        }

    }
}
