package Lesson.Collection.Queue;

import java.util.PriorityQueue;

public class LessonPriorityQueue {
    public static void main(String[] args) {
        PriorityQueue <Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(1);
        priorityQueue.add(2);

        //System.out.println(priorityQueue.element());
        System.out.println(priorityQueue.remove());
        System.out.println(priorityQueue.remove());

        System.out.println(priorityQueue.peek());

        System.out.println(priorityQueue);
    }
}
