package Lesson.Interface;

public class Bmw  extends Auto implements Metal, SportCar{
    @Override
    public int getWeight() {
        return 1200;
    }

    public Bmw(String model) {
        super(model);
    }

    @Override
    public void info() {
        System.out.println(getWeight() + " bmw");
    }
}
