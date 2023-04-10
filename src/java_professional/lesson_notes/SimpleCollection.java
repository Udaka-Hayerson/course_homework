package java_professional.lesson_notes;

import java.sql.Array;
import java.util.*;

class Animal{
    String breed;
    int price;

    public Animal(String breed, int price) {
        this.breed = breed;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "breed='" + breed + '\'' +
                ", price=" + price +
                '}';
    }
}

public class SimpleCollection {

    public static void main(String[] args) {

        Animal cat = new Animal("Maveric", 50);
        Animal dog = new Animal("Maveric", 60);
        Animal bird = new Animal("Crow", 100);
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(cat);
        animals.add(dog);
        animals.add(bird);
        System.out.println(animals);
        Iterator<Animal> a_itr = animals.iterator();
        while (a_itr.hasNext())
        {
            Animal a = a_itr.next();
            a.price += 50;
        }
        System.out.println(animals);

        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(4);
        integers.add(5);
        integers.add(6);
        integers.add(8);
        integers.add(1);
        integers.add(9);
        integers.add(7);
    //        Iterator<Integer> itr = integers.iterator();
        ListIterator<Integer> litr = integers.listIterator();
        System.out.println("/////////////////////////////////////////////////////////");
        while (litr.hasNext()){
            System.out.print(litr.next() + " ");
        }
        System.out.println();
        while (litr.hasPrevious()) {
            System.out.print(litr.previous() + " ");
        }
        System.out.println();
        while (litr.hasNext()){
            System.out.print(litr.next() + " ");
        }
        System.out.println();
        while (litr.hasPrevious()) {
            System.out.print(litr.previous() + " ");
        }
        System.out.println();
        System.out.println("/////////////////////////////////////////////////////////");


        for (Animal a : animals) {
        a.price += 30; // зміна полей обєкта можлива
        // a = new Animal("Sphinx", 333); зміна обєктів неможлива

        }

        Collection<Integer> list1 = new ArrayList<>();
        Collection<Integer> list2 = new ArrayList<>();
        extracted(list1); // укстракт (виділеної частини) в окремий метод Ctrl + alt + M

        for (Iterator<Integer> iterator = list1.iterator(); iterator.hasNext();) {  // itco = створення ітератору
            System.out.println( iterator.next() + " ");

        }

        list2.addAll(list1);
        System.out.println(list2.size());
        list2.clear();
        System.out.println(list2 + " " + list2.size());
        boolean empty = list2.isEmpty();  // упаковка () в змінну Ctrl + alt + V
        if (empty) { // упаковка () в if/if-else/while/for/... Ctrl + alt + T
            Object[] objects = list1.toArray();
            for (int i = 0; i < objects.length; i++) { // автостворення циклу для Array =  array.fori
                System.out.println(objects[i] + " ");

            }
        }

        int[] arr = {0, 1, 2, 3, 4, 5};
        for (int i = 0; i < arr.length; i++) { // автостворення циклу для Array =  array.fori
            System.out.println(arr[i]);

        }

        for (int temp : arr) {
            ++temp;
            System.out.println(temp);
        }


    }

    private static void extracted(Collection<Integer> list1) {
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        list1.add(6);
    }

}
















//end