package Dz2806.task3;

/*
Создать метод, который находит количество знаков вопроса "?".
Метод должен принимать массив String[] и возвращать int . что бы сделать из строки массив
String [] array = "wefwefwef".split("")
 */
public class Main {
    public static void main(String[] args) {
        String[] array = " cкол?ько врем?е?н?и???".split("");

        calculate(array);
    }

    public static void calculate(String[] array) {
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals("?")) {
                result++;
            }
        }
        System.out.println( "Количество вопросительных знаков:  " + result);
    }
}
