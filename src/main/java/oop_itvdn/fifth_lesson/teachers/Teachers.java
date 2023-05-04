package oop_itvdn.fifth_lesson.teachers;

import java.util.ArrayList;

// Задание
// Используя IntelliJ IDEA создать проект, пакет.
// Создать class Main, в нем создать список, добавить учителей, которых вы только сможете вспомнить со
// школы. И получить индекс самого лучшего учителя и самого не очень. Вывести список в консоль.

public class Teachers {
    public static void main(String[] args) {
        ArrayList<String> teachers = new ArrayList<>();
        teachers.add(0,"Olga A");
        teachers.add(1,"Galina I");
        teachers.add(2,"Anna Yu");
        teachers.add(3,"Victoria D");
        teachers.add(4,"Svitlana O");

        for (String t : teachers) {
            System.out.print(t + "  ");
        }

        System.out.println();
        System.out.println("badass  " + teachers.get(0));
        System.out.println("lovely  " + teachers.get(4));

    }
}
