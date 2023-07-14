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

    Product[] products = new Product[100];

    public Store() {
        addProducts(new Product("Milk", 134));
        addProducts(new Product("Potato", 30));
        addProducts(new Product("Chocolate", 150));
        addProducts(new Product("Ice cream", 200));
        addProducts(new Product("Coffee", 500));
        addProducts(new Product("Pizza", 350));

    }

    public void addProducts(Product product) {
        for (int i = 0; i < products.length; i++) {
            if (products[i] == null) {
                products[i] = product;
                System.out.println(products[i].getName() + " " + products[i].getPrice());
                break;
            }

        }


    }


    public class Product {
       String name;
       int price;

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
        System.out.println("Введите название товара, который вы хотите купить");
        Scanner in = new Scanner(System.in);
        String answer = in.nextLine();
        for (int i = 0; i < products.length; i++) {
            if (answer.equals(products[i].getName())) {
                System.out.println("Вы купили " + products[i].getName() + " " + products[i].getPrice());
                //printBill();
                break;
                //здесь необходимо вставить метод с чеком//сделать возвратный метод?
            } else {
                System.out.println(answer + " нет в наличии");
                break;
            }

        }

class Check  {
    static int numberOfBill = 0;
    String nameOfProduct;
    int costProduct;
    Product product;

    public Check(String nameOfProduct, int costProduct, String name, String price) {
       // ?? this.nameOfProduct = new Product(name);
        this.costProduct = costProduct;
    }
}

    }

  /*
    public void printBill () {
    class Bill {
            static int numberOfBill = 0;
            String nameOfProduct;
            int costProduct;
            Product product;

            public Bill(String nameOfProduct, int costProduct, Product product) {
                this.nameOfProduct = nameOfProduct;
                this.costProduct = costProduct;
                this.product = product;
            }
        }
        Bill bill = new Bill();
        System.out.println( "чек " + bill.nameOfProduct);


   */


    }



