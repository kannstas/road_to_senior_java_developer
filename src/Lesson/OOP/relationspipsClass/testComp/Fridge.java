package Lesson.OOP.relationspipsClass.testComp;

public class Fridge {
    String name;
    int minTemp;
    int maxTemp;

    Motor motor;

    public Fridge (String name, int minTemp, int maxTemp) {
        this.name = name;
        this.minTemp = minTemp;
        this.maxTemp = maxTemp;
        this.motor = new Motor(1200, 250);
    }
}
