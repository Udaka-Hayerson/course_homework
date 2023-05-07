package java_professional.lesson_notes.fifteenth_lesson.with_or_without_lambda;


public class Main {
    public static void main(String[] args) {
        Operation operation = new Operation() {
            public int calculate(int x, int y) {
                return x+y;
            }
        };
        Operation lambda_o = (x, y) -> x-y;
        int z = operation.calculate(30, 20); //z.sout;
        int l = lambda_o.calculate(30, 20); //l.sout;
        operation.show(z);
        Operation.print(l);

        Operation add = (x, y) -> x+y;
        Operation sub = (x, y) -> x-y;
        Operation div = (x, y) -> x*y;
        Operation mul = (x, y) -> x/y;
        System.out.println(add.calculate(10, 5));
        System.out.println(sub.calculate(10, 5));
        System.out.println(div.calculate(10, 5));
        System.out.println(mul.calculate(10, 5));


    }
}
@FunctionalInterface
interface Operation{
    int calculate(int x, int y);

    default void show(int s_i){
        System.out.println(s_i);
    }

    static void print(int s_i){
        System.out.println(s_i);
    }
 }