package Dz_2307.task4;

/*
4. Напишите обобщенный класс "Pair",
который принимает два разных типа данных и предоставляет методы для получения и установки значений каждого из них.
 */
public class Main {
    public static void main(String[] args) {
        Pair pair = new Pair(11, "Eleven");

        System.out.println(pair.getT());
        System.out.println(pair.getV());
        System.out.println();
        
        pair.setT(12);
        pair.setV("Twelve");

        System.out.println(pair.getT());
        System.out.println(pair.getV());
    }
}
