package dz_2205;

public class Task2 {
    // создать еще один файл java
    //в нем написать метод main
    //создать 2 переменные  для строк  через ключевое слово new
    //в них записать 2 строки одинаковые
    //после сравнить их через ==  и вывести результат
    //ниже в комментария написать почему результат false

    public static void main(String[] args) {
        String j = "Петя";
        String j1 = new String("Петя");

        if (j == j1) {
            System.out.println("Вы Петя");
        } else {
            System.out.println("Вы не Петя");
        }
    }
}
