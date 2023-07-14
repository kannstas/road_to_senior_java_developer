package Lesson.Classes.AnonimClass;

public class Main {
    public static void main(String[] args) {
        Bmw bmw = new Bmw("Bmw x5", 500);
        Lada lada = new Lada("Vesta", 500);
        System.out.println(bmw.infoExpenditure());
        System.out.println(lada.infoExpenditure());
        Auto mersedes = new Auto("mersedes",500) {
            @Override
            public Engine getEngine() {
                return super.getEngine();
            }

            @Override
            public int infoExpenditure() {
                return getEngine().getLs() / 30 + 15;
            }
        };

        System.out.println(mersedes.infoExpenditure());


    }
}
