package Lesson.Generics;

public class Student extends Person{
    public Student(String name, int age) {
        super(name, age);
    }

    public void helloTeacher () {
        System.out.println("Здравствуйте, учитель!");
    }
}
