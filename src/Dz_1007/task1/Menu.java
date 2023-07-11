package Dz_1007.task1;

import java.util.Arrays;
import java.util.Scanner;

/*
создать класс меню с методом старт  и реализловать там
пункт 1 список телефонов (5 телефонов на выбор) (есть возможность добавить в корзину)
пункт 2 корзина ( вывод всех телефонов и общей суммы товаров)
пункт 3 очистить корзину
 */
public class Menu {

    Phone[] shoppingCarts = new Phone[5];

    public void start() {
        boolean b = true;
        System.out.println("Здравствуйте! Выберете интерсующую вас позицию");
        while (b) {
            System.out.println(""" 
                     1. список телефонов +
                     2. корзина  +
                     3. очистить корзину
                     0. выйти""");

            Scanner in = new Scanner(System.in);
            int answer = in.nextInt();
            in.nextLine();

            switch (answer) {
                case 1 -> info();
                case 2 -> checkShoppingCart();
                case 3 -> deleteShoppingCart();
                case 0 -> b = false;

            }

        }
    }

    public void info() {

        Phone phone = new Phone("Iphone 14", 123_000);
        Phone phone1 = new Phone("Iphone x", 70_000);
        Phone phone2 = new Phone("Samsung Galaxy", 50_000);
        Phone phone3 = new Phone("Fly 12", 20_000);
        Phone phone4 = new Phone("Iphone 12", 100_000);

        Phone[] phones = {phone, phone1, phone2, phone3, phone4};

        for (int i = 0; i < phones.length; i++) {
            System.out.println(phones[i].getModel() + " " + phones[i].getPrice());

        }
        shoppingCart();


    }

    public void shoppingCart() {
        System.out.println("Добавьте интересующую вас позицию в корзину");
        Scanner in = new Scanner(System.in);
        System.out.println("Введите модель телефона");
        String nameModel = in.nextLine();
        System.out.println("Введите цену телефона");
        int priceModel = in.nextInt();
        Phone phone = new Phone(nameModel, priceModel);
        for (int i = 0; i < shoppingCarts.length; i++) {
            if (shoppingCarts[i] == null) {// ((shoppingCarts[i]).equals(nameModel) && shoppingCarts[i].equals(priceModel)) ТАК НЕ РАБОТАЕТ, А ЕСЛИ БЕЗ ЭТОГО, ТО ПОЛЬЗОВАТЕЛЬ СМОЖЕТ ВВЕСТИ ЧТО УГОДНО
                shoppingCarts[i] = phone;
                System.out.println(shoppingCarts[i].getModel() + " " + shoppingCarts[i].getPrice() + " " + " добавлен в корзину");
                break;
            }

        }


    }

    public void checkShoppingCart () {
        for (int i = 0; i < shoppingCarts.length; i++) {
            System.out.println(shoppingCarts[i].getModel() + " " + shoppingCarts [i].getPrice());//Cannot invoke "Dz_1007.task1.Phone.getModel()" because "this.shoppingCarts[i]" is null
            //НО ОН НЕ NULL!!!!!
        }


        }

        public void deleteShoppingCart () {
            System.out.println("Вся козина будет очищена");
            System.out.println(Arrays.toString(shoppingCarts));
            for (int i = 0; i < shoppingCarts.length; i++) {
                shoppingCarts [i] = null;
            } System.out.println("Вся козина была очищена");
            System.out.println(Arrays.toString(shoppingCarts));
        }
    }








