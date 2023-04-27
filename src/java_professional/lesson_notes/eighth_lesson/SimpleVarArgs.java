package java_professional.lesson_notes.eighth_lesson;

public class SimpleVarArgs {
    private int sum(int... values){
        int sum = 0;
        for (int value : values) {
            sum += value;
        }
        return sum;
    }


    private int sum( boolean b, int... values){
        int sum = 0;
        for (int value : values) {
            sum += value;
        }
        if (b) {
            return sum;
        } else {
            return sum * -1;
        }
    }
    public static void main(String... a) {
        SimpleVarArgs simpleVarArgs = new SimpleVarArgs();
        System.out.println(simpleVarArgs.sum());
        System.out.println(simpleVarArgs.sum(5, 10, 15));
        System.out.println(simpleVarArgs.sum(5, 10, 15, 20, 25));
        System.out.println(simpleVarArgs.sum(true, 5, 10, 15, 20, 25, 30));
        System.out.println(simpleVarArgs.sum(false, 5, 10, 15, 20, 25, 30, 35));
    }
}
