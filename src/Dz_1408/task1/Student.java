package Dz_1408.task1;

import java.util.Arrays;
import java.util.Objects;

public class Student {
    private String name;
   private int [] score;

    public Student(String name, int [] score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int [] getScore() {
        return score;
    }

    public void setScore( int [] score) {
        this.score = score;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name) && Arrays.equals(score, student.score);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(name);
        result = 31 * result + Arrays.hashCode(score);
        return result;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", score=" + Arrays.toString(score) +
                '}';
    }
}
