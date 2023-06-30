package Dz_3105;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Введите ключевое слово");
        Scanner in = new Scanner(System.in);
        String word = in.nextLine();
        for (int i = 0; i < 20; i++) {
            System.out.print(word + " ");
        }

    }
}

