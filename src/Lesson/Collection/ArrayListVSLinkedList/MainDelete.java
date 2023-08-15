package Lesson.Collection.ArrayListVSLinkedList;

import java.util.ArrayList;
import java.util.LinkedList;

// Arraylist удаляет быстрее
public class MainDelete {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < 100_000; i++) {
            arrayList.add(7);
        }

        long timeStart = System.nanoTime();
        for (int i = 0; i < 10_000; i++) {
            arrayList.remove(arrayList.size()/2);
        }

        long timeEnd = System.nanoTime();
        System.out.println((timeEnd - timeStart)/ 1_000_000);


        LinkedList<Integer> linkedList = new LinkedList<>();

        for (int i = 0; i < 100_000; i++) {
            linkedList.add(7);
        }

        long timeStartLinkedList = System.nanoTime();
        for (int i = 0; i < 10_000; i++) {
            linkedList.remove(linkedList.size()/2);

        }

        long timeEndLinkedList = System.nanoTime();
        System.out.println((timeEndLinkedList - timeStartLinkedList) /1_000_000);
    }
}
