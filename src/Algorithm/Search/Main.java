package Algorithm.Search;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

// BINARY SEARCH
public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110,};
        // бинарный поиск заключается в том, что массив делится пополам и отсекается число исходя из того-больше оно среднего значения или нет

        int start = 0;
        int finish = array[array.length - 1];
        int middle = (start + finish) / 2;
        int figure = 1;

        for (int i = 0; i < array.length; i++) {
            if (middle >= figure) {
                finish = middle - 1;
                array[i] = figure;
            } else if (middle <= figure) {
                start = middle + 1;
                array[i] = figure;
            } else {
                System.out.println("Число не было найдено");
            }
            System.out.println(array[i]);
        }


    }
}







      /*  for (int i = 0; i < array.length; i++) {
            if (middle > figure) {
                middle = middle - 1;
                array[i] = figure;
                System.out.println(Arrays.toString(array));
                System.out.println("число " + figure + " в ячейке " + array[i]);
                break;
            } else if (middle < figure) {
                middle = middle + 1;
                array[i] = figure;
                System.out.println("число " + figure + " в ячейке " + array[i]);
                break;

            } else {
                System.out.println("такого числа нет в массиве");
            }


        }


    }
}

       */
