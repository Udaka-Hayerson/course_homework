package java_professional.lesson_notes.third_lesson;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

public class SimpleIdentityHashMap {
    public static void main(String[] args) {
        IdentityHashMap<Integer, String> identityHashMapTwo = new IdentityHashMap<>();
        identityHashMapTwo.put(1, "one");
        identityHashMapTwo.put(11, "two");
        identityHashMapTwo.put(23, "three");
        identityHashMapTwo.put(1, "one");
        identityHashMapTwo.put(23, "five");

        Set set = identityHashMapTwo.entrySet();

        for (Object o : set) {
            Map.Entry<Integer, String> e = (Map.Entry<Integer, String>) o;
            System.out.println(e.getKey() + " " + e.getValue());

        }

        System.out.println("***");
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "one");
        hashMap.put(11, "two");
        hashMap.put(23, "three");
        hashMap.put(1, "one");
        hashMap.put(23, "five");

        set = hashMap.entrySet();

        for (Object o : set) {
            Map.Entry<Integer, String> e = (Map.Entry<Integer, String>) o;
            System.out.println(e.getKey() + " " + e.getValue());

        }

/*        IdentityHashMap<Integer, String> identityHashMap = new IdentityHashMap<>();
        identityHashMap.put(new Integer(1), "one"); // (new Integer(1), ...) deprecated , use (1, ...)
        identityHashMap.put(new Integer(11), "two");
        identityHashMap.put(new Integer(23), "three");
        identityHashMap.put(new Integer(1), "one");
        identityHashMap.put(new Integer(23), "five");

        set = identityHashMap.entrySet();

        for (Object o : set) {
            Map.Entry<Integer, String> e = (Map.Entry<Integer, String>) o;
            System.out.println(e.getKey() + " " + e.getValue());

        }*/

    }
}
