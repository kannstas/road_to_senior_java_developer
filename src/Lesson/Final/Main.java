package Lesson.Final;

public class Main {
    public static void main(String[] args) {
        Bmw bmw = new Bmw("X4");
        Lada lada = new Lada("Vesta");
        bmw.info();
        lada.info();
        System.out.println(Auto.count);

        s(45);
    }

    public static void s (final int id) {
        if (id < 100) {
            System.out.println(true);
        } else {
            System.out.println(false);;
        }
    }
}
