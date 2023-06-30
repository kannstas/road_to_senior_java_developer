package Lesson.Interface.test;

public class Lada extends Auto implements Taxi{
    @Override
    public void start() {
        System.out.println("start taxi lada");
    }
}
