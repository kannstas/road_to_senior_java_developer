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
        //поля сделаь приватные
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
        // принять данные после создать объект контакт после проверить  в массиве контактов если есть свободная ячейка с null то туда записать данный контакт
    }

    public static void deleteContact(Contact[] contacts) {
        System.out.println("Какой порядковый номер контакта, который вы желаете удалить?");
        Scanner in = new Scanner(System.in);
        int i = in.nextInt();
        contacts [i] = null;
        System.out.println("Контакт " + contacts[i].getName() + " удален");
        //????????? не просот выводить чот контакт удален а удалить его из массива contacts
    }
}
