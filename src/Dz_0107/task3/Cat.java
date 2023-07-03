package Dz_0107.task3;

public final class Cat extends Animal {
    private String name;
    private int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public final void knowOld() {
        if (age >= 10) {
            System.out.println( Animal.word + " " + name + " " + age + " этот кот взрослый");
        } else if (age >= 5) {
            System.out.println( Animal.word + " " + name + " " + age + " этот кот молодой");
        } else if (age > 0) {
            System.out.println(Animal.word + " " + name + " " + age + " этот кот маленький");
        }
    }
}
