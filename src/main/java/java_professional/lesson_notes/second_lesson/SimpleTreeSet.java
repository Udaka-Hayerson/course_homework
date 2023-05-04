package java_professional.lesson_notes.second_lesson;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;


class Car implements Comparable<Car>{
    private int price;

    public Car(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public int compareTo(Car c) {
        return this.price - c.price;
    }

    @Override
    public String toString() {
        return "" + price;
    }
}


public class SimpleTreeSet {
    public static void main(String[] args) {
        extractedCarSet();
        extractedSet();
    }

    private static void extractedCarSet() {
        NavigableSet<Car> car_set = new TreeSet<>();
        car_set.add(new Car(5000));
        car_set.add(new Car(4000));
        car_set.add(new Car(8000));
        car_set.add(new Car(2000));
        car_set.add(new Car(9000));
        Iterator<Car> iterator = car_set.iterator();
        while (iterator.hasNext()){
            Car temp  = iterator.next();
            temp.setPrice(temp.getPrice() + temp.getPrice() / 1000 * 111);
            System.out.println(temp.getPrice());
        }
    }

    private static void extractedSet() {
        NavigableSet<Integer> ts = new TreeSet<>();
        ts.add(1);
        ts.add(2);
        ts.add(3);
        ts.add(4);
        ts.add(5);
        ts.add(9);
        System.out.println(ts);
        System.out.println(ts.add(11));
        System.out.println(ts.add(13));
        System.out.println(ts.add(17));
        System.out.println(ts);
        System.out.println(ts.ceiling(4));
        NavigableSet<Integer> subset = ts.headSet(9, true);
        subset.add(8);
        System.out.println(subset);
        System.out.println(ts);

    }
}
