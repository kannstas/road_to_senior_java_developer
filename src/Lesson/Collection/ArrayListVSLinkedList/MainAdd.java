package Lesson.Collection.ArrayListVSLinkedList;

import java.util.ArrayList;
import java.util.LinkedList;
// ArrayList добавляет быстрее
public class MainAdd {
    public static void main(String[] args) {
        ArrayList <Integer> arrayList = new ArrayList<>();
        long timeStart = System.nanoTime();
        for (int i = 0; i < 10000000; i++) {
            arrayList.add(7);
        }
        long timeEnd = System.nanoTime();
        System.out.println((timeEnd - timeStart) / 1_000_000);


        LinkedList <Integer> linkedList = new LinkedList<>();
        long timeStartLinkedList = System.nanoTime();
        for (int i = 0; i < 10000000; i++) {
            linkedList.add(7);
        }
        long timeEndLinkedList = System.nanoTime();

        System.out.println((timeEndLinkedList - timeStartLinkedList) /1_000_000);





    }
}
