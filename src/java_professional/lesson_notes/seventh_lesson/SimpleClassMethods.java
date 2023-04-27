package java_professional.lesson_notes.seventh_lesson;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class SimpleClassMethods {
    private static final class CatMethods{
        public String name = "Marsel";
        private int age = 7;
        short ears = 5;
        protected long tail = 30;

        public CatMethods() {
        }

        public CatMethods(int age) {
            this.age = age;
        }

        public CatMethods(String name, int age, short ears, long tail) {
            this.name = name;
            this.age = age;
            this.ears = ears;
            this.tail = tail;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public short getEars() {
            return ears;
        }

        public void setEars(short ears) {
            this.ears = ears;
        }

        public long getTail() {
            return tail;
        }

        public void setTail(long tail) {
            this.tail = tail;
        }
    }

    public static void main(String[] args) {
        String s = (char) 27 + "[31m";
        String s1 = (char) 27 + "[39m";
        String s2 = (char) 27 + "[34m";
        Class<?> cl = CatMethods.class;
        System.out.println(s + "Constructors " + s1);

        Constructor<?>[] constructors = cl.getConstructors();
        int i = 0;
        for (Constructor<?>ctr : constructors){
            System.out.print(s + "\tConstructor " + (++i) + " : ");
            Class<?>[] paramTypes = ctr.getParameterTypes();
            for (Class<?> paramType : paramTypes) {
                System.out.print(s1 + paramType.getName() + " ");
            }
            System.out.println();
        }
        try {
            Class<?>[] paramTypes = new Class<?>[]{int.class};
            Constructor<?> ctr = cl.getConstructor(paramTypes);
            CatMethods cm = (CatMethods) ctr.newInstance(Integer.valueOf(1));
            System.out.println(s + "Filds: " + s1 + " Age = " + cm.getAge() + " Name = " +
                    cm.getName() + "Ears = " + cm.getEars() + "Tail = " + cm.getTail());

        } catch (Exception e) {
            e.printStackTrace();
        }
        Method[] methods = cl.getMethods();
        for(Method method : methods) {
            System.out.println(s + "Name : " + method.getName());
            System.out.println(s + "\tReturnType : " + method.getReturnType().getName());
            Class<?>[] paramTypes = method.getParameterTypes();
            System.out.print(s + "\tParam types: " + s1);
            for(Class<?> paramType : paramTypes){
                System.out.print(" " + paramType.getName());
            }
            System.out.println();
        }

        try {
            CatMethods cm = new CatMethods();
            Class<?>[] paramTypes = new Class<?>[]{int.class};
            Method method = cl.getMethod("setAge", paramTypes);
            Object[]obArgs = new Object[]{Integer.valueOf(8)};
            method.invoke(cm, obArgs);
            System.out.println(s + "Age: " + s1 + cm.getAge());
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            CatMethods obj = new CatMethods();
            Class<?>[] paramTypes = new Class<?>[]{String.class};
            Method method = cl.getMethod("wrongMethod", paramTypes);
            Object[]obArgs = new Object[]{Integer.valueOf("Hello")};
            method.invoke(obj, obArgs);
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}