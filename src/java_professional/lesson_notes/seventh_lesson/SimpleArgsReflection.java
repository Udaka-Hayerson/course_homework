package java_professional.lesson_notes.seventh_lesson;

import java.lang.reflect.Member;

public class SimpleArgsReflection {
    public static void main(String[] args) {
        try {
            Class<?> c = Class.forName(args[0]);
            printMembers(c.getFields());
            printMembers(c.getConstructors());
            printMembers(c.getMethods());

        } catch (ClassNotFoundException e) {
            System.out.println("Class Not Found" + args[0]);
            e.printStackTrace();
        }

    }

    private static void printMembers(Member[]mems){
        for (int i = 0; i < mems.length; i++) {
            if(mems[0].getDeclaringClass() == Object.class){
                continue;
            }
            String decl = mems[i].toString();
            System.out.println("    ");
            System.out.println(decl);
        }
    }
}
