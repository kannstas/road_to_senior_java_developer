package Lesson.ClassObject;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Петя2", 21);
        Student student1 = new Student("Петя", 21);
        System.out.println(student.toString());

        System.out.println(student.getClass());
        System.out.println(student.hashCode());
        System.out.println(student1.hashCode());

        System.out.println(student.equals(student1));


    }


}
