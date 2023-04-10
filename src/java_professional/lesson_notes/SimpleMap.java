package java_professional.lesson_notes;

import java.util.HashMap;
import java.util.Map;

public class SimpleMap {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put(null, 100); // without exception
        map.put("A", null); // without exception
        map.put("World", 100);
        System.out.println(map.size());
        map.put("World", 150); // перезапис по унікальному ключу
        System.out.println(map.size());
        map.put("Sun", 1000);
        map.put("Fun", 500);
        map.put("Run", 666);
        System.out.println(map);
        for (Map.Entry<String, Integer> temp : map.entrySet()){
            System.out.println(temp.getKey() + " " + temp.getValue());
        }
    }
}
