package java_professional.lesson_notes.second_lesson;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SimpleHashSet {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
//        set.add(null); .hashCode() = NullPointerException
        set.add("CCad");
        set.add("DDf");
        set.add("EEht");
        set.add("AAd");
        set.add("BBbgt");
        for (String s : set) {
            System.out.println(s + " " + s.hashCode());

        }
        Set<String> l_h_set = new LinkedHashSet<>();
        l_h_set.add("AA");
        l_h_set.add("BB");
        l_h_set.add("CC");
        l_h_set.add("DD");
        l_h_set.add("EE");
        for (String s : l_h_set) {
            System.out.println(s + " " + s.hashCode());

        }
    }
}
