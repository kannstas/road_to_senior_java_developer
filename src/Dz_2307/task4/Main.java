package Dz_2307.task4;

/*
4. Напишите обобщенный класс "Pair",
который принимает два разных типа данных и предоставляет методы для получения и установки значений каждого из них.
 */
public class Main {
    public static void main(String[] args) {
        Pair pair = new Pair(11, "Eleven");

        System.out.println(pair.getLeft());
        System.out.println(pair.getRight());
        System.out.println();

        Pair pairTwo = new Pair(11, "Eleven");

        System.out.println(pairTwo.getLeft());
        System.out.println(pairTwo.getRight());

        System.out.println("hash1: " + pair.hashCode());
        System.out.println("hash2: " + pairTwo.hashCode());
        System.out.println("equals: " + pair.equals(pairTwo));
    }
}
