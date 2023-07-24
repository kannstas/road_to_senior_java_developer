package Dz_2307.task2_3;

import java.util.ArrayList;

/*
2. Напишите обобщенный класс с именем "Box", который может хранить любой тип данных.
Реализуйте методы для добавления элемента в коробку и получения элемента из коробки.
 */
public class Main {
    public static void main(String[] args) {

        Box box = new Box("kitchen");

        ArrayList<Box> boxes = new ArrayList<>();
        boxes.add(new Box<>("lamp"));
        boxes.add(new Box(1));
        boxes.add(new Box(5.55));

        System.out.println(boxes.get(2));
        System.out.println(boxes);

/*
3. Создайте обобщенный метод с именем "printArray",
 который принимает массив любого типа данных и выводит его элементы в консоль.
 */
        box.printArray(new Object[]{1, 3, 5, "fridge", 7.6});
    }
}
