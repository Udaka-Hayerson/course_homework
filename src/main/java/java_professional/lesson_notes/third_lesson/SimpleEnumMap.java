package java_professional.lesson_notes.third_lesson;

import java.util.EnumMap;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;


enum Animal{
    CAT, DOG, BIRD
}

public class SimpleEnumMap {
    public static void main(String[] args) {

        EnumMap<Animal, String> enumMap = new EnumMap<>(Animal.class);
        enumMap.put(Animal.CAT, "C");
        enumMap.put(Animal.DOG, "D");
        enumMap.put(Animal.BIRD, "B");
        Set set = enumMap.entrySet();
        for (Object o : set) {
            Map.Entry<Animal, String> m = (Map.Entry<Animal, String> ) o;
            System.out.println(m.getKey() + " " + m.getValue());
            
        }
    }
}
