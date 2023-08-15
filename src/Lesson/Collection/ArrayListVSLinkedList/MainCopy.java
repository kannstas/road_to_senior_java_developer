package Lesson.Collection.ArrayListVSLinkedList;

import java.util.ArrayList;
import java.util.LinkedList;
// ArrayList копирует быстрее
public class MainCopy {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        ArrayList<Integer> arrayList1Copy = new ArrayList<>();

        for (int i = 0; i < 1_000_000; i++) {
            arrayList.add(7);
        }

        long timeStart = System.nanoTime();
        arrayList1Copy.addAll(arrayList);
        long timeEnd = System.nanoTime();
        System.out.println((timeEnd - timeStart) / 1_000_000);


        LinkedList<Integer> linkedList = new LinkedList<>();
        LinkedList<Integer> linkedList1Copy = new LinkedList<>();

        for (int i = 0; i < 1_000_000; i++) {
            linkedList.add(7);
        }
        long timeStartLinkedList = System.nanoTime();
        linkedList1Copy.addAll(linkedList);
        long timeEndLinkedList = System.nanoTime();

        System.out.println((timeEndLinkedList - timeStartLinkedList) / 1_000_000);
    }
}

