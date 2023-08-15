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

        HashMap<String, Double> mapProduct = new HashMap<>();

        mapProduct.put("Молоко", 50.0);
        mapProduct.put("Молоко", 50.0);
        mapProduct.put("Молоко", 50.0);
        mapProduct.put("Молоко", 50.0);

        mapProduct.put("Сыр", 180.0);
        mapProduct.put("Сыр", 150.0);
        mapProduct.put("Сыр", 110.0);

        mapProduct.put("Мороженое", 100.0);

        System.out.println(mapProduct);

        for (Map.Entry<String, Double> stringDoubleEntry : mapProduct.entrySet()) {
            if (mapProduct.containsKey(stringDoubleEntry)) {
                mapProduct.put(String.valueOf(stringDoubleEntry), mapProduct.get(String.valueOf(stringDoubleEntry)) + 1);
            }
            else {
               mapProduct.put(String.valueOf(stringDoubleEntry), 1.0);
            }
        }



        for (Map.Entry<String, Double> s : mapProduct.entrySet()) {
            System.out.println(s);

        }



    }
}
