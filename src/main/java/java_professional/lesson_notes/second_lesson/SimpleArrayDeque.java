package java_professional.lesson_notes.second_lesson;

import java.util.ArrayDeque;

public class SimpleArrayDeque {
    public static void main(String[] args) {
        ArrayDeque<String> states = new ArrayDeque<>();
        states.add("Ukraine");
        states.add("France");
        states.push("Poland");

        String f = states.getFirst();
        String l = states.getLast();

        while (states.peek() != null) {
            System.out.println(states.pop());
        }




    }
}
