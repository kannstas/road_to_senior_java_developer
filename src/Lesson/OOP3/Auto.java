package Lesson.OOP3;

public abstract class Auto {
    String model;
    int horsePower;

    public Auto(String model, int horsePower) {
        this.model = model;
        this.horsePower = horsePower;
    }

    public abstract void start ();

    public void info () {
        System.out.print(model + " " + horsePower +" ");
        km();
    }
    private void km () {
        System.out.println( "расход на 100 км:  " + (horsePower/50) + " л" );
    }
}
