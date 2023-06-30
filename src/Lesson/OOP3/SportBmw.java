package Lesson.OOP3;

public class SportBmw extends Bmw{
    public SportBmw(String model, int horsePower) {
        super(model, horsePower);
    }

    @Override
    public void start() {
        System.out.println("Спорт бмв завелся");
    }
}
