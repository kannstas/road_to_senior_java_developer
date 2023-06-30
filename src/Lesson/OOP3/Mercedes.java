package Lesson.OOP3;

public class Mercedes extends  Auto{
    public Mercedes(String model, int horsePower) {
        super(model, horsePower);
    }

    @Override
    public void start() {
        System.out.println("Мерседес завелся");
    }
}
