package Lesson.Collection.ArrayListVSLinkedList;

import java.util.ArrayList;
import java.util.LinkedList;
// ArrayList быстрее
public class MainPaste {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < 100000; i++) {
            arrayList.add(7);
        }

        long timeStart = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            arrayList.add(arrayList.size()/2,10);
        }

        long timeEnd = System.nanoTime();
        System.out.println((timeEnd - timeStart)/ 1_000_000);


        LinkedList<Integer> linkedList = new LinkedList<>();

        for (int i = 0; i < 100000; i++) {
            linkedList.addFirst(7);
        }

        long timeStartLinkedList = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            linkedList.add(arrayList.size()/2, 10);

        }

        long timeEndLinkedList = System.nanoTime();
        System.out.println((timeEndLinkedList - timeStartLinkedList) /1_000_000);




    }

}

