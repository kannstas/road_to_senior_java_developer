package Initiative;

import java.util.Map;
import java.util.Scanner;

/* хочу написать программу, которая спрашивает из какого города
      и куда едете и затем говорит, можно купить билет или нет
       */
public class Train {
    private static Map<String, Integer> routeNameToDistanceMap = Map.of(
            "Москва-Курск", 500,
            "Москва-Луганск", 1000,
            "Москва-Владивосток", 8000
    );


    public static void main(String[] args) {

        int balance = 200;
        if (balance < 3000) {
            System.out.println("Вы не можете купить билет");
        } else if (balance >= 3000) {
            System.out.println("Вы можете купить билет");
        }
        Scanner in = new Scanner(System.in);
        System.out.println("Укажите город отбытия");
        String departureCity = in.next();
        System.out.println("Укажите город прибытия");
        String arrivalCity = in.next();

        if (departureCity.equals(arrivalCity)) {
            System.out.println("Вы из одного города, вы не можете купить билет");
            return;
        }
        if (departureCity.equals("Мурманск") || (arrivalCity.equals("Мурманск"))) {
            System.out.println("В данный город и из этого города поезда временно приостановлены");
            return;
        }

        Integer distance = routeNameToDistanceMap.get(departureCity + "-" + arrivalCity);
        if (distance == null) {
            System.out.println("Запрашиваемые город(а) не найдены");
            return;
        }


        System.out.println("Длина запрашиваемого маршрута равна: " + distance);
    }
}




