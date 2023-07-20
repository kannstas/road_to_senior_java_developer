package Lesson.ClassObject.Clone;

import java.util.Objects;

public class Engine implements  Cloneable{
    private int ls;

    public Engine(int ls) {
        this.ls = ls;
    }

    public int getLs() {
        return ls;
    }

    public void setLs(int ls) {
        this.ls = ls;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new Engine(ls);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Engine engine = (Engine) o;
        return ls == engine.ls;
    }

    @Override
    public int hashCode() {
        return Objects.hash(ls);
    }
}
