package java_professional.lesson_notes.sixth_lesson;

import java.util.Date;

public class SimpleDate {
    public static void main(String[] args) {
        Date date = new Date();
        long mlsc = date.getTime();
        System.out.println(mlsc); //now 1682449313006 . course made 1529253451357
        Date made_course = new Date();
        long mlsc_made_course = 1529253451357L;
        made_course.setTime(mlsc_made_course);
        System.out.println(made_course.getDate() + "." + made_course.getMonth() + "." + (made_course.getYear() + 1900));
        System.out.println(date.getDate() + "." + date.getMonth() + "." + (date.getYear() + 1900));
    }
}
