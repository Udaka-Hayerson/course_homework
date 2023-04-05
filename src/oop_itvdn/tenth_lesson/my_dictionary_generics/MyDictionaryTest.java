package oop_itvdn.tenth_lesson.my_dictionary_generics;

import java.util.Hashtable;

public class MyDictionaryTest {
    public static void main(String[] args) {


        MyDictionary<String, Integer> md = new MyDictionary<>();
        md.put("U", 10);
        md.put("A", 11);
        md.put("D", 12);
        md.put("E", 13);
        md.put("O", 14);

        String key = (String) md.getKey(10);
        int value = (Integer) md.getValue("U");
        int size = md.size();
        System.out.println(key);
        System.out.println(value);
        System.out.println(size);
        md.remove("A");
        size = md.size();
        System.out.println(size);

    }
}
