package java_professional.lesson_notes.twelfth_lesson.jackson.entity;

import java.util.List;

public class Person {
    private String firstName;
    private String lastName;
    private Course course;
    private List<String> personalContacts;

    public Person(){}

    public Person(String firstName, String lastName, Course course, List<String> personslContacts) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.course = course;
        this.personalContacts = personslContacts;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", course=" + course +
                ", personslContacts=" + personalContacts +
                '}';
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Course getCourse() {
        return course;
    }

    public List<String> getPersonalContacts() {
        return personalContacts;
    }
}
