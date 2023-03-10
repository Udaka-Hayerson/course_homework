package oop_itvdn.fifth_lesson.zoo_edit;

// Задание 3
// Используя IntelliJ IDEA создать проект, пакет.
// Используя класс Zoo Задания 2, удалить 3, 5, 7 животные, узнать размер списка и вывести в консоль.

import java.util.ArrayList;
import java.util.ListIterator;

public class ZooEdit {

    public static void main(String[] args) {
        ArrayList<String> zooEditArrayList = new ArrayList<>();
        zooEditArrayList.add(0,"Buffalo");
        zooEditArrayList.add(1,"Lion");
        zooEditArrayList.add(2,"Elephant");
        zooEditArrayList.add(3,"Wolf");
        zooEditArrayList.add(4,"Monkey");
        zooEditArrayList.add(5,"Giraffe");
        zooEditArrayList.add(6,"Python");
        zooEditArrayList.add(7,"Rhinoceros");

        System.out.println("ZooEditArrayList:" + zooEditArrayList);

        ListIterator<String> zoo_iterator = zooEditArrayList.listIterator(0);

        while (zoo_iterator.hasNext())
        {
            int index = zoo_iterator.nextIndex();
            if (index == 3 || index == 5 || index == 7){
                zoo_iterator.set(" was released");
            }
            System.out.print(zoo_iterator.next());
        }

        System.out.println("ZooEditArrayList:" + zooEditArrayList);

    }
}
