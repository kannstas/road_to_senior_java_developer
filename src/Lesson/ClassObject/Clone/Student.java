package Lesson.ClassObject.Clone;

import java.util.Objects;

public class Student implements Cloneable{
    private String name;
    private int age;
    private int group;

    public Student(String name, int age, int group) {
        this.name = name;
        this.age = age;
        this.group = group;
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

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && group == student.group && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, group);
    }


    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new Student(name,age,group);
    }
}
