package java_professional.lesson_notes.fifteenth_lesson.with_or_without_lambda.without_lambda_expression;

public class Main {
    public static void main(String[] args) {
        Switcher switcher = new Switcher();
        Lamp lamp = new Lamp();
        Radio radio = new Radio();
        switcher.addElectrocityListener(lamp);
        switcher.addElectrocityListener(radio);
        String massage = "Fire!";
        switcher.addElectrocityListener(new ElectricityConsumer() {
            @Override
            public void electricityOn(Object sender) {
                System.out.println(massage);
            }
        });
        switcher.switchOn();
    }
}
