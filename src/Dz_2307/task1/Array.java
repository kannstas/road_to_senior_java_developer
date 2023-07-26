package Dz_2307.task1;

import java.util.Arrays;


public class Array{


    public <T extends Comparable<T>> void printArray (T [] t) {
        System.out.println(Arrays.toString(t));
        Arrays.sort(t);
        System.out.println(Arrays.toString(t));

    }

}
