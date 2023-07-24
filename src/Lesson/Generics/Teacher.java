package Lesson.Generics;

public class Teacher extends Person{
    public Teacher(String name, int age) {
        super(name, age);
    }

    public void printHello () {
        System.out.println("Здравствуйте, дети!");
    }
}
