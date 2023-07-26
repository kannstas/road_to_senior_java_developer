package Dz_2607.task2;

import java.util.Arrays;

public class Triple<T, V, E> {
    private T[] array;
    private V v;
    private E e;

    public Triple(T[] array, V v, E e) {
        this.array = array;
        this.v = v;
        this.e = e;
    }

    public T[] getArray() {
        return array;
    }

    public V getV() {
        return v;
    }

    public E getE() {
        return e;
    }

    @Override
    public String toString() {
        return "Triple{" +
                "array=" + Arrays.toString(array) +
                ", v=" + v +
                ", e=" + e +
                '}';
    }
}
