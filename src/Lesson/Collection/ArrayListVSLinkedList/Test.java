package Lesson.Collection.ArrayListVSLinkedList;

import java.util.LinkedList;

public class Test {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(10);
        linkedList.add(15);

        linkedList.addLast(1);

        System.out.println(linkedList);
    }

}
