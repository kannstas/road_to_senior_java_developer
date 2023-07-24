package Dz_2307.task1;

import java.util.Arrays;


public class Array <T>{
    T[] t;

    public <T> void printArray (T [] t) {
        for (T t1 : t) {
        } System.out.println(Arrays.toString(t));
        Arrays.sort(t);
        System.out.println(Arrays.toString(t));

    }


    @Override
    public String toString() {
        return "Array{" +
                "t=" + Arrays.toString(t) +
                '}';
    }
}
