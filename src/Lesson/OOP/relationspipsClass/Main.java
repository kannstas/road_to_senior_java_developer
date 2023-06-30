package Lesson.OOP.relationspipsClass;

public class Main {
    public static void main(String[] args) {
      // Phone phone = new Phone("Iphone");
        Student student = new Student("Lisa","Iphone", "dff" );
        Student student1 = new Student("Anna","Iphone", "rer" );
        student1.phone.name = "samsung";

        System.out.println(student.phone.name);
        System.out.println(student1.phone.name);
    }
}
