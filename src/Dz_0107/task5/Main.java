package Dz_0107.task5;

import java.time.LocalDate;
import java.util.Arrays;

/*
2 Задание
написать класс Студент без свойств и без конструктора
создать Массив студентов пустой  для 10 студентов
после через цикл заполнит этот массив студентами
и вывести общее количество студентов (вызвав у класса Стдент метод который выводит их кол во)
*/
public class Main {
    public static void main(String[] args) {
        Student[] array = new Student[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = new Student();
            System.out.println("Студент: " + array[i] + " в ячейку: " + i);
            Student.count++;

        }
        int year = LocalDate.now().getYear();
        System.out.printf("Количество студентов в %d году: %d%n", year, Student.count);
    }
}




