package oop_itvdn.fifth_lesson.zoo;

import java.util.ArrayList;
import java.util.ListIterator;

// Задание 2
// Используя IntelliJ IDEA создать проект, пакет.
// Создать класс Zoo. В классе создать список, в который записать 8 животных через метод add(index,
// element).
// Вывести список в консоль.

public class Zoo {

    public static void main(String[] args) {
        ArrayList<String> zooArrayList = new ArrayList<>();
        zooArrayList.add(0,"Buffalo");
        zooArrayList.add(1,"Lion");
        zooArrayList.add(2,"Elephant");
        zooArrayList.add(3,"Wolf");
        zooArrayList.add(4,"Monkey");
        zooArrayList.add(5,"Giraffe");
        zooArrayList.add(6,"Python");
        zooArrayList.add(7,"Rhinoceros");

        ListIterator <String> zoo_iterator = zooArrayList.listIterator(0);

        while (zoo_iterator.hasNext()) {
            System.out.print(" " + zoo_iterator.next());

        }

    }
}
