package Lesson.Generics;

import java.util.ArrayList;

public class Example<T,V> {
    T [] array = (T[])new Object[100];
    V tittle = (V) new Object();

   public static Object  i = 123;

    public static<T> T getI() {
        return (T) i;
    }

    ArrayList<T> list = new ArrayList<>();

    public Example(T[] array, V tittle) {
        this.array = array;
        this.tittle = tittle;
    }

    public void printInfo(T t){
        System.out.println(t);
    }

    public <V> void printTask (V v1,V v2){
        System.out.println( v1 + " = " + v2  + "?");
    }

    public <E>void countElement (E [] array, E e) {
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(e)) {
                count++;
            }

        }
        System.out.println(count);

    }
}
