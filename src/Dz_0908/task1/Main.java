package Dz_0908.task1;

import java.util.ArrayList;
import java.util.Scanner;

/*
Дз написать программу консольную
В которой есть пункт 1
Добавить запись
Нужно ввести имя фамилию и номер
После добавить в ArrayList
И выйти в меню

Так же реализовать методы вывести список записей и удалить записи
 */
public class Main {

    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        boolean b = true;
        while (b) {
            System.out.println("Введите цифру:" +
                    "\n 1 - добавить запись (Ввести фамилию, имя, номер)" +
                    "\n 2 - вывести список записей" +
                    "\n 3 - удалить все записи" +
                    "\n 0 - завершить программу");

            Scanner in = new Scanner(System.in);
            int answer = in.nextInt();
            in.nextLine();

            switch (answer) {
                case 1 -> addNote(arrayList);
                case 2 -> showList(arrayList);
                case 3 -> deleteNote(arrayList);
                case 0 -> b = false;
            }
        }
    }

    public static void addNote(ArrayList arrayList) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите фамилию");
        String surname = in.nextLine();

        System.out.println("Введите имя");
        String name = in.nextLine();

        System.out.println("Введите номер телефона");
        String number = in.nextLine();

        String answer = surname + " " + name + " " + number;

        arrayList.add(answer);

        System.out.println(arrayList);
    }

    public static void showList(ArrayList arrayList) {
        System.out.println(arrayList);
    }

    public static void deleteNote(ArrayList arrayList) {
        arrayList.removeAll(arrayList);
        System.out.println(arrayList);
    }
}
