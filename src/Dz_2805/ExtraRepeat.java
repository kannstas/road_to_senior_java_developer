package Dz_2805;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ExtraRepeat {
    public static void main(String[] args) {

        int count = 10;
        int e = 0;
        while (e < count) {
            if (e == count-1) {
                System.out.print(++e);
            } else {
                System.out.print(++e + ",");
            }
        }
//        System.out.println(++e);

        String result = IntStream.range(1, 11).boxed()
                .map(String::valueOf)
                .collect(Collectors.joining(","));

        System.out.println("\nIvan's result: " + result);
    }
}
