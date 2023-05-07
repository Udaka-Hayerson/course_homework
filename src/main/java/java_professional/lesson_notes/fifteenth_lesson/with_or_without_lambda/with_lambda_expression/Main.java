package java_professional.lesson_notes.fifteenth_lesson.with_or_without_lambda.with_lambda_expression;

public class Main {

    public static void fire(Object sendler){
        System.out.println("Fire");
    }
    public static void main(String[] args) {

        Switcher switcher = new Switcher();
        Lamp lamp = new Lamp();
        Radio radio = new Radio();
        switcher.addElectrocityListener(lamp);
        switcher.addElectrocityListener(radio);
        String massage = "Fire";
        switcher.addElectrocityListener(sender -> System.out.println(massage));
        switcher.addElectrocityListener(Main::fire);
        switcher.switchOn();
    }
}
