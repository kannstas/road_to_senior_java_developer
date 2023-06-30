package Lesson.Static;

public class Auto {
    String model;
    static int count = 0;

    public Auto(String model) {
        this.model = model;
        count++;
    }
    public static void info () {
        System.out.println(count);

    }
    public void info2 () {
        System.out.println("Всего авто было создано:  " + count);
        System.out.println(model);
    }
}
