package Dz_1606.composition;

public class Person {
    String name;
    Sword sword;
    public  Person (String name, String modelSword) {
        this.name = name;
        this.sword = new Sword(modelSword);
    }
}
