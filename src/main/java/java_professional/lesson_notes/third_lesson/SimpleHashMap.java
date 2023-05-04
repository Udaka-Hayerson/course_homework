package java_professional.lesson_notes.third_lesson;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class SimpleHashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("a", 30);
        hm.put("b", 40);
        hm.put("c", 50);
        hm.put(null, 25);
        System.out.println(hm);

        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();
        lhm.put("0", 1);
        lhm.put("1", 2);
        lhm.put("2", 3);
        lhm.put("3", 4);
        Map<String, Integer> m_lhm = lhm;
        Set<Map.Entry<String, Integer>> set = m_lhm.entrySet();
        for (Map.Entry<String, Integer> n : set) {
            System.out.println(n.getKey() + " " + n.getValue());

        }
    }
}
