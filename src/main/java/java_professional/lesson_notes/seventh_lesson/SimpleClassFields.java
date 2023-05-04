package java_professional.lesson_notes.seventh_lesson;

import java.lang.reflect.Field;

public class SimpleClassFields {
    private static final class CatFields{
        public String name = "Marsel";
        private int age = 7;
        short ears = 5;
        protected long tail = 30;
    }

    public static void main(String[] args) {
        String s = (char) 27 + "[31m";
        String s1 = (char) 27 + "[39m";
        String s2 = (char) 27 + "[34m";
        Class<?> cl = CatFields.class;
        System.out.println("Public Reflection Fields: ");
        Field[] fields = cl.getFields();
        for (Field field: fields){
            Class<?> fieldType = field.getType();
            System.out.println(s2 + "\tName: " + s1 + field.getName());
            System.out.println(s2 + "\tType: " + s1 + field.getType());
        }
        System.out.println("All Modifiers Reflection Fields: ");
        fields = cl.getDeclaredFields();
        for (Field field: fields){
            Class<?> fieldType = field.getType();
            System.out.println(s2 + "\tName: " + s1 + field.getName());
            System.out.println(s2 + "\tType: " + s1 + field.getType());
        }
    }
}
