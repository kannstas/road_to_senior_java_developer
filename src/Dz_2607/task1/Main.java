package Dz_2607.task1;
/*
2 Напишите обобщенный метод countOccurrences(), который будет принимать на вход массив объектов и объект,
 количество вхождений которого в массив нужно посчитать. Метод должен возвращать количество вхождений объекта в массив.
При этом метод должен быть способен работать
 */
public class Main {
    public static void main(String[] args) {
        Integer [] array = {1, 4, 2, 5, 6, 10, 6, 66, 6};
        String [] stringsArray = {"Вася", "Коля", "Вася","Эля", "Вася", "Вася"};
        Double [] doublesArray = {1.3, 1.2, 1.3, 1.4, 2.66, 3.222, 1.3};


        countOccurrences(array, 6);
        countOccurrences(stringsArray, "Вася");
        countOccurrences(doublesArray, 1.3);

    }


    public static <T> void countOccurrences(T [] array, T t) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == t || array[i].equals(t)) {
                count++;
            }

        } System.out.println("количество повторений " + t + " равняется " + count);



    }
}
