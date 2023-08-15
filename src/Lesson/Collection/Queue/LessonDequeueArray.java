package Lesson.Collection.Queue;

import java.util.ArrayDeque;

public class LessonDequeueArray {
    public static void main(String[] args) {
        ArrayDeque <Integer> arrayDeque = new ArrayDeque();
        arrayDeque.offer(10);
        arrayDeque.offer(20);
        arrayDeque.offerFirst(30);

        System.out.println(arrayDeque.pop());
        arrayDeque.removeFirstOccurrence(7);
        arrayDeque.removeFirstOccurrence(10);
        System.out.println(arrayDeque);


    }
}
