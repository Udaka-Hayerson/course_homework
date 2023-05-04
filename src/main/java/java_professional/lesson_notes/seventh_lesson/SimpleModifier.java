package java_professional.lesson_notes.seventh_lesson;

import java.lang.reflect.Modifier;

public class SimpleModifier {
    private static final class CatModifier{}

    public static void main(String[] args) {
        String s = (char) 27 + "[31m";
        String s1 = (char) 27 + "[39m";
        String s2 = (char) 27 + "[34m";
        Class<?> cl = CatModifier.class;
        System.out.println(s + "Class name: " + s1 + cl.getName());
        System.out.println(s + "Modifiers of class: " + s1);
        int mods = cl.getModifiers();

        if (Modifier.isPublic(mods)) {
            System.out.print("Public ");
        }
        if (Modifier.isProtected(mods)) {
            System.out.print("Protected ");
        }
        if (Modifier.isPrivate(mods)) {
            System.out.print("Private ");
        }
        if (Modifier.isAbstract(mods)) {
            System.out.print("Abstract ");
        }
        if (Modifier.isStatic(mods)) {
            System.out.print("Static ");
        }
        if (Modifier.isFinal(mods)) {
            System.out.print("Final ");
        }
    }
}
