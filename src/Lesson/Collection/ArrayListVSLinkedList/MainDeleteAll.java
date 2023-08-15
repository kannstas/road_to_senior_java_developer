package Lesson.Collection.ArrayListVSLinkedList;

import java.util.ArrayList;
import java.util.LinkedList;
// ArrayList быстрее
public class MainDeleteAll {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < 100_000; i++) {
            arrayList.add(7);
        }

        long timeStart = System.nanoTime();
        arrayList.clear();
        long timeEnd = System.nanoTime();
        System.out.println((timeEnd - timeStart) / 1_000_000);


        LinkedList<Integer> linkedList = new LinkedList<>();

        for (int i = 0; i < 100_000; i++) {
            linkedList.add(7);
        }

        long timeStartLinkedList = System.nanoTime();
        linkedList.clear();
        long timeEndLinkedList = System.nanoTime();
        System.out.println((timeEndLinkedList - timeStartLinkedList) / 1_000_000);
    }
}
