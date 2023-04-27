package java_professional.lesson_notes.seventh_lesson;

import java.util.ArrayList;
import java.util.Map;

public class SimpleReflection {
    public static void main(String[] args) throws ClassNotFoundException {
        // 4. Object.class.getSuperclass()
        Class<?> cls = Integer.class.getSuperclass();
        Class<?> cls2 = Map.Entry.class.getEnclosingClass();
        System.out.println(cls);
        System.out.println(cls2);


        // 3. Class.forName(class_name)
        Class<?> c3 = Class.forName("java_professional.lesson_notes.seventh_lesson.SimpleReflection");
        Class<?> c4 = Class.forName("[I");
        ArrayList<Object> ao = new ArrayList<>();
        ao.add(Class.forName("[I"));
        ao.add(Class.forName("[S"));
        ao.add(Class.forName("[D"));
        ao.add(Class.forName("[F"));
//        System.out.println(ao.toString());

        // 2. String.class
        Class<?> c = SimpleReflection.class;
        Class<?> c2 = int[].class;

        // 1. obj.getClass()
        SimpleReflection sr = new SimpleReflection();
        Class<?> cl = sr.getClass();
        int[] arr = new int[10];
        Class<?> cl2 = arr.getClass();
        Class<?> cl3 = "world".getClass();
        Class<?> cl4 = Integer.valueOf(5).getClass();
    }
}
