package Lesson.Final;

public class Lada extends Auto{
    public Lada(String model) {
        super(model);
    }

    @Override
    public final void info() {
        System.out.println("Это лада");
    }
}
