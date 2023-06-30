package Lesson;

public class LessonIf {
    public static void main(String[] args) {
        String city = "Ростов";
        String city2 = new String("Ростов");

        System.out.println(city);
        System.out.println(city2);


        if (city.equals(city2)){
            System.out.println("вы в одном городе");
        }else {
            System.out.println("вы с разных городов");
        }

        /*
        <=
        == проверка на равенство
        != не равно
        && и
        || или

         */
        int age = 1200;
        if (age>=18 && age < 100) {
            System.out.println("Доступ открыт");
        } else if (age == 17) {
            System.out.println("вернитесь через год");
        }else if (age == 16){
            System.out.println();
        } else {
            System.out.println("Доступ закрыт");
        }
    }
}
