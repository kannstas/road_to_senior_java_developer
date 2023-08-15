package Lesson.Collection.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TaskMap {
    public static void main(String[] args) {
        HashMap <String, Integer> hashMap = new HashMap();

        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку");

        String answer = in.nextLine();

        char [] chars = answer.toCharArray();

        for (char c : chars) {
            if (hashMap.containsKey(String.valueOf(c))){
                hashMap.put(String.valueOf(c),hashMap.get(String.valueOf(c))+1);
            }else {
                hashMap.put(String.valueOf(c), 1);
            }
        }

        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println(entry);
        }




    }

}
