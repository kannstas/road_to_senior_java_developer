package Lesson.OOP.relationspipsClass;

public class Student {
    String name;
    Phone phone;
    PencilCase pencilCase;
    public Student (String name, String model, String namePC) { // композиция
        this.name = name;
        this.phone = new Phone(model);
        this.pencilCase = new PencilCase(namePC);
    }

    public Student (String name, Phone phone, PencilCase pencilCase) { // агрегация
        this.name = name;
        this.phone = phone;
        this.pencilCase = pencilCase;
    }
}
