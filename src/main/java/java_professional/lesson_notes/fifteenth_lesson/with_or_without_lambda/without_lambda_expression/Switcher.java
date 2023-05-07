package java_professional.lesson_notes.fifteenth_lesson.with_or_without_lambda.without_lambda_expression;

import java.util.ArrayList;
import java.util.List;

public class Switcher {
    private List<ElectricityConsumer> listeners = new ArrayList<>();

    public void addElectrocityListener(ElectricityConsumer listener){
        listeners.add(listener);
    }

    public void removeElectrocityListener(ElectricityConsumer listener){
        listeners.remove(listener);
    }

    public void switchOn(){
        System.out.println("Switcher on");

        for (ElectricityConsumer c : listeners) {
            c.electricityOn(this);

        }
    }
}
