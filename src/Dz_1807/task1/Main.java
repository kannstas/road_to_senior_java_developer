package Dz_1807.task1;

import java.util.Arrays;

/*
Создать классс продукт
со свойствами
название
вес
цена
принимаем через конструкто
в класссе маин создать 10 разных товаров
реализовать метод euqlse и  hashCode так чтоб при сравнении товаров
выводил что товары одинаковые если их название и вес равен
так же переопределить для товаров метод toString он будет выводить имя товара и цену
 */
public class Main {
    public static void main(String[] args) {


        Product product = new Product("Milk", 0.3, 100);
        Product product1 = new Product("Potato", 1.5, 30);
        Product product2 = new Product("Chocolate", 0.25, 150);
        Product product3 = new Product("Ice cream", 0.25, 250);
        Product product4 = new Product("Potato", 1.5, 20);
        Product product5 = new Product("Pizza", 0.5, 300);
        Product product6 = new Product("Pizza", 0.5, 400);
        Product product7 = new Product("Coffee", 0.25, 500);
        Product product8 = new Product("Lime", 0.10, 30);
        Product product9 = new Product("Carrot", 1.5, 25);

        Product[] products1 = {product, product1, product2, product3, product4, product5, product6, product7, product8, product9};
        Product[] products = Arrays.copyOf(products1, products1.length + 50);

        System.out.println(product1.hashCode());
        System.out.println(product4.hashCode());
        System.out.println(product9.hashCode());

        System.out.println();

        System.out.println(product1.equals(product4));
        System.out.println(product1.equals(product9));


        array(products);

        addProduct(products, new Product("Lime", 0.2, 76));
        System.out.println("--------\n\n");
        array(products);

    }

    public static void addProduct(Product[] products, Product product) {
        boolean b = false;
        for (int i = 0; i < products.length; i++) {
            if (!(products[i] == null)){
                if (products[i].equals(product)) {
                    b = true;
            }

            }
        }
        if (b == false) {
            for (int i = 0; i < products.length; i++) {
                if (products[i] == null) {
                    products[i] = product;
                    System.out.println(products[i]);
                    break;
                }
            }
        }
    }

    public static void array(Product[] products) {
        int id = 1;
        for (Product prod : products) {
            if (prod !=null) {
                System.out.println(id++ + " " + prod);
                System.out.println("------------");
            }

        }
        id = 1;
    }

}


        /*for (int i = 0; i < products.length; i++) {
          if (products[i].equals(products[i+1])) {
           
                System.out.println("товары одинаковые");
            } else {
                System.out.println("товары не одинаковые");

            }

        }

    }*/








