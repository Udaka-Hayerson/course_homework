package java_professional.lesson_notes.eighth_lesson;

import java.lang.annotation.*;
import java.lang.reflect.Method;


@Documented
@Inherited
//@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD, ElementType.FIELD})
@interface MyAnno {
    String value() default "OK";
    String str() default "Hello"; // must be constants
    int i() default 5 + 5;
}

@Documented
@interface OwnAnno {
    myAnnoRepeatable[] value();
}
@Documented
@Repeatable(OwnAnno.class)
@interface myAnnoRepeatable {
    String value() default "hi";
}

@Documented
@Inherited
@interface MyNotAllowedAnno {
/*  Object o() default 55; not allowed
    Intrger valInt() default 100; not allowed
    public abstract String str() default "Hello " + new String("World"); not allowed */
}

@FunctionalInterface
interface MyOwnInterface{
    int i();
//    int i2(); not allowed
}
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface MathAnno{
    int num1() default 0;
    int num2() default 0;
}

@Deprecated
@myAnnoRepeatable("ONE")
@myAnnoRepeatable("TWO")
class A{

    @MyAnno("Example")
    public void print(int i){
        System.out.print(" A method " + i);
    }
    @SuppressWarnings("deprecated")
    @Deprecated
    @SafeVarargs
    public static void printLn(int... i){
        System.out.println(" A methodLn " + i.length);
    }
}
@Deprecated
class B extends A{
    @Deprecated
    @MyAnno("Example")
    private int n = 0;

    @Override
    @MyAnno(str = "ExampleTwo", i = 1234)
    public void print(@Deprecated int i){
        System.out.print(" B method "  + i);
    }

    // Static Not @Override
    @SuppressWarnings("deprecated")
    @Deprecated
    @SafeVarargs
    @MyAnno(value = "Example", str = " ok ", i = 66)
    public static void printLn(int... i){
        System.out.println(" B methodLn " + i.length);
    }
}
public class SimpleAnnotation {
    @MathAnno(num1 = 10, num2 = 30)
    public void addTwoNum(int num1, int num2){
        System.out.println();
        System.out.println(num1 + num2);
    }
    public static void main(String[] args) {
        A a = new B();
        B b = new B();
        A.printLn(1, 3, 5);
        B.printLn(1, 3, 5, 7);
        a.printLn(1, 3, 5, 7, 9);

        a.print(5); // B method
        b.print(10);
        SimpleAnnotation s_a = new SimpleAnnotation();
        Class<?> c = s_a.getClass();
        try {
            Method m = c.getMethod("addTwoNum", int.class, int.class);
            MathAnno mathAnno = m.getAnnotation(MathAnno.class);
            s_a.addTwoNum(mathAnno.num1(), mathAnno.num2());
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        System.out.println();
        try {
            Class<?> b_c = b.getClass();
            Annotation[] annotations = b_c.getAnnotations();
            for (Annotation annotation : annotations) {
                System.out.println("\t" + annotation);

            }
            Class<?> a_c = a.getClass();
            annotations = a_c.getAnnotations();
            for (Annotation annotation : annotations) {
                System.out.println("\t" + annotation);

            }
            Method[] classmethods_a = a_c.getMethods();
            Method[] classmethods_b = b_c.getMethods();
            for (Method method : classmethods_a) {
                Annotation[] methodAnno = method.getAnnotations();
                if(methodAnno.length > 0){
                    System.out.println("\t" + method.getName() + "(): ");
                }
                for (Annotation annotation : methodAnno) {
                    System.out.println("\t" + annotation);
                }
            }
            for (Method method : classmethods_b) {
                Annotation[] methodAnno = method.getAnnotations();
                if(methodAnno.length > 0){
                    System.out.println("\t" + method.getName() + "(): ");
                }
                for (Annotation annotation : methodAnno) {
                    System.out.println("\t" + annotation);
                }
            }
        } catch (SecurityException e) {
            e.printStackTrace();
        }


    }

}
