package Lesson.Interface.test;

public class Bmw extends Auto implements PremiumClass, Taxi{
    @Override
    public void start() {
        System.out.println("start taxi bmw");
    }
}
