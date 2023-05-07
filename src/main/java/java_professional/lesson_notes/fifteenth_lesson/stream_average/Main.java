package java_professional.lesson_notes.fifteenth_lesson.stream_average;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Ary", 20));
        persons.add(new Person("Mary", 30));
        persons.add(new Person("Tom", 6));
        persons.add(new Person("Jerry", 3));
        persons.add(new Person("Udo",28));
        int sum = 0;
        int adult_persons = 0;

        for (Person p : persons) {
            if(p.getAge() >= 18){
                sum += p.getAge();
                adult_persons++;
            }
        }
        double average_age = (double) sum / adult_persons;
        System.out.println(average_age);
        double average = persons
                .stream()
                .filter(p -> p.getAge() >= 18)
                .mapToInt(p -> p.getAge())
                .average().getAsDouble();
        System.out.println(average);

    }
}
