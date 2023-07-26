package Dz_2307.task5;

public class Figure {
    public static void main(String[] args) {
        Integer [] integerArray = {1, 44, 23, 55, 100, 99};
        String [] strings = {"Aaa", "Bet", "Zzz"};
        Float [] floats  = {1.23f, 22.44f, 666.2f, 0.1f};

        Student [] student = {new Student(22),new Student(17),new Student(27)};

        System.out.println( "integerArray max value = " + findMax(integerArray));
        System.out.println( "strings  max value = " + findMax(strings));
        System.out.println( "floats  max value = " + findMax(floats));
        System.out.println( "student max value = " + findMax(student).getAge());
    }
    public static <T extends Comparable<T>> T findMax (T[] array) { // 5 6 7 3

        if (array == null || array.length == 0) {
            return null;
        }
        T max = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i].compareTo(max) > 0){
                max = array[i];
            }
        }
        return max;

    }
}


