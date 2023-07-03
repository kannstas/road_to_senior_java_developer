package Dz_0107.task2;

import java.util.Arrays;
import java.util.Scanner;

public class Menu extends Main {
    public static void mainMenu(Contact[] contacts) {
        boolean b = false;
      block1:
        while (b = true) {
            System.out.println("Введите число: " +
                    " 1 - добавить контакт " +
                    " 2 - посмотреть список контактов " +
                    " 3 - удалить контакт" +
                    " 0 - чтобы выйти");
            Scanner in = new Scanner(System.in);
            int answer = in.nextInt();
            switch (answer) {
                case 1 -> addContact(contacts);
                case 2 -> System.out.println(Arrays.toString(contacts));
                case 0 -> b = false;

            }
        }
    }


}
