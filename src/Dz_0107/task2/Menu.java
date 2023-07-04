package Dz_0107.task2;

import java.util.Arrays;
import java.util.Scanner;

public class Menu {
    //поля сделаь приватные
    Contact[] contacts = new Contact[10];
    public  void mainMenu() {
        boolean b = false;
        block1:
        while (b = true) {
            System.out.println("""
                    Введите число: 
                    1 - добавить контакт 
                    2 - посмотреть список контактов 
                    3 - удалить контакт
                    0 - чтобы выйти""");
            Scanner in = new Scanner(System.in);
            int answer = in.nextInt();
            switch (answer) {
                case 1 -> addContact();
                case 2 -> System.out.println(Arrays.toString(contacts));//через for каждый с новой строки
                case 3 -> deleteContact(contacts);
                case 0 -> b = false;
            }
        }
    }

    public  boolean addContact() {
        Scanner in = new Scanner(System.in);
        System.out.println("введите имя");
        String name = in.nextLine();
        System.out.println("введите фамилию");
        String surname = in.nextLine();
        System.out.println("введите номер");
        String number = in.nextLine();
        Contact contact = new Contact(name,surname, number);

        for (int i = 0; i < contacts.length; i++) {
            if (contacts[i] == null) {
                contacts[i] = contact;
                System.out.println("Контакт добавлен");
                return true;
            }
        }
        System.out.println("Нет места");
        return false;
    }

    public  boolean deleteContact(Contact[] contacts) {
        Scanner in = new Scanner(System.in);
        System.out.println("введите имя");
        String name = in.nextLine();
        System.out.println("введите фамилию");
        String surname = in.nextLine();
        for (int i = 0; i < contacts.length; i++) {
            if (contacts[i].getName().equals(name) && (contacts[i]).getSurname().equals(surname)){
                System.out.println("Контакт " + contacts[i].getName() + " удален");
                contacts[i] = null;
                return true;
            }
        }
        System.out.println("не найден");
        return false;

    }
}
