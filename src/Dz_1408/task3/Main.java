package Dz_1408.task3;

import java.util.*;

/*
1 Создайте HashSet, добавьте несколько элементов и выведите на экран содержимое множества.
2 Создайте TreeSet, добавьте несколько элементов и выведите на экран содержимое множества в отсортированном порядке.
3 Создайте LinkedHashSet, добавьте несколько элементов и выведите на экран содержимое множества в порядке добавления элементов.
4 Удалите все элементы из множества.
5 Проверьте, содержит ли множество определенный элемент.
6 Найдите пересечение двух множеств.
 */
public class Main {
    public static void main(String[] args) {


        HashSet hashSet = new HashSet();

        hashSet.add(12);
        hashSet.add(15);
        hashSet.add(0);

        System.out.println(hashSet); // 1. отсортировал по хэш коду, [0, 12, 15]


        TreeSet treeSet = new TreeSet();

        treeSet.add(12);
        treeSet.add(15);
        treeSet.add(40);
        treeSet.add(-1);

        System.out.println(treeSet); // 2. отсортировал по возрастанию [-1, 12, 15, 40]

        LinkedHashSet linkedHashSet = new LinkedHashSet<>();

        linkedHashSet.add(12);
        linkedHashSet.add(0);
        linkedHashSet.add(100);
        linkedHashSet.add(-20);
        linkedHashSet.add(0);
        linkedHashSet.add(50);

        System.out.println(linkedHashSet); // 3. [12, 0, 100, -20, 50]


        linkedHashSet.clear(); // 4. очистил linkedHashSet

        System.out.println(linkedHashSet);


        System.out.println(hashSet.contains(15)); // 5. Проверил, если ли такие эелементы
        System.out.println(hashSet.contains(10));


        hashSet.retainAll(treeSet); // 6. найти персеечение множеств

        System.out.println("Перечесение множeств: " + hashSet);

        }

    }

