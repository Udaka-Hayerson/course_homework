package java_professional.lesson_notes.seventh_lesson;

import java.lang.reflect.Field;

public class SimpleReflectionAccess {
    private static final class Dog{
        private int age = 3;
    }

    public static void main(String[] args) {
        try {
            Class<?> c = Dog.class;
            Dog dog = new Dog();
            Field field = c.getDeclaredField("age");
            field.setAccessible(true);
            System.out.println("Private field value: " + field.getInt(dog));
            field.setInt(dog,5);
            System.out.println("New private field value: " + field.getInt(dog));
/*          field.setAccessible(false);
            field.setInt(dog,99);
            System.out.println("Not New private field value: " + field.getInt(dog)); */
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
