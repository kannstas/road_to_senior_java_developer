package Lesson.OOP3;

public class Bmw  extends Auto {
    public Bmw(String model, int horsePower) {
        super(model, horsePower);
    }

    @Override
    public void start() {
        System.out.println("Bmw завелся");
    }

    public void openBag () {
        System.out.println("Открыть багажник");
    }
}
