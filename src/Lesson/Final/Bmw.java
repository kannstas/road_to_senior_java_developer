package Lesson.Final;

public  final class Bmw extends  Auto{
    public Bmw(String model) {
        super(model);
    }

    @Override
    public void info() {
        System.out.println("Это бмв");
    }
}
