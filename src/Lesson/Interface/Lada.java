package Lesson.Interface;

public class Lada extends Auto implements Metal{
    @Override
    public int getWeight() {
        return 12000;
    }

    public Lada(String model) {
        super(model);
    }
}
