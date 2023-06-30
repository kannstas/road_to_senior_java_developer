package Lesson.OOP.relationspipsClass.testComp;

public class Main {


    public static void main(String[] args) {
        Fridge fridge = new Fridge("Электролюкс", -20, 5);
        System.out.println(fridge.motor.voltage);
    }
}
