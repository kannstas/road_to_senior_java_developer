package Dz_1408.task2;

import Dz_2307.task1.Array;
import Lesson.Collection.Set.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/*
Создайте Map из продуктов и их кол ве ,то есть  содержащую информацию о количестве товаров на складе каждого
 типа и написать метод который принимает мап
 и возвращает название  товара которого меньше всего

 типо если он уже есть, то +1
 */
public class Main {
    public static void main(String[] args) {

        HashMap<Product, Integer> mapProduct = new HashMap<>();

        mapProduct.put(new Product("Кефир", 60), 1);
        mapProduct.put(new Product("Лосось", 1006), 2);
        mapProduct.put(new Product("Жевачка", 10), 6);
        Product product = null;

        for (Map.Entry<Product, Integer> entry: mapProduct.entrySet()) {
            int minCount = Integer.MAX_VALUE;

            if (entry.getValue() < minCount) {
                minCount = entry.getValue();
                product = entry.getKey();
            }

        }
        if (product != null) {
            System.out.println(product.getName() +  " " + product.getCost() + " " + mapProduct.get(product));


        }


        }





    static class Product {
       private String name;
       private int cost;

        public Product(String name, int cost) {
            this.name = name;
            this.cost = cost;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getCost() {
            return cost;
        }

        public void setCost(int cost) {
            this.cost = cost;
        }
    }




}
