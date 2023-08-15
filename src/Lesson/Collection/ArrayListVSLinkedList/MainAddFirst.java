package Lesson.Collection.ArrayListVSLinkedList;

import java.util.ArrayList;
import java.util.LinkedList;
// LinkedList вставляет в начало быстрее
public class MainAddFirst {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < 1_000_000; i++) {
            arrayList.add(7);
        }

        long timeStart = System.nanoTime();
        for (int i = 0; i < 100_000; i++) {
            arrayList.add(0, 10);
        }

        long timeEnd = System.nanoTime();
        System.out.println((timeEnd - timeStart)/ 1_000_000);


        LinkedList<Integer> linkedList = new LinkedList<>();

        for (int i = 0; i < 1_000_000; i++) {
            linkedList.addFirst(7);
        }

        long timeStartLinkedList = System.nanoTime();
        for (int i = 0; i < 100_000; i++) {
            linkedList.addFirst(10);

        }

        long timeEndLinkedList = System.nanoTime();
        System.out.println((timeEndLinkedList - timeStartLinkedList) /1_000_000);



    }
}
