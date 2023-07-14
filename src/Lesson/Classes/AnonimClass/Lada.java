package Lesson.Classes.AnonimClass;

public class Lada extends Auto{
    public Lada(String model, int ls) {
        super(model, ls);
    }

    @Override
    public int infoExpenditure() {
        return getEngine().getLs() / 60 + 5;
    }
}
