package java_professional.lesson_notes.fifteenth_lesson.with_or_without_lambda;

public class LambdaTest  {
    public static void main(String[] args) {
        long t1 = System.nanoTime();
        User user =  () -> System.out.println("lambda user");
        long t2 = System.nanoTime();
        long t3 = System.nanoTime();
        User u = new User() {
            @Override
            public void print() {
                System.out.println("I am user");
            }
        };
        long t4 = System.nanoTime();
        System.out.println(t2 - t1);
        System.out.println(t4 - t3);
    }
}

@FunctionalInterface
interface User {
    void print();
}