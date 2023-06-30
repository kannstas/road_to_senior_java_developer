package Dz_3105;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {

        System.out.println("Введите числа в строку");
        Scanner in = new Scanner(System.in);
        int[] array = new int[100];
        int index = 0;


        while (true) {
            String n = in.nextLine();
            if (n.isEmpty()) {
                break;
            } else {
                array[index++] = Integer.parseInt(n);
            }
        }

        for (int i = 0; i < index; i++) {
            System.out.print(array[i]+" ");

        }


    }
}

