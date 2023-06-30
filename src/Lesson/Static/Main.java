package Lesson.Static;

public class Main {
    public static void main(String[] args) {
        Auto auto = new Auto("Bmw");
        Auto auto1 = new Auto("Lada");
        System.out.println(auto.model);
        System.out.println(auto1.model);
        System.out.println(Auto.count);

        Auto.info();
        auto.info2();

    }
}
