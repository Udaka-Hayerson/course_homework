package java_professional.lesson_notes.fifteenth_lesson.stream;

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
        persons
                .stream()
                .filter(p -> p.getAge() >= 18)
                .sorted(Comparator.comparing(Person::getName))
              //.sorted((p1,p2)->p1.getName().compareTo(p2.getName()))
                .map(Person::getName).forEach(
                      //(String name)->System.out.println(name)
                        System.out::println);
              //.map(person->person.getName())

            }
}
