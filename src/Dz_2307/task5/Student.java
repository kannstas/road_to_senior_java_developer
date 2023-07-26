package Dz_2307.task5;

public class Student  implements Comparable<Student>{

    @Override
    public int compareTo(Student student) {
        return Integer.compare(this.age,student.age);
    }

    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student(int age) {
        this.age = age;
    }
}
