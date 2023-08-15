package Lesson.Collection.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> arraylist = new ArrayList<>(100);
        arraylist.add("1");
        arraylist.add("2");
        arraylist.add("3");
        arraylist.add("4");
        System.out.println(arraylist.size());

        System.out.println();

        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList2.add("1");
        arrayList2.add("2");
        arrayList2.add("5");

      //  arrayList2.addAll(arraylist);

        // arrayList2.remove(0);
        //arrayList2.remove("Anna");

        // arrayList2.removeAll(arraylist); удаляет все элементы, которые есть в arraylist

       // arrayList2.retainAll(arraylist); // удаляет все элементы, которых нет в arraylist


        arrayList2.set(2, "3");


        //arrayList2.clear();


        System.out.println(arrayList2.contains("3"));

        /* for (String s : arrayList2) {
           if (s.equals("1"))  {
               arrayList2.remove(s);
           }
        }

         */
       ListIterator<String> iterator =  arrayList2.listIterator();
        while(iterator.hasNext()){
            if (iterator.next().equals("1"))  {
               iterator.remove();
             //  iterator.add("5");

            }
        }
        arrayList2.indexOf("3");
        arrayList2.removeIf(e -> e.equals("2"));

        for (String s : arrayList2) {
            System.out.println(s);

        }

    }
}
