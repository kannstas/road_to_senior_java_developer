package Dz_1606.addComposition;

public class Person {
     String name;
     Sword sword;

    public Person (String name, int powerSword,String nameSword) {
        this.name = name;
        this.sword = new Sword(nameSword,powerSword);
    }


}
