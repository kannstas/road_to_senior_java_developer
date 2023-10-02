package Lesson.SemaphoreEx;

import java.util.concurrent.Semaphore;

public class Main {
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(2);
         new Person("Anna", semaphore);
        new Person("Lena", semaphore);
        new Person("Kolya", semaphore);
        new Person("Petya", semaphore);
        new Person("Ivan", semaphore);
    }
}

class Person extends Thread {

    String name;
    Semaphore semaphore;

    public Person(String name, Semaphore semaphore) {
        this.name = name;
        this.semaphore = semaphore;
        this.start();
    }

    @Override
    public void run() {
        System.out.println(name + " wait");
        try {
            semaphore.acquire();
        System.out.println(name + " use phone");

        Thread.sleep(5000);
            System.out.println(name +" end call");
    } catch (InterruptedException e) {
        throw new RuntimeException(e);
    } finally {
            semaphore.release();
        }

}
}
