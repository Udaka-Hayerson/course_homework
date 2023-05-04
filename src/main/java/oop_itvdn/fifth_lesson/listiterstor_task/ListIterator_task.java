package oop_itvdn.fifth_lesson.listiterstor_task;

import java.util.ArrayList;
import java.util.ListIterator;

// Задание 4
// Используя IntelliJ IDEA создать проект, пакет.
// Создать класс Main, создать список целых чисел и используя ListIterator пройтись по списку и увеличить
// значения на 1;

public class ListIterator_task {

    public static void main(String[] args) {
        ArrayList <Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            arrayList.add(i);
        }

        System.out.println("ArrayList:" + arrayList);
        ListIterator<Integer> iterator = arrayList.listIterator(0);
        while (iterator.hasNext()) {
            int c = iterator.next();
            iterator.set(c + 1);

        }

        while (iterator.hasPrevious()) {
            System.out.print(" " + iterator.previous());

        }

        System.out.println();

        while (iterator.hasNext()) {
            System.out.print(" " + iterator.next());

        }

        System.out.println();

        ListIterator<Integer> new_iterator = arrayList.listIterator(0);

        while (new_iterator.hasNext()) {
            System.out.print(" " + new_iterator.next());

        }


    }
}
