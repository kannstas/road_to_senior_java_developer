package Lesson.Generics;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList();
        arrayList.add("One");
        System.out.println(arrayList);

        Example<String,String> example = new Example<>(new String[]{"One - 1","Two - 2"},"Generics");
        example.printInfo("ляля");
        Example<Double,String> example1 =  new Example<Double, String>(new Double[]{1.2,2.4,5.7},"Generics2");

        example.printTask ("One","One");

        String [] arrayString = {"zero", "one", "two", "two"};
        int [] arrayInt = {0, 1, 2,2,1,2};

        example.countElement(boxing(arrayInt), 2);
        example.countElement(arrayString, "two");

    }

    public static Integer [] boxing ( int [] arrayInt) {
        Integer [] autoBoxing = new Integer[arrayInt.length];
        for (int i = 0; i < arrayInt.length; i++) {
            autoBoxing[i] = arrayInt[i];
        }
        return autoBoxing;
    }
}
