package Lesson.Collection.Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Map <String, Integer> map = new HashMap();
        map.put("April", 10);
        map.put("May", 15);
        map.put("September", 30);

        System.out.println(map.get("May"));

        System.out.println(map.containsKey("April"));
        System.out.println(map.containsValue(30));
        System.out.println(map);

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());

        }
        for (String k : map.keySet()) {
            System.out.println(k);
        }

        System.out.println();




    }
}