package Dz_1007.task1;

import javax.xml.crypto.dsig.keyinfo.PGPData;

/*
Написать программу для покупки моб телефонов

создать класс телефон
у телефона есть след свойства

модель  - строка (инициализация через констурктор)
цена - число инт - (инициализация через конструктор)

карта памяти - (создается внутри класса объем любой)
батарея - (создается внутри класса объем любой)
для этого  нужно реализовать классы

у каждого телефона есть внутренний класс microSd(с полем объем памяти)

у каждого телефона есть метод информация о батарее ( локальный класс батарея с полями емкость)


создать класс меню с методом старт  и реализловать там
пункт 1 список телефонов (5 телефонов на выбор) (есть возможность добавить в корзину)
пункт 2 корзина ( вывод всех телефонов и общей суммы товаров)
пункт 3 очистить корзину


класс Маин
создать объект класса меню и вызвать метод старт
 */
public class Main {
    public static void main(String[] args) {

        //phone.info();
      //почему-то если класс не был статическим, выдавалась ошибка

       // System.out.println(phone.getModel() + phone.getPrice() + microSd.getMicroSd());

        Menu menu = new Menu();
        menu.start();




    }
}
