package Dz_2307.task1;

import java.util.Arrays;

/*
1 Написать обобщенную функцию сортировки, которая работает с любыми типами данных, и возвращает отсортированный массив.
 */
public class Main {
    public static void main(String[] args) {

        Array array = new Array();

        Integer[] intArray = new Integer[]{1, 2, 36, 32, 21, 15, 78, 74, 0};
        Double[] doubleArray = new Double[]{1.1, 16.78, 8.33, 22.22, 0.1};
        String[] stringsArray = new String[]{"Эмма", "Петя", "Анастасия", "Рома", "Аня", "Костя", "Алла"};


        array.printArray(intArray);
        array.printArray(doubleArray);
        array.printArray(stringsArray);

        System.out.println();


        Arrays.sort(intArray);
        System.out.println(Arrays.toString(intArray));


       /*  Array <Integer> arrays = new Array (new Integer []{1, 2, 36, 32, 21, 15, 78, 74, 0});
         Arrays.sort(arrays);//  получается, что так нельзя????????
        */


    }

}


