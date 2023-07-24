package Dz_2307.task2_3;

public class Box <T, V>{
    T title;
    V [] array;

    public Box(T title) {
        this.title = title;
    }

    public <V> void printArray (V [] v) {
        for (V v1 : v) {
            System.out.print (v1 + " ");
        }

        }


    @Override
    public String toString() {
        return "Box{" +
                "title=" + title +
                '}';
    }
}
