package Lesson.Collection.ArrayListVSLinkedList;

import java.util.ArrayList;
import java.util.LinkedList;
// ArrayList быстрее
public class MainGetElement {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < 10_000_000; i++) {
            arrayList.add(7);
        }

        long timeStart = System.nanoTime();
        System.out.println(arrayList.get(2_000_000));
        long timeEnd = System.nanoTime();
        System.out.println((timeEnd - timeStart) / 1_000_000);


        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < 10_000_000; i++) {
            linkedList.add(7);
        }

        long timeStartLinkedList = System.nanoTime();
        System.out.println(linkedList.get(2_000_000));
        long timeEndLinkedList = System.nanoTime();
        System.out.println((timeEndLinkedList - timeStartLinkedList) / 1_000_000);


    }
}
