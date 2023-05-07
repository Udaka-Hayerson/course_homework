package java_professional.lesson_notes.fifteenth_lesson.with_or_without_lambda.with_lambda_expression;


public class Radio implements ElectricityConsumer {
    @Override
    public void electricityOn(Object sender) {
        playMusic();
    }

    private void playMusic() {
        System.out.println("Radio plays");
    }

}
