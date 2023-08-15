package Lesson.Collection.ArrayListVSLinkedList;

import java.util.ArrayList;
import java.util.LinkedList;
// LinkedList быстрее удаляет с начала и с конца
public class MainDeleteFirstDeleteLast {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < 10_000_000; i++) {
            arrayList.add(7);
        }

        long timeStart = System.nanoTime();
        System.out.println(arrayList.remove(arrayList.size() - 1));
        long timeEnd = System.nanoTime();
        System.out.println((timeEnd - timeStart) / 1_000_000);

        System.out.println();

        LinkedList<Integer> linkedList = new LinkedList<>();

        for (int i = 0; i < 10_000_000; i++) {
            linkedList.add(7);
        }

        long timeStartLinkedList = System.nanoTime();
        System.out.println(linkedList.removeLast());
        long timeEndLinkedList = System.nanoTime();
        System.out.println((timeEndLinkedList - timeStartLinkedList) / 1_000_000);

        System.out.println();

        long timeStart1 = System.nanoTime();
        System.out.println(arrayList.remove(0));
        long timeEnd1 = System.nanoTime();
        System.out.println((timeEnd1 - timeStart1) / 1_000_000);

        System.out.println();

        long timeStartLinkedList1 = System.nanoTime();
        System.out.println(linkedList.removeLast());
        long timeEndLinkedList1 = System.nanoTime();
        System.out.println((timeEndLinkedList1 - timeStartLinkedList1) / 1_000_000);




    }
}

