package Dz_1007.task3;

import Lesson.Classes.LocalClass.Product;

import java.util.Scanner;

/*
дз 2
создать объект магазина с массивом продуктов
продукт это внутренний класс с полем цена
так же в магазине есть метод покупка в которой пользователь вводит название товара и он выводит вы купили товар если он был в массиве
так же данный метод выводит после покупки чек
чек это объект локального класса котороый создан внутри метода продажи товаров
у данного объекта будет свойство цена чека и название товара и номер чека
 */
public class Store {
    Product [] products = new Product[100];
    public void addProducts(Product product) {
        for (int i = 0; i < products.length; i++) {
            if (products[i] == null) {
                products[i] = product;
                break;
            }
            System.out.println(products[i].getName() + " " + products[i].getPrice());
        }


    }


    private class Product {
        private String name;
        private int price;

        public Product(String name, int price) {
            this.name = name;
            this.price = price;
        }

        public int getPrice() {
            return price;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setPrice(int price) {
            this.price = price;

        }
    }

    public void buyProduct() {

    }
}
