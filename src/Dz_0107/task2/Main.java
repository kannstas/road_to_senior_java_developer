package Dz_0107.task2;

import java.util.Arrays;
import java.util.Scanner;

/*
создать проект в Idea записная книга
Создаем класс меню  с методом главное меню 1 добавить контакт 2 посмотреть список контактов 3 удалить контакт
создаем объект контакт (с полями имя фамилия и номер телефона)

создаем объект контакт и передаем туда имя фамилию и номер телефона
и записываем данный  контакт в массив (длинна мссива 10 элементов)
и выходим в главное меню где можем снова добавить контакт

в данном проекте нужно обработать exeption indexOfBoundExeption
т е если мы пытаем добавить новый контакт а места нету то программа не выключается и выводится сообщение что места больше нет
 */
public class Main {
    public static void main(String[] args) {
        Contact[] contacts = new Contact[10];
        Menu menu = new Menu();
        mainMenu(contacts);


    }

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
                case 3 -> deleteContact(contacts);
                case 0 -> b = false;
            }
        }
    }

    public static void addContact(Contact[] contacts) {
        Scanner in = new Scanner(System.in);
        try {
            for (int i = 0; i < contacts.length; i++) {
                String answer = in.nextLine();
                String[] splitResult = answer.split(" ");
                contacts[i] = new Contact(
                        splitResult[0],
                        splitResult[1],
                        Integer.parseInt(splitResult[2]));
                System.out.println(Arrays.toString(contacts));
                System.out.println(splitResult[0] + " " + splitResult[1] + " " + splitResult[2] + " был добавлен в записную книжку");
//ПОЧЕМУ-ТО ДОБАВЛЯЕТ ТОЛЬКО ПОСЛЕДНИЙ ЗАПИСАННЫЙ ОБЪЕКТ
            }

        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
            System.out.println("Нет места в записной книжке");

        }
    }

    public static void deleteContact(Contact[] contacts) {
        System.out.println("Какой порядковый номер контакта, который вы желаете удалить?");
        Scanner in = new Scanner(System.in);
        int i = in.nextInt();
        contacts [i] = null;
        System.out.println("Контакт " + contacts[i].getName() + " удален");
        //?????????
    }
}