package java_professional.lesson_notes.fifteenth_lesson.with_or_without_lambda.with_lambda_expression;

public class Lamp implements ElectricityConsumer {
    @Override
    public void electricityOn(Object sender) {
        lightOn();
    }

    private void lightOn() {
        System.out.println("Light on");
    }
}
